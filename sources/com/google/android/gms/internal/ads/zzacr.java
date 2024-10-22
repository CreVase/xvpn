package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzacr {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzacr(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacr.class == obj.getClass()) {
            zzacr zzacrVar = (zzacr) obj;
            if (this.zza == zzacrVar.zza && this.zzc == zzacrVar.zzc && this.zzd == zzacrVar.zzd && Arrays.equals(this.zzb, zzacrVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
