package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class vg implements dw2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4826a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4827b;
    public final Object c;

    public vg(xg xgVar, dw2 dw2Var) {
        this.f4827b = xgVar;
        this.c = dw2Var;
    }

    @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f4826a;
        Object obj = this.f4827b;
        switch (i) {
            case 0:
                xg xgVar = (xg) obj;
                dw2 dw2Var = (dw2) this.c;
                xgVar.enter();
                try {
                    dw2Var.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.dw2, java.io.Flushable
    public final void flush() {
        int i = this.f4826a;
        Object obj = this.f4827b;
        switch (i) {
            case 0:
                xg xgVar = (xg) obj;
                dw2 dw2Var = (dw2) this.c;
                xgVar.enter();
                try {
                    dw2Var.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // defpackage.dw2
    public final d93 timeout() {
        switch (this.f4826a) {
            case 0:
                return (xg) this.f4827b;
            default:
                return (d93) this.c;
        }
    }

    public final String toString() {
        switch (this.f4826a) {
            case 0:
                return "AsyncTimeout.sink(" + ((dw2) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4827b) + ')';
        }
    }

    @Override // defpackage.dw2
    public final void write(lr lrVar, long j) {
        int i = this.f4826a;
        Object obj = this.c;
        Object obj2 = this.f4827b;
        switch (i) {
            case 0:
                t9.u(lrVar.f3176b, 0L, j);
                while (j > 0) {
                    so2 so2Var = lrVar.f3175a;
                    long j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += so2Var.c - so2Var.f4387b;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                so2Var = so2Var.f;
                            }
                        }
                    }
                    xg xgVar = (xg) obj2;
                    dw2 dw2Var = (dw2) obj;
                    xgVar.enter();
                    try {
                        dw2Var.write(lrVar, j2);
                        if (!xgVar.exit()) {
                            j -= j2;
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
                }
                return;
            default:
                t9.u(lrVar.f3176b, 0L, j);
                while (j > 0) {
                    ((d93) obj).throwIfReached();
                    so2 so2Var2 = lrVar.f3175a;
                    int min = (int) Math.min(j, so2Var2.c - so2Var2.f4387b);
                    ((OutputStream) obj2).write(so2Var2.f4386a, so2Var2.f4387b, min);
                    int i2 = so2Var2.f4387b + min;
                    so2Var2.f4387b = i2;
                    long j3 = min;
                    j -= j3;
                    lrVar.f3176b -= j3;
                    if (i2 == so2Var2.c) {
                        lrVar.f3175a = so2Var2.a();
                        uo2.a(so2Var2);
                    }
                }
                return;
        }
    }

    public vg(OutputStream outputStream, d93 d93Var) {
        this.f4827b = outputStream;
        this.c = d93Var;
    }
}
