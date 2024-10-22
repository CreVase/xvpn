package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class mf1 extends nh {

    /* renamed from: b, reason: collision with root package name */
    public final mn1 f3285b;
    public mn1 c;
    public final /* synthetic */ nf1 d;
    public final /* synthetic */ Object e;

    public mf1(mn1 mn1Var, nf1 nf1Var, Object obj) {
        this.d = nf1Var;
        this.e = obj;
        this.f3285b = mn1Var;
    }

    @Override // defpackage.nh
    public final void b(Object obj, Object obj2) {
        boolean z;
        mn1 mn1Var;
        mn1 mn1Var2 = (mn1) obj;
        boolean z2 = false;
        if (obj2 == null) {
            z = true;
        } else {
            z = false;
        }
        mn1 mn1Var3 = this.f3285b;
        if (z) {
            mn1Var = mn1Var3;
        } else {
            mn1Var = this.c;
        }
        if (mn1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mn1.f3319a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(mn1Var2, this, mn1Var)) {
                    z2 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(mn1Var2) != this) {
                    break;
                }
            }
            if (z2 && z) {
                mn1Var3.f(this.c);
            }
        }
    }

    @Override // defpackage.nh
    public final pq0 c(Object obj) {
        boolean z;
        if (this.d.F() == this.e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return pg1.i;
    }
}
