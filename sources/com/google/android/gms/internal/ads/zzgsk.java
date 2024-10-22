package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgsk extends zzgsn {
    private final int zzc;
    private final int zzd;

    public zzgsk(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgsr.zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgsn, com.google.android.gms.internal.ads.zzgsr
    public final byte zza(int i) {
        zzgsr.zzy(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgsn, com.google.android.gms.internal.ads.zzgsr
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsn, com.google.android.gms.internal.ads.zzgsr
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgsn, com.google.android.gms.internal.ads.zzgsr
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
