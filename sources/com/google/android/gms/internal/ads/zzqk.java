package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzqk implements zzpv {
    public zzqk(zzqj zzqjVar) {
    }

    public static int zza(int i, int i2, int i3) {
        return zzfya.zza(((i * i2) * i3) / 1000000);
    }

    public static int zzb(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
