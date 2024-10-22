package defpackage;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;

/* loaded from: classes.dex */
public final class wj1 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ LifecycleCoroutineScopeImpl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, c90 c90Var) {
        super(2, c90Var);
        this.f = lifecycleCoroutineScopeImpl;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        wj1 wj1Var = new wj1(this.f, c90Var);
        wj1Var.e = obj;
        return wj1Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        wj1 wj1Var = (wj1) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        wj1Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        aa0 aa0Var = (aa0) this.e;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f;
        if (((ck1) lifecycleCoroutineScopeImpl.f252a).d.compareTo(uj1.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.f252a.a(lifecycleCoroutineScopeImpl);
        } else {
            zf3.h(aa0Var.w(), null);
        }
        return ch3.f636a;
    }
}
