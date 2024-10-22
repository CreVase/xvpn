package defpackage;

import android.widget.FrameLayout;
import com.security.xvpn.z35kb.browser.PrivateBrowser;

/* loaded from: classes2.dex */
public final /* synthetic */ class k82 implements fc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo3 f2906b;

    public /* synthetic */ k82(yo3 yo3Var, int i) {
        this.f2905a = i;
        this.f2906b = yo3Var;
    }

    @Override // defpackage.cc
    public final void a(int i) {
        int i2;
        int i3;
        int i4 = this.f2905a;
        yo3 yo3Var = this.f2906b;
        switch (i4) {
            case 0:
                PrivateBrowser privateBrowser = (PrivateBrowser) yo3Var;
                FrameLayout frameLayout = privateBrowser.t;
                if (i == 0 && !privateBrowser.H) {
                    i3 = privateBrowser.A;
                } else {
                    i3 = 0;
                }
                frameLayout.setPadding(0, 0, 0, i3);
                return;
            default:
                j53 j53Var = (j53) yo3Var;
                FrameLayout frameLayout2 = j53Var.i;
                if (i == 0 && !j53Var.r) {
                    i2 = j53Var.v;
                } else {
                    i2 = 0;
                }
                frameLayout2.setPadding(0, 0, 0, i2);
                return;
        }
    }
}
