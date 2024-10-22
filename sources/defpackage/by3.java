package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzu;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.util.List;

/* loaded from: classes.dex */
public final class by3 extends BroadcastReceiver {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final od2 f552a;

    /* renamed from: b, reason: collision with root package name */
    public final x50 f553b;
    public boolean c;
    public final /* synthetic */ x50 d;

    public /* synthetic */ by3(x50 x50Var, od2 od2Var, x50 x50Var2) {
        this.d = x50Var;
        this.f552a = od2Var;
        this.f553b = x50Var2;
    }

    public final void a(Bundle bundle, wp wpVar, int i) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        x50 x50Var = this.f553b;
        if (byteArray != null) {
            try {
                x50Var.C(zzfb.zzx(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzbn.zza()));
                return;
            } catch (Throwable unused) {
                zzb.zzj("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        x50Var.C(pd0.T(23, i, wpVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i = 1;
        x50 x50Var = this.f553b;
        od2 od2Var = this.f552a;
        if (extras == null) {
            zzb.zzj("BillingBroadcastManager", "Bundle is null.");
            wp wpVar = ax3.h;
            x50Var.C(pd0.T(11, 1, wpVar));
            if (od2Var != null) {
                ((GoogleIABHelper) od2Var).z(wpVar, null);
                return;
            }
            return;
        }
        wp zzd = zzb.zzd(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        if (string == "LAUNCH_BILLING_FLOW" || (string != null && string.equals("LAUNCH_BILLING_FLOW"))) {
            i = 2;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List zzh = zzb.zzh(extras);
            if (zzd.f5050a == 0) {
                zzfe zzv = zzff.zzv();
                zzv.zzj(i);
                x50Var.D((zzff) zzv.zzc());
            } else {
                a(extras, zzd, i);
            }
            ((GoogleIABHelper) od2Var).z(zzd, zzh);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zzd.f5050a != 0) {
                a(extras, zzd, i);
                ((GoogleIABHelper) od2Var).z(zzd, zzu.zzk());
            } else {
                zzb.zzj("BillingBroadcastManager", "AlternativeBillingListener is null.");
                wp wpVar2 = ax3.h;
                x50Var.C(pd0.T(15, i, wpVar2));
                ((GoogleIABHelper) od2Var).z(wpVar2, zzu.zzk());
            }
        }
    }
}
