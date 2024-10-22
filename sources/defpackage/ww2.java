package defpackage;

import a.bx;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.security.xvpn.z35kb.AboutActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.WebViewActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowser;
import com.security.xvpn.z35kb.protocol.ProtocolSettingsActivity;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class ww2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5079b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ww2(int i, Object obj, Object obj2) {
        this.f5078a = i;
        this.f5079b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x31 x31Var;
        wm1 b2;
        LinearLayout linearLayout;
        Integer num;
        ApplicationInfo applicationInfo;
        String str;
        int i = this.f5078a;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.f5079b;
        switch (i) {
            case 0:
                xw2 xw2Var = (xw2) obj2;
                xw2Var.getClass();
                ((View.OnClickListener) obj).onClick(view);
                xw2Var.a(1);
                return;
            case 1:
                Context context = (Context) obj;
                String charSequence = ((xv3) obj2).f5233a.getText().toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setText(charSequence);
                    Toast.makeText(context, "copy done!", 0).show();
                    return;
                }
                return;
            case 2:
                d dVar = (d) obj;
                int i3 = AboutActivity.m;
                if (!((AboutActivity) obj2).a0() && (x31Var = dVar.f1711b) != null) {
                    x31Var.invoke(view);
                    return;
                }
                return;
            case 3:
                li1 li1Var = (li1) obj2;
                String str4 = (String) obj;
                int i4 = ki1.w;
                li1Var.g = str4;
                ew3.l0(str4);
                if (Build.VERSION.SDK_INT >= 33) {
                    if (m20.L((String) li1Var.g, "auto")) {
                        b2 = wm1.f5037b;
                    } else {
                        b2 = wm1.b((String) li1Var.g);
                    }
                    sc.m(b2);
                }
                Context context2 = view.getContext();
                int i5 = ly1.f3206a;
                ly1.a(context2.getApplicationContext());
                li1Var.f();
                view.post(new dx2(view, i2));
                return;
            case 4:
                ((x31) ((li1) obj2).g).invoke((ef) obj);
                return;
            case 5:
                PrivateBrowser privateBrowser = (PrivateBrowser) obj2;
                int i6 = PrivateBrowser.L;
                privateBrowser.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse((String) obj));
                intent.setFlags(268435456);
                try {
                    privateBrowser.c.startActivity(intent);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 6:
                s53 s53Var = (s53) obj;
                int i7 = s53.q;
                if (((o11) obj2).c.isEnabled()) {
                    br brVar = br.f513a;
                    s53Var.f.getClass();
                    br.h = !br.d.isEmpty();
                    v31 v31Var = s53Var.n;
                    if (v31Var != null) {
                        v31Var.invoke();
                    }
                    s53Var.requireActivity().finish();
                    s53Var.requireActivity().overridePendingTransition(R.anim.none, R.anim.none);
                    return;
                }
                return;
            case 7:
                s53 s53Var2 = (s53) obj2;
                s53Var2.g.add(s53Var2.k, (k53) obj);
                Iterator it = s53Var2.g.iterator();
                while (it.hasNext()) {
                    k53 k53Var = (k53) it.next();
                    z91 z91Var = k53Var.f2891a;
                    s53Var2.f.getClass();
                    k53Var.f2892b = m20.L(z91Var, d20.L0(br.d));
                }
                li1 li1Var2 = s53Var2.j;
                if (li1Var2 == null) {
                    li1Var2 = null;
                }
                li1Var2.f();
                s53Var2.D(s53Var2.k);
                s53Var2.E();
                o11 o11Var = s53Var2.l;
                if (o11Var != null && (linearLayout = o11Var.g) != null) {
                    linearLayout.setVisibility(8);
                }
                s53Var2.n = null;
                return;
            case 8:
                Context context3 = (Context) obj2;
                j60 j60Var = (j60) obj;
                int i8 = j60.G;
                if (!ew3.X()) {
                    m20.C0(context3, 29);
                    return;
                }
                w50 w50Var = j60Var.D;
                if (w50Var != null) {
                    num2 = Integer.valueOf(w50Var.j);
                }
                if ((num2 != null && num2.intValue() == 4) || (num2 != null && num2.intValue() == 3)) {
                    z = true;
                }
                if (z) {
                    j60Var.y();
                    return;
                }
                if (num2 != null && num2.intValue() == 2) {
                    j60Var.z(pd0.y(R.string.StaticIPNotWorkConfirm));
                    return;
                } else {
                    if (num2 != null && num2.intValue() == 1) {
                        j60Var.z(pd0.y(R.string.StaticIPCheckingConfirm));
                        return;
                    }
                    return;
                }
            case 9:
                Context context4 = (Context) obj2;
                j12 j12Var = (j12) obj;
                int i9 = j12.s;
                Intent intent2 = new Intent();
                if (Build.VERSION.SDK_INT >= 26) {
                    intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    if (context4 != null) {
                        str2 = context4.getPackageName();
                    }
                    intent2.putExtra("android.provider.extra.APP_PACKAGE", str2);
                } else {
                    intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    if (context4 != null && (applicationInfo = context4.getApplicationInfo()) != null) {
                        num = Integer.valueOf(applicationInfo.uid);
                    } else {
                        num = null;
                    }
                    intent2.putExtra("app_uid", num);
                    if (context4 != null) {
                        str3 = context4.getPackageName();
                    }
                    intent2.putExtra("app_package", str3);
                }
                Activity T = ya0.T(j12Var);
                if (T != null) {
                    try {
                        T.startActivity(intent2);
                        return;
                    } catch (Exception e2) {
                        bx3.M(e2);
                        try {
                            T.startActivity(new Intent("android.settings.SETTINGS"));
                            return;
                        } catch (Exception e3) {
                            bx3.M(e3);
                            return;
                        }
                    }
                }
                return;
            case 10:
                Context context5 = (Context) obj2;
                int i10 = ud2.f;
                Intent intent3 = new Intent(context5, (Class<?>) WebViewActivity.class);
                n42[] n42VarArr = new n42[2];
                tt3 tt3Var = ((ud2) obj).f4653b;
                if (tt3Var == null || (str = tt3Var.q) == null) {
                    str = "";
                }
                n42VarArr[0] = new n42("intentTargetUrl", str + "&dark=" + v73.l());
                n42VarArr[1] = new n42("intentTitle", "");
                ((Activity) context5).startActivity(intent3.putExtras(tf3.r(n42VarArr)));
                return;
            case 11:
                ProtocolSettingsActivity protocolSettingsActivity = (ProtocolSettingsActivity) obj2;
                protocolSettingsActivity.m = true;
                bx j = hx2.j(((o6) obj).c.getText().toString(), 518);
                boolean q = j.q();
                j.h();
                protocolSettingsActivity.n = q;
                if (q) {
                    protocolSettingsActivity.o = ew3.a0();
                }
                protocolSettingsActivity.b0();
                return;
            case 12:
                int i11 = fd2.v;
                int d = ((fd2) obj).d();
                kd2 kd2Var = ((jd2) obj2).f2754a;
                kd2Var.g.f(d);
                kd2Var.h.f();
                return;
            case 13:
                zp2 zp2Var = (zp2) obj;
                jq2 jq2Var = ((lq2) obj2).g;
                if (jq2Var != null) {
                    ((hq2) jq2Var).a(zp2Var);
                    return;
                }
                return;
            default:
                r9 r9Var = (r9) obj2;
                o9 o9Var = (o9) obj;
                DialogInterface.OnDismissListener onDismissListener = r9Var.g;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(r9Var.getDialog());
                }
                r9Var.dismissAllowingStateLoss();
                v31 v31Var2 = o9Var.d;
                if (v31Var2 != null) {
                    v31Var2.invoke();
                    return;
                }
                return;
        }
    }
}
