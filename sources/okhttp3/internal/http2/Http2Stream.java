package okhttp3.internal.http2;

import defpackage.d93;
import defpackage.dw2;
import defpackage.lr;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.sr;
import defpackage.xg;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class FramingSource implements mx2 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final lr receiveBuffer = new lr();
        private final lr readBuffer = new lr();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                setClosed$okhttp(true);
                j = getReadBuffer().f3176b;
                getReadBuffer().a();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final lr getReadBuffer() {
            return this.readBuffer;
        }

        public final lr getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:            throw new java.io.IOException("stream closed");     */
        @Override // defpackage.mx2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(defpackage.lr r18, long r19) throws java.io.IOException {
            /*
                r17 = this;
                r1 = r17
                r2 = r19
                r0 = 1
                r5 = 0
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 < 0) goto Ld
                r7 = 1
                goto Le
            Ld:
                r7 = 0
            Le:
                if (r7 == 0) goto Ld0
            L10:
                okhttp3.internal.http2.Http2Stream r7 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r7)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r8 = r7.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lcd
                r8.enter()     // Catch: java.lang.Throwable -> Lcd
                okhttp3.internal.http2.ErrorCode r8 = r7.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L91
                if (r8 == 0) goto L30
                java.io.IOException r8 = r7.getErrorException$okhttp()     // Catch: java.lang.Throwable -> L91
                if (r8 != 0) goto L31
                okhttp3.internal.http2.StreamResetException r8 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L91
                okhttp3.internal.http2.ErrorCode r9 = r7.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L91
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L91
                goto L31
            L30:
                r8 = 0
            L31:
                boolean r9 = r17.getClosed$okhttp()     // Catch: java.lang.Throwable -> L91
                if (r9 != 0) goto Lbd
                lr r9 = r17.getReadBuffer()     // Catch: java.lang.Throwable -> L91
                long r9 = r9.f3176b     // Catch: java.lang.Throwable -> L91
                r11 = -1
                int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r13 <= 0) goto L93
                lr r9 = r17.getReadBuffer()     // Catch: java.lang.Throwable -> L91
                lr r10 = r17.getReadBuffer()     // Catch: java.lang.Throwable -> L91
                long r13 = r10.f3176b     // Catch: java.lang.Throwable -> L91
                long r13 = java.lang.Math.min(r2, r13)     // Catch: java.lang.Throwable -> L91
                r10 = r18
                long r13 = r9.read(r10, r13)     // Catch: java.lang.Throwable -> L91
                long r15 = r7.getReadBytesTotal()     // Catch: java.lang.Throwable -> L91
                long r4 = r15 + r13
                r7.setReadBytesTotal$okhttp(r4)     // Catch: java.lang.Throwable -> L91
                long r4 = r7.getReadBytesTotal()     // Catch: java.lang.Throwable -> L91
                long r15 = r7.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> L91
                long r4 = r4 - r15
                if (r8 != 0) goto La2
                okhttp3.internal.http2.Http2Connection r6 = r7.getConnection()     // Catch: java.lang.Throwable -> L91
                okhttp3.internal.http2.Settings r6 = r6.getOkHttpSettings()     // Catch: java.lang.Throwable -> L91
                int r6 = r6.getInitialWindowSize()     // Catch: java.lang.Throwable -> L91
                int r6 = r6 / 2
                long r9 = (long) r6     // Catch: java.lang.Throwable -> L91
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 < 0) goto La2
                okhttp3.internal.http2.Http2Connection r6 = r7.getConnection()     // Catch: java.lang.Throwable -> L91
                int r9 = r7.getId()     // Catch: java.lang.Throwable -> L91
                r6.writeWindowUpdateLater$okhttp(r9, r4)     // Catch: java.lang.Throwable -> L91
                long r4 = r7.getReadBytesTotal()     // Catch: java.lang.Throwable -> L91
                r7.setReadBytesAcknowledged$okhttp(r4)     // Catch: java.lang.Throwable -> L91
                goto La2
            L91:
                r0 = move-exception
                goto Lc5
            L93:
                boolean r4 = r17.getFinished$okhttp()     // Catch: java.lang.Throwable -> L91
                if (r4 != 0) goto La1
                if (r8 != 0) goto La1
                r7.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L91
                r13 = r11
                r4 = 1
                goto La3
            La1:
                r13 = r11
            La2:
                r4 = 0
            La3:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = r7.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lcd
                r5.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lcd
                monitor-exit(r7)
                if (r4 == 0) goto Lb1
                r5 = 0
                goto L10
            Lb1:
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 == 0) goto Lb9
                r1.updateConnectionFlowControl(r13)
                return r13
            Lb9:
                if (r8 != 0) goto Lbc
                return r11
            Lbc:
                throw r8
            Lbd:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L91
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L91
                throw r0     // Catch: java.lang.Throwable -> L91
            Lc5:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r7.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lcd
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lcd
                throw r0     // Catch: java.lang.Throwable -> Lcd
            Lcd:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
            Ld0:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.Long r2 = java.lang.Long.valueOf(r19)
                java.lang.String r0 = defpackage.m20.d1(r2, r0)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(lr, long):long");
        }

        public final void receive$okhttp(sr srVar, long j) throws IOException {
            boolean finished$okhttp;
            boolean z;
            boolean z2;
            long j2;
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    finished$okhttp = getFinished$okhttp();
                    z = true;
                    if (getReadBuffer().f3176b + j > this.maxByteCount) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    srVar.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (finished$okhttp) {
                    srVar.skip(j);
                    return;
                }
                long read = srVar.read(this.receiveBuffer, j);
                if (read != -1) {
                    j -= read;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        if (getClosed$okhttp()) {
                            j2 = getReceiveBuffer().f3176b;
                            getReceiveBuffer().a();
                        } else {
                            if (getReadBuffer().f3176b != 0) {
                                z = false;
                            }
                            getReadBuffer().l(getReceiveBuffer());
                            if (z) {
                                http2Stream2.notifyAll();
                            }
                            j2 = 0;
                        }
                    }
                    if (j2 > 0) {
                        updateConnectionFlowControl(j2);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // defpackage.mx2
        public d93 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    /* loaded from: classes2.dex */
    public final class StreamTimeout extends xg {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (!exit()) {
            } else {
                throw newTimeoutException(null);
            }
        }

        @Override // defpackage.xg
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // defpackage.xg
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        this.id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        }
        if (isLocallyInitiated()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            if (getSource$okhttp().getFinished$okhttp() && getSink$okhttp().getFinished()) {
                return false;
            }
            setErrorCode$okhttp(errorCode);
            setErrorException$okhttp(iOException);
            notifyAll();
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (!getSource$okhttp().getFinished$okhttp() && getSource$okhttp().getClosed$okhttp() && (getSink$okhttp().getFinished() || getSink$okhttp().getClosed())) {
                z = true;
            } else {
                z = false;
            }
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                if (this.errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        throw new StreamResetException(this.errorCode);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void close(ErrorCode errorCode, IOException iOException) throws IOException {
        if (!closeInternal(errorCode, iOException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, errorCode);
    }

    public final void closeLater(ErrorCode errorCode) {
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    public final void enqueueTrailers(Headers headers) {
        synchronized (this) {
            boolean z = true;
            if (!getSink$okhttp().getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    getSink$okhttp().setTrailers(headers);
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final dw2 getSink() {
        boolean z;
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.sink;
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final mx2 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.getClient$okhttp() == z) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    public final d93 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(sr srVar, int i) throws IOException {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        this.source.receive$okhttp(srVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:10:0x0030, B:14:0x0038, B:16:0x0049, B:17:0x0050, B:24:0x0040), top: B:9:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L2f
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L2f
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Thread "
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2f:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L62
            r1 = 1
            if (r0 == 0) goto L40
            if (r4 != 0) goto L38
            goto L40
        L38:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource$okhttp()     // Catch: java.lang.Throwable -> L62
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L62
            goto L47
        L40:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L62
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L62
            r0.add(r3)     // Catch: java.lang.Throwable -> L62
        L47:
            if (r4 == 0) goto L50
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.getSource$okhttp()     // Catch: java.lang.Throwable -> L62
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L62
        L50:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L62
            r2.notifyAll()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r2)
            if (r3 != 0) goto L61
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L61:
            return
        L62:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final synchronized Headers takeHeaders() throws IOException {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
        } else {
            IOException iOException = this.errorException;
            if (iOException == null) {
                throw new StreamResetException(this.errorCode);
            }
            throw iOException;
        }
        return this.headersQueue.removeFirst();
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().j() && this.source.getReadBuffer().j()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else {
            if (this.errorCode != null) {
                IOException iOException = this.errorException;
                if (iOException == null) {
                    throw new StreamResetException(this.errorCode);
                }
                throw iOException;
            }
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z3 = true;
            this.hasResponseHeaders = true;
            if (z) {
                getSink$okhttp().setFinished(true);
            }
        }
        if (!z2) {
            synchronized (this.connection) {
                if (getConnection().getWriteBytesTotal() < getConnection().getWriteBytesMaximum()) {
                    z3 = false;
                }
            }
            z2 = z3;
        }
        this.connection.writeHeaders$okhttp(this.id, z, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public final d93 writeTimeout() {
        return this.writeTimeout;
    }

    /* loaded from: classes2.dex */
    public final class FramingSink implements dw2 {
        private boolean closed;
        private boolean finished;
        private final lr sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new lr();
        }

        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !getFinished() && !getClosed() && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } finally {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.f3176b);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (z && min == this.sendBuffer.f3176b) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                http2Stream = Http2Stream.this;
            }
        }

        @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (getClosed()) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    if (this.sendBuffer.f3176b > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.trailers != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        while (this.sendBuffer.f3176b > 0) {
                            emitFrame(false);
                        }
                        Http2Stream.this.getConnection().writeHeaders$okhttp(Http2Stream.this.getId(), z, Util.toHeaderList(this.trailers));
                    } else if (z2) {
                        while (this.sendBuffer.f3176b > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    setClosed(true);
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // defpackage.dw2, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.f3176b > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // defpackage.dw2
        public d93 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // defpackage.dw2
        public void write(lr lrVar, long j) throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            this.sendBuffer.write(lrVar, j);
            while (this.sendBuffer.f3176b >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(boolean z, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
