package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzdm implements Serializable, zzdj {
    final Object zza;

    public zzdm(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdm)) {
            return false;
        }
        Object obj2 = this.zza;
        Object obj3 = ((zzdm) obj).zza;
        if (obj2 != obj3 && !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        return this.zza;
    }
}
