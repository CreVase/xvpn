package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzacy {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzby zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzfk.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzer.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaem.zzb(new zzfb(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzer.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzafz(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    public static zzacv zzc(zzfb zzfbVar, boolean z, boolean z2) throws zzcc {
        if (z) {
            zzd(3, zzfbVar, false);
        }
        String zzy = zzfbVar.zzy((int) zzfbVar.zzr(), zzfsi.zzc);
        int length = zzy.length();
        long zzr = zzfbVar.zzr();
        String[] strArr = new String[(int) zzr];
        int i = length + 15;
        for (int i2 = 0; i2 < zzr; i2++) {
            String zzy2 = zzfbVar.zzy((int) zzfbVar.zzr(), zzfsi.zzc);
            strArr[i2] = zzy2;
            i = i + 4 + zzy2.length();
        }
        if (z2 && (zzfbVar.zzl() & 1) == 0) {
            throw zzcc.zza("framing bit expected to be set", null);
        }
        return new zzacv(zzy, strArr, i + 1);
    }

    public static boolean zzd(int i, zzfb zzfbVar, boolean z) throws zzcc {
        if (zzfbVar.zza() < 7) {
            if (z) {
                return false;
            }
            throw zzcc.zza("too short header: " + zzfbVar.zza(), null);
        }
        if (zzfbVar.zzl() != i) {
            if (z) {
                return false;
            }
            throw zzcc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzfbVar.zzl() == 118 && zzfbVar.zzl() == 111 && zzfbVar.zzl() == 114 && zzfbVar.zzl() == 98 && zzfbVar.zzl() == 105 && zzfbVar.zzl() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzcc.zza("expected characters 'vorbis'", null);
    }
}
