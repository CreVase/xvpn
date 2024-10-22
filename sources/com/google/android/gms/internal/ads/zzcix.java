package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcix implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcix(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbvr zzb() {
        Context zza = ((zzcic) this.zza).zza();
        zzfjh zzfjhVar = (zzfjh) this.zzb.zzb();
        zzboa zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcaz.zza(), zzfjhVar);
        zzbnu zzbnuVar = zzbnx.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbnuVar, zzbnuVar);
        return new zzbvq(zza, com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcaz.zza(), zzfjhVar).zza("google.afma.sdkConstants.getSdkConstants", zzbnuVar, zzbnuVar));
    }
}
