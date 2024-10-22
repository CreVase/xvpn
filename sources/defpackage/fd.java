package defpackage;

import a.bx;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import com.google.android.play.core.install.zza;
import com.google.firebase.messaging.FirebaseMessaging;
import com.security.xvpn.z35kb.account.AccountManagerActivity;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesForPlayStationActivity;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew1Activity;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fd extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2077a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2078b;

    public /* synthetic */ fd(Object obj, int i) {
        this.f2077a = i;
        this.f2078b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        int i = 2;
        String str = null;
        switch (this.f2077a) {
            case 0:
                ed edVar = (ed) ((gd) this.f2078b);
                int i2 = edVar.c;
                jd jdVar = edVar.d;
                switch (i2) {
                    case 0:
                        jdVar.v(true, true);
                        return;
                    default:
                        jdVar.v(true, true);
                        return;
                }
            case 1:
                try {
                    ((IntentSender) this.f2078b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 2:
                if (intent != null) {
                    ((ar) this.f2078b).g(intent);
                    return;
                }
                return;
            case 3:
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    bo1 c2 = bo1.c();
                    String str2 = tz1.j;
                    c2.a(new Throwable[0]);
                    tz1 tz1Var = (tz1) this.f2078b;
                    tz1Var.c(tz1Var.f());
                    return;
                }
                return;
            case 4:
                t13 t13Var = (t13) this.f2078b;
                t13Var.f4441b.post(new nw3(t13Var, 14));
                return;
            case 5:
                if (!isInitialStickyBroadcast()) {
                    ((rj2) this.f2078b).a();
                    return;
                }
                return;
            case 6:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i = type != 9 ? 8 : 7;
                                        }
                                        i = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (wi3.f5017a >= 29) {
                                        i = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i = 1;
                        }
                    } catch (SecurityException unused2) {
                    }
                    if (wi3.f5017a < 31 && i == 5) {
                        wz1 wz1Var = (wz1) this.f2078b;
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            telephonyManager.getClass();
                            vz1 vz1Var = new vz1(wz1Var);
                            mainExecutor = context.getMainExecutor();
                            it1.t(telephonyManager, mainExecutor, vz1Var);
                            it1.s(telephonyManager, vz1Var);
                            return;
                        } catch (RuntimeException unused3) {
                            wz1.a(5, wz1Var);
                            return;
                        }
                    }
                    wz1.a(i, (wz1) this.f2078b);
                    return;
                }
                i = 0;
                if (wi3.f5017a < 31) {
                }
                wz1.a(i, (wz1) this.f2078b);
                return;
            case 7:
                ix3 ix3Var = (ix3) this.f2078b;
                ix3Var.getClass();
                boolean equals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                pq0 pq0Var = ix3Var.f2672a;
                if (!equals) {
                    pq0Var.e("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                pq0Var.e("List of extras in received intent:", new Object[0]);
                for (String str3 : intent.getExtras().keySet()) {
                    pq0Var.e("Key: %s; value: %s", str3, intent.getExtras().get(str3));
                }
                pq0Var.e("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                pq0Var.e("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                pq0Var.e("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                pq0Var.e("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                ix3Var.c(zzaVar);
                return;
            case 8:
                la0 la0Var = (la0) this.f2078b;
                if (la0Var != null && la0Var.b()) {
                    la0 la0Var2 = (la0) this.f2078b;
                    ((FirebaseMessaging) la0Var2.d).getClass();
                    FirebaseMessaging.b(la0Var2, 0L);
                    ((la0) this.f2078b).a().unregisterReceiver(this);
                    this.f2078b = null;
                    return;
                }
                return;
            case 9:
                ((AccountManagerActivity) this.f2078b).finish();
                return;
            case 10:
                ((ChangePasswordActivity) this.f2078b).finish();
                return;
            case 11:
                ((ForgetPasswordActivity) this.f2078b).finish();
                return;
            case 12:
                OtherDevicesForPlayStationActivity otherDevicesForPlayStationActivity = (OtherDevicesForPlayStationActivity) this.f2078b;
                Boolean bool = Boolean.FALSE;
                int i3 = OtherDevicesForPlayStationActivity.u;
                otherDevicesForPlayStationActivity.Z(bool);
                String U = ya0.U();
                if (!U.isEmpty()) {
                    ((OtherDevicesForPlayStationActivity) this.f2078b).l.setText(U);
                    TextView textView = ((OtherDevicesForPlayStationActivity) this.f2078b).m;
                    bx i4 = hx2.i(490);
                    String u = i4.u();
                    i4.h();
                    textView.setText(u);
                    return;
                }
                ((OtherDevicesForPlayStationActivity) this.f2078b).l.setText("-");
                ((OtherDevicesForPlayStationActivity) this.f2078b).m.setText("-");
                return;
            case 13:
                if (!ew3.X()) {
                    if (intent != null) {
                        str = intent.getAction();
                    }
                    if (!m20.L(str, "ExitAction")) {
                        return;
                    }
                }
                ((GuideToPurchaseActivity) this.f2078b).b0();
                return;
            case 14:
                if (!ew3.X()) {
                    if (intent != null) {
                        str = intent.getAction();
                    }
                    if (!m20.L(str, "ExitAction")) {
                        return;
                    }
                }
                ((GuideToPurchaseNew1Activity) this.f2078b).b0();
                return;
            default:
                if (!ew3.X()) {
                    if (intent != null) {
                        str = intent.getAction();
                    }
                    if (!m20.L(str, "ExitAction")) {
                        return;
                    }
                }
                ((GuideToPurchaseNew2Activity) this.f2078b).b0();
                return;
        }
    }

    public /* synthetic */ fd(ix3 ix3Var) {
        this.f2077a = 7;
        this.f2078b = ix3Var;
    }

    public fd(la0 la0Var) {
        this.f2077a = 8;
        this.f2078b = la0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(rj2 rj2Var) {
        this(rj2Var, 5);
        this.f2077a = 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(t13 t13Var) {
        this(t13Var, 4);
        this.f2077a = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(wz1 wz1Var) {
        this(wz1Var, 6);
        this.f2077a = 6;
    }
}
