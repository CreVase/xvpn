package defpackage;

import a.du;
import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.browser.BrowserSettingActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowser;
import java.util.Stack;

/* loaded from: classes2.dex */
public final /* synthetic */ class h82 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrivateBrowser f2383b;

    public /* synthetic */ h82(PrivateBrowser privateBrowser, int i) {
        this.f2382a = i;
        this.f2383b = privateBrowser;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2382a;
        PrivateBrowser privateBrowser = this.f2383b;
        switch (i) {
            case 0:
                int i2 = PrivateBrowser.L;
                privateBrowser.getClass();
                String charSequence = ((TextView) view).getText().toString();
                privateBrowser.B = true;
                if (view.getId() == R.id.tv_input_expand_item_load) {
                    privateBrowser.n.b(3, ya0.Y(charSequence));
                } else {
                    privateBrowser.n.b(4, ya0.P(charSequence));
                }
                privateBrowser.u.setVisibility(8);
                privateBrowser.y.setVisibility(8);
                return;
            case 1:
                privateBrowser.n.D.callOnClick();
                return;
            case 2:
                int i3 = PrivateBrowser.L;
                privateBrowser.getClass();
                Stack stack = XApplication.e;
                if (stack.size() > 0) {
                    try {
                        int size = stack.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                Stack stack2 = XApplication.e;
                                if (stack2.get(i4) instanceof MainActivity) {
                                    ((Activity) stack2.get(i4)).finish();
                                    stack2.remove(stack2.get(i4));
                                } else {
                                    i4++;
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                privateBrowser.C = true;
                ya0.H(privateBrowser, MainActivity.class);
                privateBrowser.overridePendingTransition(R.anim.browser_slide_left_in, R.anim.browser_slide_right_out);
                if (ya0.e0()) {
                    privateBrowser.Z(false);
                }
                XApplication.e.remove(privateBrowser);
                return;
            case 3:
                privateBrowser.x.stopLoading();
                privateBrowser.z.e(true, true, true);
                if (privateBrowser.y.getVisibility() == 0) {
                    privateBrowser.x.goForward();
                    privateBrowser.n.setUrl(privateBrowser.x.getUrl());
                    privateBrowser.y.setVisibility(8);
                    return;
                }
                privateBrowser.x.goForward();
                return;
            case 4:
                privateBrowser.x.stopLoading();
                privateBrowser.z.e(true, true, true);
                if (privateBrowser.x.canGoBack()) {
                    privateBrowser.x.goBack();
                    return;
                }
                privateBrowser.n.c();
                privateBrowser.y.setVisibility(0);
                privateBrowser.p.setEnabled(true);
                privateBrowser.o.setEnabled(false);
                return;
            case 5:
                int i5 = PrivateBrowser.L;
                privateBrowser.Z(true);
                return;
            case 6:
                int i6 = PrivateBrowser.L;
                privateBrowser.getClass();
                ya0.H(privateBrowser, BrowserSettingActivity.class);
                if (!ew3.X()) {
                    du.d(629, null);
                    return;
                }
                return;
            default:
                PopupWindow popupWindow = privateBrowser.k;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    return;
                }
                return;
        }
    }
}
