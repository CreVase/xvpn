package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcqe {
    private final zzfib zza;
    private final zzdso zzb;
    private final zzfde zzc;

    public zzcqe(zzdso zzdsoVar, zzfde zzfdeVar, zzfib zzfibVar) {
        this.zza = zzfibVar;
        this.zzb = zzdsoVar;
        this.zzc = zzfdeVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            zzfib zzfibVar = this.zza;
            zzfde zzfdeVar = this.zzc;
            zzfia zzb = zzfia.zzb("ad_closed");
            zzb.zzg(zzfdeVar.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j));
            zzb.zza("ad_format", "app_open_ad");
            zzb.zza("acr", zzb(i));
            zzfibVar.zzb(zzb);
            return;
        }
        zzdso zzdsoVar = this.zzb;
        zzfde zzfdeVar2 = this.zzc;
        zzdsn zza = zzdsoVar.zza();
        zza.zze(zzfdeVar2.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        zza.zzb("acr", zzb(i));
        zza.zzg();
    }
}
