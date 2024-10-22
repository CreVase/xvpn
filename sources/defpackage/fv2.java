package defpackage;

import a.bx;
import a.du;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.net.VpnService;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.accelerateApp.AllAppActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.television.purchase.PurchaseActivity;
import com.security.xvpn.z35kb.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class fv2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv2(Object obj, int i) {
        super(1);
        this.f = i;
        this.g = obj;
    }

    public final void a(p9 p9Var) {
        int i = 6;
        int i2 = 2;
        int i3 = this.f;
        int i4 = 3;
        Object obj = this.g;
        switch (i3) {
            case 5:
                p9Var.f3798a = pd0.y(R.string.SignOut);
                p9Var.f3799b = pd0.y(R.string.DialogSignOutConfirm);
                p9.b(p9Var, pd0.y(R.string.Okay), new ia((na) obj, i4), 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                return;
            case 6:
                p9Var.f3798a = pd0.y(R.string.ProcessFailed);
                p9Var.f3799b = pd0.y(R.string.DisconnectTimeoutDialogText);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                p9.b(p9Var, pd0.y(R.string.Restart), new yy2((Activity) obj, i), 2);
                return;
            case 7:
                p9Var.f3798a = pd0.y(R.string.Error);
                p9Var.f3799b = pd0.y(R.string.DialogMissWebViewError);
                p9Var.d = pd0.y(R.string.Close);
                p9Var.f = new yy2((PrivateBrowserActivity) obj, 9);
                return;
            case 21:
                p9Var.f3798a = pd0.y(R.string.UpdateApp);
                p9Var.f3799b = pd0.y(R.string.UpdateAppTipsContent);
                p9Var.h = pd0.y(R.string.NoThanks);
                p9.b(p9Var, pd0.y(R.string.AppUpgradeBtn), new yy2((lt3) obj, 21), 2);
                return;
            default:
                p9Var.f3798a = pd0.y(R.string.StreamingLineTipsTitle);
                p9Var.f3799b = pd0.y(R.string.StreamingLineTips);
                v31 v31Var = (v31) obj;
                p9.b(p9Var, pd0.y(R.string.Okay), new z62(v31Var, i2), 2);
                p9.a(p9Var, pd0.y(R.string.DontRemindMeAgain), new z62(v31Var, i4), 2);
                return;
        }
    }

    public final void b(ad3 ad3Var) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 11:
                ad3Var.f61a = pd0.y(R.string.BindFailedTitle);
                ad3Var.f62b = pd0.y(R.string.BindFailedNormalTips);
                ad3Var.e = pd0.y(R.string.Cancel);
                ad3Var.c = pd0.y(R.string.Retry);
                ad3Var.d = new ld3((nd3) obj, 1);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.Notice);
                ad3Var.f62b = pd0.y(R.string.AppBypassDisconnectConfirm);
                ad3Var.c = pd0.y(R.string.Disconnect);
                ad3Var.d = new yy2((tz2) obj, 20);
                return;
        }
    }

    public final void c(Rect rect) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 2:
                int i2 = rect.top;
                ((Toolbar) obj).setPadding(i2, i2, i2, i2);
                return;
            case 3:
                ((gu3) obj).setPadding(0, 0, 0, rect.bottom);
                return;
            case 18:
                TextView textView = (TextView) obj;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = tf3.K(36) + rect.top;
                    textView.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                ImageView imageView = (ImageView) obj;
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = rect.top;
                    imageView.setLayoutParams(marginLayoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void d(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 13:
                ye3 ye3Var = (ye3) obj;
                x31 onItemClick = ye3Var.getOnItemClick();
                if (onItemClick != null) {
                    onItemClick.invoke(((AppCompatTextView) ye3Var.getTvDomain()).getText().toString());
                    return;
                }
                return;
            case 14:
                j50 j50Var = (j50) obj;
                int i2 = j50.k;
                j50Var.getClass();
                if (!ew3.X() && !m20.B0()) {
                    Bundle bundle = new Bundle();
                    Context context = j50Var.getContext();
                    if (context != null) {
                        tf3.g0(context, PurchaseActivity.class, bundle, 0);
                        return;
                    }
                    return;
                }
                if (VpnService.prepare(zf3.f5472a) != null && rt3.e().f4214b == 65286) {
                    m20.Z0(j50Var.getChildFragmentManager(), "VpnPermission", md3.l);
                    return;
                } else {
                    pe0.e();
                    return;
                }
            case 20:
                ((pn0) obj).getItemClick().invoke();
                return;
            default:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://xvpn.io/download/vpn-android"));
                intent.addFlags(268435456);
                ((AppCompatButton) obj).getContext().startActivity(intent);
                return;
        }
    }

    public final void e(BaseIAPHelper baseIAPHelper) {
        int i = this.f;
        int i2 = 2;
        Object obj = this.g;
        switch (i) {
            case 9:
                int i3 = ((kd2) obj).g.f203b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 4) {
                                baseIAPHelper.h(4);
                                return;
                            }
                            return;
                        }
                        baseIAPHelper.h(3);
                        return;
                    }
                    baseIAPHelper.h(2);
                    return;
                }
                baseIAPHelper.h(1);
                return;
            default:
                zb2 zb2Var = (zb2) obj;
                if (!zb2Var.g) {
                    i2 = 1;
                }
                String str = zb2Var.f5459a;
                baseIAPHelper.e = i2;
                baseIAPHelper.i(str);
                return;
        }
    }

    public final void f(Throwable th) {
        switch (this.f) {
            case 0:
                if (th != null) {
                    ((yv2) this.g).g.g(new kx0(th));
                }
                Object obj = yv2.k;
                yv2 yv2Var = (yv2) this.g;
                synchronized (obj) {
                    yv2.j.remove(yv2Var.c().getAbsolutePath());
                }
                return;
            case 27:
                ((uu) this.g).resumeWith(ch3.f636a);
                return;
            default:
                ((bp2) this.g).b();
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        Object obj2;
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        Object obj3 = null;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                f((Throwable) obj);
                return ch3Var;
            case 1:
                View view = (View) ((Map.Entry) obj).getValue();
                WeakHashMap weakHashMap = ll3.f3151a;
                return Boolean.valueOf(d20.F0((Collection) obj4, al3.k(view)));
            case 2:
                c((Rect) obj);
                return ch3Var;
            case 3:
                c((Rect) obj);
                return ch3Var;
            case 4:
                ef efVar = (ef) obj;
                d5 d5Var = gf.f2243a;
                AllAppActivity allAppActivity = (AllAppActivity) obj4;
                ArrayList arrayList = new ArrayList(d5.A(allAppActivity.m));
                boolean z = efVar.d;
                String str = efVar.c;
                if (z) {
                    arrayList.add(str);
                } else {
                    arrayList.remove(str);
                }
                d5.G(arrayList, allAppActivity.m);
                AllAppActivity.b0(allAppActivity);
                return ch3Var;
            case 5:
                a((p9) obj);
                return ch3Var;
            case 6:
                a((p9) obj);
                return ch3Var;
            case 7:
                a((p9) obj);
                return ch3Var;
            case 8:
                s53 s53Var = (s53) obj4;
                v31 v31Var = s53Var.n;
                if (v31Var != null) {
                    v31Var.invoke();
                }
                s53Var.requireActivity().finish();
                return ch3Var;
            case 9:
                e((BaseIAPHelper) obj);
                return ch3Var;
            case 10:
                e((BaseIAPHelper) obj);
                return ch3Var;
            case 11:
                b((ad3) obj);
                return ch3Var;
            case 12:
                KeyEvent keyEvent = (KeyEvent) obj;
                if (keyEvent == null) {
                    return Boolean.FALSE;
                }
                bx1 bx1Var = (bx1) obj4;
                if (!bx1Var.isCancelable()) {
                    return Boolean.FALSE;
                }
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
                    bx1Var.t();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 13:
                d((View) obj);
                return ch3Var;
            case 14:
                d((View) obj);
                return ch3Var;
            case 15:
                String str2 = (String) obj;
                eb2 eb2Var = (eb2) obj4;
                eb2Var.k.invoke(str2);
                bx bxVar = new bx();
                bxVar.z(str2);
                du.d(553, bxVar);
                bxVar.h();
                eb2Var.t();
                return ch3Var;
            case 16:
                e8 e8Var = (e8) obj4;
                ef efVar2 = (ef) e8Var.f.get(((Number) obj).intValue());
                ArrayList arrayList2 = new ArrayList(mz2.f3379a);
                arrayList2.add(efVar2.c);
                if (mz2.d) {
                    ew3.x0((String[]) arrayList2.toArray(new String[0]));
                } else {
                    ew3.y0((String[]) arrayList2.toArray(new String[0]));
                }
                zf3.T(e8Var, null, new d8(e8Var, null), 3);
                return ch3Var;
            case 17:
                b((ad3) obj);
                return ch3Var;
            case 18:
                c((Rect) obj);
                return ch3Var;
            case 19:
                c((Rect) obj);
                return ch3Var;
            case 20:
                d((View) obj);
                return ch3Var;
            case 21:
                a((p9) obj);
                return ch3Var;
            case 22:
                d((View) obj);
                return ch3Var;
            case 23:
                a((p9) obj);
                return ch3Var;
            case 24:
                if (obj == ((t) obj4)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 25:
                p71.C(obj);
                throw null;
            case 26:
                return i23.s1((CharSequence) obj4, (kd1) obj);
            case 27:
                f((Throwable) obj);
                return ch3Var;
            case 28:
                Throwable th = (Throwable) obj;
                try {
                    Throwable th2 = (Throwable) ((x31) obj4).invoke(th);
                    boolean L = m20.L(th.getMessage(), th2.getMessage());
                    obj2 = th2;
                    if (!L) {
                        boolean L2 = m20.L(th2.getMessage(), th.toString());
                        obj2 = th2;
                        if (!L2) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th3) {
                    obj2 = new pk2(th3);
                }
                if (!(obj2 instanceof pk2)) {
                    obj3 = obj2;
                }
                return (Throwable) obj3;
            default:
                f((Throwable) obj);
                return ch3Var;
        }
    }
}
