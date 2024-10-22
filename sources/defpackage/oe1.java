package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class oe1 extends ff1 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(oe1.class, "_invoked");
    private volatile int _invoked;
    public final x31 e;

    public oe1(x31 x31Var) {
        this.e = x31Var;
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return ch3.f636a;
    }

    @Override // defpackage.if1
    public final void l(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
