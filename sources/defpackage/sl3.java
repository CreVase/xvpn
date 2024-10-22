package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class sl3 extends x12 implements z12 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4366a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4367b;

    public sl3(kd2 kd2Var) {
        this.f4367b = kd2Var;
    }

    @Override // defpackage.z12
    public final void a(Object obj) {
        ((y12) obj).b(this);
    }

    @Override // defpackage.z12
    public final void b(Object obj) {
        ((y12) obj).a(this);
    }

    public sl3(tl3 tl3Var, int i, ReferenceQueue referenceQueue) {
        this.f4367b = new ro3(tl3Var, i, this, referenceQueue);
    }
}
