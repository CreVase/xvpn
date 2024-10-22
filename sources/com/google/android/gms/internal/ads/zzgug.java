package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgug extends AbstractList {
    private final List zza;
    private final zzguf zzb;

    public zzgug(List list, zzguf zzgufVar) {
        this.zza = list;
        this.zzb = zzgufVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzayt zzb = zzayt.zzb(((Integer) this.zza.get(i)).intValue());
        if (zzb == null) {
            return zzayt.AD_FORMAT_TYPE_UNSPECIFIED;
        }
        return zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
