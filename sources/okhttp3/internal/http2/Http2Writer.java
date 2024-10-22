package okhttp3.internal.http2;

import defpackage.lr;
import defpackage.m20;
import defpackage.ng0;
import defpackage.rr;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* loaded from: classes2.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final lr hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final rr sink;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public Http2Writer(rr rrVar, boolean z) {
        this.sink = rrVar;
        this.client = z;
        lr lrVar = new lr();
        this.hpackBuffer = lrVar;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, lrVar, 3, null);
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
        int i2;
        while (j > 0) {
            long min = Math.min(this.maxFrameSize, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            frameHeader(i, i3, 9, i2);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (!this.closed) {
            if (!this.client) {
                return;
            }
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(m20.d1(Http2.CONNECTION_PREFACE.d(), ">> CONNECTION "), new Object[0]));
            }
            this.sink.r(Http2.CONNECTION_PREFACE);
            this.sink.flush();
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void data(boolean z, int i, lr lrVar, int i2) throws IOException {
        if (!this.closed) {
            dataFrame(i, z ? 1 : 0, lrVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i, int i2, lr lrVar, int i3) throws IOException {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            this.sink.write(lrVar, i3);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
        boolean z;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
        }
        boolean z2 = true;
        if (i2 <= this.maxFrameSize) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((Integer.MIN_VALUE & i) != 0) {
                z2 = false;
            }
            if (z2) {
                Util.writeMedium(this.sink, i2);
                this.sink.k(i3 & 255);
                this.sink.k(i4 & 255);
                this.sink.h(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i2).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        boolean z;
        if (!this.closed) {
            boolean z2 = false;
            if (errorCode.getHttpCode() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                frameHeader(0, bArr.length + 8, 7, 0);
                this.sink.h(i);
                this.sink.h(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.sink.z(bArr);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z, int i, List<Header> list) throws IOException {
        int i2;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.f3176b;
            long min = Math.min(this.maxFrameSize, j);
            if (j == min) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            frameHeader(i, (int) min, 1, i2);
            this.sink.write(this.hpackBuffer, min);
            if (j > min) {
                writeContinuationFrames(i, j - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i, int i2) throws IOException {
        int i3;
        if (!this.closed) {
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            frameHeader(0, 8, 6, i3);
            this.sink.h(i);
            this.sink.h(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        int i3;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.f3176b;
            int min = (int) Math.min(this.maxFrameSize - 4, j);
            int i4 = min + 4;
            long j2 = min;
            if (j == j2) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            frameHeader(i, i4, 5, i3);
            this.sink.h(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j2);
            if (j > j2) {
                writeContinuationFrames(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        boolean z;
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                frameHeader(i, 4, 3, 0);
                this.sink.h(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) throws IOException {
        int i;
        if (!this.closed) {
            int i2 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i2 < 10) {
                int i3 = i2 + 1;
                if (settings.isSet(i2)) {
                    if (i2 != 4) {
                        if (i2 != 7) {
                            i = i2;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    this.sink.g(i);
                    this.sink.h(settings.get(i2));
                }
                i2 = i3;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void windowUpdate(int i, long j) throws IOException {
        boolean z;
        if (!this.closed) {
            if (j != 0 && j <= 2147483647L) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                frameHeader(i, 4, 8, 0);
                this.sink.h((int) j);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
