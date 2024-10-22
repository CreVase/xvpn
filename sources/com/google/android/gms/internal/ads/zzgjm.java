package com.google.android.gms.internal.ads;

import defpackage.p71;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgjm {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgjm(Class cls, Class cls2, zzgjl zzgjlVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjm)) {
            return false;
        }
        zzgjm zzgjmVar = (zzgjm) obj;
        if (!zzgjmVar.zza.equals(this.zza) || !zzgjmVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return p71.m(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
