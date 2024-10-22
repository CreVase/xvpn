package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzfxj extends zzfxb implements Serializable {
    static final zzfxj zza = new zzfxj();

    private zzfxj() {
    }

    @Override // com.google.android.gms.internal.ads.zzfxb, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final zzfxb zza() {
        return zzfwz.zza;
    }
}
