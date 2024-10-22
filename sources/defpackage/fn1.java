package defpackage;

import a.bx;
import a.du;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class fn1 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ in1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn1(in1 in1Var, int i) {
        super(1);
        this.f = i;
        this.g = in1Var;
    }

    public final void a(zp2 zp2Var) {
        int i = this.f;
        in1 in1Var = this.g;
        switch (i) {
            case 3:
                ic G = zf3.G();
                if (G != null) {
                    String a2 = zp2Var.a();
                    fn1 fn1Var = new fn1(in1Var, 2);
                    bx j = hx2.j(a2, 541);
                    String u = j.u();
                    j.h();
                    if (!i23.b1(u)) {
                        m20.a1(G, new d6(u, fn1Var, a2, 1));
                        return;
                    } else {
                        fn1Var.invoke(a2);
                        return;
                    }
                }
                return;
            default:
                du.d(271, null);
                if ("Premium".equals(zp2Var.e)) {
                    du.d(278, null);
                }
                if (zp2Var.d() && !ew3.X()) {
                    bx3.d0(in1Var.requireActivity());
                    return;
                }
                ic G2 = zf3.G();
                if (G2 != null) {
                    fn1 fn1Var2 = new fn1(in1Var, 3);
                    bx j2 = hx2.j(zp2Var.a(), 193);
                    boolean q = j2.q();
                    j2.h();
                    if (q) {
                        bx i2 = hx2.i(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
                        boolean q2 = i2.q();
                        i2.h();
                        if (q2) {
                            du.d(139, null);
                            m20.a1(G2, new f6(fn1Var2, zp2Var, 1));
                            return;
                        }
                    }
                    fn1Var2.invoke(zp2Var);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        String obj2;
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        String str = "";
        AppCompatEditText appCompatEditText = null;
        in1 in1Var = this.g;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    AppCompatTextView appCompatTextView = in1Var.n;
                    if (appCompatTextView == null) {
                        appCompatTextView = null;
                    }
                    if (appCompatTextView.isShown()) {
                        AppCompatEditText appCompatEditText2 = in1Var.k;
                        if (appCompatEditText2 != null) {
                            appCompatEditText = appCompatEditText2;
                        }
                        appCompatEditText.setText("");
                    }
                }
                return ch3Var;
            case 1:
                AppCompatEditText appCompatEditText3 = in1Var.k;
                if (appCompatEditText3 == null) {
                    appCompatEditText3 = null;
                }
                appCompatEditText3.requestFocus();
                AppCompatEditText appCompatEditText4 = in1Var.k;
                if (appCompatEditText4 == null) {
                    appCompatEditText4 = null;
                }
                m20.J0(appCompatEditText4);
                AppCompatEditText appCompatEditText5 = in1Var.k;
                if (appCompatEditText5 != null) {
                    appCompatEditText = appCompatEditText5;
                }
                Editable text = appCompatEditText.getText();
                if (text != null && (obj2 = text.toString()) != null) {
                    str = obj2;
                }
                in1.D(in1Var, str);
                return ch3Var;
            case 2:
                String str2 = (String) obj;
                if (in1Var.r) {
                    in1Var.E();
                }
                ew3.T0(str2);
                pe0.c();
                int i2 = HomeActivity.l;
                d5.J();
                return ch3Var;
            case 3:
                a((zp2) obj);
                return ch3Var;
            default:
                a((zp2) obj);
                return ch3Var;
        }
    }
}
