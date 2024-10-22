package defpackage;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public final /* synthetic */ class nt3 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XEditText f3539b;

    public /* synthetic */ nt3(XEditText xEditText, int i) {
        this.f3538a = i;
        this.f3539b = xEditText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3538a;
        XEditText xEditText = this.f3539b;
        switch (i) {
            case 0:
                int i2 = XEditText.k;
                xEditText.setText("");
                return;
            default:
                int i3 = XEditText.k;
                if (xEditText.getTransformationMethod() instanceof PasswordTransformationMethod) {
                    xEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    xEditText.setRight(xEditText.getResources().getDrawable(R.drawable.ic_pass_cipertext));
                    return;
                } else {
                    xEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    xEditText.setRight(xEditText.getResources().getDrawable(R.drawable.ic_pass_cleartext));
                    return;
                }
        }
    }
}
