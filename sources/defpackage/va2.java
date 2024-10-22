package defpackage;

import a.bx;
import a.du;
import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class va2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xa2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va2(xa2 xa2Var, int i) {
        super(1);
        this.f = i;
        this.g = xa2Var;
    }

    public final void a(View view) {
        int i;
        int i2 = this.f;
        xa2 xa2Var = this.g;
        switch (i2) {
            case 0:
                AppCompatEditText appCompatEditText = xa2Var.j;
                if (appCompatEditText != null) {
                    appCompatEditText.requestFocus();
                    Editable text = appCompatEditText.getText();
                    if (text != null) {
                        i = text.length();
                    } else {
                        i = 0;
                    }
                    appCompatEditText.setSelection(i);
                    m20.J0(appCompatEditText);
                    return;
                }
                return;
            default:
                eb2 eb2Var = new eb2();
                eb2Var.k = new va2(xa2Var, 1);
                eb2Var.show(xa2Var.getChildFragmentManager(), "ProtocolTlsDomain");
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        xa2 xa2Var = this.g;
        switch (i) {
            case 0:
                a((View) obj);
                return ch3Var;
            case 1:
                String str = (String) obj;
                AppCompatTextView appCompatTextView = xa2Var.k;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(str);
                }
                return ch3Var;
            case 2:
                a((View) obj);
                return ch3Var;
            default:
                bc2 bc2Var = (bc2) obj;
                if (!ew3.X()) {
                    bx j = hx2.j(bc2Var.f445a, 572);
                    boolean q = j.q();
                    j.h();
                    if (q) {
                        du.d(272, null);
                    }
                    bx3.d0(xa2Var.requireActivity());
                } else {
                    du.d(272, null);
                    pe0.d(bc2Var.f445a);
                    String str2 = bc2Var.f445a;
                    bx bxVar = new bx();
                    bxVar.z(str2);
                    du.d(571, bxVar);
                    bxVar.h();
                    pe0.c();
                    int i2 = HomeActivity.l;
                    d5.J();
                }
                return ch3Var;
        }
    }
}
