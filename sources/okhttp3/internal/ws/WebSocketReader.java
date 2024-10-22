package okhttp3.internal.ws;

import defpackage.at;
import defpackage.jr;
import defpackage.lr;
import defpackage.m20;
import defpackage.sr;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final jr maskCursor;
    private final byte[] maskKey;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final sr source;
    private final lr controlFrameBuffer = new lr();
    private final lr messageFrameBuffer = new lr();

    /* loaded from: classes2.dex */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(at atVar) throws IOException;

        void onReadMessage(String str) throws IOException;

        void onReadPing(at atVar);

        void onReadPong(at atVar);
    }

    public WebSocketReader(boolean z, sr srVar, FrameCallback frameCallback, boolean z2, boolean z3) {
        byte[] bArr;
        this.isClient = z;
        this.source = srVar;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = z ? null : new jr();
    }

    private final void readControlFrame() throws IOException {
        short s;
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.J(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.M(this.maskCursor);
                this.maskCursor.c(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                lr lrVar = this.controlFrameBuffer;
                long j2 = lrVar.f3176b;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = lrVar.readShort();
                        str = this.controlFrameBuffer.P();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.u());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.u());
                return;
            default:
                throw new ProtocolException(m20.d1(Util.toHexString(this.opcode), "Unknown control opcode: "));
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i = and & 15;
                this.opcode = i;
                boolean z7 = false;
                if ((and & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.isFinalFrame = z;
                if ((and & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.isControlFrame = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((and & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != 1 && i != 2) {
                    if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z3) {
                        if (this.perMessageDeflate) {
                            z4 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z4 = false;
                    }
                    this.readingCompressedMessage = z4;
                }
                if ((and & 32) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    if ((and & 16) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        int and2 = Util.and(this.source.readByte(), 255);
                        if ((and2 & 128) != 0) {
                            z7 = true;
                        }
                        if (z7 == this.isClient) {
                            if (this.isClient) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = and2 & 127;
                        this.frameLength = j;
                        if (j == 126) {
                            this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        } else if (j == 127) {
                            long readLong = this.source.readLong();
                            this.frameLength = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.isControlFrame && this.frameLength > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z7) {
                            this.source.readFully(this.maskKey);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.J(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.M(this.maskCursor);
                    this.maskCursor.c(this.messageFrameBuffer.f3176b - this.frameLength);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException(m20.d1(Util.toHexString(this.opcode), "Expected continuation opcode. Got: "));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException(m20.d1(Util.toHexString(i), "Unknown opcode: "));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.P());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.u());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final sr getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
