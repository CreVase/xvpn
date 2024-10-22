package defpackage;

import a.bx;
import a.du;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import b.ContentWrapper;
import com.security.xvpn.z35kb.AboutActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.protocol.ProtocolActivity;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import com.security.xvpn.z35kb.widget.Toolbar;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class q90 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q90(int i, Object obj, Object obj2) {
        super(1);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public final void a(p9 p9Var) {
        int i = 6;
        int i2 = this.f;
        int i3 = 5;
        int i4 = 2;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i2) {
            case 2:
                p9Var.f3799b = pd0.y(R.string.KillSwitchConfirm);
                p9.b(p9Var, pd0.y(R.string.Okay), new b9((f43) obj2, i4), 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), new yy2((CompoundButton) obj, i3), 2);
                return;
            case 3:
                p9Var.f3798a = pd0.y(R.string.AccountDeleted);
                p9.b(p9Var, pd0.y(R.string.Okay), new a72(i4, (aa0) obj2, (na) obj), 2);
                return;
            case 4:
                p9Var.f3798a = pd0.y(R.string.DeleteMyAccountTitle);
                int i5 = 1;
                if (ew3.X()) {
                    na naVar = (na) obj2;
                    View inflate = naVar.getLayoutInflater().inflate(R.layout.dialog_delete_account, (ViewGroup) null);
                    ei2 ei2Var = (ei2) obj;
                    TextView textView = (TextView) inflate.findViewById(R.id.tvDeleteAccountTips3);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.DeleteAccountTips3));
                    int i6 = 0;
                    bx3.i(valueOf, pd0.y(R.string.DeleteAccountContactUs), new x9(ei2Var, i5));
                    textView.setText(valueOf);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.tvManageSubscription);
                    textView2.getPaint().setUnderlineText(true);
                    textView2.setOnClickListener(new cr1(ei2Var, 11));
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    int childCount = viewGroup.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = viewGroup.getChildAt(i7);
                        if (childAt.getId() != R.id.tvManageSubscription && (childAt instanceof TextView)) {
                            fl.n(naVar, (TextView) childAt, 1000015);
                        }
                    }
                    p9Var.l = inflate;
                    ArrayList arrayList = p9Var.m;
                    arrayList.add(new o9(pd0.y(R.string.Delete), 1000145, new ia(naVar, i6), 1));
                    arrayList.add(new o9(pd0.y(R.string.Cancel), 1000020, (v31) null, 9));
                    return;
                }
                p9Var.f3799b = pd0.y(R.string.DeleteMyAccountConfirm);
                p9.b(p9Var, pd0.y(R.string.Cancel), null, 6);
                p9.a(p9Var, pd0.y(R.string.Delete), new ia((na) obj2, i5), 2);
                p9Var.i = 1000145;
                return;
            case 5:
                p9Var.f3798a = pd0.y(R.string.DeleteFailed);
                p9Var.f3799b = (CharSequence) obj2;
                p9Var.d = pd0.y(R.string.Cancel);
                p9.a(p9Var, pd0.y(R.string.Retry), new ia((na) obj, i4), 2);
                return;
            case 6:
                p9Var.f3798a = pd0.y(R.string.AlertTurnOffStaticIPTitle);
                p9Var.f3799b = pd0.y(R.string.AlertTurnOffStaticIPContent);
                p9.b(p9Var, pd0.y(R.string.Okay), new a72(4, (SwitchCompat) obj2, (ConnectionLogActivity) obj), 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                return;
            case 7:
                p9Var.f3798a = pd0.y(R.string.DeleteConnectionLogConfirm);
                p9Var.h = pd0.y(R.string.Cancel);
                p9.b(p9Var, pd0.y(R.string.Delete), new a72(i3, (String) obj2, (ConnectionLogActivity) obj), 2);
                return;
            case 8:
                p9Var.f3798a = pd0.y(R.string.AlertTurnOffStaticIPTitle);
                p9Var.f3799b = pd0.y(R.string.AlertTurnOffStaticIPContent);
                p9.b(p9Var, pd0.y(R.string.Okay), new a72(i, (SwitchCompat) obj2, (v31) obj), 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                return;
            case 9:
                p9Var.f3799b = (Spannable) obj2;
                p9Var.h = pd0.y(R.string.Cancel);
                p9.b(p9Var, pd0.y(R.string.ConnectAnyway), new yy2((j60) obj, 12), 2);
                return;
            case 10:
                p9Var.f3798a = (String) obj2;
                p9Var.f3799b = (String) obj;
                p9Var.d = pd0.y(R.string.OK);
                return;
            case 11:
            default:
                p9Var.f3798a = pd0.y(R.string.SpeedTestStopTitle);
                p9Var.f3799b = pd0.y(R.string.SpeedTestStopToConnect);
                p9.b(p9Var, pd0.y(R.string.ContinueToConnect), new a72(10, (SpeedTestActivity) obj2, (String) obj), 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                return;
            case 12:
                p9Var.f3799b = (Spannable) obj2;
                p9Var.c = LinkMovementMethod.getInstance();
                p9.a(p9Var, pd0.y(R.string.Cancel), e.r, 2);
                p9.b(p9Var, pd0.y(R.string.Settings), new xy((String) obj, 3), 2);
                p9Var.k = d42.k;
                return;
        }
    }

    public final void b(ad3 ad3Var) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 14:
                ad3Var.f61a = pd0.y(R.string.Sorry);
                ad3Var.f62b = ((tc2) ((xc2) obj2)).f4485a;
                ad3Var.e = pd0.y(R.string.Cancel);
                ad3Var.c = pd0.y(R.string.RestorePurchase);
                ad3Var.d = new ld3((nd3) obj, 0);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.ProcessFailed);
                ad3Var.f62b = (String) obj2;
                ad3Var.c = pd0.y(R.string.Retry);
                ad3Var.d = new y3((f4) obj, 1);
                return;
        }
    }

    public final void c(Throwable th) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                boolean z = false;
                if (th != null) {
                    if (th instanceof CancellationException) {
                        hu huVar = (hu) obj2;
                        huVar.d = true;
                        ju juVar = huVar.f2486b;
                        if (juVar != null && juVar.f2829b.cancel(true)) {
                            z = true;
                        }
                        if (z) {
                            huVar.f2485a = null;
                            huVar.f2486b = null;
                            huVar.c = null;
                            return;
                        }
                        return;
                    }
                    hu huVar2 = (hu) obj2;
                    huVar2.d = true;
                    ju juVar2 = huVar2.f2486b;
                    if (juVar2 != null && juVar2.f2829b.i(th)) {
                        z = true;
                    }
                    if (z) {
                        huVar2.f2485a = null;
                        huVar2.f2486b = null;
                        huVar2.c = null;
                        return;
                    }
                    return;
                }
                hu huVar3 = (hu) obj2;
                Object d = ((rj0) obj).d();
                huVar3.d = true;
                ju juVar3 = huVar3.f2486b;
                if (juVar3 != null && juVar3.f2829b.h(d)) {
                    z = true;
                }
                if (z) {
                    huVar3.f2485a = null;
                    huVar3.f2486b = null;
                    huVar3.c = null;
                    return;
                }
                return;
            case 18:
                ((h71) obj2).f2377b.removeCallbacks((Runnable) obj);
                return;
            default:
                ((ky1) obj2).e(obj);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                c((Throwable) obj);
                return ch3Var;
            case 1:
                Toolbar toolbar = (Toolbar) obj;
                toolbar.setTitle(pd0.y(R.string.About));
                toolbar.setShowBackBtn(true);
                ((AboutActivity) obj3).bindInvalidate(toolbar);
                ((ContentWrapper) obj2).a(new fv2(toolbar, 2));
                return ch3Var;
            case 2:
                a((p9) obj);
                return ch3Var;
            case 3:
                a((p9) obj);
                return ch3Var;
            case 4:
                a((p9) obj);
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
                a((p9) obj);
                return ch3Var;
            case 9:
                a((p9) obj);
                return ch3Var;
            case 10:
                a((p9) obj);
                return ch3Var;
            case 11:
                bc2 bc2Var = (bc2) obj3;
                pe0.d(bc2Var.f445a);
                String str = bc2Var.f445a;
                bx bxVar = new bx();
                bxVar.z(str);
                du.d(571, bxVar);
                bxVar.h();
                Intent intent = new Intent();
                intent.putExtra("UserChooseProtocol", bc2Var.f445a);
                ProtocolActivity protocolActivity = (ProtocolActivity) obj2;
                protocolActivity.setResult(-1, intent);
                protocolActivity.finish();
                return ch3Var;
            case 12:
                a((p9) obj);
                return ch3Var;
            case 13:
                a((p9) obj);
                return ch3Var;
            case 14:
                b((ad3) obj);
                return ch3Var;
            case 15:
                b((ad3) obj);
                return ch3Var;
            case 16:
                int intValue = ((Number) obj).intValue();
                yo2 yo2Var = (yo2) obj3;
                ef efVar = (ef) yo2Var.f.e.get(intValue);
                Context context = ((RecyclerView) obj2).getContext();
                ArrayList arrayList = new ArrayList(mz2.f3379a);
                arrayList.remove(efVar.c);
                if (mz2.d) {
                    ew3.x0((String[]) arrayList.toArray(new String[0]));
                } else {
                    ew3.y0((String[]) arrayList.toArray(new String[0]));
                }
                zf3.T(yo2Var, null, new xo2(yo2Var, intValue, context, null), 3);
                return ch3Var;
            case 17:
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.addCategory("android.intent.category.APP_MARKET");
                    intent2.addFlags(268435456);
                    intent2.setData(Uri.parse("market://details?id=" + ((Activity) obj3).getPackageName()));
                    ((AppCompatButton) obj2).getContext().startActivity(intent2);
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + ((Activity) obj3).getPackageName()));
                    intent3.addFlags(268435456);
                    ((AppCompatButton) obj2).getContext().startActivity(intent3);
                }
                return ch3Var;
            case 18:
                c((Throwable) obj);
                return ch3Var;
            default:
                c((Throwable) obj);
                return ch3Var;
        }
    }
}
