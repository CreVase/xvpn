package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcsa implements zzhbc {
    private final zzhbp zza;

    public zzcsa(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzcxc) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfv)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
