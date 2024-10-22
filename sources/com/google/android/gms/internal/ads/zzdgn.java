package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdgn implements zzhbc {
    private final zzdga zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdgn(zzdga zzdgaVar, zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzdgaVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbyg zzb() {
        return new zzbyg(((zzcic) this.zzb).zza(), ((zzcxc) this.zzc).zza().zzf);
    }
}
