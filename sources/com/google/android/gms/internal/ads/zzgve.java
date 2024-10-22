package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgve {
    public static final boolean zza(Object obj) {
        if (!((zzgvd) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgvd zzgvdVar = (zzgvd) obj;
        zzgvd zzgvdVar2 = (zzgvd) obj2;
        if (!zzgvdVar2.isEmpty()) {
            if (!zzgvdVar.zze()) {
                zzgvdVar = zzgvdVar.zzb();
            }
            zzgvdVar.zzd(zzgvdVar2);
        }
        return zzgvdVar;
    }
}
