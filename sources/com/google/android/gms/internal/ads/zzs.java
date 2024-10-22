package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzs {
    public static final zzs zza = new zzs(1, 2, 3, null);
    public static final zzs zzb;
    public static final zzn zzc;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    private int zzl;

    static {
        zzr zzrVar = new zzr();
        zzrVar.zzb(1);
        zzrVar.zza(1);
        zzrVar.zzc(2);
        zzb = zzrVar.zzd();
        zzh = Integer.toString(0, 36);
        zzi = Integer.toString(1, 36);
        zzj = Integer.toString(2, 36);
        zzk = Integer.toString(3, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzp
        };
    }

    @Deprecated
    public zzs(int i, int i2, int i3, byte[] bArr) {
        this.zzd = i;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = bArr;
    }

    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzf(int i) {
        return i != -1 ? i != 1 ? i != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzg(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzh(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            if (this.zzd == zzsVar.zzd && this.zze == zzsVar.zze && this.zzf == zzsVar.zzf && Arrays.equals(this.zzg, zzsVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzl;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzg) + ((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf) * 31);
            this.zzl = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(zzg(this.zzd));
        sb.append(", ");
        sb.append(zzf(this.zze));
        sb.append(", ");
        sb.append(zzh(this.zzf));
        sb.append(", ");
        if (this.zzg != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final zzr zzc() {
        return new zzr(this, null);
    }

    public final String zzd() {
        if (!zze()) {
            return "NA";
        }
        return String.format(Locale.US, "%s/%s/%s", zzg(this.zzd), zzf(this.zze), zzh(this.zzf));
    }

    public final boolean zze() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
