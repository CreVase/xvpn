package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class zzfxb implements Comparator {
    public static zzfxb zzb(Comparator comparator) {
        if (comparator instanceof zzfxb) {
            return (zzfxb) comparator;
        }
        return new zzfvd(comparator);
    }

    public static zzfxb zzc() {
        return zzfwz.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfxb zza() {
        return new zzfxk(this);
    }
}
