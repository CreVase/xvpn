package defpackage;

import a.bx;
import a.du;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.billingclient.api.Purchase;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import com.security.xvpn.z35kb.banner.HomeBannerManager;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.protocol.ProtocolActivity;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.television.SplashActivity;
import com.security.xvpn.z35kb.widget.PasswordStrengthBar;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class to1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4553b;
    public final /* synthetic */ Object c;

    public /* synthetic */ to1(int i, Object obj, Object obj2) {
        this.f4552a = i;
        this.f4553b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        gc3 F;
        View findViewById;
        int i = 11;
        int i2 = 4;
        Object obj = null;
        final int i3 = 0;
        switch (this.f4552a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f4553b;
                String str = (String) this.c;
                int i4 = MainActivity.y;
                Toast.makeText(mainActivity.c, "Error: " + str, 0).show();
                return;
            case 1:
                ((iq2) this.f4553b).e.setAdapter((n40) this.c);
                return;
            case 2:
                iq2 iq2Var = (iq2) this.f4553b;
                qb2 qb2Var = (qb2) this.c;
                int i5 = iq2Var.d;
                if (i5 != 0) {
                    if (i5 == 4) {
                        if (qb2Var != null) {
                            arrayList2 = fl.W(qb2Var.e, true);
                        } else {
                            arrayList2 = new ArrayList();
                        }
                    } else if (i5 == 1) {
                        if (qb2Var != null) {
                            arrayList2 = fl.W(qb2Var.f3978a, true);
                        } else {
                            arrayList2 = new ArrayList();
                        }
                    } else if (i5 != 3) {
                        arrayList = new ArrayList();
                    } else if (qb2Var != null) {
                        arrayList2 = fl.W(qb2Var.f3979b, false);
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    arrayList = arrayList2;
                } else if (qb2Var != null) {
                    arrayList = new ArrayList();
                    arrayList.addAll(fl.W(qb2Var.f, false));
                    fl.L(arrayList);
                    ArrayList W = fl.W(qb2Var.c, false);
                    ArrayList W2 = fl.W(qb2Var.d, false);
                    if (W2.size() != 0) {
                        String y = pd0.y(R.string.Favorites);
                        while (i3 < W2.size()) {
                            ((zp2) W2.get(i3)).f = y;
                            i3++;
                        }
                    }
                    arrayList.addAll(W2);
                    String y2 = pd0.y(R.string.Recommend);
                    Iterator it = W.iterator();
                    while (it.hasNext()) {
                        ((zp2) it.next()).f = y2;
                    }
                    arrayList.addAll(W);
                } else {
                    arrayList = new ArrayList();
                }
                c32 c32Var = iq2Var.k;
                if (c32Var.tryLock()) {
                    ArrayList j0 = tf3.j0(arrayList);
                    if (iq2Var.f.c() > 1) {
                        for (gc3 gc3Var : iq2Var.f.f) {
                            if (gc3Var.c && (F = tf3.F(gc3Var, j0)) != null) {
                                F.c = true;
                            }
                        }
                    }
                    c32Var.unlock();
                    ew3.d0(new y4(20, iq2Var, j0));
                    return;
                }
                return;
            case 3:
                rt3 rt3Var = (rt3) this.f4553b;
                String str2 = (String) this.c;
                rt3Var.getClass();
                try {
                    Toast toast = rt3Var.l;
                    if (toast != null) {
                        toast.cancel();
                        rt3Var.l = null;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        rt3Var.l = Toast.makeText(zf3.f5472a, str2, 0);
                    } else {
                        rt3Var.l = new Toast(zf3.f5472a);
                        View inflate = LayoutInflater.from(zf3.f5472a).inflate(R.layout.toast, (ViewGroup) null);
                        ((TextView) inflate.findViewById(R.id.message)).setText(str2);
                        rt3Var.l.setView(inflate);
                        rt3Var.l.setDuration(0);
                    }
                    rt3Var.l.show();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 4:
                final ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) this.f4553b;
                fc2 fc2Var = (fc2) this.c;
                int i6 = ChangePasswordActivity.q;
                if (changePasswordActivity.d) {
                    return;
                }
                changePasswordActivity.N();
                if (fc2Var.f2076b) {
                    return;
                }
                if (!bw3.b(fc2Var.f2075a, "")) {
                    if (tf3.X(fc2Var.f2075a)) {
                        String y3 = pd0.y(R.string.ProcessFailedCheckNetwork);
                        uo.f(changePasswordActivity.c).i(y3);
                        t9.u0(changePasswordActivity, new ew(i3, changePasswordActivity, y3));
                        return;
                    }
                    if (bw3.a(fc2Var.f2075a, "The password is incorrect.")) {
                        changePasswordActivity.k.q(pd0.y(R.string.ChangePassPasswordIncorrect));
                        uo.f(changePasswordActivity.c).i(pd0.y(R.string.ChangePassPasswordIncorrect));
                        return;
                    }
                    if (TextUtils.equals(fc2Var.f2075a, "Password must be 6+ characters.")) {
                        String y4 = pd0.y(R.string.AccountErrorPasswordMinLen);
                        changePasswordActivity.k.p(y4);
                        uo.f(changePasswordActivity.c).i(y4);
                        return;
                    } else {
                        String A = pd0.A(fc2Var.f2075a);
                        changePasswordActivity.k.p(A);
                        uo.f(changePasswordActivity.c).i(A);
                        if (XApplication.c) {
                            return;
                        }
                        t9.u0(changePasswordActivity, new x31() { // from class: fw
                            @Override // defpackage.x31
                            public final Object invoke(Object obj2) {
                                ch3 ch3Var = ch3.f636a;
                                int i7 = i3;
                                ChangePasswordActivity changePasswordActivity2 = changePasswordActivity;
                                switch (i7) {
                                    case 0:
                                        p9 p9Var = (p9) obj2;
                                        int i8 = ChangePasswordActivity.q;
                                        changePasswordActivity2.getClass();
                                        String y5 = pd0.y(R.string.ContactSupport);
                                        SpannableString spannableString = new SpannableString(pd0.y(R.string.PasswordChangedFailedDetail));
                                        bx3.i(spannableString, y5, new x9(changePasswordActivity2, 2));
                                        p9Var.f3798a = pd0.y(R.string.PasswordChangedFailed);
                                        p9Var.f3799b = spannableString;
                                        p9Var.d = pd0.y(R.string.OK);
                                        p9Var.f = new gw(changePasswordActivity2, 0);
                                        p9Var.c = LinkMovementMethod.getInstance();
                                        return ch3Var;
                                    default:
                                        p9 p9Var2 = (p9) obj2;
                                        int i9 = ChangePasswordActivity.q;
                                        changePasswordActivity2.getClass();
                                        p9Var2.f3798a = pd0.y(R.string.PasswordChangedSuccessfully);
                                        p9Var2.f3799b = pd0.y(R.string.OldPasswordInvalid);
                                        p9Var2.d = pd0.y(R.string.OK);
                                        p9Var2.f = new gw(changePasswordActivity2, 1);
                                        return ch3Var;
                                }
                            }
                        });
                        return;
                    }
                }
                m20.v0(changePasswordActivity.k.r);
                t9.a();
                if (changePasswordActivity.m) {
                    p5 p5Var = (p5) changePasswordActivity.k;
                    p5Var.G = true;
                    synchronized (p5Var) {
                        p5Var.K |= 16;
                    }
                    p5Var.e(18);
                    p5Var.m();
                    ((PasswordStrengthBar) changePasswordActivity.l.c).setVisibility(8);
                    ((AppCompatTextView) changePasswordActivity.l.d).setVisibility(8);
                    ((AppCompatTextView) changePasswordActivity.l.e).setVisibility(8);
                    return;
                }
                t9.u0(changePasswordActivity, new x31() { // from class: fw
                    @Override // defpackage.x31
                    public final Object invoke(Object obj2) {
                        ch3 ch3Var = ch3.f636a;
                        int i7 = r2;
                        ChangePasswordActivity changePasswordActivity2 = changePasswordActivity;
                        switch (i7) {
                            case 0:
                                p9 p9Var = (p9) obj2;
                                int i8 = ChangePasswordActivity.q;
                                changePasswordActivity2.getClass();
                                String y5 = pd0.y(R.string.ContactSupport);
                                SpannableString spannableString = new SpannableString(pd0.y(R.string.PasswordChangedFailedDetail));
                                bx3.i(spannableString, y5, new x9(changePasswordActivity2, 2));
                                p9Var.f3798a = pd0.y(R.string.PasswordChangedFailed);
                                p9Var.f3799b = spannableString;
                                p9Var.d = pd0.y(R.string.OK);
                                p9Var.f = new gw(changePasswordActivity2, 0);
                                p9Var.c = LinkMovementMethod.getInstance();
                                return ch3Var;
                            default:
                                p9 p9Var2 = (p9) obj2;
                                int i9 = ChangePasswordActivity.q;
                                changePasswordActivity2.getClass();
                                p9Var2.f3798a = pd0.y(R.string.PasswordChangedSuccessfully);
                                p9Var2.f3799b = pd0.y(R.string.OldPasswordInvalid);
                                p9Var2.d = pd0.y(R.string.OK);
                                p9Var2.f = new gw(changePasswordActivity2, 1);
                                return ch3Var;
                        }
                    }
                });
                return;
            case 5:
                ForgetPasswordActivity forgetPasswordActivity = (ForgetPasswordActivity) this.f4553b;
                String str3 = (String) this.c;
                int i7 = ForgetPasswordActivity.q;
                forgetPasswordActivity.getClass();
                bx bxVar = new bx();
                bxVar.z(str3);
                du.d(99, bxVar);
                cc2 cc2Var = new cc2();
                cc2Var.f611a = bxVar.s();
                cc2Var.f612b = bxVar.u();
                cc2Var.c = bxVar.q();
                cc2Var.d = bxVar.q();
                bxVar.h();
                forgetPasswordActivity.runOnUiThread(new to1(6, forgetPasswordActivity, cc2Var));
                return;
            case 6:
                ForgetPasswordActivity forgetPasswordActivity2 = (ForgetPasswordActivity) this.f4553b;
                cc2 cc2Var2 = (cc2) this.c;
                int i8 = ForgetPasswordActivity.q;
                forgetPasswordActivity2.N();
                if (!TextUtils.isEmpty(cc2Var2.f612b)) {
                    v01 v01Var = forgetPasswordActivity2.n;
                    if (v01Var != null) {
                        v01Var.cancel();
                        forgetPasswordActivity2.n = null;
                    }
                    forgetPasswordActivity2.o.w.setEnabled(true);
                    forgetPasswordActivity2.o.w.setText(pd0.y(R.string.SendVerificationCode));
                    if (cc2Var2.d) {
                        return;
                    }
                    if (cc2Var2.c) {
                        forgetPasswordActivity2.o.p(pd0.A(cc2Var2.f612b));
                        forgetPasswordActivity2.o.o(null);
                        return;
                    } else {
                        forgetPasswordActivity2.o.p(null);
                        forgetPasswordActivity2.o.o(pd0.A(cc2Var2.f612b));
                        forgetPasswordActivity2.o.v.setTextColor(-52378);
                        return;
                    }
                }
                forgetPasswordActivity2.o.r.requestFocus();
                forgetPasswordActivity2.o.o(pd0.y(R.string.TipsMailSendSuccess));
                forgetPasswordActivity2.o.v.setTextColor(-13323231);
                int i9 = (int) cc2Var2.f611a;
                v01 v01Var2 = forgetPasswordActivity2.n;
                if (v01Var2 != null) {
                    v01Var2.cancel();
                    forgetPasswordActivity2.n = null;
                }
                v01 v01Var3 = new v01(forgetPasswordActivity2, i9 * 1000);
                forgetPasswordActivity2.n = v01Var3;
                v01Var3.start();
                return;
            case 7:
                ((v01) this.f4553b).f4767a.o.w.setText(pd0.z(R.string.SendVerificationCodeWait, (String) this.c));
                return;
            case 8:
                ku kuVar = (ku) this.f4553b;
                fc2 fc2Var2 = (fc2) this.c;
                kuVar.getClass();
                qu2.h = fc2Var2.f2075a;
                qu2 qu2Var = (qu2) kuVar.d;
                if (qu2Var.getActivity() == null || ((lt3) qu2Var.getActivity()).d) {
                    return;
                }
                ((lt3) qu2Var.getActivity()).N();
                if (fc2Var2.f2076b) {
                    return;
                }
                if (!TextUtils.isEmpty(fc2Var2.f2075a) && !bw3.a(fc2Var2.f2075a, "user exist and login")) {
                    if (tf3.X(fc2Var2.f2075a)) {
                        t9.w0(qu2Var.getParentFragmentManager(), new ut2(r5));
                        return;
                    }
                    if (bw3.a(fc2Var2.f2075a, "wj76qv8gwh")) {
                        qu2.z(qu2Var, new Bundle());
                        return;
                    }
                    if (bw3.a(fc2Var2.f2075a, "email already exist")) {
                        uo.f(qu2Var.getActivity()).i(pd0.y(R.string.EmailExistError));
                    } else if (TextUtils.equals(fc2Var2.f2075a, "Password must be 6+ characters.")) {
                        String y5 = pd0.y(R.string.PasswordTooShort);
                        qu2Var.d.p(y5);
                        uo.f(qu2Var.getActivity()).i(y5);
                        return;
                    } else if (TextUtils.equals(fc2Var2.f2075a, "Use 50 characters or fewer for your password")) {
                        String y6 = pd0.y(R.string.PasswordTooLong);
                        qu2Var.d.p(y6);
                        uo.f(qu2Var.getActivity()).i(y6);
                        return;
                    }
                    String A2 = pd0.A(fc2Var2.f2075a);
                    qu2Var.d.o(A2);
                    uo.f(qu2Var.getActivity()).i(A2);
                    return;
                }
                qu2.z(qu2Var, new Bundle());
                return;
            case 9:
                HomeBannerManager homeBannerManager = (HomeBannerManager) this.f4553b;
                t81 t81Var = (t81) this.c;
                homeBannerManager.j();
                Activity activity = homeBannerManager.f1594a;
                ViewGroup viewGroup = activity == null ? null : (ViewGroup) activity.getWindow().getDecorView();
                homeBannerManager.c = t81Var;
                t81Var.getClass();
                if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.fragment_native_ad_wrapper)) != null) {
                    if (t81Var instanceof o81) {
                        findViewById.setTag(null);
                    } else {
                        findViewById.setTag(t81Var.getClass().getCanonicalName());
                    }
                }
                t81Var.b(viewGroup);
                return;
            case 10:
                ChatActivity chatActivity = (ChatActivity) this.f4553b;
                List list = (List) this.c;
                chatActivity.n.clear();
                ArrayList arrayList3 = chatActivity.n;
                arrayList3.addAll(list);
                if (!cz.A) {
                    boolean A3 = ew3.A();
                    cz.A = A3;
                    if (!A3) {
                        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                Object previous = listIterator.previous();
                                tt3 tt3Var = (tt3) previous;
                                if ((!tt3Var.f4578b || tt3Var.j || m20.L("xha3hkfayx", tt3Var.f4577a)) ? false : true) {
                                    obj = previous;
                                }
                            }
                        }
                        cz.C = (tt3) obj;
                    }
                }
                chatActivity.f0(false);
                chatActivity.m.f();
                chatActivity.g0();
                return;
            case 11:
                ProtocolActivity protocolActivity = (ProtocolActivity) this.f4553b;
                bc2 bc2Var = (bc2) this.c;
                int i10 = ProtocolActivity.o;
                protocolActivity.getClass();
                if (!ew3.X()) {
                    bx j = hx2.j(bc2Var.f445a, 572);
                    boolean q = j.q();
                    j.h();
                    int i11 = q ? 31 : -1;
                    if (i11 != -1) {
                        du.d(272, null);
                        m20.C0(protocolActivity.c, i11);
                        return;
                    }
                }
                du.d(272, null);
                tf3.x(protocolActivity, ew3.S0(), new q90(i, bc2Var, protocolActivity));
                return;
            case 12:
                BaseIAPHelper baseIAPHelper = (BaseIAPHelper) this.f4553b;
                ob2 ob2Var = (ob2) this.c;
                ArrayList arrayList4 = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                baseIAPHelper.q((String) ob2Var.f3638b);
                return;
            case 13:
                BaseIAPHelper baseIAPHelper2 = (BaseIAPHelper) this.f4553b;
                String str4 = (String) this.c;
                ArrayList arrayList5 = BaseIAPHelper.f;
                baseIAPHelper2.f();
                rt3.e().i(ew3.o(), ew3.X());
                if (str4.contains("xvec2fucj4")) {
                    baseIAPHelper2.p();
                    baseIAPHelper2.d = 0;
                    return;
                }
                boolean isEmpty = TextUtils.isEmpty(str4);
                bx bxVar2 = new bx();
                bxVar2.v(isEmpty);
                bxVar2.z(str4);
                du.d(318, bxVar2);
                bxVar2.h();
                int i12 = baseIAPHelper2.d;
                if (!(i12 == 3842)) {
                    if (!(i12 == 3843)) {
                        if (TextUtils.isEmpty(str4)) {
                            ew3.a();
                            rt3.e().m();
                            baseIAPHelper2.d = 0;
                            if (baseIAPHelper2.g()) {
                                return;
                            }
                            if (ew3.o()) {
                                baseIAPHelper2.s();
                                return;
                            }
                            yc2.f5315b.g(uc2.f4649a);
                            ic icVar = baseIAPHelper2.f1607a;
                            if (icVar instanceof lt3) {
                                ld2 m = ld2.m(icVar, 1);
                                m.setOnCancelListener(new ao(baseIAPHelper2, r5));
                                m.setOnDismissListener(new d50(r5));
                                m.show();
                                return;
                            }
                            return;
                        }
                        baseIAPHelper2.d = 0;
                        yc2.f5315b.g(new tc2(pd0.y(R.string.TVPremiumAddFailedtips)));
                        if (baseIAPHelper2.g()) {
                            return;
                        }
                        ic icVar2 = baseIAPHelper2.f1607a;
                        if (icVar2 instanceof lt3) {
                            t9.w0(((lt3) icVar2).getSupportFragmentManager(), new wn(baseIAPHelper2, str4, r5));
                            return;
                        }
                        return;
                    }
                }
                if (TextUtils.isEmpty(str4)) {
                    yb ybVar = yb.f5305b;
                    ew3.T0("");
                    t9.a();
                    rt3.e().m();
                    if (baseIAPHelper2.g()) {
                        return;
                    }
                    if (baseIAPHelper2.d == 3843) {
                        yc2.f5315b.g(sc2.f4316b);
                        ic icVar3 = baseIAPHelper2.f1607a;
                        if (icVar3 instanceof lt3) {
                            ld2.m(icVar3, 2).show();
                        }
                        baseIAPHelper2.d = 0;
                        return;
                    }
                    yc2.f5315b.g(wc2.f4982a);
                    ic icVar4 = baseIAPHelper2.f1607a;
                    if (icVar4 instanceof lt3) {
                        t9.w0(((lt3) icVar4).getSupportFragmentManager(), new xn(r5, baseIAPHelper2));
                    }
                    baseIAPHelper2.d = 0;
                    return;
                }
                if (str4.contains("Subscription is active in another X-VPN")) {
                    if (baseIAPHelper2.g()) {
                        return;
                    }
                    String trim = str4.replace("Subscription is active in another X-VPN account", "").trim();
                    yc2.f5315b.g(new jc2(trim));
                    ic icVar5 = baseIAPHelper2.f1607a;
                    if (icVar5 instanceof lt3) {
                        ed2 ed2Var = new ed2(icVar5, R.layout.dialog_purchase_bind_another);
                        ed2Var.m = 4;
                        ed2Var.n = trim != null ? trim : "";
                        ed2Var.show();
                    }
                    baseIAPHelper2.d = 0;
                    return;
                }
                if ((baseIAPHelper2.d != 3843 ? 0 : 1) != 0) {
                    baseIAPHelper2.q(str4);
                    return;
                } else {
                    baseIAPHelper2.q(str4);
                    return;
                }
            case 14:
                wp wpVar = (wp) this.f4553b;
                List list2 = (List) this.c;
                if (wpVar.f5050a == 0) {
                    String M = ew3.M();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (m20.L(d20.H0(((Purchase) next).a()), M)) {
                                obj = next;
                            }
                        }
                    }
                    Purchase purchase = (Purchase) obj;
                    if (purchase != null) {
                        GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
                        String str5 = (String) purchase.a().get(0);
                        googleIABHelper.getClass();
                        ew3.b0(new le0(str5, i2));
                        return;
                    }
                    GoogleIABHelper.g.getClass();
                    ew3.b0(new le0("", i2));
                    return;
                }
                GoogleIABHelper.g.getClass();
                ew3.b0(new le0("", i2));
                return;
            case 15:
                eu3 eu3Var = (eu3) this.f4553b;
                SplashActivity splashActivity = (SplashActivity) this.c;
                int i13 = SplashActivity.i;
                float f = tf3.F;
                ObjectAnimator duration = ObjectAnimator.ofFloat(eu3Var, "translationX", 140 * f, 640 * f).setDuration(2000L);
                duration.addListener(new o4(splashActivity, i));
                duration.start();
                return;
            case 16:
                VungleInitializer.a((InitializationListener) this.f4553b, (VungleError) this.c);
                return;
            case 17:
                BaseAdLoader.a((BaseAdLoader) this.f4553b, (AdLoaderCallback) this.c);
                return;
            case 18:
                FilePreferences.a((FilePreferences) this.f4553b, (Serializable) this.c);
                return;
            case 19:
                AndroidPlatform.a((AndroidPlatform) this.f4553b, (y70) this.c);
                return;
            default:
                VungleWebClient.b((VungleWebClient) this.f4553b, (WebView) this.c);
                return;
        }
    }
}
