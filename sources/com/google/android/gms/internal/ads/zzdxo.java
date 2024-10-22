package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzdxo implements zzfzp {
    final /* synthetic */ zzdxp zza;

    public zzdxo(zzdxp zzdxpVar) {
        this.zza = zzdxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        Pattern pattern;
        zzecl zzeclVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
            pattern = zzdxp.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzeclVar = this.zza.zzf;
                zzeclVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzecl zzeclVar;
        zzecl zzeclVar2;
        zzfde zzfdeVar = (zzfde) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
            zzeclVar = this.zza.zzf;
            zzeclVar.zzi(zzfdeVar.zzb.zzb.zze);
            zzeclVar2 = this.zza.zzf;
            zzeclVar2.zzj(zzfdeVar.zzb.zzb.zzf);
        }
    }
}
