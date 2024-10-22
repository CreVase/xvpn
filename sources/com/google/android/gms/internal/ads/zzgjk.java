package com.google.android.gms.internal.ads;

import defpackage.p71;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgjk {
    private final Class zza;
    private final zzgrx zzb;

    public /* synthetic */ zzgjk(Class cls, zzgrx zzgrxVar, zzgjj zzgjjVar) {
        this.zza = cls;
        this.zzb = zzgrxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjk)) {
            return false;
        }
        zzgjk zzgjkVar = (zzgjk) obj;
        if (!zzgjkVar.zza.equals(this.zza) || !zzgjkVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return p71.m(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
