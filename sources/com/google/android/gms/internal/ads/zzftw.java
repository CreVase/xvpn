package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzftw extends zzfwj {
    final /* synthetic */ zzfty zza;

    public zzftw(zzfty zzftyVar) {
        this.zza = zzftyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfur.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzftx(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfty zzftyVar = this.zza;
        zzful.zzo(zzftyVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final Map zza() {
        return this.zza;
    }
}
