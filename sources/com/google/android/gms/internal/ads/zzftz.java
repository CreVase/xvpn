package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzftz implements Iterator {
    final Iterator zza;
    Object zzb;
    Collection zzc;
    Iterator zzd;
    final /* synthetic */ zzful zze;

    public zzftz(zzful zzfulVar) {
        Map map;
        this.zze = zzfulVar;
        map = zzfulVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfwb.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.zza.hasNext() && !this.zzd.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zzd.remove();
        Collection collection = this.zzc;
        collection.getClass();
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzful zzfulVar = this.zze;
        i = zzfulVar.zzb;
        zzfulVar.zzb = i - 1;
    }
}
