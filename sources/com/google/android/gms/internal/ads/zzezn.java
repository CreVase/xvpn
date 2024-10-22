package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzezn implements zzffv {
    public final zzfah zza;
    public final zzfaj zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzffk zzg;

    public zzezn(zzfah zzfahVar, zzfaj zzfajVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzffk zzffkVar) {
        this.zza = zzfahVar;
        this.zzb = zzfajVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzffkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffv
    public final zzffk zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzffv
    public final Executor zzb() {
        return this.zze;
    }
}
