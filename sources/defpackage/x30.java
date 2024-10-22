package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.PasswordStrengthBar;

/* loaded from: classes2.dex */
public final class x30 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5111a;

    /* renamed from: b, reason: collision with root package name */
    public final View f5112b;
    public final View c;
    public final View d;
    public final View e;

    public /* synthetic */ x30(View view, View view2, View view3, View view4, int i) {
        this.f5111a = i;
        this.f5112b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
    }

    public static x30 a(View view) {
        int i = R.id.passwordStrengthBar;
        PasswordStrengthBar passwordStrengthBar = (PasswordStrengthBar) m20.g0(view, R.id.passwordStrengthBar);
        if (passwordStrengthBar != null) {
            i = R.id.tvPasswordStrength;
            AppCompatTextView appCompatTextView = (AppCompatTextView) m20.g0(view, R.id.tvPasswordStrength);
            if (appCompatTextView != null) {
                i = R.id.tvPasswordStrengthDetails;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) m20.g0(view, R.id.tvPasswordStrengthDetails);
                if (appCompatTextView2 != null) {
                    return new x30(view, passwordStrengthBar, appCompatTextView, appCompatTextView2, 1);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public final LinearLayout b() {
        int i = this.f5111a;
        View view = this.f5112b;
        switch (i) {
            case 0:
                return (LinearLayout) view;
            default:
                return (LinearLayout) view;
        }
    }

    public final ConstraintLayout c() {
        int i = this.f5111a;
        View view = this.f5112b;
        switch (i) {
            case 2:
                return (ConstraintLayout) view;
            default:
                return (ConstraintLayout) view;
        }
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        switch (this.f5111a) {
            case 0:
                return b();
            case 1:
                return this.f5112b;
            case 2:
                return c();
            case 3:
                return b();
            default:
                return c();
        }
    }
}
