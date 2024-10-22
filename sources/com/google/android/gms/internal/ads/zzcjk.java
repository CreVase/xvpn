package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzcjk extends zzevj {
    private final zzewp zza;
    private final zzcjs zzb;
    private final zzcjk zzc = this;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;
    private final zzhbp zzl;
    private final zzhbp zzm;
    private final zzhbp zzn;

    public /* synthetic */ zzcjk(zzcjs zzcjsVar, zzewp zzewpVar, zzcjj zzcjjVar) {
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzhbp zzhbpVar3;
        this.zzb = zzcjsVar;
        this.zza = zzewpVar;
        zzewr zzewrVar = new zzewr(zzewpVar);
        this.zzd = zzewrVar;
        zzhbp zzc = zzhbb.zzc(zzdrn.zza());
        this.zze = zzc;
        zzhbp zzc2 = zzhbb.zzc(zzdrl.zza());
        this.zzf = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzdrp.zza());
        this.zzg = zzc3;
        zzhbp zzc4 = zzhbb.zzc(zzdrr.zza());
        this.zzh = zzc4;
        zzhbf zzc5 = zzhbg.zzc(4);
        zzc5.zzb(zzfhl.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfhl.BUILD_URL, zzc2);
        zzc5.zzb(zzfhl.HTTP, zzc3);
        zzc5.zzb(zzfhl.PRE_PROCESS, zzc4);
        zzhbg zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzhbpVar = zzcjsVar.zzg;
        zzhbp zzc7 = zzhbb.zzc(new zzdrs(zzewrVar, zzhbpVar, zzfgm.zza(), zzc6));
        this.zzj = zzc7;
        zzhbm zza = zzhbn.zza(0, 1);
        zza.zza(zzc7);
        zzhbn zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfhu zzfhuVar = new zzfhu(zzc8);
        this.zzl = zzfhuVar;
        zzfgm zza2 = zzfgm.zza();
        zzhbpVar2 = zzcjsVar.zzm;
        this.zzm = zzhbb.zzc(new zzfht(zza2, zzhbpVar2, zzfhuVar));
        zzhbpVar3 = zzcjsVar.zzG;
        this.zzn = zzhbb.zzc(new zzfjf(zzhbpVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzevj
    public final zzetz zza() {
        zzchz zzchzVar;
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzchzVar = this.zzb.zza;
        Context zza = zzchzVar.zza();
        zzhbk.zzb(zza);
        zzbzq zzbzqVar = new zzbzq();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        zzewj zzewjVar = new zzewj(zzbzqVar, zzgadVar, zzewq.zza(this.zza));
        zzhbk.zzb(zzgadVar);
        zzhbpVar = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhbpVar.zzb();
        zzfje zzfjeVar = (zzfje) this.zzn.zzb();
        zzhbpVar2 = this.zzb.zzZ;
        zzdso zzdsoVar = (zzdso) zzhbpVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzese(zzewjVar, 0L, scheduledExecutorService));
        return new zzetz(zza, zzgadVar, hashSet, zzfjeVar, zzdsoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzevj
    public final zzfhr zzb() {
        return (zzfhr) this.zzm.zzb();
    }
}
