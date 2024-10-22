package com.google.android.gms.internal.ads;

import defpackage.p71;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgiz {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgiz(Class cls, Class cls2, zzgiy zzgiyVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgiz)) {
            return false;
        }
        zzgiz zzgizVar = (zzgiz) obj;
        if (!zzgizVar.zza.equals(this.zza) || !zzgizVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return p71.m(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
