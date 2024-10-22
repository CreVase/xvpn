package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgcb implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzgcb zzgcbVar = (zzgcb) obj;
        int length = this.zza.length;
        int length2 = zzgcbVar.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i];
            byte b3 = zzgcbVar.zza[i];
            if (b2 != b3) {
                return b2 - b3;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgcb)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzgcb) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgro.zza(this.zza);
    }
}
