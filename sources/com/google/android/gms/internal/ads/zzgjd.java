package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgjd implements zzgjh {
    private final zzgrx zza;
    private final zzgpe zzb;

    private zzgjd(zzgpe zzgpeVar, zzgrx zzgrxVar) {
        this.zzb = zzgpeVar;
        this.zza = zzgrxVar;
    }

    public static zzgjd zza(zzgpe zzgpeVar) {
        return new zzgjd(zzgpeVar, zzgjr.zza(zzgpeVar.zzg()));
    }

    public final zzgpe zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjh
    public final zzgrx zzd() {
        throw null;
    }
}
