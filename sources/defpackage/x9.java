package defpackage;

import a.du;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.security.xvpn.z35kb.accelerateApp.AllAppActivity;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesForPlayStationActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;

/* loaded from: classes2.dex */
public final class x9 extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5129a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5130b;

    public /* synthetic */ x9(Object obj, int i) {
        this.f5129a = i;
        this.f5130b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.f5129a;
        Object obj = this.f5130b;
        switch (i) {
            case 0:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                AllAppActivity allAppActivity = (AllAppActivity) obj;
                intent.setData(Uri.fromParts("package", allAppActivity.getPackageName(), null));
                allAppActivity.startActivity(intent);
                return;
            case 1:
                r9 r9Var = (r9) ((ei2) obj).f1938a;
                if (r9Var != null) {
                    r9Var.dismissAllowingStateLoss();
                }
                bx3.a(view.getContext());
                return;
            case 2:
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) obj;
                changePasswordActivity.onBackPressed();
                bx3.a(changePasswordActivity);
                return;
            case 3:
                bx3.a((OtherDevicesForPlayStationActivity) obj);
                return;
            case 4:
                du.d(389, null);
                GoogleIABHelper.u(GoogleIABHelper.g, (String) obj);
                return;
            case 5:
                tf3.f0((SpeedTestActivity) obj, ConnectionLogActivity.class, 8);
                return;
            default:
                ((x31) obj).invoke(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5129a) {
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setColor(-11153696);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public x9(z8 z8Var) {
        this.f5129a = 6;
        this.f5130b = z8Var;
    }
}
