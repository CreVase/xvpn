package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzgd;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;

/* loaded from: classes.dex */
public final class zw3 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5565a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final qp f5566b;
    public final /* synthetic */ pp c;

    public /* synthetic */ zw3(pp ppVar, qp qpVar) {
        this.c = ppVar;
        this.f5566b = qpVar;
    }

    public final void a(wp wpVar) {
        synchronized (this.f5565a) {
            try {
                qp qpVar = this.f5566b;
                if (qpVar != null) {
                    ((GoogleIABHelper) qpVar).y(wpVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzi("BillingClient", "Billing service connected.");
        this.c.g = zzd.zzn(iBinder);
        pp ppVar = this.c;
        if (ppVar.h(new pa0(this, 2), 30000L, new qw3(this, 12), ppVar.d()) == null) {
            wp f = this.c.f();
            this.c.f.C(pd0.T(25, 6, f));
            a(f);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzj("BillingClient", "Billing service disconnected.");
        x50 x50Var = this.c.f;
        zzgd zzw = zzgd.zzw();
        x50Var.getClass();
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) x50Var.f5117b;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzl(zzw);
            ((u93) x50Var.c).i((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
        this.c.g = null;
        this.c.f3888a = 0;
        synchronized (this.f5565a) {
            try {
                if (this.f5566b != null) {
                    GoogleIABHelper.j = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
