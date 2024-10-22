package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class zzmi {
    public abstract int zza(int i, byte[] bArr, int i2, int i3);

    public abstract int zza(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract String zza(byte[] bArr, int i, int i2) throws zzji;

    public final boolean zzb(byte[] bArr, int i, int i2) {
        if (zza(0, bArr, i, i2) != 0) {
            return false;
        }
        return true;
    }
}
