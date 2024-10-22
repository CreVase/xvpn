package defpackage;

import a.du;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.l;
import b.ContentWrapper;
import com.security.xvpn.z35kb.AboutActivity;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.TestConsoleActivity;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesListActivity;
import com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import com.security.xvpn.z35kb.television.GuideActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class yy2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy2(Object obj, int i) {
        super(0);
        this.f = i;
        this.g = obj;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m255invoke() {
        int i = 0;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 3:
                ya0.H(((AboutActivity) obj).c, TestConsoleActivity.class);
                return;
            case 4:
                du.d(134, null);
                ya0.H((AdvancedFeaturesActivity) obj, SplitTunnelingActivity.class);
                return;
            case 5:
                ((CompoundButton) obj).setChecked(false);
                return;
            case 6:
                m20.f1((Activity) obj);
                return;
            case 7:
            case 10:
            case 14:
            case 17:
            case 18:
            default:
                uf ufVar = uf.f4657a;
                uf.d((lt3) obj);
                return;
            case 8:
                ((kn) obj).e();
                return;
            case 9:
                ((PrivateBrowserActivity) obj).finish();
                return;
            case 11:
                du.d(199, null);
                int i3 = ConnectionLogActivity.s;
                ((ConnectionLogActivity) obj).Z();
                return;
            case 12:
                int i4 = j60.G;
                ((j60) obj).y();
                return;
            case 13:
                OtherDevicesListActivity otherDevicesListActivity = (OtherDevicesListActivity) obj;
                int i5 = OtherDevicesListActivity.l;
                t9.w0(otherDevicesListActivity.getSupportFragmentManager(), new c42(otherDevicesListActivity, i));
                return;
            case 15:
                Intent intent = new Intent();
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    int i6 = ApplyQuickConnActivity.m;
                    intent.putExtra("android.provider.extra.APP_PACKAGE", ((ApplyQuickConnActivity) obj).c.getPackageName());
                } else {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    ApplyQuickConnActivity applyQuickConnActivity = (ApplyQuickConnActivity) obj;
                    int i7 = ApplyQuickConnActivity.m;
                    ApplicationInfo applicationInfo = applyQuickConnActivity.c.getApplicationInfo();
                    intent.putExtra("app_uid", applicationInfo != null ? Integer.valueOf(applicationInfo.uid) : null);
                    intent.putExtra("app_package", applyQuickConnActivity.c.getPackageName());
                }
                ((ApplyQuickConnActivity) obj).startActivity(intent);
                return;
            case 16:
                boolean z = ServerChooseActivity.u;
                bx3.a(((ServerChooseActivity) obj).c);
                return;
            case 19:
                l requireActivity = ((tr2) obj).requireActivity();
                HomeActivity homeActivity = requireActivity instanceof HomeActivity ? (HomeActivity) requireActivity : null;
                if (homeActivity != null) {
                    homeActivity.U();
                    return;
                }
                return;
            case 20:
                t9.a();
                v31 v31Var = ((tz2) obj).l;
                if (v31Var != null) {
                    v31Var.invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.v31
    public final Object invoke() {
        int i = 1;
        switch (this.f) {
            case 0:
                return (ViewGroup) View.inflate(((az2) this.g).f367a, R.layout.splash_screen_view, null);
            case 1:
                File file = (File) ((yv2) this.g).f5395a.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (yv2.k) {
                    LinkedHashSet linkedHashSet = yv2.j;
                    if (true ^ linkedHashSet.contains(absolutePath)) {
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return file;
            case 2:
                return pe0.A((lm3) this.g);
            case 3:
                m255invoke();
                return ch3.f636a;
            case 4:
                m255invoke();
                return ch3.f636a;
            case 5:
                m255invoke();
                return ch3.f636a;
            case 6:
                m255invoke();
                return ch3.f636a;
            case 7:
                return new ContentWrapper((Context) this.g, null, 6);
            case 8:
                m255invoke();
                return ch3.f636a;
            case 9:
                m255invoke();
                return ch3.f636a;
            case 10:
                return new n53((s53) this.g);
            case 11:
                m255invoke();
                return ch3.f636a;
            case 12:
                m255invoke();
                return ch3.f636a;
            case 13:
                m255invoke();
                return ch3.f636a;
            case 14:
                return ((lm3) ((ui1) this.g).getValue()).getViewModelStore();
            case 15:
                m255invoke();
                return ch3.f636a;
            case 16:
                m255invoke();
                return ch3.f636a;
            case 17:
                return Boolean.valueOf(((GuideActivity) this.g).moveTaskToBack(true));
            case 18:
            default:
                op2 op2Var = (op2) this.g;
                return Integer.valueOf(t9.O(op2Var, op2Var.k));
            case 19:
                m255invoke();
                return ch3.f636a;
            case 20:
                m255invoke();
                return ch3.f636a;
            case 21:
                m255invoke();
                return ch3.f636a;
            case 22:
                return ((r9) this.g).getDialog();
            case 23:
                return new am3((Object[]) this.g);
            case 24:
                j62 j62Var = (j62) this.g;
                return new y80(t9.q("kotlinx.serialization.Polymorphic", h62.f2371a, new mp2[0], new l63(j62Var, i)), j62Var.f2709a);
        }
    }
}
