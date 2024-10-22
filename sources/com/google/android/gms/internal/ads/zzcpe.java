package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
final class zzcpe implements zzfzp {
    final /* synthetic */ zzcpg zza;

    public zzcpe(zzcpg zzcpgVar) {
        this.zza = zzcpgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfdx zzfdxVar;
        zzfjt zzfjtVar;
        zzfde zzfdeVar;
        zzfcr zzfcrVar;
        zzfcr zzfcrVar2;
        Context context;
        zzcpg zzcpgVar = this.zza;
        String str = (String) obj;
        zzfdxVar = zzcpgVar.zzh;
        zzfjtVar = zzcpgVar.zzg;
        zzfdeVar = zzcpgVar.zze;
        zzfcrVar = zzcpgVar.zzf;
        zzfcrVar2 = zzcpgVar.zzf;
        List zzd = zzfjtVar.zzd(zzfdeVar, zzfcrVar, false, "", str, zzfcrVar2.zzc);
        zzcpg zzcpgVar2 = this.zza;
        zzcac zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = zzcpgVar2.zza;
        boolean zzx = zzo.zzx(context);
        int i = 1;
        if (true == zzx) {
            i = 2;
        }
        zzfdxVar.zzc(zzd, i);
    }
}
