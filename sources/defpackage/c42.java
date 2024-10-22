package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.menu.OtherDevicesListActivity;
import com.security.xvpn.z35kb.widget.PasscodeEditText;

/* loaded from: classes2.dex */
public final class c42 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ OtherDevicesListActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c42(OtherDevicesListActivity otherDevicesListActivity, int i) {
        super(1);
        this.f = i;
        this.g = otherDevicesListActivity;
    }

    public final void a(p9 p9Var) {
        int i = this.f;
        OtherDevicesListActivity otherDevicesListActivity = this.g;
        switch (i) {
            case 0:
                p9Var.f3798a = pd0.y(R.string.LoginRequest);
                ei2 ei2Var = new ei2();
                int i2 = OtherDevicesListActivity.l;
                LinearLayout linearLayout = new LinearLayout(otherDevicesListActivity.c);
                linearLayout.setOrientation(1);
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                appCompatTextView.setId(-1);
                appCompatTextView.setText(R.string.LoginRequestDetails);
                tf3.A0(appCompatTextView);
                fl.n(otherDevicesListActivity, appCompatTextView, 1000015);
                linearLayout.addView(appCompatTextView);
                View inflate = LayoutInflater.from(otherDevicesListActivity.c).inflate(R.layout.passcode_edittext, (ViewGroup) linearLayout, false);
                linearLayout.addView(inflate);
                PasscodeEditText passcodeEditText = (PasscodeEditText) inflate;
                ei2Var.f1938a = passcodeEditText;
                otherDevicesListActivity.bindInvalidate(inflate);
                fl.n(otherDevicesListActivity, (TextView) inflate, 1000013);
                passcodeEditText.setOnEditorActionListener(new b42(0, otherDevicesListActivity, p9Var));
                p9Var.l = linearLayout;
                p9Var.n = y62.J;
                p9Var.h = pd0.y(R.string.Cancel);
                p9Var.d = pd0.y(R.string.OK);
                p9Var.g = new a72(7, ei2Var, otherDevicesListActivity);
                return;
            default:
                p9Var.f3798a = pd0.y(R.string.PasscodeInvalid);
                p9Var.f3799b = pd0.y(R.string.PasscodeInvalidDetails);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                p9.b(p9Var, pd0.y(R.string.Retry), new yy2(otherDevicesListActivity, 13), 2);
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((p9) obj);
                return ch3Var;
            default:
                a((p9) obj);
                return ch3Var;
        }
    }
}
