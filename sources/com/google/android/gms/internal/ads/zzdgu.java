package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdgu implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzczr zza;
    private final zzdet zzb;

    public zzdgu(zzczr zzczrVar, zzdet zzdetVar) {
        this.zza = zzczrVar;
        this.zzb = zzdetVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        this.zza.zzbL();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        this.zza.zzbo();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        this.zza.zzbu();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        this.zza.zzbv();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        this.zza.zzbx();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        this.zza.zzby(i);
        this.zzb.zza();
    }
}
