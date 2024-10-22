package com.google.android.gms.internal.auth;

import defpackage.hx2;

/* loaded from: classes.dex */
final class zzdy extends zzeb {
    private final int zzc;

    public zzdy(byte[] bArr, int i, int i2) {
        super(bArr);
        zzee.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hx2.m("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(hx2.n("Index > length: ", i, ", ", i2));
        }
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
