package okhttp3;

import defpackage.at;
import defpackage.c93;
import defpackage.d93;
import defpackage.lr;
import defpackage.m20;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.r32;
import defpackage.sr;
import defpackage.t9;
import defpackage.v73;
import defpackage.xg2;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes2.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final r32 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final at crlfDashDashBoundary;
    private PartSource currentPart;
    private final at dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final sr source;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final r32 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Part implements Closeable {
        private final sr body;
        private final Headers headers;

        public Part(Headers headers, sr srVar) {
            this.headers = headers;
            this.body = srVar;
        }

        public final sr body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* loaded from: classes2.dex */
    public final class PartSource implements mx2 {
        private final d93 timeout = new d93();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m20.L(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // defpackage.mx2
        public long read(lr lrVar, long j) {
            boolean z;
            long read;
            long j2;
            long read2;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (m20.L(MultipartReader.this.currentPart, this)) {
                    d93 timeout = MultipartReader.this.source.timeout();
                    d93 d93Var = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    c93 c93Var = d93.Companion;
                    long timeoutNanos2 = d93Var.timeoutNanos();
                    long timeoutNanos3 = timeout.timeoutNanos();
                    c93Var.getClass();
                    if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                        timeoutNanos2 = timeoutNanos3;
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(timeoutNanos2, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (d93Var.hasDeadline()) {
                            j2 = deadlineNanoTime;
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), d93Var.deadlineNanoTime()));
                        } else {
                            j2 = deadlineNanoTime;
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(lrVar, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (d93Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j2);
                            }
                            return read2;
                        } catch (Throwable th) {
                            long j3 = j2;
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (d93Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j3);
                            }
                            throw th;
                        }
                    }
                    if (d93Var.hasDeadline()) {
                        timeout.deadlineNanoTime(d93Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(lrVar, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (d93Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (d93Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
        }

        @Override // defpackage.mx2
        public d93 timeout() {
            return this.timeout;
        }
    }

    static {
        at atVar = new at(t9.l("\r\n"));
        atVar.c = "\r\n";
        at atVar2 = new at(t9.l("--"));
        atVar2.c = "--";
        at atVar3 = new at(t9.l(" "));
        atVar3.c = " ";
        at atVar4 = new at(t9.l("\t"));
        atVar4.c = "\t";
        afterBoundaryOptions = v73.m(atVar, atVar2, atVar3, atVar4);
    }

    public MultipartReader(sr srVar, String str) throws IOException {
        this.source = srVar;
        this.boundary = str;
        lr lrVar = new lr();
        lrVar.d0("--");
        lrVar.d0(str);
        this.dashDashBoundary = lrVar.u();
        lr lrVar2 = new lr();
        lrVar2.d0("\r\n--");
        lrVar2.d0(str);
        this.crlfDashDashBoundary = lrVar2.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long currentPartBytesRemaining(long r25) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.currentPartBytesRemaining(long):long");
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.A(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.c());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.c());
            }
            boolean z = false;
            while (true) {
                int C = this.source.C(afterBoundaryOptions);
                if (C != -1) {
                    if (C != 0) {
                        if (C != 1) {
                            if (C == 2 || C == 3) {
                                z = true;
                            }
                        } else {
                            if (!z) {
                                if (this.partCount != 0) {
                                    this.noMoreParts = true;
                                    return null;
                                }
                                throw new ProtocolException("expected at least 1 part");
                            }
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, new xg2(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            sr r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 != 0) goto Lc
            r3 = 0
            goto L12
        Lc:
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
        L12:
            if (r3 == 0) goto L18
            r2.<init>(r0, r3)
            return
        L18:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
