package defpackage;

import a.bx;
import a.du;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import b.ContentWrapper;
import com.google.android.material.datepicker.g;
import com.security.xvpn.z35kb.Adv4.appopen.CustomOpenAdActivity;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;
import com.security.xvpn.z35kb.EnforceUpgradeActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.accelerateApp.AllAppActivity;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;
import com.security.xvpn.z35kb.account.ChooseBindSubscribeActivity;
import com.security.xvpn.z35kb.browser.BrowserSettingActivity;
import com.security.xvpn.z35kb.browser.BrowserToolbar;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;
import com.security.xvpn.z35kb.protocol.ProtocolActivity;
import com.security.xvpn.z35kb.protocol.ProtocolSettingsActivity;
import com.security.xvpn.z35kb.ui.components.ConnectingStatusView;
import com.security.xvpn.z35kb.view.GuidePurchaseHeaderView;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public final /* synthetic */ class cr1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1661b;

    public /* synthetic */ cr1(Object obj, int i) {
        this.f1660a = i;
        this.f1661b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1660a;
        int i2 = 1;
        int i3 = 2;
        String str = null;
        AppCompatEditText appCompatEditText = null;
        ViewGroup viewGroup = null;
        Object obj = this.f1661b;
        switch (i) {
            case 0:
                int i4 = g.u;
                ((g) obj).s();
                throw null;
            case 1:
                v00 v00Var = (v00) obj;
                EditText editText = v00Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    v00Var.q();
                    return;
                }
                return;
            case 2:
                ((lo0) obj).u();
                return;
            case 3:
                v42 v42Var = (v42) obj;
                EditText editText2 = v42Var.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = v42Var.f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        v42Var.f.setTransformationMethod(null);
                    } else {
                        v42Var.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        v42Var.f.setSelection(selectionEnd);
                    }
                    v42Var.q();
                    return;
                }
                return;
            case 4:
                xv3 xv3Var = (xv3) obj;
                int i5 = xv3.c;
                xv3Var.getClass();
                yv3.f5398b = false;
                try {
                    ((ViewGroup) xv3Var.getParent()).removeView(xv3Var);
                    yv3.f5397a = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                View view2 = CustomOpenAdActivity.m;
                ((CustomOpenAdActivity) obj).finish();
                return;
            case 6:
                AdvancedFeaturesActivity advancedFeaturesActivity = (AdvancedFeaturesActivity) obj;
                int i6 = AdvancedFeaturesActivity.n;
                if (!ew3.R()) {
                    t9.u0(advancedFeaturesActivity, new z8(advancedFeaturesActivity, i3));
                    return;
                } else {
                    ya0.H(advancedFeaturesActivity, SplitTunnelingActivity.class);
                    return;
                }
            case 7:
                int i7 = EnforceUpgradeActivity.k;
                uf ufVar = uf.f4657a;
                uf.d((EnforceUpgradeActivity) obj);
                return;
            case 8:
                dp1 dp1Var = (dp1) obj;
                if (!dp1Var.l) {
                    du.d(132, null);
                    dp1Var.f.setVisibility(4);
                    dp1Var.g.setVisibility(0);
                    dp1Var.l = true;
                }
                String b2 = pe0.b();
                if (!ew3.X() && (b2.equals("Connected") || b2.equals("Reconnecting"))) {
                    dp1Var.p = true;
                }
                if (bw3.b(b2, "DisConnected")) {
                    ew3.c0(new d9(8));
                }
                if (pe0.b().equals("DisConnected")) {
                    dn dnVar = (dn) dp1Var.getActivity();
                    i30 i30Var = new i30(dp1Var, i2);
                    bx i8 = hx2.i(140);
                    boolean q = i8.q();
                    i8.h();
                    if (q) {
                        t9.u0(dnVar, new fv2(i30Var, 23));
                        return;
                    } else {
                        i30Var.invoke();
                        return;
                    }
                }
                dp1Var.e.d0();
                return;
            case 9:
                int i9 = iq2.m;
                m20.C0(((iq2) obj).getActivity(), 2);
                return;
            case 10:
                k5 k5Var = (k5) obj;
                int i10 = AllAppActivity.t;
                k5Var.f2887b.setText("");
                XEditText xEditText = k5Var.f2887b;
                xEditText.clearFocus();
                m20.v0(xEditText);
                return;
            case 11:
                r9 r9Var = (r9) ((ei2) obj).f1938a;
                if (r9Var != null) {
                    r9Var.dismissAllowingStateLoss();
                }
                d5.D(ew3.M());
                return;
            case 12:
                int i11 = ChooseBindSubscribeActivity.k;
                ((ChooseBindSubscribeActivity) obj).onBackPressed();
                return;
            case 13:
                BrowserSettingActivity browserSettingActivity = (BrowserSettingActivity) obj;
                int i12 = BrowserSettingActivity.m;
                browserSettingActivity.getClass();
                br brVar = br.f513a;
                ya0.H(browserSettingActivity, PrivateBrowserActivity.class);
                browserSettingActivity.overridePendingTransition(R.anim.slide_left_in, R.anim.none);
                browserSettingActivity.finish();
                return;
            case 14:
                BrowserToolbar browserToolbar = (BrowserToolbar) obj;
                browserToolbar.A.setText("");
                browserToolbar.P = false;
                browserToolbar.B.setFloatValues(0.0f, browserToolbar.M);
                browserToolbar.B.start();
                browserToolbar.G = false;
                fr frVar = browserToolbar.f1598a;
                if (frVar != null) {
                    frVar.a(7, null);
                    return;
                }
                return;
            case 15:
                j60 j60Var = (j60) obj;
                x31 x31Var = j60Var.C;
                if (x31Var != null) {
                    x31Var.invoke(j60Var.D.f4943b);
                    return;
                }
                return;
            case 16:
                tt3 tt3Var = ((kz) obj).j;
                if (tt3Var != null) {
                    str = tt3Var.c;
                }
                ew3.b(str);
                return;
            case 17:
                j12 j12Var = (j12) obj;
                int i13 = j12.s;
                ViewParent parent = j12Var.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(j12Var);
                    return;
                }
                return;
            case 18:
                int i14 = ProtocolActivity.o;
                tf3.h0((ProtocolActivity) obj, ProtocolSettingsActivity.class, null, 0, 6);
                return;
            case 19:
                int i15 = sa2.w;
                ((ab2) obj).f.run();
                return;
            case 20:
                qe1 qe1Var = (qe1) obj;
                int i16 = eq.v;
                qe1Var.s.f(qe1Var.t);
                return;
            case 21:
                ue3 ue3Var = (ue3) obj;
                te3 te3Var = ue3Var.g;
                if (te3Var != null) {
                    zp2 zp2Var = (zp2) ue3Var.f.d;
                    x31 x31Var2 = ((kn1) te3Var).e;
                    if (x31Var2 != null) {
                        x31Var2.invoke(zp2Var);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ve3 ve3Var = (ve3) obj;
                x31 x31Var3 = ve3Var.e;
                if (x31Var3 != null) {
                    x31Var3.invoke(ve3Var.g);
                    return;
                }
                return;
            case 23:
                int i17 = fq.d;
                ((fq) obj).dismissAllowingStateLoss();
                yc2.a();
                return;
            case 24:
                yz yzVar = (yz) obj;
                int i18 = yz.g;
                yc2.a();
                yzVar.dismissAllowingStateLoss();
                yzVar.f.invoke(((pb2) yzVar.e.get(yzVar.d)).f3815a);
                return;
            case 25:
                AppCompatEditText appCompatEditText2 = ((e8) obj).d;
                if (appCompatEditText2 != null) {
                    appCompatEditText = appCompatEditText2;
                }
                xm3.g(appCompatEditText);
                return;
            case 26:
                v31 v31Var = ((yo2) obj).d;
                if (v31Var != null) {
                    v31Var.invoke();
                    return;
                }
                return;
            case 27:
                ConnectingStatusView connectingStatusView = (ConnectingStatusView) obj;
                int i19 = ConnectingStatusView.f;
                t9.a();
                connectingStatusView.getClass();
                connectingStatusView.post(new s50(connectingStatusView, 0));
                return;
            case 28:
                int i20 = rl0.n;
                bx3.a(((ContentWrapper) obj).getContext());
                return;
            default:
                int i21 = GuidePurchaseHeaderView.h;
                h50.c();
                m20.C0(((AppCompatButton) obj).getContext(), 100);
                return;
        }
    }
}
