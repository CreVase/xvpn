package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class sl0 extends ul0 implements ca0, c90 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(sl0.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final v90 d;
    public final c90 e;
    public Object f;
    public final Object g;

    public sl0(v90 v90Var, c90 c90Var) {
        super(-1);
        this.d = v90Var;
        this.e = c90Var;
        this.f = tf3.p;
        this.g = getContext().fold(0, gv2.u);
    }

    @Override // defpackage.ul0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof e30) {
            ((e30) obj).f1879b.invoke(cancellationException);
        }
    }

    @Override // defpackage.ul0
    public final c90 c() {
        return this;
    }

    @Override // defpackage.ca0
    public final ca0 getCallerFrame() {
        c90 c90Var = this.e;
        if (c90Var instanceof ca0) {
            return (ca0) c90Var;
        }
        return null;
    }

    @Override // defpackage.c90
    public final t90 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.ul0
    public final Object j() {
        Object obj = this.f;
        this.f = tf3.p;
        return obj;
    }

    @Override // defpackage.c90
    public final void resumeWith(Object obj) {
        Object d30Var;
        boolean z;
        c90 c90Var = this.e;
        t90 context = c90Var.getContext();
        Throwable a2 = qk2.a(obj);
        if (a2 == null) {
            d30Var = obj;
        } else {
            d30Var = new d30(false, a2);
        }
        v90 v90Var = this.d;
        if (v90Var.L()) {
            this.f = d30Var;
            this.c = 0;
            v90Var.K(context, this);
            return;
        }
        ms0 a3 = n83.a();
        if (a3.f3343b >= 4294967296L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f = d30Var;
            this.c = 0;
            gg ggVar = a3.d;
            if (ggVar == null) {
                ggVar = new gg();
                a3.d = ggVar;
            }
            ggVar.c(this);
            return;
        }
        a3.O(true);
        try {
            t90 context2 = getContext();
            Object o0 = zf3.o0(context2, this.g);
            try {
                c90Var.resumeWith(obj);
                do {
                } while (a3.Q());
            } finally {
                zf3.e0(context2, o0);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + pe0.T(this.e) + ']';
    }
}
