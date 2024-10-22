package defpackage;

import android.animation.LayoutTransition;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.browser.PrivateBrowser;

/* loaded from: classes2.dex */
public final /* synthetic */ class j82 implements fr, aw3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrivateBrowser f2721a;

    public /* synthetic */ j82(PrivateBrowser privateBrowser) {
        this.f2721a = privateBrowser;
    }

    @Override // defpackage.fr
    public final void a(int i, String str) {
        int i2 = PrivateBrowser.L;
        PrivateBrowser privateBrowser = this.f2721a;
        privateBrowser.getClass();
        switch (i) {
            case 1:
                privateBrowser.x.reload();
                return;
            case 2:
                privateBrowser.x.stopLoading();
                privateBrowser.n.setShowProgress(false);
                return;
            case 3:
            case 4:
            case 5:
                privateBrowser.D = false;
                privateBrowser.B = true;
                if (str != null && !str.trim().isEmpty()) {
                    if (i == 5) {
                        if (ya0.X(str)) {
                            str = ya0.Y(str);
                        } else {
                            str = ya0.P(str);
                        }
                    }
                    if (i == 3) {
                        str = ya0.Y(str);
                    }
                    privateBrowser.x.loadUrl(str);
                    privateBrowser.n.setUrl(str);
                    privateBrowser.n.setShowProgress(true);
                    privateBrowser.n.setWebProgress(0.1f);
                    privateBrowser.y.setVisibility(8);
                    privateBrowser.u.setVisibility(8);
                    return;
                }
                return;
            case 6:
                privateBrowser.y.setVisibility(0);
                privateBrowser.B = false;
                return;
            case 7:
                privateBrowser.u.setVisibility(8);
                if (privateBrowser.o.isEnabled()) {
                    privateBrowser.B = true;
                    privateBrowser.y.setVisibility(8);
                    privateBrowser.n.setUrl(privateBrowser.x.getUrl());
                    return;
                }
                return;
            case 8:
                privateBrowser.z.e(true, true, true);
                return;
            case 9:
                if (!TextUtils.isEmpty(str) && privateBrowser.n.G) {
                    privateBrowser.u.setVisibility(0);
                    if (str.contains(".") && !str.endsWith(".")) {
                        privateBrowser.w.setVisibility(0);
                        privateBrowser.v.setText(str);
                        privateBrowser.w.setText(str);
                        if (ya0.X(str)) {
                            privateBrowser.v.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_browser_input_load, 0, 0, 0);
                            privateBrowser.w.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_browser_input_search, 0, 0, 0);
                            privateBrowser.v.setId(R.id.tv_input_expand_item_load);
                            privateBrowser.w.setId(R.id.tv_input_expand_item_search);
                            return;
                        }
                        privateBrowser.v.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_browser_input_search, 0, 0, 0);
                        privateBrowser.w.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_browser_input_load, 0, 0, 0);
                        privateBrowser.v.setId(R.id.tv_input_expand_item_search);
                        privateBrowser.w.setId(R.id.tv_input_expand_item_load);
                        return;
                    }
                    privateBrowser.v.setText(str);
                    privateBrowser.v.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_browser_input_search, 0, 0, 0);
                    privateBrowser.v.setId(R.id.tv_input_expand_item_search);
                    privateBrowser.w.setVisibility(8);
                    privateBrowser.w.setId(0);
                    return;
                }
                privateBrowser.u.setVisibility(8);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.aw3
    public final void d(boolean z) {
        LayoutTransition layoutTransition;
        int i;
        PrivateBrowser privateBrowser = this.f2721a;
        if (z != privateBrowser.H) {
            ViewGroup viewGroup = (ViewGroup) privateBrowser.z.getParent();
            if (z) {
                layoutTransition = new LayoutTransition();
            } else {
                layoutTransition = null;
            }
            viewGroup.setLayoutTransition(layoutTransition);
            privateBrowser.H = z;
            FrameLayout frameLayout = privateBrowser.t;
            if (z) {
                i = 0;
            } else {
                i = privateBrowser.A;
            }
            frameLayout.setPadding(0, 0, 0, i);
            privateBrowser.s.postDelayed(new i82(privateBrowser, 2), 0L);
        }
    }
}
