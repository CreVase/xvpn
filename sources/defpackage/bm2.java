package defpackage;

/* loaded from: classes2.dex */
public final class bm2 extends d90 implements iz0 {
    public final iz0 e;
    public final t90 f;
    public final int g;
    public t90 h;
    public c90 i;

    public bm2(iz0 iz0Var, t90 t90Var) {
        super(f02.f2027a, zq0.f5530a);
        this.e = iz0Var;
        this.f = t90Var;
        this.g = ((Number) t90Var.fold(0, gv2.t)).intValue();
    }

    public final Object a(c90 c90Var, Object obj) {
        t90 context = c90Var.getContext();
        df1 df1Var = (df1) context.get(d5.g);
        if (df1Var != null && !df1Var.a()) {
            throw ((nf1) df1Var).A();
        }
        t90 t90Var = this.h;
        if (t90Var != context) {
            if (!(t90Var instanceof zm0)) {
                if (((Number) context.fold(0, new y9(this, 2))).intValue() == this.g) {
                    this.h = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(t9.F0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((zm0) t90Var).f5509a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.i = c90Var;
        Object invoke = dm2.f1806a.invoke(this.e, obj, this);
        if (!m20.L(invoke, ba0.f430a)) {
            this.i = null;
        }
        return invoke;
    }

    @Override // defpackage.iz0
    public final Object b(Object obj, c90 c90Var) {
        try {
            Object a2 = a(c90Var, obj);
            if (a2 == ba0.f430a) {
                return a2;
            }
            return ch3.f636a;
        } catch (Throwable th) {
            this.h = new zm0(c90Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.mn, defpackage.ca0
    public final ca0 getCallerFrame() {
        c90 c90Var = this.i;
        if (c90Var instanceof ca0) {
            return (ca0) c90Var;
        }
        return null;
    }

    @Override // defpackage.d90, defpackage.c90
    public final t90 getContext() {
        t90 t90Var = this.h;
        if (t90Var == null) {
            return zq0.f5530a;
        }
        return t90Var;
    }

    @Override // defpackage.mn
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = qk2.a(obj);
        if (a2 != null) {
            this.h = new zm0(getContext(), a2);
        }
        c90 c90Var = this.i;
        if (c90Var != null) {
            c90Var.resumeWith(obj);
        }
        return ba0.f430a;
    }

    @Override // defpackage.d90, defpackage.mn
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
