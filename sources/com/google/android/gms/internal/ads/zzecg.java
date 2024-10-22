package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class zzecg implements zzfzp {
    final /* synthetic */ zzfgu zza;

    public zzecg(zzech zzechVar, zzfgu zzfguVar) {
        this.zza = zzfguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzcat.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzcat.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
