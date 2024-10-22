package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzyu implements zzaah, zzdj {
    private final Context zza;
    private final zzaaf zzb;
    private final zzdk zzc;
    private final zzet zzd = new zzet(16);
    private final zzfh zze = new zzfh(10);
    private final zzfh zzf = new zzfh(10);
    private final Handler zzg;
    private final ArrayList zzh;
    private final zzae zzi;
    private zzaae zzj;
    private Executor zzk;
    private zzzj zzl;
    private zzam zzm;
    private Pair zzn;
    private final zzdm zzo;
    private final zzdm zzp;
    private boolean zzq;

    public zzyu(Context context, zzdi zzdiVar, zzaaf zzaafVar, zzam zzamVar) throws zzdh {
        zzs zzsVar;
        int i;
        int i2;
        this.zza = context;
        this.zzb = zzaafVar;
        zzfk.zzG(context);
        zzdm zzdmVar = zzdm.zza;
        this.zzo = zzdmVar;
        this.zzp = zzdmVar;
        zzae zzaeVar = null;
        final Handler zzv = zzfk.zzv(null);
        this.zzg = zzv;
        zzs zzsVar2 = zzamVar.zzy;
        if (zzsVar2 == null || ((i2 = zzsVar2.zzf) != 7 && i2 != 6)) {
            zzsVar2 = zzs.zza;
        }
        zzs zzsVar3 = zzsVar2;
        if (zzsVar3.zzf == 7) {
            zzr zzc = zzsVar3.zzc();
            zzc.zzc(6);
            zzsVar = zzc.zzd();
        } else {
            zzsVar = zzsVar3;
        }
        this.zzc = zzdiVar.zza(context, zzv.zzb, zzsVar3, zzsVar, false, new Executor() { // from class: com.google.android.gms.internal.ads.zzys
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                zzv.post(runnable);
            }
        }, this);
        Pair pair = this.zzn;
        if (pair == null) {
            this.zzh = new ArrayList();
            if (zzfk.zza < 21 && (i = zzamVar.zzu) != 0) {
                zzaeVar = zzyt.zza(i);
            }
            this.zzi = zzaeVar;
            return;
        }
        throw null;
    }

    private final void zzh() {
        if (this.zzm == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        zzae zzaeVar = this.zzi;
        if (zzaeVar != null) {
            arrayList.add(zzaeVar);
        }
        arrayList.addAll(this.zzh);
        if (this.zzm == null) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zza(int i, zzam zzamVar) {
        this.zzm = zzamVar;
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzb(zzaae zzaaeVar, Executor executor) {
        if (zzfk.zzE(this.zzj, zzaaeVar)) {
            zzdx.zzf(zzfk.zzE(this.zzk, executor));
        } else {
            this.zzj = zzaaeVar;
            this.zzk = executor;
        }
    }

    public final void zzc(Surface surface, zzfc zzfcVar) {
        Pair pair = this.zzn;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfc) this.zzn.second).equals(zzfcVar)) {
            return;
        }
        Pair pair2 = this.zzn;
        boolean z = true;
        if (pair2 != null && !((Surface) pair2.first).equals(surface)) {
            z = false;
        }
        this.zzq = z;
        this.zzn = Pair.create(surface, zzfcVar);
        throw null;
    }

    public final void zzd(List list) {
        this.zzh.clear();
        this.zzh.addAll(list);
        zzh();
    }

    public final void zze(zzzj zzzjVar) {
        this.zzl = zzzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final boolean zzf() {
        return zzfk.zzG(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final boolean zzg() {
        return this.zzq;
    }
}
