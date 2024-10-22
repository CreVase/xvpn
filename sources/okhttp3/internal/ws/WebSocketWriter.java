package okhttp3.internal.ws;

import defpackage.at;
import defpackage.jr;
import defpackage.lr;
import defpackage.rr;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes2.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final jr maskCursor;
    private final byte[] maskKey;
    private final lr messageBuffer = new lr();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final rr sink;
    private final lr sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, rr rrVar, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        this.isClient = z;
        this.sink = rrVar;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = rrVar.b();
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new jr() : null;
    }

    private final void writeControlFrame(int i, at atVar) throws IOException {
        boolean z;
        if (!this.writerClosed) {
            int c = atVar.c();
            if (c <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.sinkBuffer.V(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.V(c | 128);
                    this.random.nextBytes(this.maskKey);
                    lr lrVar = this.sinkBuffer;
                    byte[] bArr = this.maskKey;
                    lrVar.getClass();
                    lrVar.T(0, bArr, bArr.length);
                    if (c > 0) {
                        lr lrVar2 = this.sinkBuffer;
                        long j = lrVar2.f3176b;
                        atVar.k(lrVar2, atVar.c());
                        this.sinkBuffer.M(this.maskCursor);
                        this.maskCursor.c(j);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.V(c);
                    lr lrVar3 = this.sinkBuffer;
                    lrVar3.getClass();
                    atVar.k(lrVar3, atVar.c());
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final rr getSink() {
        return this.sink;
    }

    public final void writeClose(int i, at atVar) throws IOException {
        at atVar2 = at.d;
        if (i != 0 || atVar != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            lr lrVar = new lr();
            lrVar.a0(i);
            if (atVar != null) {
                atVar.k(lrVar, atVar.c());
            }
            atVar2 = lrVar.u();
        }
        try {
            writeControlFrame(8, atVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, at atVar) throws IOException {
        if (!this.writerClosed) {
            lr lrVar = this.messageBuffer;
            lrVar.getClass();
            atVar.k(lrVar, atVar.c());
            int i2 = 128;
            int i3 = i | 128;
            if (this.perMessageDeflate && atVar.c() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long j = this.messageBuffer.f3176b;
            this.sinkBuffer.V(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (j <= 125) {
                this.sinkBuffer.V(((int) j) | i2);
            } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.V(i2 | 126);
                this.sinkBuffer.a0((int) j);
            } else {
                this.sinkBuffer.V(i2 | 127);
                this.sinkBuffer.Z(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                lr lrVar2 = this.sinkBuffer;
                byte[] bArr = this.maskKey;
                lrVar2.getClass();
                lrVar2.T(0, bArr, bArr.length);
                if (j > 0) {
                    this.messageBuffer.M(this.maskCursor);
                    this.maskCursor.c(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, j);
            this.sink.f();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(at atVar) throws IOException {
        writeControlFrame(9, atVar);
    }

    public final void writePong(at atVar) throws IOException {
        writeControlFrame(10, atVar);
    }
}
