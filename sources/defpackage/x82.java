package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class x82 extends v implements y82, jw {
    public final jw d;

    public x82(t90 t90Var, or orVar) {
        super(t90Var, true);
        this.d = orVar;
    }

    @Override // defpackage.v
    public final void W(boolean z, Throwable th) {
        if (!this.d.g(th) && !z) {
            zf3.H(this.c, th);
        }
    }

    @Override // defpackage.v
    public final void X(Object obj) {
        this.d.g(null);
    }

    @Override // defpackage.v, defpackage.nf1, defpackage.df1
    public final boolean a() {
        return super.a();
    }

    @Override // defpackage.yg2
    public final Object b() {
        return this.d.b();
    }

    @Override // defpackage.nf1, defpackage.df1
    public final void c(CancellationException cancellationException) {
        boolean z;
        Object F = F();
        if (!(F instanceof d30) && (!(F instanceof lf1) || !((lf1) F).e())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (cancellationException == null) {
                cancellationException = new ef1(u(), null, this);
            }
            s(cancellationException);
        }
    }

    @Override // defpackage.ep2
    public final boolean g(Throwable th) {
        return this.d.g(th);
    }

    @Override // defpackage.ep2
    public final void h(fv2 fv2Var) {
        this.d.h(fv2Var);
    }

    @Override // defpackage.yg2
    public final nr iterator() {
        return this.d.iterator();
    }

    @Override // defpackage.ep2
    public final Object j(Object obj) {
        return this.d.j(obj);
    }

    @Override // defpackage.ep2
    public final boolean k() {
        return this.d.k();
    }

    @Override // defpackage.yg2
    public final Object m(tu2 tu2Var) {
        return this.d.m(tu2Var);
    }

    @Override // defpackage.nf1
    public final void s(CancellationException cancellationException) {
        this.d.c(cancellationException);
        r(cancellationException);
    }
}
