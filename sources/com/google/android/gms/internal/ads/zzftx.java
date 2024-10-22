package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzftx implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfty zzc;

    public zzftx(zzfty zzftyVar) {
        this.zzc = zzftyVar;
        this.zza = zzftyVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.zzb != null) {
            z = true;
        } else {
            z = false;
        }
        zzfsw.zzj(z, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzful zzfulVar = this.zzc.zzb;
        i = zzfulVar.zzb;
        zzfulVar.zzb = i - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
