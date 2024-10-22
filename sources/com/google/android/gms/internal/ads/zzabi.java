package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzabi {
    public final String zza;

    private zzabi(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzabi zza(zzfb zzfbVar) {
        String str;
        zzfbVar.zzH(2);
        int zzl = zzfbVar.zzl();
        int i = zzl >> 1;
        int i2 = zzl & 1;
        int zzl2 = zzfbVar.zzl() >> 3;
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i3 = zzl2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (i3 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(i3);
        return new zzabi(i, i3, sb.toString());
    }
}
