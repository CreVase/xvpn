package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzack {
    public final zzacn zza;
    public final zzacn zzb;

    public zzack(zzacn zzacnVar, zzacn zzacnVar2) {
        this.zza = zzacnVar;
        this.zzb = zzacnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzack.class == obj.getClass()) {
            zzack zzackVar = (zzack) obj;
            if (this.zza.equals(zzackVar.zza) && this.zzb.equals(zzackVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String concat;
        zzacn zzacnVar = this.zza;
        zzacn zzacnVar2 = this.zzb;
        String zzacnVar3 = zzacnVar.toString();
        if (zzacnVar.equals(zzacnVar2)) {
            concat = "";
        } else {
            concat = ", ".concat(this.zzb.toString());
        }
        return "[" + zzacnVar3 + concat + "]";
    }
}
