package defpackage;

import a.bx;
import a.du;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.Editable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesListActivity;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.account.SignInActivity;
import com.security.xvpn.z35kb.widget.PasscodeEditText;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a72 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a72(int i, Object obj, Object obj2) {
        super(0);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [mp2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [mp2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [f62, xr0] */
    public final mp2 b() {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 12:
                as0 as0Var = (as0) obj2;
                ?? r0 = (mp2) as0Var.d;
                if (r0 == 0) {
                    Enum[] enumArr = (Enum[]) as0Var.c;
                    r0 = new xr0((String) obj, enumArr.length);
                    for (Enum r02 : enumArr) {
                        r0.j(r02.name(), false);
                    }
                }
                return r0;
            default:
                return t9.q((String) obj2, o23.d, new mp2[0], new l63((as0) obj, 3));
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m0invoke() {
        LinearLayout linearLayout;
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 1:
                ((SplashActivity) obj2).runOnUiThread(new nw3((AnimatorSet) obj, 28));
                return;
            case 2:
                if (m20.L(pe0.b(), "Connected")) {
                    pe0.e();
                }
                zf3.T((aa0) obj2, vl0.c, new fa(null), 2);
                int i2 = na.e;
                l activity = ((na) obj).getActivity();
                dn dnVar = activity instanceof dn ? (dn) activity : null;
                if (dnVar == null || dnVar.isFinishing()) {
                    return;
                }
                dnVar.finish();
                return;
            case 3:
                s53 s53Var = (s53) obj2;
                Context requireContext = s53Var.requireContext();
                j53 j53Var = (j53) ((z91) obj);
                String str = j53Var.x;
                zj2 zj2Var = d5.e;
                if (zj2Var == null) {
                    zj2Var = null;
                }
                zj2Var.remove(str);
                if (d5.p(requireContext.getApplicationContext())) {
                    File file = new File(requireContext.getApplicationContext().getCacheDir(), hx2.p("web_icon/", str));
                    if (file.exists()) {
                        file.delete();
                    }
                }
                s53Var.f.getClass();
                j53Var.m.onPause();
                j53Var.h();
                ArrayList arrayList = br.d;
                arrayList.remove(j53Var);
                Iterator it = br.g.iterator();
                if (!it.hasNext()) {
                    if (m20.L(j53Var, br.e)) {
                        if (!arrayList.isEmpty()) {
                            br.c((z91) d20.L0(arrayList));
                        }
                    } else {
                        z91 z91Var = br.e;
                        if (z91Var != null) {
                            ((j53) z91Var).o(arrayList.size());
                        }
                    }
                    o11 o11Var = s53Var.l;
                    if (o11Var != null && (linearLayout = o11Var.g) != null) {
                        linearLayout.setVisibility(8);
                    }
                    s53Var.n = null;
                    return;
                }
                p71.C(it.next());
                throw null;
            case 4:
                ew3.k0(false);
                ((SwitchCompat) obj2).setChecked(false);
                int i3 = ConnectionLogActivity.s;
                ((ConnectionLogActivity) obj).Z();
                return;
            case 5:
                p71.x((String) obj2, 198);
                int i4 = ConnectionLogActivity.s;
                ((ConnectionLogActivity) obj).Z();
                return;
            case 6:
                ew3.k0(false);
                ((SwitchCompat) obj2).setChecked(false);
                v31 v31Var = (v31) obj;
                if (v31Var != null) {
                    v31Var.invoke();
                    return;
                }
                return;
            case 7:
            case 8:
            case 9:
            default:
                int i5 = ((ae3) ((he3) obj2)).f70a;
                if (i5 == 1) {
                    bx3.d0((HomeActivity) obj);
                    return;
                } else if (i5 == 2) {
                    tf3.h0((HomeActivity) obj, SignInActivity.class, null, 0, 6);
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    pe0.e();
                    return;
                }
            case 10:
                SpeedTestActivity speedTestActivity = (SpeedTestActivity) obj2;
                int i6 = SpeedTestActivity.u;
                speedTestActivity.g0(false);
                bx bxVar = new bx();
                bxVar.z((String) obj);
                du.d(464, bxVar);
                bxVar.h();
                speedTestActivity.setResult(-1);
                speedTestActivity.finish();
                return;
        }
    }

    @Override // defpackage.v31
    public final Object invoke() {
        String str;
        Editable text;
        k71 k71Var;
        bc0 bc0Var;
        im3 defaultViewModelProviderFactory;
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new File(((Context) obj2).getApplicationContext().getFilesDir(), m20.d1(m20.d1(".preferences_pb", ((b72) obj).f420a), "datastore/"));
            case 1:
                m0invoke();
                return ch3Var;
            case 2:
                m0invoke();
                return ch3Var;
            case 3:
                m0invoke();
                return ch3Var;
            case 4:
                m0invoke();
                return ch3Var;
            case 5:
                m0invoke();
                return ch3Var;
            case 6:
                m0invoke();
                return ch3Var;
            case 7:
                ei2 ei2Var = (ei2) obj2;
                PasscodeEditText passcodeEditText = (PasscodeEditText) ei2Var.f1938a;
                boolean z = false;
                if (passcodeEditText != null && passcodeEditText.length() == 6) {
                    OtherDevicesListActivity otherDevicesListActivity = (OtherDevicesListActivity) obj;
                    PasscodeEditText passcodeEditText2 = (PasscodeEditText) ei2Var.f1938a;
                    if (passcodeEditText2 == null || (text = passcodeEditText2.getText()) == null || (str = text.toString()) == null) {
                        str = "";
                    }
                    int i2 = OtherDevicesListActivity.l;
                    otherDevicesListActivity.T();
                    zf3.T(otherDevicesListActivity, null, new f42(otherDevicesListActivity, str, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                v31 v31Var = (v31) obj2;
                if (v31Var != null && (bc0Var = (bc0) v31Var.invoke()) != null) {
                    return bc0Var;
                }
                lm3 lm3Var = (lm3) ((ui1) obj).getValue();
                k71Var = lm3Var instanceof k71 ? (k71) lm3Var : null;
                return k71Var != null ? k71Var.getDefaultViewModelCreationExtras() : zb0.f5456b;
            case 9:
                lm3 lm3Var2 = (lm3) ((ui1) obj).getValue();
                k71Var = lm3Var2 instanceof k71 ? (k71) lm3Var2 : null;
                return (k71Var == null || (defaultViewModelProviderFactory = k71Var.getDefaultViewModelProviderFactory()) == null) ? ((Fragment) obj2).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 10:
                m0invoke();
                return ch3Var;
            case 11:
                m0invoke();
                return ch3Var;
            case 12:
                return b();
            default:
                return b();
        }
    }
}
