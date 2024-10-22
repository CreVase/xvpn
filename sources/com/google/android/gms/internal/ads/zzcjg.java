package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzcjg extends zzeuu {
    private final zzhbp zzA;
    private final zzhbp zzB;
    private final zzeww zza;
    private final zzcjs zzb;
    private final zzcjg zzc = this;
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
    private final zzhbp zzo;
    private final zzhbp zzp;
    private final zzhbp zzq;
    private final zzhbp zzr;
    private final zzhbp zzs;
    private final zzhbp zzt;
    private final zzhbp zzu;
    private final zzhbp zzv;
    private final zzhbp zzw;
    private final zzhbp zzx;
    private final zzhbp zzy;
    private final zzhbp zzz;

    public /* synthetic */ zzcjg(zzcjs zzcjsVar, zzeww zzewwVar, zzcjf zzcjfVar) {
        zzhbp zzhbpVar;
        zzcne zzcneVar;
        zzhbp zzhbpVar2;
        zzhbp zzhbpVar3;
        zzcis zzcisVar;
        zzhbp zzhbpVar4;
        zzcne zzcneVar2;
        zzhbp zzhbpVar5;
        zzhbp zzhbpVar6;
        zzhbp zzhbpVar7;
        zzcmy zzcmyVar;
        zzhbp zzhbpVar8;
        zzcna zzcnaVar;
        zzcnc zzcncVar;
        zzhbp zzhbpVar9;
        zzhbp zzhbpVar10;
        zzhbp zzhbpVar11;
        zzcng zzcngVar;
        zzhbp zzhbpVar12;
        zzcmw zzcmwVar;
        zzhbp zzhbpVar13;
        zzhbp zzhbpVar14;
        zzhbp zzhbpVar15;
        zzhbp zzhbpVar16;
        this.zzb = zzcjsVar;
        this.zza = zzewwVar;
        zzhbpVar = zzcjsVar.zzG;
        this.zzd = zzhbb.zzc(new zzfjf(zzhbpVar));
        zzewy zzewyVar = new zzewy(zzewwVar);
        this.zze = zzewyVar;
        zzewz zzewzVar = new zzewz(zzewwVar);
        this.zzf = zzewzVar;
        zzexb zzexbVar = new zzexb(zzewwVar);
        this.zzg = zzexbVar;
        zzcneVar = zzcnd.zza;
        zzhbpVar2 = zzcjsVar.zzg;
        zzhbpVar3 = zzcjsVar.zzm;
        this.zzh = new zzeut(zzcneVar, zzhbpVar2, zzhbpVar3, zzfgm.zza(), zzewyVar, zzewzVar, zzexbVar);
        zzewx zzewxVar = new zzewx(zzewwVar);
        this.zzi = zzewxVar;
        zzcisVar = zzcir.zza;
        zzhbpVar4 = zzcjsVar.zzg;
        this.zzj = new zzevp(zzcisVar, zzhbpVar4, zzewxVar, zzfgm.zza());
        zzcneVar2 = zzcnd.zza;
        zzhbpVar5 = zzcjsVar.zzg;
        zzhbpVar6 = zzcjsVar.zzah;
        zzhbpVar7 = zzcjsVar.zzm;
        this.zzk = new zzewa(zzcneVar2, zzewyVar, zzhbpVar5, zzhbpVar6, zzhbpVar7, zzfgm.zza(), zzewxVar);
        zzcmyVar = zzcmx.zza;
        zzfgm zza = zzfgm.zza();
        zzhbpVar8 = zzcjsVar.zzg;
        this.zzl = new zzewe(zzcmyVar, zza, zzhbpVar8);
        zzcnaVar = zzcmz.zza;
        this.zzm = new zzewl(zzcnaVar, zzfgm.zza(), zzewxVar);
        zzcncVar = zzcnb.zza;
        zzhbpVar9 = zzcjsVar.zzm;
        zzhbpVar10 = zzcjsVar.zzg;
        this.zzn = new zzewv(zzcncVar, zzhbpVar9, zzhbpVar10);
        this.zzo = new zzexq(zzfgm.zza());
        zzexa zzexaVar = new zzexa(zzewwVar);
        this.zzp = zzexaVar;
        zzhbpVar11 = zzcjsVar.zzah;
        zzcngVar = zzcnf.zza;
        zzfgm zza2 = zzfgm.zza();
        zzhbpVar12 = zzcjsVar.zzm;
        this.zzq = new zzexm(zzhbpVar11, zzexaVar, zzexbVar, zzcngVar, zza2, zzewxVar, zzhbpVar12);
        zzcmwVar = zzcmv.zza;
        zzhbpVar13 = zzcjsVar.zzah;
        zzhbpVar14 = zzcjsVar.zzm;
        this.zzr = new zzevu(zzewxVar, zzcmwVar, zzhbpVar13, zzhbpVar14, zzfgm.zza());
        zzexc zzexcVar = new zzexc(zzewwVar);
        this.zzs = zzexcVar;
        zzhbp zzc = zzhbb.zzc(zzdrn.zza());
        this.zzt = zzc;
        zzhbp zzc2 = zzhbb.zzc(zzdrl.zza());
        this.zzu = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzdrp.zza());
        this.zzv = zzc3;
        zzhbp zzc4 = zzhbb.zzc(zzdrr.zza());
        this.zzw = zzc4;
        zzhbf zzc5 = zzhbg.zzc(4);
        zzc5.zzb(zzfhl.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfhl.BUILD_URL, zzc2);
        zzc5.zzb(zzfhl.HTTP, zzc3);
        zzc5.zzb(zzfhl.PRE_PROCESS, zzc4);
        zzhbg zzc6 = zzc5.zzc();
        this.zzx = zzc6;
        zzhbpVar15 = zzcjsVar.zzg;
        zzhbp zzc7 = zzhbb.zzc(new zzdrs(zzexcVar, zzhbpVar15, zzfgm.zza(), zzc6));
        this.zzy = zzc7;
        zzhbm zza3 = zzhbn.zza(0, 1);
        zza3.zza(zzc7);
        zzhbn zzc8 = zza3.zzc();
        this.zzz = zzc8;
        zzfhu zzfhuVar = new zzfhu(zzc8);
        this.zzA = zzfhuVar;
        zzfgm zza4 = zzfgm.zza();
        zzhbpVar16 = zzcjsVar.zzm;
        this.zzB = zzhbb.zzc(new zzfht(zza4, zzhbpVar16, zzfhuVar));
    }

    private final zzeux zze() {
        zzbzt zzbztVar = new zzbzt();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        zzeww zzewwVar = this.zza;
        return new zzeux(zzbztVar, zzgadVar, zzewwVar.zzd(), zzewwVar.zzb(), zzewwVar.zza());
    }

    private final zzewn zzf() {
        zzbbt zzbbtVar = new zzbbt();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        List zzf = this.zza.zzf();
        zzhbk.zzb(zzf);
        return new zzewn(zzbbtVar, zzgadVar, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzetz zza() {
        zzchz zzchzVar;
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzchzVar = this.zzb.zza;
        Context zza = zzchzVar.zza();
        zzhbk.zzb(zza);
        zzbzq zzbzqVar = new zzbzq();
        zzbzr zzbzrVar = new zzbzr();
        zzhbpVar = this.zzb.zzaK;
        Object zzb = zzhbpVar.zzb();
        zzhbp zzhbpVar3 = this.zzr;
        zzhbp zzhbpVar4 = this.zzq;
        zzhbp zzhbpVar5 = this.zzo;
        zzhbp zzhbpVar6 = this.zzn;
        zzhbp zzhbpVar7 = this.zzm;
        zzhbp zzhbpVar8 = this.zzl;
        zzhbp zzhbpVar9 = this.zzk;
        zzhbp zzhbpVar10 = this.zzj;
        zzhbp zzhbpVar11 = this.zzh;
        zzeux zze = zze();
        zzewn zzf = zzf();
        zzhaw zza2 = zzhbb.zza(zzhbpVar11);
        zzhaw zza3 = zzhbb.zza(zzhbpVar10);
        zzhaw zza4 = zzhbb.zza(zzhbpVar9);
        zzhaw zza5 = zzhbb.zza(zzhbpVar8);
        zzhaw zza6 = zzhbb.zza(zzhbpVar7);
        zzhaw zza7 = zzhbb.zza(zzhbpVar6);
        zzhaw zza8 = zzhbb.zza(zzhbpVar5);
        zzhaw zza9 = zzhbb.zza(zzhbpVar4);
        zzhaw zza10 = zzhbb.zza(zzhbpVar3);
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        zzfje zzfjeVar = (zzfje) this.zzd.zzb();
        zzhbpVar2 = this.zzb.zzZ;
        return zzexh.zza(zza, zzbzqVar, zzbzrVar, zzb, zze, zzf, zza2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zzgadVar, zzfjeVar, (zzdso) zzhbpVar2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzetz zzb() {
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
        String zzc = this.zza.zzc();
        zzhbk.zzb(zzc);
        zzewj zzewjVar = new zzewj(zzbzqVar, zzgadVar, zzc);
        zzerw zza2 = zzery.zza();
        zzhbpVar = this.zzb.zzm;
        zzetw zza3 = zzexf.zza(zzewjVar, zza2, (ScheduledExecutorService) zzhbpVar.zzb(), -1);
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
        zzeww zzewwVar = this.zza;
        zzeur zza6 = zzeut.zza(zzbztVar, zza5, scheduledExecutorService2, zzgadVar, zzewwVar.zza(), zzewz.zzc(zzewwVar), zzexb.zzc(zzewwVar));
        zzhbpVar5 = this.zzb.zzm;
        zzetw zza7 = zzexg.zza(zza6, (ScheduledExecutorService) zzhbpVar5.zzb());
        zzhbk.zzb(zzgadVar);
        zzexo zzexoVar = new zzexo(zzgadVar);
        zzhbpVar6 = this.zzb.zzm;
        zzetw zzc2 = zzexf.zzc(zzexoVar, (ScheduledExecutorService) zzhbpVar6.zzb());
        zzexd zzexdVar = zzexd.zza;
        zzchzVar4 = this.zzb.zza;
        Context zza8 = zzchzVar4.zza();
        zzhbk.zzb(zza8);
        String zzc3 = this.zza.zzc();
        zzhbk.zzb(zzc3);
        zzhbk.zzb(zzgadVar);
        zzevn zzevnVar = new zzevn(null, zza8, zzc3, zzgadVar);
        zzaxk zzaxkVar = new zzaxk();
        zzhbk.zzb(zzgadVar);
        zzchzVar5 = this.zzb.zza;
        Context zza9 = zzchzVar5.zza();
        zzhbk.zzb(zza9);
        zzbzt zzbztVar2 = new zzbzt();
        zzeww zzewwVar2 = this.zza;
        zzcjs zzcjsVar = this.zzb;
        int zza10 = zzewwVar2.zza();
        zzchzVar6 = zzcjsVar.zza;
        Context zza11 = zzchzVar6.zza();
        zzhbk.zzb(zza11);
        zzhbpVar7 = this.zzb.zzah;
        zzcac zzcacVar = (zzcac) zzhbpVar7.zzb();
        zzhbpVar8 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzhbpVar8.zzb();
        zzhbk.zzb(zzgadVar);
        String zzc4 = this.zza.zzc();
        zzhbk.zzb(zzc4);
        zzhbpVar9 = this.zzb.zzaK;
        String zzc5 = this.zza.zzc();
        zzhbk.zzb(zzc5);
        zzawy zzawyVar = new zzawy();
        zzhbpVar10 = this.zzb.zzah;
        zzcac zzcacVar2 = (zzcac) zzhbpVar10.zzb();
        zzhbpVar11 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) zzhbpVar11.zzb();
        zzhbk.zzb(zzgadVar);
        zzfvx zzp = zzfvx.zzp(zza3, zzb, zza7, zzc2, zzexdVar, zzevnVar, new zzewc(zzaxkVar, zzgadVar, zza9), zzf(), zze(), new zzevy(zzbztVar2, zza10, zza11, zzcacVar, scheduledExecutorService3, zzgadVar, zzc4), (zzetw) zzhbpVar9.zzb(), zzevu.zza(zzc5, zzawyVar, zzcacVar2, scheduledExecutorService4, zzgadVar));
        zzfje zzfjeVar = (zzfje) this.zzd.zzb();
        zzhbpVar12 = this.zzb.zzZ;
        return new zzetz(zza, zzgadVar, zzp, zzfjeVar, (zzdso) zzhbpVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzfhr zzc() {
        return (zzfhr) this.zzB.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzfje zzd() {
        return (zzfje) this.zzd.zzb();
    }
}
