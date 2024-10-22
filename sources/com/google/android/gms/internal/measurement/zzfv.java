package com.google.android.gms.internal.measurement;

import android.content.Context;
import defpackage.g33;

/* loaded from: classes.dex */
final class zzfv extends zzgu {
    private final Context zza;
    private final g33 zzb;

    public zzfv(Context context, g33 g33Var) {
        if (context != null) {
            this.zza = context;
            this.zzb = g33Var;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        g33 g33Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgu) {
            zzgu zzguVar = (zzgu) obj;
            if (this.zza.equals(zzguVar.zza()) && ((g33Var = this.zzb) != null ? g33Var.equals(zzguVar.zzb()) : zzguVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.zza.hashCode() ^ 1000003) * 1000003;
        g33 g33Var = this.zzb;
        if (g33Var == null) {
            hashCode = 0;
        } else {
            hashCode = g33Var.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzgu
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzgu
    public final g33 zzb() {
        return this.zzb;
    }
}
