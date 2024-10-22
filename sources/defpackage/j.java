package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import com.security.xvpn.z35kb.AboutActivity;
import com.security.xvpn.z35kb.WebViewActivity;

/* loaded from: classes2.dex */
public final class j extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ AboutActivity g;
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, AboutActivity aboutActivity) {
        super(1);
        this.f = 2;
        this.h = dVar;
        this.g = aboutActivity;
    }

    public final void a(View view) {
        AboutActivity aboutActivity = this.g;
        int i = this.f;
        d dVar = this.h;
        switch (i) {
            case 0:
                tf3.h0(aboutActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", dVar.f1710a)), 0, 4);
                return;
            case 1:
                tf3.h0(aboutActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", dVar.f1710a)), 0, 4);
                return;
            default:
                OssLicensesMenuActivity.setActivityTitle(dVar.f1710a);
                aboutActivity.startActivity(new Intent(aboutActivity, (Class<?>) OssLicensesMenuActivity.class));
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((View) obj);
                return ch3Var;
            case 1:
                a((View) obj);
                return ch3Var;
            default:
                a((View) obj);
                return ch3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AboutActivity aboutActivity, d dVar, int i) {
        super(1);
        this.f = i;
        this.g = aboutActivity;
        this.h = dVar;
    }
}
