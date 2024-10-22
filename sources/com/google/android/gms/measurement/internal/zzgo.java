package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;

/* loaded from: classes2.dex */
final class zzgo implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzby zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzgl zzc;

    public zzgo(zzgl zzglVar, com.google.android.gms.internal.measurement.zzby zzbyVar, ServiceConnection serviceConnection) {
        this.zzc = zzglVar;
        this.zza = zzbyVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        zzgl zzglVar = this.zzc;
        zzgm zzgmVar = zzglVar.zza;
        str = zzglVar.zzb;
        com.google.android.gms.internal.measurement.zzby zzbyVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza = zzgmVar.zza(str, zzbyVar);
        zzgmVar.zza.zzl().zzt();
        zzgmVar.zza.zzy();
        if (zza != null) {
            long j = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzgmVar.zza.zzj().zzu().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzgmVar.zza.zzj().zzp().zza("InstallReferrer API result", string);
                    zznd zzt = zzgmVar.zza.zzt();
                    Uri parse = Uri.parse("?".concat(string));
                    if (zzpy.zza() && zzgmVar.zza.zzf().zza(zzbi.zzbz)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zzoi.zza() && zzgmVar.zza.zzf().zza(zzbi.zzct)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Bundle zza2 = zzt.zza(parse, z, z2);
                    if (zza2 == null) {
                        zzgmVar.zza.zzj().zzg().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zza2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            long j2 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzgmVar.zza.zzj().zzg().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zza2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzgmVar.zza.zzn().zzd.zza()) {
                            zzgmVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzgmVar.zza.zzac()) {
                            zzgmVar.zza.zzn().zzd.zza(j);
                            zzgmVar.zza.zzj().zzp().zza("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zza2.putString("_cis", "referrer API v2");
                            zzgmVar.zza.zzp().zza("auto", "_cmp", zza2, str);
                        }
                    }
                } else {
                    zzgmVar.zza.zzj().zzg().zza("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzgmVar.zza.zza(), serviceConnection);
        }
    }
}
