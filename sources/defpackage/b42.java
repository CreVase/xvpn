package defpackage;

import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.security.xvpn.z35kb.menu.OtherDevicesListActivity;
import com.security.xvpn.z35kb.television.account.SignInActivity;
import com.security.xvpn.z35kb.television.account.SignUpActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class b42 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f398b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b42(int i, Object obj, Object obj2) {
        this.f397a = i;
        this.f398b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Dialog dialog;
        int i2 = this.f397a;
        View view = null;
        Object obj = this.c;
        Object obj2 = this.f398b;
        switch (i2) {
            case 0:
                OtherDevicesListActivity otherDevicesListActivity = (OtherDevicesListActivity) obj2;
                p9 p9Var = (p9) obj;
                if (i == 6) {
                    String obj3 = textView.getText().toString();
                    int i3 = OtherDevicesListActivity.l;
                    otherDevicesListActivity.T();
                    zf3.T(otherDevicesListActivity, null, new f42(otherDevicesListActivity, obj3, null), 3);
                    v31 v31Var = p9Var.o;
                    if (v31Var != null && (dialog = (Dialog) v31Var.invoke()) != null) {
                        dialog.dismiss();
                    }
                }
                return false;
            case 1:
                AppCompatEditText appCompatEditText = (AppCompatEditText) obj2;
                SignInActivity signInActivity = (SignInActivity) obj;
                int i4 = SignInActivity.A;
                if (i == 6) {
                    pe0.E(appCompatEditText);
                    AppCompatButton appCompatButton = signInActivity.y;
                    if (appCompatButton != null) {
                        view = appCompatButton;
                    }
                    view.requestFocus();
                    signInActivity.R().n();
                    return true;
                }
                return false;
            case 2:
                AppCompatEditText appCompatEditText2 = (AppCompatEditText) obj2;
                SignUpActivity signUpActivity = (SignUpActivity) obj;
                int i5 = SignUpActivity.q;
                if (i == 6) {
                    pe0.E(appCompatEditText2);
                    AppCompatButton appCompatButton2 = signUpActivity.j;
                    if (appCompatButton2 != null) {
                        view = appCompatButton2;
                    }
                    view.requestFocus();
                    signUpActivity.R().s();
                    return true;
                }
                return false;
            case 3:
                in1 in1Var = (in1) obj2;
                AppCompatEditText appCompatEditText3 = (AppCompatEditText) obj;
                if (i == 6) {
                    du3 du3Var = in1Var.m;
                    if (du3Var != null) {
                        view = du3Var;
                    }
                    view.requestFocus();
                    pe0.E(appCompatEditText3);
                    return true;
                }
                int i6 = in1.t;
                return false;
            default:
                AppCompatEditText appCompatEditText4 = (AppCompatEditText) obj2;
                e8 e8Var = (e8) obj;
                int i7 = e8.j;
                if (i == 6) {
                    pe0.E(appCompatEditText4);
                    du3 du3Var2 = e8Var.e;
                    if (du3Var2 != null) {
                        view = du3Var2;
                    }
                    view.requestFocus();
                    return true;
                }
                return false;
        }
    }
}
