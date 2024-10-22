package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzful extends zzfuo implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzful(Map map) {
        zzfsw.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzful zzfulVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfulVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfulVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final Collection zzf() {
        return new zzfun(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfuo
    public final Iterator zzg() {
        return new zzftv(this);
    }

    public final List zzh(Object obj, List list, zzfui zzfuiVar) {
        if (list instanceof RandomAccess) {
            return new zzfue(this, obj, list, zzfuiVar);
        }
        return new zzfuk(this, obj, list, zzfuiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfuc(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfuf(this, (SortedMap) map);
        }
        return new zzfty(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfud(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfug(this, (SortedMap) map);
        }
        return new zzfub(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfuo, com.google.android.gms.internal.ads.zzfwo
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.zzb++;
            return true;
        }
        return false;
    }
}
