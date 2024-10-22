package defpackage;

import a.bx;
import android.content.ComponentName;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.browser.IntentReceiverActivity;

/* loaded from: classes2.dex */
public final class rf implements qt3 {

    /* renamed from: a, reason: collision with root package name */
    public static final rf f4141a = new rf();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4142b;

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        int i;
        if (XApplication.c) {
            return;
        }
        boolean X = ew3.X();
        bx i2 = hx2.i(355);
        boolean q = i2.q();
        i2.h();
        if (!q) {
            if (X && rt3.e().f4214b != 65286 && !f4142b) {
                ew3.T0("");
                pe0.c();
            }
            f4142b = X;
        }
        if (!XApplication.c) {
            if (X) {
                i = 1;
            } else {
                i = 2;
            }
            try {
                ComponentName componentName = new ComponentName(zf3.z(), IntentReceiverActivity.class.getName());
                if (zf3.z().getPackageManager().getComponentEnabledSetting(componentName) != i) {
                    zf3.z().getPackageManager().setComponentEnabledSetting(componentName, i, 1);
                }
            } catch (Exception e) {
                bx3.M(e);
            }
        }
    }
}
