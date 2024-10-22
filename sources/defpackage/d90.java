package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class d90 extends mn {
    private final t90 _context;
    private transient c90 intercepted;

    public d90(c90 c90Var, t90 t90Var) {
        super(c90Var);
        this._context = t90Var;
    }

    @Override // defpackage.c90
    public t90 getContext() {
        return this._context;
    }

    public final c90 intercepted() {
        c90 c90Var = this.intercepted;
        if (c90Var == null) {
            t90 context = getContext();
            int i = e90.U;
            e90 e90Var = (e90) context.get(d5.f1730b);
            if (e90Var != null) {
                c90Var = new sl0((v90) e90Var, this);
            } else {
                c90Var = this;
            }
            this.intercepted = c90Var;
        }
        return c90Var;
    }

    @Override // defpackage.mn
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        vu vuVar;
        c90 c90Var = this.intercepted;
        if (c90Var != null && c90Var != this) {
            t90 context = getContext();
            int i = e90.U;
            ((v90) ((e90) context.get(d5.f1730b))).getClass();
            sl0 sl0Var = (sl0) c90Var;
            do {
                atomicReferenceFieldUpdater = sl0.h;
            } while (atomicReferenceFieldUpdater.get(sl0Var) == tf3.q);
            Object obj = atomicReferenceFieldUpdater.get(sl0Var);
            if (obj instanceof vu) {
                vuVar = (vu) obj;
            } else {
                vuVar = null;
            }
            if (vuVar != null) {
                vuVar.o();
            }
        }
        this.intercepted = c30.f572a;
    }

    public d90(c90 c90Var) {
        this(c90Var, c90Var != null ? c90Var.getContext() : null);
    }
}
