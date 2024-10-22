package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzasx implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzasy zza;

    public zzasx(zzasy zzasyVar) {
        this.zza = zzasyVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzasy zzasyVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j = zzasyVar.zzc;
        if (j > 0) {
            zzasy zzasyVar2 = this.zza;
            j2 = zzasyVar2.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzasyVar2.zzc;
                zzasyVar2.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
