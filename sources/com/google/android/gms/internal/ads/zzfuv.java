package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfuv extends AbstractSet {
    final /* synthetic */ zzfvb zza;

    public zzfuv(zzfvb zzfvbVar) {
        this.zza = zzfvbVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzq;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzq = this.zza.zzq(entry.getKey());
            if (zzq != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfsr.zza(objArr[zzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfvb zzfvbVar = this.zza;
        Map zzj = zzfvbVar.zzj();
        if (zzj != null) {
            return zzj.entrySet().iterator();
        }
        return new zzfut(zzfvbVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzp;
        int i;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfvb zzfvbVar = this.zza;
        if (zzfvbVar.zzo()) {
            return false;
        }
        zzp = zzfvbVar.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfvb zzfvbVar2 = this.zza;
        Object zzh = zzfvb.zzh(zzfvbVar2);
        int[] iArr = zzfvbVar2.zza;
        iArr.getClass();
        zzfvb zzfvbVar3 = this.zza;
        Object[] objArr = zzfvbVar3.zzb;
        objArr.getClass();
        Object[] objArr2 = zzfvbVar3.zzc;
        objArr2.getClass();
        int zzb = zzfvc.zzb(key, value, zzp, zzh, iArr, objArr, objArr2);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzn(zzb, zzp);
        zzfvb zzfvbVar4 = this.zza;
        i = zzfvbVar4.zzg;
        zzfvbVar4.zzg = i - 1;
        this.zza.zzl();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
