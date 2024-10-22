package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzdo {
    public static final zzdo zza = new zzdo(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdo(int i, int i2, int i3) {
        int i4;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        if (zzfk.zzF(i3)) {
            i4 = zzfk.zzl(i3, i2);
        } else {
            i4 = -1;
        }
        this.zze = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdo)) {
            return false;
        }
        zzdo zzdoVar = (zzdo) obj;
        if (this.zzb == zzdoVar.zzb && this.zzc == zzdoVar.zzc && this.zzd == zzdoVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.zzb);
        sb.append(", channelCount=");
        sb.append(this.zzc);
        sb.append(", encoding=");
        return hx2.r(sb, this.zzd, "]");
    }
}
