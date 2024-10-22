package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class wg implements mx2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4999a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5000b;
    public final Object c;

    public wg(xg xgVar, mx2 mx2Var) {
        this.f5000b = xgVar;
        this.c = mx2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f4999a;
        Object obj = this.f5000b;
        switch (i) {
            case 0:
                xg xgVar = (xg) obj;
                mx2 mx2Var = (mx2) this.c;
                xgVar.enter();
                try {
                    mx2Var.close();
                    if (!xgVar.exit()) {
                        return;
                    } else {
                        throw xgVar.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!xgVar.exit()) {
                        throw e;
                    }
                    throw xgVar.access$newTimeoutException(e);
                } finally {
                    xgVar.exit();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.mx2
    public final long read(lr lrVar, long j) {
        boolean z;
        int i = this.f4999a;
        Object obj = this.c;
        Object obj2 = this.f5000b;
        switch (i) {
            case 0:
                xg xgVar = (xg) obj2;
                mx2 mx2Var = (mx2) obj;
                xgVar.enter();
                try {
                    long read = mx2Var.read(lrVar, j);
                    if (!xgVar.exit()) {
                        return read;
                    }
                    throw xgVar.access$newTimeoutException(null);
                } catch (IOException e) {
                    if (!xgVar.exit()) {
                        throw e;
                    }
                    throw xgVar.access$newTimeoutException(e);
                } finally {
                    xgVar.exit();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    try {
                        ((d93) obj).throwIfReached();
                        so2 S = lrVar.S(1);
                        int read2 = ((InputStream) obj2).read(S.f4386a, S.c, (int) Math.min(j, 8192 - S.c));
                        if (read2 == -1) {
                            if (S.f4387b == S.c) {
                                lrVar.f3175a = S.a();
                                uo2.a(S);
                            }
                            return -1L;
                        }
                        S.c += read2;
                        long j2 = read2;
                        lrVar.f3176b += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        if (t9.R(e2)) {
                            throw new IOException(e2);
                        }
                        throw e2;
                    }
                }
                throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
        }
    }

    @Override // defpackage.mx2
    public final d93 timeout() {
        switch (this.f4999a) {
            case 0:
                return (xg) this.f5000b;
            default:
                return (d93) this.c;
        }
    }

    public final String toString() {
        switch (this.f4999a) {
            case 0:
                return "AsyncTimeout.source(" + ((mx2) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.f5000b) + ')';
        }
    }

    public wg(InputStream inputStream, d93 d93Var) {
        this.f5000b = inputStream;
        this.c = d93Var;
    }
}
