package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.account.ResetPasswordActivity;

/* loaded from: classes2.dex */
public final class uj2 extends z33 implements l41 {
    public final /* synthetic */ ResetPasswordActivity e;
    public final /* synthetic */ ei2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj2(ResetPasswordActivity resetPasswordActivity, ei2 ei2Var, c90 c90Var) {
        super(2, c90Var);
        this.e = resetPasswordActivity;
        this.f = ei2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new uj2(this.e, this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((uj2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        ResetPasswordActivity resetPasswordActivity = this.e;
        String str = resetPasswordActivity.n;
        String str2 = resetPasswordActivity.m;
        String str3 = (String) this.f.f1938a;
        bx bxVar = new bx();
        bxVar.z(str);
        bxVar.z(str2);
        bxVar.z(str3);
        du.d(101, bxVar);
        fc2 fc2Var = new fc2();
        ew3.w0(bxVar, fc2Var);
        bxVar.h();
        boolean z = fc2Var.f2076b;
        rt3.e().i(true, ew3.X());
        return fc2Var;
    }
}
