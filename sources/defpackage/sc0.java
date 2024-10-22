package defpackage;

import com.security.xvpn.z35kb.Adv4.appopen.CustomOpenAdActivity;

/* loaded from: classes2.dex */
public final class sc0 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ CustomOpenAdActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc0(CustomOpenAdActivity customOpenAdActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = customOpenAdActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new sc0(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((sc0) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            lv2 lv2Var = new lv2(new qc0(null));
            CustomOpenAdActivity customOpenAdActivity = this.f;
            nz0 nz0Var = new nz0(lv2Var, new rc0(customOpenAdActivity, null));
            kv2 kv2Var = new kv2(customOpenAdActivity, 1);
            this.e = 1;
            if (nz0Var.a(kv2Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
