package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzfwz extends zzfxb implements Serializable {
    static final zzfwz zza = new zzfwz();

    private zzfwz() {
    }

    @Override // com.google.android.gms.internal.ads.zzfxb, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final zzfxb zza() {
        return zzfxj.zza;
    }
}
