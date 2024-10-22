package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcxh implements zzhbc {
    private final zzcxg zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzcxh(zzcxg zzcxgVar, zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzcxgVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
        this.zzd = zzhbpVar3;
        this.zze = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        String str;
        Context context = (Context) this.zzb.zzb();
        zzcaz zza = ((zzcio) this.zzc).zza();
        zzfcr zza2 = ((zzctn) this.zzd).zza();
        zzbxq zzbxqVar = new zzbxq();
        zzbxr zzbxrVar = zza2.zzC;
        if (zzbxrVar == null) {
            return null;
        }
        zzfcx zzfcxVar = zza2.zzu;
        if (zzfcxVar == null) {
            str = null;
        } else {
            str = zzfcxVar.zzb;
        }
        return new zzbxp(context, zza, zzbxrVar, str, zzbxqVar);
    }
}
