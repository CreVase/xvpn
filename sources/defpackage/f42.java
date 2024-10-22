package defpackage;

import android.text.TextUtils;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesListActivity;

/* loaded from: classes2.dex */
public final class f42 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ OtherDevicesListActivity f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(OtherDevicesListActivity otherDevicesListActivity, String str, c90 c90Var) {
        super(2, c90Var);
        this.f = otherDevicesListActivity;
        this.g = str;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new f42(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((f42) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            sh0 sh0Var = vl0.c;
            e42 e42Var = new e42(this.g, null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, e42Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        fc2 fc2Var = (fc2) obj;
        OtherDevicesListActivity otherDevicesListActivity = this.f;
        otherDevicesListActivity.N();
        boolean z2 = fc2Var.f2076b;
        ch3 ch3Var = ch3.f636a;
        if (z2) {
            return ch3Var;
        }
        if (fc2Var.f2075a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            t9.u0(otherDevicesListActivity, d42.g);
            return ch3Var;
        }
        if (tf3.X(fc2Var.f2075a)) {
            t9.w0(otherDevicesListActivity.getSupportFragmentManager(), d42.h);
        } else if (TextUtils.equals(fc2Var.f2075a, "AccountExpired4cu498baf9")) {
            tf3.g0(otherDevicesListActivity, MainActivity.class, tf3.r(new n42("LoginFailed", "AccountExpired")), 603979776);
            otherDevicesListActivity.finish();
        } else if (bw3.a(fc2Var.f2075a, "AccountV5AuthFailed")) {
            t9.u0(otherDevicesListActivity, d42.i);
        } else if (TextUtils.equals(fc2Var.f2075a, "xsxkzk5dc4")) {
            t9.w0(otherDevicesListActivity.getSupportFragmentManager(), new c42(otherDevicesListActivity, i2));
        } else {
            t9.w0(otherDevicesListActivity.getSupportFragmentManager(), d42.j);
        }
        return ch3Var;
    }
}
