package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class zzbih implements zzbjj {
    public final /* synthetic */ zzdfd zza;
    public final /* synthetic */ zzcou zzb;

    public /* synthetic */ zzbih(zzdfd zzdfdVar, zzcou zzcouVar) {
        this.zza = zzdfdVar;
        this.zzb = zzcouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        zzbji.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzcat.zzj("URL missing from click GMSG.");
            return;
        }
        final zzcou zzcouVar = this.zzb;
        zzfzk zzu = zzfzk.zzu(zzbji.zza(zzcgbVar, str));
        zzfza zzfzaVar = new zzfza() { // from class: com.google.android.gms.internal.ads.zzbij
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj2) {
                zzcou zzcouVar2;
                String str2 = (String) obj2;
                zzbjj zzbjjVar = zzbji.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzju)).booleanValue() && (zzcouVar2 = zzcou.this) != null) {
                    return zzcouVar2.zzc(str2, com.google.android.gms.ads.internal.client.zzay.zze());
                }
                return zzfzt.zzh(str2);
            }
        };
        zzgad zzgadVar = zzcbg.zza;
        zzfzt.zzr(zzfzt.zzn(zzu, zzfzaVar, zzgadVar), new zzbix(zzcgbVar), zzgadVar);
    }
}
