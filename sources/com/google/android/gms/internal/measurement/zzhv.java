package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhv {
    private final zzig zza;
    private final byte[] zzb;

    public final zzhm zza() {
        this.zza.zzb();
        return new zzhw(this.zzb);
    }

    public final zzig zzb() {
        return this.zza;
    }

    private zzhv(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzig.zzb(bArr);
    }
}
