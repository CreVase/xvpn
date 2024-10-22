package com.google.android.gms.internal.measurement;

import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhq extends zzhw {
    private final int zzc;
    private final int zzd;

    public zzhq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzhm.zza(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhw, com.google.android.gms.internal.measurement.zzhm
    public final byte zza(int i) {
        int zzb = zzb();
        if (((zzb - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hx2.m("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(hx2.n("Index > length: ", i, ", ", zzb));
        }
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhw, com.google.android.gms.internal.measurement.zzhm
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhw
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzhw, com.google.android.gms.internal.measurement.zzhm
    public final int zzb() {
        return this.zzd;
    }
}
