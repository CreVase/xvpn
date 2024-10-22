package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class zzcg {
    public final float zzc;
    public final float zzd;
    private final int zzg;
    public static final zzcg zza = new zzcg(1.0f, 1.0f);
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcf
    };

    public zzcg(float f, float f2) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        zzdx.zzd(f2 > 0.0f);
        this.zzc = f;
        this.zzd = f2;
        this.zzg = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcg.class == obj.getClass()) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.zzc == zzcgVar.zzc && this.zzd == zzcgVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToRawIntBits = Float.floatToRawIntBits(this.zzc) + 527;
        return Float.floatToRawIntBits(this.zzd) + (floatToRawIntBits * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j) {
        return j * this.zzg;
    }
}
