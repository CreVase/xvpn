package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import defpackage.ml1;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcwp {
    private final zzfhr zza;
    private final zzcaz zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhaw zzg;
    private final String zzh;
    private final zzetz zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfdn zzk;
    private final zzdcu zzl;

    public zzcwp(zzfhr zzfhrVar, zzcaz zzcazVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhaw zzhawVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzetz zzetzVar, zzfdn zzfdnVar, zzdcu zzdcuVar) {
        this.zza = zzfhrVar;
        this.zzb = zzcazVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhawVar;
        this.zzh = str2;
        this.zzi = zzetzVar;
        this.zzj = zzgVar;
        this.zzk = zzfdnVar;
        this.zzl = zzdcuVar;
    }

    public final /* synthetic */ zzbvg zza(ml1 ml1Var) throws Exception {
        boolean z;
        Bundle bundle = (Bundle) ml1Var.get();
        String str = (String) ((ml1) this.zzg.zzb()).get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhe)).booleanValue() && this.zzj.zzQ()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzbvg(bundle, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z, this.zzk.zzb());
    }

    public final ml1 zzb() {
        this.zzl.zza();
        return zzfhb.zzc(this.zzi.zza(new Bundle()), zzfhl.SIGNALS, this.zza).zza();
    }

    public final ml1 zzc() {
        final ml1 zzb = zzb();
        return this.zza.zza(zzfhl.REQUEST_PARCEL, zzb, (ml1) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcwo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcwp.this.zza(zzb);
            }
        }).zza();
    }
}
