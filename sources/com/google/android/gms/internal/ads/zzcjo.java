package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzcjo extends zzevl {
    private final zzeuz zza;
    private final zzcjs zzb;
    private final zzcjo zzc = this;
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

    public /* synthetic */ zzcjo(zzcjs zzcjsVar, zzeuz zzeuzVar, zzcjn zzcjnVar) {
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzhbp zzhbpVar3;
        this.zzb = zzcjsVar;
        this.zza = zzeuzVar;
        zzhbpVar = zzcjsVar.zzG;
        this.zzd = zzhbb.zzc(new zzfjf(zzhbpVar));
        zzevh zzevhVar = new zzevh(zzeuzVar);
        this.zze = zzevhVar;
        zzhbp zzc = zzhbb.zzc(zzdrn.zza());
        this.zzf = zzc;
        zzhbp zzc2 = zzhbb.zzc(zzdrl.zza());
        this.zzg = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzdrp.zza());
        this.zzh = zzc3;
        zzhbp zzc4 = zzhbb.zzc(zzdrr.zza());
        this.zzi = zzc4;
        zzhbf zzc5 = zzhbg.zzc(4);
        zzc5.zzb(zzfhl.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfhl.BUILD_URL, zzc2);
        zzc5.zzb(zzfhl.HTTP, zzc3);
        zzc5.zzb(zzfhl.PRE_PROCESS, zzc4);
        zzhbg zzc6 = zzc5.zzc();
        this.zzj = zzc6;
        zzhbpVar2 = zzcjsVar.zzg;
        zzhbp zzc7 = zzhbb.zzc(new zzdrs(zzevhVar, zzhbpVar2, zzfgm.zza(), zzc6));
        this.zzk = zzc7;
        zzhbm zza = zzhbn.zza(0, 1);
        zza.zza(zzc7);
        zzhbn zzc8 = zza.zzc();
        this.zzl = zzc8;
        zzfhu zzfhuVar = new zzfhu(zzc8);
        this.zzm = zzfhuVar;
        zzfgm zza2 = zzfgm.zza();
        zzhbpVar3 = zzcjsVar.zzm;
        this.zzn = zzhbb.zzc(new zzfht(zza2, zzhbpVar3, zzfhuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzevl
    public final zzetz zza() {
        zzchz zzchzVar;
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzchz zzchzVar2;
        zzhbp zzhbpVar3;
        zzchz zzchzVar3;
        zzhbp zzhbpVar4;
        zzhbp zzhbpVar5;
        zzhbp zzhbpVar6;
        zzchz zzchzVar4;
        zzchz zzchzVar5;
        zzchz zzchzVar6;
        zzhbp zzhbpVar7;
        zzhbp zzhbpVar8;
        zzhbp zzhbpVar9;
        zzhbp zzhbpVar10;
        zzhbp zzhbpVar11;
        zzhbp zzhbpVar12;
        zzchzVar = this.zzb.zza;
        Context zza = zzchzVar.zza();
        zzhbk.zzb(zza);
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        zzbzq zzbzqVar = new zzbzq();
        zzhbk.zzb(zzgadVar);
        zzewj zzewjVar = new zzewj(zzbzqVar, zzgadVar, zzeva.zza(this.zza));
        zzerw zza2 = zzery.zza();
        zzhbpVar = this.zzb.zzm;
        zzetw zza3 = zzexf.zza(zzewjVar, zza2, (ScheduledExecutorService) zzhbpVar.zzb(), 0);
        zzbsz zzbszVar = new zzbsz();
        zzhbpVar2 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhbpVar2.zzb();
        zzchzVar2 = this.zzb.zza;
        Context zza4 = zzchzVar2.zza();
        zzhbk.zzb(zza4);
        zzewt zzewtVar = new zzewt(zzbszVar, scheduledExecutorService, zza4);
        zzhbpVar3 = this.zzb.zzm;
        zzetw zzb = zzexf.zzb(zzewtVar, (ScheduledExecutorService) zzhbpVar3.zzb());
        zzbzt zzbztVar = new zzbzt();
        zzchzVar3 = this.zzb.zza;
        Context zza5 = zzchzVar3.zza();
        zzhbk.zzb(zza5);
        zzhbpVar4 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzhbpVar4.zzb();
        zzhbk.zzb(zzgadVar);
        zzeuz zzeuzVar = this.zza;
        zzeur zza6 = zzeut.zza(zzbztVar, zza5, scheduledExecutorService2, zzgadVar, zzevb.zza(zzeuzVar), zzevd.zza(zzeuzVar), zzeve.zza(zzeuzVar));
        zzhbpVar5 = this.zzb.zzm;
        zzetw zza7 = zzexg.zza(zza6, (ScheduledExecutorService) zzhbpVar5.zzb());
        zzhbk.zzb(zzgadVar);
        zzexo zzexoVar = new zzexo(zzgadVar);
        zzhbpVar6 = this.zzb.zzm;
        zzetw zzc = zzexf.zzc(zzexoVar, (ScheduledExecutorService) zzhbpVar6.zzb());
        zzexd zzexdVar = zzexd.zza;
        zzchzVar4 = this.zzb.zza;
        Context zza8 = zzchzVar4.zza();
        zzhbk.zzb(zza8);
        String zza9 = zzeva.zza(this.zza);
        zzhbk.zzb(zzgadVar);
        zzevn zzevnVar = new zzevn(null, zza8, zza9, zzgadVar);
        zzaxk zzaxkVar = new zzaxk();
        zzhbk.zzb(zzgadVar);
        zzchzVar5 = this.zzb.zza;
        Context zza10 = zzchzVar5.zza();
        zzhbk.zzb(zza10);
        zzbbt zzbbtVar = new zzbbt();
        zzhbk.zzb(zzgadVar);
        zzbzt zzbztVar2 = new zzbzt();
        zzhbk.zzb(zzgadVar);
        zzeuz zzeuzVar2 = this.zza;
        zzbzt zzbztVar3 = new zzbzt();
        zzeuz zzeuzVar3 = this.zza;
        zzcjs zzcjsVar = this.zzb;
        int zza11 = zzevb.zza(zzeuzVar3);
        zzchzVar6 = zzcjsVar.zza;
        Context zza12 = zzchzVar6.zza();
        zzhbk.zzb(zza12);
        zzhbpVar7 = this.zzb.zzah;
        zzcac zzcacVar = (zzcac) zzhbpVar7.zzb();
        zzhbpVar8 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzhbpVar8.zzb();
        zzhbk.zzb(zzgadVar);
        zzhbpVar9 = this.zzb.zzaK;
        String zza13 = zzeva.zza(this.zza);
        zzawy zzawyVar = new zzawy();
        zzhbpVar10 = this.zzb.zzah;
        zzcac zzcacVar2 = (zzcac) zzhbpVar10.zzb();
        zzhbpVar11 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) zzhbpVar11.zzb();
        zzhbk.zzb(zzgadVar);
        zzfvx zzp = zzfvx.zzp(zza3, zzb, zza7, zzc, zzexdVar, zzevnVar, new zzewc(zzaxkVar, zzgadVar, zza10), new zzewn(zzbbtVar, zzgadVar, zzevc.zza(this.zza)), new zzeux(zzbztVar2, zzgadVar, zzevf.zza(zzeuzVar2), zzevg.zza(zzeuzVar2), zzevb.zza(zzeuzVar2)), new zzevy(zzbztVar3, zza11, zza12, zzcacVar, scheduledExecutorService3, zzgadVar, zzeva.zza(this.zza)), (zzetw) zzhbpVar9.zzb(), zzevu.zza(zza13, zzawyVar, zzcacVar2, scheduledExecutorService4, zzgadVar));
        zzfje zzfjeVar = (zzfje) this.zzd.zzb();
        zzhbpVar12 = this.zzb.zzZ;
        return new zzetz(zza, zzgadVar, zzp, zzfjeVar, (zzdso) zzhbpVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzevl
    public final zzfhr zzb() {
        return (zzfhr) this.zzn.zzb();
    }
}
