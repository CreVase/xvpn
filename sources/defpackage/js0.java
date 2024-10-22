package defpackage;

/* loaded from: classes2.dex */
public abstract class js0 implements Runnable, Comparable, yl0 {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f2820a;

    /* renamed from: b, reason: collision with root package name */
    public int f2821b = -1;

    public js0(long j) {
        this.f2820a = j;
    }

    public final o83 a() {
        Object obj = this._heap;
        if (obj instanceof o83) {
            return (o83) obj;
        }
        return null;
    }

    public final int c(long j, ks0 ks0Var, ls0 ls0Var) {
        js0 js0Var;
        synchronized (this) {
            if (this._heap == ya0.f5300b) {
                return 2;
            }
            synchronized (ks0Var) {
                try {
                    js0[] js0VarArr = ks0Var.f3618a;
                    if (js0VarArr != null) {
                        js0Var = js0VarArr[0];
                    } else {
                        js0Var = null;
                    }
                    if (ls0.S(ls0Var)) {
                        return 1;
                    }
                    if (js0Var == null) {
                        ks0Var.c = j;
                    } else {
                        long j2 = js0Var.f2820a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - ks0Var.c > 0) {
                            ks0Var.c = j;
                        }
                    }
                    long j3 = this.f2820a;
                    long j4 = ks0Var.c;
                    if (j3 - j4 < 0) {
                        this.f2820a = j4;
                    }
                    ks0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f2820a - ((js0) obj).f2820a;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.yl0
    public final void d() {
        ks0 ks0Var;
        synchronized (this) {
            Object obj = this._heap;
            pq0 pq0Var = ya0.f5300b;
            if (obj == pq0Var) {
                return;
            }
            if (obj instanceof ks0) {
                ks0Var = (ks0) obj;
            } else {
                ks0Var = null;
            }
            if (ks0Var != null) {
                ks0Var.d(this);
            }
            this._heap = pq0Var;
        }
    }

    public final void e(ks0 ks0Var) {
        boolean z;
        if (this._heap != ya0.f5300b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this._heap = ks0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2820a + ']';
    }
}
