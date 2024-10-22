package defpackage;

import a.du;
import android.text.TextUtils;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class fu2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hu2 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu2(hu2 hu2Var, String str, String str2, c90 c90Var) {
        super(2, c90Var);
        this.g = hu2Var;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        fu2 fu2Var = new fu2(this.g, this.h, this.i, c90Var);
        fu2Var.f = obj;
        return fu2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((fu2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            sh0 sh0Var = vl0.c;
            eu2 eu2Var = new eu2(this.h, this.i, null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, eu2Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        fc2 fc2Var = (fc2) obj;
        hu2 hu2Var = this.g;
        hu2Var.f.i(Boolean.FALSE);
        boolean z = fc2Var.f2076b;
        ch3 ch3Var = ch3.f636a;
        if (z) {
            return ch3Var;
        }
        if (!TextUtils.isEmpty(fc2Var.f2075a) && !bw3.a(fc2Var.f2075a, "user exist and login") && !bw3.a(fc2Var.f2075a, "wj76qv8gwh")) {
            if (tf3.X(fc2Var.f2075a)) {
                hu2Var.i.i(Boolean.TRUE);
                return ch3Var;
            }
            boolean a2 = bw3.a(fc2Var.f2075a, "email already exist");
            ey1 ey1Var = hu2Var.l;
            if (a2) {
                String y = pd0.y(R.string.EmailExistError);
                yb.f5305b.getClass();
                yb.a(y);
            } else {
                if (TextUtils.equals(fc2Var.f2075a, "Password must be 6+ characters.")) {
                    String y2 = pd0.y(R.string.PasswordTooShort);
                    ey1Var.i(y2);
                    yb.f5305b.getClass();
                    yb.a(y2);
                    return ch3Var;
                }
                if (TextUtils.equals(fc2Var.f2075a, "Use 50 characters or fewer for your password")) {
                    String y3 = pd0.y(R.string.PasswordTooLong);
                    ey1Var.i(y3);
                    yb.f5305b.getClass();
                    yb.a(y3);
                    return ch3Var;
                }
            }
            String A = pd0.A(fc2Var.f2075a);
            yb.f5305b.getClass();
            yb.a(A);
            ey1Var.i(A);
            return ch3Var;
        }
        rt3.e().i(true, ew3.X());
        if (hu2Var.d) {
            du.d(264, null);
        }
        du.d(261, null);
        boolean z2 = yc2.f5314a;
        yc2.f5314a = hu2Var.t;
        ew3.T0("");
        t9.a();
        return ch3Var;
    }
}
