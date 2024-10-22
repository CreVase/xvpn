package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzasn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzasp zzb;

    public zzasn(zzasp zzaspVar, int i, boolean z) {
        this.zzb = zzaspVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapj zzapjVar;
        int i = this.zza;
        zzasp zzaspVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaspVar.zza.getPackageManager().getPackageInfo(zzaspVar.zza.getPackageName(), 0);
            Context context = zzaspVar.zza;
            zzapjVar = zzfmy.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzapjVar = null;
        }
        this.zzb.zzm = zzapjVar;
        if (this.zza < 4) {
            if (zzapjVar == null || !zzapjVar.zzaj() || zzapjVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzapjVar.zzak() || !zzapjVar.zzf().zze() || zzapjVar.zzf().zza() == -2) {
                this.zzb.zzo(this.zza + 1, true);
            }
        }
    }
}
