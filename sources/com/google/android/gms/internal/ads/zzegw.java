package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import defpackage.ml1;

/* loaded from: classes.dex */
final class zzegw implements zzdhf {
    private final Context zza;
    private final zzcaz zzb;
    private final ml1 zzc;
    private final zzfcr zzd;
    private final zzcgb zze;
    private final zzfdn zzf;
    private final zzbjl zzg;
    private final boolean zzh;
    private final zzedz zzi;

    public zzegw(Context context, zzcaz zzcazVar, ml1 ml1Var, zzfcr zzfcrVar, zzcgb zzcgbVar, zzfdn zzfdnVar, boolean z, zzbjl zzbjlVar, zzedz zzedzVar) {
        this.zza = context;
        this.zzb = zzcazVar;
        this.zzc = ml1Var;
        this.zzd = zzfcrVar;
        this.zze = zzcgbVar;
        this.zzf = zzfdnVar;
        this.zzg = zzbjlVar;
        this.zzh = z;
        this.zzi = zzedzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdhf
    public final void zza(boolean z, Context context, zzcxy zzcxyVar) {
        boolean z2;
        boolean z3;
        float f;
        zzedz zzedzVar;
        zzdfx zzdfxVar = (zzdfx) zzfzt.zzq(this.zzc);
        this.zze.zzan(true);
        if (this.zzh) {
            z2 = this.zzg.zze(false);
        } else {
            z2 = false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        Context context2 = this.zza;
        boolean z4 = this.zzh;
        boolean zzH = com.google.android.gms.ads.internal.util.zzt.zzH(context2);
        if (z4) {
            z3 = this.zzg.zzd();
        } else {
            z3 = false;
        }
        if (this.zzh) {
            f = this.zzg.zza();
        } else {
            f = 0.0f;
        }
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(z2, zzH, z3, f, -1, z, this.zzd.zzQ, false);
        if (zzcxyVar != null) {
            zzcxyVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdgu zzh = zzdfxVar.zzh();
        zzcgb zzcgbVar = this.zze;
        zzfcr zzfcrVar = this.zzd;
        zzcaz zzcazVar = this.zzb;
        int i = zzfcrVar.zzS;
        String str = zzfcrVar.zzD;
        zzfcx zzfcxVar = zzfcrVar.zzu;
        String str2 = zzfcxVar.zzb;
        String str3 = zzfcxVar.zza;
        zzfdn zzfdnVar = this.zzf;
        if (zzfcrVar.zzak) {
            zzedzVar = this.zzi;
        } else {
            zzedzVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcgbVar, i, zzcazVar, str, zzjVar, str2, str3, zzfdnVar.zzf, zzcxyVar, zzedzVar), true);
    }
}
