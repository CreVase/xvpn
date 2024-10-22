package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzgsi implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgsr zzgsrVar = (zzgsr) obj;
        zzgsr zzgsrVar2 = (zzgsr) obj2;
        zzgsl it = zzgsrVar.iterator();
        zzgsl it2 = zzgsrVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgsrVar.zzd()).compareTo(Integer.valueOf(zzgsrVar2.zzd()));
    }
}
