package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzekm implements zzeeu {
    private final Context zza;
    private final zzcrs zzb;
    private final zzbdg zzc;
    private final zzgad zzd;
    private final zzfhr zze;

    public zzekm(Context context, zzcrs zzcrsVar, zzfhr zzfhrVar, zzgad zzgadVar, zzbdg zzbdgVar) {
        this.zza = context;
        this.zzb = zzcrsVar;
        this.zze = zzfhrVar;
        this.zzd = zzgadVar;
        this.zzc = zzbdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final ml1 zza(zzfde zzfdeVar, zzfcr zzfcrVar) {
        zzekk zzekkVar = new zzekk(this, new View(this.zza), null, new zzcsv() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // com.google.android.gms.internal.ads.zzcsv
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzfcs) zzfcrVar.zzw.get(0));
        zzcqw zza = this.zzb.zza(new zzctm(zzfdeVar, zzfcrVar, null), zzekkVar);
        zzekl zzk = zza.zzk();
        zzfcx zzfcxVar = zzfcrVar.zzu;
        final zzbdb zzbdbVar = new zzbdb(zzk, zzfcxVar.zzb, zzfcxVar.zza);
        zzfhl zzfhlVar = zzfhl.CUSTOM_RENDER_SYN;
        return zzfhb.zzd(new zzfgv() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzfgv
            public final void zza() {
                zzekm.this.zzc(zzbdbVar);
            }
        }, this.zzd, zzfhlVar, this.zze).zzb(zzfhl.CUSTOM_RENDER_ACK).zzd(zzfzt.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final boolean zzb(zzfde zzfdeVar, zzfcr zzfcrVar) {
        zzfcx zzfcxVar;
        if (this.zzc != null && (zzfcxVar = zzfcrVar.zzu) != null && zzfcxVar.zza != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void zzc(zzbdb zzbdbVar) throws Exception {
        this.zzc.zze(zzbdbVar);
    }
}
