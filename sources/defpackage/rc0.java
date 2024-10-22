package defpackage;

import com.security.xvpn.z35kb.Adv4.appopen.CustomOpenAdActivity;

/* loaded from: classes2.dex */
public final class rc0 extends z33 implements n41 {
    public final /* synthetic */ CustomOpenAdActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc0(CustomOpenAdActivity customOpenAdActivity, c90 c90Var) {
        super(3, c90Var);
        this.e = customOpenAdActivity;
    }

    @Override // defpackage.n41
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rc0 rc0Var = new rc0(this.e, (c90) obj3);
        ch3 ch3Var = ch3.f636a;
        rc0Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        CustomOpenAdActivity customOpenAdActivity = this.e;
        customOpenAdActivity.Z().d.setText(">");
        customOpenAdActivity.Z().c.setEnabled(true);
        return ch3.f636a;
    }
}
