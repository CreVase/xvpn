package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.browser.PrivateBrowser;

/* loaded from: classes2.dex */
public final /* synthetic */ class i82 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrivateBrowser f2553b;

    public /* synthetic */ i82(PrivateBrowser privateBrowser, int i) {
        this.f2552a = i;
        this.f2553b = privateBrowser;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2552a;
        PrivateBrowser privateBrowser = this.f2553b;
        int i2 = 0;
        switch (i) {
            case 0:
                int i3 = PrivateBrowser.L;
                privateBrowser.a0(false);
                return;
            case 1:
                int i4 = PrivateBrowser.L;
                View inflate = LayoutInflater.from(privateBrowser.c).inflate(R.layout.popupwindow_private_browser_layout, (ViewGroup) null);
                PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
                privateBrowser.k = popupWindow;
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                privateBrowser.k.setOutsideTouchable(true);
                privateBrowser.k.setFocusable(true);
                inflate.findViewById(R.id.iv_hint).setOnClickListener(new h82(privateBrowser, 7));
                if (!privateBrowser.d) {
                    privateBrowser.k.showAsDropDown(privateBrowser.l, -bx3.t(privateBrowser.c, 10), -bx3.t(privateBrowser.c, 10));
                    return;
                }
                return;
            default:
                View view = privateBrowser.r;
                if (privateBrowser.H) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                return;
        }
    }
}
