package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzu;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class pp {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f3888a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3889b;
    public final Handler c;
    public volatile x50 d;
    public Context e;
    public x50 f;
    public volatile zze g;
    public volatile zw3 h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ExecutorService t;

    public pp(Context context, od2 od2Var) {
        String g = g();
        this.f3888a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.j = 0;
        this.f3889b = g;
        this.e = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(g);
        zzv.zzi(this.e.getPackageName());
        this.f = new x50(this.e, (zzfm) zzv.zzc());
        if (od2Var == null) {
            zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.d = new x50(this.e, od2Var, this.f);
        this.s = false;
    }

    public static String g() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.0.1";
        }
    }

    public final boolean a() {
        return (this.f3888a != 2 || this.g == null || this.h == null) ? false : true;
    }

    public final void b(i4 i4Var, c02 c02Var) {
        String str = i4Var.f2534a;
        if (!a()) {
            x50 x50Var = this.f;
            wp wpVar = ax3.j;
            x50Var.C(pd0.T(2, 9, wpVar));
            c02Var.l(wpVar, zzu.zzk());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            zzb.zzj("BillingClient", "Please provide a valid product type.");
            x50 x50Var2 = this.f;
            wp wpVar2 = ax3.e;
            x50Var2.C(pd0.T(50, 9, wpVar2));
            c02Var.l(wpVar2, zzu.zzk());
            return;
        }
        if (h(new jy3(this, str, c02Var, 3), 30000L, new y4(this, c02Var, 13), d()) == null) {
            wp f = f();
            this.f.C(pd0.T(25, 9, f));
            c02Var.l(f, zzu.zzk());
        }
    }

    public final void c(qp qpVar) {
        if (a()) {
            zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            x50 x50Var = this.f;
            zzfe zzv = zzff.zzv();
            zzv.zzj(6);
            x50Var.D((zzff) zzv.zzc());
            ((GoogleIABHelper) qpVar).y(ax3.i);
            return;
        }
        int i = 1;
        if (this.f3888a == 1) {
            zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            x50 x50Var2 = this.f;
            wp wpVar = ax3.d;
            x50Var2.C(pd0.T(37, 6, wpVar));
            ((GoogleIABHelper) qpVar).y(wpVar);
            return;
        }
        if (this.f3888a == 3) {
            zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            x50 x50Var3 = this.f;
            wp wpVar2 = ax3.j;
            x50Var3.C(pd0.T(38, 6, wpVar2));
            ((GoogleIABHelper) qpVar).y(wpVar2);
            return;
        }
        this.f3888a = 1;
        x50 x50Var4 = this.d;
        x50Var4.getClass();
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        by3 by3Var = (by3) x50Var4.c;
        Context context = (Context) x50Var4.f5117b;
        if (!by3Var.c) {
            int i2 = Build.VERSION.SDK_INT;
            x50 x50Var5 = by3Var.d;
            if (i2 >= 33) {
                context.registerReceiver((by3) x50Var5.c, intentFilter, 2);
            } else {
                context.registerReceiver((by3) x50Var5.c, intentFilter);
            }
            by3Var.c = true;
        }
        zzb.zzi("BillingClient", "Starting in-app billing setup.");
        this.h = new zw3(this, qpVar);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f3889b);
                    if (this.e.bindService(intent2, this.h, 1)) {
                        zzb.zzi("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                } else {
                    zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                }
            }
        } else {
            i = 41;
        }
        this.f3888a = 0;
        zzb.zzi("BillingClient", "Billing service unavailable on device.");
        x50 x50Var6 = this.f;
        wp wpVar3 = ax3.c;
        x50Var6.C(pd0.T(i, 6, wpVar3));
        ((GoogleIABHelper) qpVar).y(wpVar3);
    }

    public final Handler d() {
        if (Looper.myLooper() == null) {
            return this.c;
        }
        return new Handler(Looper.myLooper());
    }

    public final void e(wp wpVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new y4(this, wpVar, 15));
    }

    public final wp f() {
        if (this.f3888a != 0 && this.f3888a != 3) {
            return ax3.h;
        }
        return ax3.j;
    }

    public final Future h(Callable callable, long j, Runnable runnable, Handler handler) {
        if (this.t == null) {
            this.t = Executors.newFixedThreadPool(zzb.zza, new yi0());
        }
        try {
            Future submit = this.t.submit(callable);
            handler.postDelayed(new y4(submit, runnable, 14), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            zzb.zzk("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }
}
