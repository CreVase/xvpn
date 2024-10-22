package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabq {
    public static int zza(zzabn zzabnVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzabnVar.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    public static void zzb(boolean z, String str) throws zzcc {
        if (z) {
        } else {
            throw zzcc.zza(str, null);
        }
    }

    public static boolean zzc(zzabn zzabnVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzabnVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzabn zzabnVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzabc) zzabnVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzabn zzabnVar, int i) throws IOException {
        try {
            ((zzabc) zzabnVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
