package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdxd implements zzhbc {
    private final zzhbp zza;

    public zzdxd(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcic) this.zza).zza().getPackageName();
        zzhbk.zzb(packageName);
        return packageName;
    }
}
