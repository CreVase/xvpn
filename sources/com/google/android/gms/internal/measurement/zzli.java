package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzli implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzlg zzc;

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.zza;
        if (i > 0) {
            list = this.zzc.zzb;
            if (i <= list.size()) {
                return true;
            }
        }
        if (zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!zza().hasNext()) {
            list = this.zzc.zzb;
            int i = this.zza - 1;
            this.zza = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzli(zzlg zzlgVar) {
        List list;
        this.zzc = zzlgVar;
        list = zzlgVar.zzb;
        this.zza = list.size();
    }
}
