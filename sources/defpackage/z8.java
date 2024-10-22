package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity;

/* loaded from: classes2.dex */
public final class z8 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ AdvancedFeaturesActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(AdvancedFeaturesActivity advancedFeaturesActivity, int i) {
        super(1);
        this.f = i;
        this.g = advancedFeaturesActivity;
    }

    public final void a(View view) {
        int i = this.f;
        AdvancedFeaturesActivity advancedFeaturesActivity = this.g;
        switch (i) {
            case 0:
                t9.u0(advancedFeaturesActivity, y62.l);
                return;
            case 3:
                if (!ew3.X()) {
                    m20.C0(advancedFeaturesActivity, 29);
                    return;
                }
                ew3.d0(new l30(advancedFeaturesActivity, ConnectionLogActivity.class, 8, 9));
                return;
            default:
                if (ew3.X()) {
                    tf3.h0(advancedFeaturesActivity, ApplyQuickConnActivity.class, null, 0, 6);
                    return;
                }
                int i2 = AdvancedFeaturesActivity.n;
                advancedFeaturesActivity.getClass();
                m20.C0(advancedFeaturesActivity, 32);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        AdvancedFeaturesActivity advancedFeaturesActivity = this.g;
        switch (i) {
            case 0:
                a((View) obj);
                return ch3Var;
            case 1:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                spannableStringBuilder.append((CharSequence) "<?>");
                Drawable A = zf3.A(R.drawable.add_domain_help);
                A.setBounds(new Rect(0, 0, tf3.K(17), tf3.K(16)));
                bx3.i(spannableStringBuilder, "<?>", new ImageSpan(A, 2), new x9(new z8(advancedFeaturesActivity, 0)));
                return ch3Var;
            case 2:
                p9 p9Var = (p9) obj;
                p9Var.f3799b = pd0.y(R.string.QueryAllInstallAppDialogText);
                p9.b(p9Var, pd0.y(R.string.Continue), new yy2(advancedFeaturesActivity, 4), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return ch3Var;
            case 3:
                a((View) obj);
                return ch3Var;
            default:
                a((View) obj);
                return ch3Var;
        }
    }
}
