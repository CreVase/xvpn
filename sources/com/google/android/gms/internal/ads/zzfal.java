package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfal implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzfal(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfai zzb() {
        zzbzw zzi;
        Context context = (Context) this.zza.zzb();
        zzfew zzfewVar = (zzfew) this.zzb.zzb();
        zzffo zzffoVar = (zzffo) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgn)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzi != null && zzi.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgp)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgm)).booleanValue() || z) {
                zzffn zza = zzffoVar.zza(zzffe.Rewarded, context, zzfewVar, new zzezm(new zzezj()));
                zzezy zzezyVar = new zzezy(new zzezx());
                zzffa zzffaVar = zza.zza;
                zzgad zzgadVar = zzcbg.zza;
                return new zzezo(zzezyVar, new zzezu(zzffaVar, zzgadVar), zza.zzb, zza.zza.zza().zzf, zzgadVar);
            }
        }
        return new zzezx();
    }
}
