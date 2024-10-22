package defpackage;

import a.du;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.browser.BrowserSettingActivity;
import com.security.xvpn.z35kb.browser.BrowserTabIndexActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;
import java.io.File;

/* loaded from: classes2.dex */
public final /* synthetic */ class f53 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j53 f2045b;

    public /* synthetic */ f53(j53 j53Var, int i) {
        this.f2044a = i;
        this.f2045b = j53Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zj2 zj2Var = null;
        int i = this.f2044a;
        j53 j53Var = this.f2045b;
        switch (i) {
            case 0:
                j53Var.getClass();
                String charSequence = ((TextView) view).getText().toString();
                j53Var.p = true;
                if (view.getId() == R.id.tv_input_expand_item_load) {
                    j53Var.c.b(3, ya0.Y(charSequence));
                } else {
                    j53Var.c.b(4, ya0.P(charSequence));
                }
                j53Var.j.setVisibility(8);
                j53Var.n.setVisibility(8);
                return;
            case 1:
                j53Var.c.D.callOnClick();
                return;
            case 2:
                o82 o82Var = j53Var.w;
                o82Var.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                PrivateBrowserActivity privateBrowserActivity = o82Var.f3616a;
                if (elapsedRealtime - privateBrowserActivity.q >= 500) {
                    privateBrowserActivity.a0();
                    privateBrowserActivity.l = true;
                    ya0.H(privateBrowserActivity, MainActivity.class);
                    privateBrowserActivity.overridePendingTransition(R.anim.browser_slide_left_in, R.anim.browser_slide_right_out);
                    if (ya0.e0()) {
                        privateBrowserActivity.k.getClass();
                        br.a(false);
                        br.b();
                    }
                    XApplication.e.remove(privateBrowserActivity);
                    return;
                }
                return;
            case 3:
                j53Var.m.stopLoading();
                j53Var.o.e(true, true, true);
                if (j53Var.n.getVisibility() == 0) {
                    j53Var.m.goForward();
                    j53Var.c.setUrl(j53Var.m.getUrl());
                    j53Var.n.setVisibility(8);
                    return;
                }
                j53Var.m.goForward();
                return;
            case 4:
                j53Var.m.stopLoading();
                j53Var.o.e(true, true, true);
                if (j53Var.m.canGoBack()) {
                    j53Var.m.goBack();
                    return;
                }
                j53Var.c.c();
                j53Var.n.setVisibility(0);
                j53Var.g.setEnabled(true);
                j53Var.f.setEnabled(false);
                return;
            case 5:
                o82 o82Var2 = j53Var.w;
                o82Var2.getClass();
                int i2 = PrivateBrowserActivity.r;
                PrivateBrowserActivity privateBrowserActivity2 = o82Var2.f3616a;
                new File(privateBrowserActivity2.c.getCacheDir(), "web_icon").delete();
                zj2 zj2Var2 = d5.e;
                if (zj2Var2 != null) {
                    zj2Var = zj2Var2;
                }
                zj2Var.evictAll();
                privateBrowserActivity2.k.getClass();
                br.a(true);
                br.b();
                return;
            case 6:
                o82 o82Var3 = j53Var.w;
                o82Var3.getClass();
                int i3 = BrowserTabIndexActivity.k;
                PrivateBrowserActivity privateBrowserActivity3 = o82Var3.f3616a;
                privateBrowserActivity3.startActivity(new Intent(privateBrowserActivity3, (Class<?>) BrowserTabIndexActivity.class));
                privateBrowserActivity3.overridePendingTransition(R.anim.none, R.anim.none);
                return;
            case 7:
                ya0.H(j53Var.f2705a, BrowserSettingActivity.class);
                if (!ew3.X()) {
                    du.d(629, null);
                    return;
                }
                return;
            default:
                PopupWindow popupWindow = j53Var.s;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    return;
                }
                return;
        }
    }
}
