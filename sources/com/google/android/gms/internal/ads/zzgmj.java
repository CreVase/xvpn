package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgmj {
    private final zzgmc zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzgmj(zzgmc zzgmcVar, List list, Integer num, zzgmi zzgmiVar) {
        this.zza = zzgmcVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmj)) {
            return false;
        }
        zzgmj zzgmjVar = (zzgmj) obj;
        if (this.zza.equals(zzgmjVar.zza) && this.zzb.equals(zzgmjVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzgmjVar.zzc;
            if (num != num2) {
                if (num != null && num.equals(num2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
