package defpackage;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class jd3 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(int i, Object obj, boolean z) {
        super(1);
        this.f = i;
        this.h = obj;
        this.g = z;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        boolean z = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                uq uqVar = (uq) obj;
                uqVar.setCancelable(false);
                String str = (String) obj2;
                uqVar.q = str;
                AppCompatTextView appCompatTextView = uqVar.i;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(str);
                }
                uqVar.r = false;
                AppCompatButton appCompatButton = uqVar.j;
                if (appCompatButton != null) {
                    m20.g1(appCompatButton, false);
                }
                boolean z2 = !z;
                uqVar.s = z2;
                AppCompatButton appCompatButton2 = uqVar.k;
                if (appCompatButton2 != null) {
                    m20.g1(appCompatButton2, z2);
                }
                uqVar.t = z;
                om1 om1Var = uqVar.l;
                if (om1Var != null) {
                    m20.g1(om1Var, z);
                }
                if (!z) {
                    uqVar.n = e.A;
                } else {
                    uqVar.n = null;
                }
                return ch3Var;
            default:
                ad3 ad3Var = (ad3) obj;
                ad3Var.f61a = pd0.y(R.string.Notice);
                ad3Var.f62b = pd0.y(R.string.QueryAllInstallAppDialogText);
                ad3Var.c = pd0.y(R.string.Continue);
                ad3Var.d = new sz2((tz2) obj2, z, 1);
                return ch3Var;
        }
    }
}
