package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlj {
    private final zzol zza;
    private final zzli zze;
    private final zzmb zzh;
    private final zzei zzi;
    private boolean zzj;
    private zzhk zzk;
    private zzvr zzl = new zzvr(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlj(zzli zzliVar, zzmb zzmbVar, zzei zzeiVar, zzol zzolVar) {
        this.zza = zzolVar;
        this.zze = zzliVar;
        this.zzh = zzmbVar;
        this.zzi = zzeiVar;
    }

    private final void zzr(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzlh) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzs(zzlh zzlhVar) {
        zzlg zzlgVar = (zzlg) this.zzf.get(zzlhVar);
        if (zzlgVar != null) {
            zzlgVar.zza.zzi(zzlgVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlh zzlhVar = (zzlh) it.next();
            if (zzlhVar.zzc.isEmpty()) {
                zzs(zzlhVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzlh zzlhVar) {
        if (zzlhVar.zze && zzlhVar.zzc.isEmpty()) {
            zzlg zzlgVar = (zzlg) this.zzf.remove(zzlhVar);
            zzlgVar.getClass();
            zzlgVar.zza.zzp(zzlgVar.zzb);
            zzlgVar.zza.zzs(zzlgVar.zzc);
            zzlgVar.zza.zzr(zzlgVar.zzc);
            this.zzg.remove(zzlhVar);
        }
    }

    private final void zzv(zzlh zzlhVar) {
        zztr zztrVar = zzlhVar.zza;
        zztx zztxVar = new zztx() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // com.google.android.gms.internal.ads.zztx
            public final void zza(zzty zztyVar, zzcv zzcvVar) {
                zzlj.this.zzf(zztyVar, zzcvVar);
            }
        };
        zzlf zzlfVar = new zzlf(this, zzlhVar);
        this.zzf.put(zzlhVar, new zzlg(zztrVar, zztxVar, zzlfVar));
        zztrVar.zzh(new Handler(zzfk.zzw(), null), zzlfVar);
        zztrVar.zzg(new Handler(zzfk.zzw(), null), zzlfVar);
        zztrVar.zzm(zztxVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzlh zzlhVar = (zzlh) this.zzb.remove(i2);
                this.zzd.remove(zzlhVar.zzb);
                zzr(i2, -zzlhVar.zza.zzC().zzc());
                zzlhVar.zze = true;
                if (this.zzj) {
                    zzu(zzlhVar);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcv zzb() {
        if (!this.zzb.isEmpty()) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                zzlh zzlhVar = (zzlh) this.zzb.get(i2);
                zzlhVar.zzd = i;
                i += zzlhVar.zza.zzC().zzc();
            }
            return new zzlp(this.zzb, this.zzl);
        }
        return zzcv.zza;
    }

    public final zzcv zzc(int i, int i2, List list) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        if (list.size() != i2 - i) {
            z2 = false;
        }
        zzdx.zzd(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzlh) this.zzb.get(i3)).zza.zzt((zzbp) list.get(i3 - i));
        }
        return zzb();
    }

    public final /* synthetic */ void zzf(zzty zztyVar, zzcv zzcvVar) {
        this.zze.zzh();
    }

    public final void zzg(zzhk zzhkVar) {
        zzdx.zzf(!this.zzj);
        this.zzk = zzhkVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzlh zzlhVar = (zzlh) this.zzb.get(i);
            zzv(zzlhVar);
            this.zzg.add(zzlhVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlg zzlgVar : this.zzf.values()) {
            try {
                zzlgVar.zza.zzp(zzlgVar.zzb);
            } catch (RuntimeException e) {
                zzer.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzlgVar.zza.zzs(zzlgVar.zzc);
            zzlgVar.zza.zzr(zzlgVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zztu zztuVar) {
        zzlh zzlhVar = (zzlh) this.zzc.remove(zztuVar);
        zzlhVar.getClass();
        zzlhVar.zza.zzG(zztuVar);
        zzlhVar.zzc.remove(((zzto) zztuVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzlhVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzcv zzk(int i, List list, zzvr zzvrVar) {
        if (!list.isEmpty()) {
            this.zzl = zzvrVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzlh zzlhVar = (zzlh) list.get(i2 - i);
                if (i2 > 0) {
                    zzlh zzlhVar2 = (zzlh) this.zzb.get(i2 - 1);
                    zzlhVar.zzc(zzlhVar2.zza.zzC().zzc() + zzlhVar2.zzd);
                } else {
                    zzlhVar.zzc(0);
                }
                zzr(i2, zzlhVar.zza.zzC().zzc());
                this.zzb.add(i2, zzlhVar);
                this.zzd.put(zzlhVar.zzb, zzlhVar);
                if (this.zzj) {
                    zzv(zzlhVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlhVar);
                    } else {
                        zzs(zzlhVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcv zzl(int i, int i2, int i3, zzvr zzvrVar) {
        boolean z;
        if (zza() >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        this.zzl = null;
        return zzb();
    }

    public final zzcv zzm(int i, int i2, zzvr zzvrVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzdx.zzd(z);
        this.zzl = zzvrVar;
        zzw(i, i2);
        return zzb();
    }

    public final zzcv zzn(List list, zzvr zzvrVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzvrVar);
    }

    public final zzcv zzo(zzvr zzvrVar) {
        int zza = zza();
        if (zzvrVar.zzc() != zza) {
            zzvrVar = zzvrVar.zzf().zzg(0, zza);
        }
        this.zzl = zzvrVar;
        return zzb();
    }

    public final zztu zzp(zztw zztwVar, zzxz zzxzVar, long j) {
        int i = zzlp.zzc;
        Object obj = zztwVar.zza;
        Object obj2 = ((Pair) obj).first;
        zztw zza = zztwVar.zza(((Pair) obj).second);
        zzlh zzlhVar = (zzlh) this.zzd.get(obj2);
        zzlhVar.getClass();
        this.zzg.add(zzlhVar);
        zzlg zzlgVar = (zzlg) this.zzf.get(zzlhVar);
        if (zzlgVar != null) {
            zzlgVar.zza.zzk(zzlgVar.zzb);
        }
        zzlhVar.zzc.add(zza);
        zzto zzI = zzlhVar.zza.zzI(zza, zzxzVar, j);
        this.zzc.put(zzI, zzlhVar);
        zzt();
        return zzI;
    }

    public final zzvr zzq() {
        return this.zzl;
    }
}
