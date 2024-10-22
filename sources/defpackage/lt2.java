package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.security.xvpn.z35kb.television.account.SignInActivity;
import com.security.xvpn.z35kb.television.account.SignUpActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class lt2 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatButton f3189b;

    public /* synthetic */ lt2(AppCompatButton appCompatButton, int i) {
        this.f3188a = i;
        this.f3189b = appCompatButton;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f3188a;
        AppCompatButton appCompatButton = this.f3189b;
        switch (i) {
            case 0:
                int i2 = SignInActivity.A;
                if (z) {
                    pe0.E(appCompatButton);
                    return;
                }
                return;
            default:
                int i3 = SignUpActivity.q;
                if (z) {
                    pe0.E(appCompatButton);
                    return;
                }
                return;
        }
    }
}
