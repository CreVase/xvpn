package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmf {
    final /* synthetic */ zzlx zza;

    public zzmf(zzlx zzlxVar) {
        this.zza = zzlxVar;
    }

    private final void zzb(long j, boolean z) {
        this.zza.zzt();
        if (!this.zza.zzu.zzac()) {
            return;
        }
        this.zza.zzk().zzk.zza(j);
        this.zza.zzj().zzp().zza("Session started, time", Long.valueOf(this.zza.zzb().elapsedRealtime()));
        Long valueOf = Long.valueOf(j / 1000);
        this.zza.zzm().zza("auto", "_sid", valueOf, j);
        this.zza.zzk().zzl.zza(valueOf.longValue());
        this.zza.zzk().zzg.zza(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.zza.zze().zza(zzbi.zzbj) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.zza.zzm().zza("auto", "_s", j, bundle);
        if (zznv.zza() && this.zza.zze().zza(zzbi.zzbm)) {
            String zza = this.zza.zzk().zzq.zza();
            if (!TextUtils.isEmpty(zza)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzm().zza("auto", "_ssr", j, bundle2);
            }
        }
    }

    public final void zza() {
        this.zza.zzt();
        if (this.zza.zzk().zza(this.zza.zzb().currentTimeMillis())) {
            this.zza.zzk().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.zza.zzj().zzp().zza("Detected application was in foreground");
                zzb(this.zza.zzb().currentTimeMillis(), false);
            }
        }
    }

    public final void zza(long j, boolean z) {
        this.zza.zzt();
        this.zza.zzab();
        if (this.zza.zzk().zza(j)) {
            this.zza.zzk().zzg.zza(true);
            if (zzps.zza() && this.zza.zze().zza(zzbi.zzbs)) {
                this.zza.zzg().zzag();
            }
        }
        this.zza.zzk().zzk.zza(j);
        if (this.zza.zzk().zzg.zza()) {
            zzb(j, z);
        }
    }
}
