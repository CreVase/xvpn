package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzehz {
    private final zzgal zzc;
    private Object zzf;
    private final String zzh;
    private final int zzi;
    private final zzeio zzj;
    private zzfcr zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;

    public zzehz(zzfde zzfdeVar, zzeio zzeioVar, zzgal zzgalVar) {
        this.zzi = zzfdeVar.zzb.zzb.zzp;
        this.zzj = zzeioVar;
        this.zzc = zzgalVar;
        this.zzh = zzeiu.zzc(zzfdeVar);
        List list = zzfdeVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfcr) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zzf() {
        this.zzj.zzi(this.zzk);
        Object obj = this.zzf;
        if (obj != null) {
            this.zzc.zzc(obj);
        } else {
            this.zzc.zzd(new zzeir(3, this.zzh));
        }
    }

    private final synchronized boolean zzg(boolean z) {
        int i;
        for (zzfcr zzfcrVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfcrVar);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            Integer valueOf = Integer.valueOf(i);
            if (z || !this.zze.contains(zzfcrVar.zzau)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        int i;
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfcr) it.next());
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            if (Integer.valueOf(i).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzi() {
        if (!zzg(true)) {
            if (!zzh()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized zzfcr zza() {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzfcr zzfcrVar = (zzfcr) this.zzb.get(i);
            String str = zzfcrVar.zzau;
            if (!this.zze.contains(str)) {
                if (!TextUtils.isEmpty(str)) {
                    this.zze.add(str);
                }
                this.zzd.add(zzfcrVar);
                return (zzfcr) this.zzb.remove(i);
            }
        }
        return null;
    }

    public final synchronized void zzb(Throwable th, zzfcr zzfcrVar) {
        this.zzd.remove(zzfcrVar);
        this.zze.remove(zzfcrVar.zzau);
        if (!zzd() && !zzi()) {
            zzf();
        }
    }

    public final synchronized void zzc(Object obj, zzfcr zzfcrVar) {
        int i;
        this.zzd.remove(zzfcrVar);
        if (zzd()) {
            return;
        }
        Integer num = (Integer) this.zza.get(zzfcrVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfcrVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = obj;
        this.zzk = zzfcrVar;
        if (!zzi()) {
            zzf();
        }
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }

    public final synchronized boolean zze() {
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi) {
                if (zzg(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
