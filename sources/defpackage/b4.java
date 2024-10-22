package defpackage;

import android.text.TextUtils;
import com.security.xvpn.z35kb.television.GuideActivity;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class b4 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ f4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(f4 f4Var, c90 c90Var) {
        super(2, c90Var);
        this.f = f4Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new b4(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((b4) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            sh0 sh0Var = vl0.c;
            a4 a4Var = new a4(null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, a4Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        String str = (String) obj;
        f4 f4Var = this.f;
        ((HomeActivity) f4Var.requireActivity()).N();
        int i2 = 0;
        if (bx3.E(str)) {
            m20.a1(f4Var.requireActivity(), new z3(f4Var, i2));
        } else if (TextUtils.equals(str, "ErrCantDeleteVipUser")) {
            m20.a1(f4Var.requireActivity(), md3.j);
        } else {
            if (str.length() != 0) {
                z = false;
            }
            if (z) {
                f4Var.requireActivity().finish();
                tf3.h0(f4Var.requireActivity(), GuideActivity.class, null, 0, 6);
            } else {
                m20.a1(f4Var.requireActivity(), new q90(15, "Delete Failed,error:".concat(str), f4Var));
            }
        }
        return ch3.f636a;
    }
}
