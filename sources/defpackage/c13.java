package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class c13 extends a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f567a = AtomicReferenceFieldUpdater.newUpdater(c13.class, Object.class, "_state");
    private volatile Object _state;

    @Override // defpackage.a2
    public final boolean a(z1 z1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f567a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, pd0.d);
        return true;
    }

    @Override // defpackage.a2
    public final c90[] b(z1 z1Var) {
        f567a.set(this, null);
        return pg1.f3839b;
    }
}
