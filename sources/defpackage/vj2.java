package defpackage;

import android.content.Intent;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ResetPasswordActivity;
import com.security.xvpn.z35kb.widget.PasswordStrengthBar;

/* loaded from: classes2.dex */
public final class vj2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ ResetPasswordActivity f;
    public final /* synthetic */ ei2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj2(ResetPasswordActivity resetPasswordActivity, ei2 ei2Var, c90 c90Var) {
        super(2, c90Var);
        this.f = resetPasswordActivity;
        this.g = ei2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new vj2(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((vj2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
            this.f.T();
            sh0 sh0Var = vl0.c;
            uj2 uj2Var = new uj2(this.f, this.g, null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, uj2Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        fc2 fc2Var = (fc2) obj;
        this.f.N();
        String str = fc2Var.f2075a;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (fc2Var.f2076b) {
                return ch3.f636a;
            }
            if (tf3.X(str)) {
                this.f.a0().o(pd0.y(R.string.ProcessFailedCheckNetwork));
            } else if (i23.R0(str, "must contain:", false)) {
                String j = pd0.j(str);
                this.f.a0().o(j);
                uo.f(this.f).i(j);
            } else {
                String A = pd0.A(str);
                this.f.a0().o(A);
                uo.f(this.f.c).i(A);
            }
        } else {
            m20.v0(this.f.a0().s);
            t9.a();
            u6 u6Var = (u6) this.f.a0();
            u6Var.B = true;
            synchronized (u6Var) {
                u6Var.D |= 2;
            }
            u6Var.e(18);
            u6Var.m();
            tf3.V((PasswordStrengthBar) this.f.b0().c);
            tf3.V((AppCompatTextView) this.f.b0().d);
            tf3.V((AppCompatTextView) this.f.b0().e);
            sm1.a(this.f).c(new Intent("LoginSuccessAction"));
        }
        return ch3.f636a;
    }
}
