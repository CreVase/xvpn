package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzaca implements zzabn {
    private final zzabn zza;

    public zzaca(zzabn zzabnVar) {
        this.zza = zzabnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        return this.zza.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final int zzc(int i) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public long zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public long zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final void zzg(int i) throws IOException {
        ((zzabc) this.zza).zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final void zzh(byte[] bArr, int i, int i2) throws IOException {
        ((zzabc) this.zza).zzm(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final void zzi(byte[] bArr, int i, int i2) throws IOException {
        ((zzabc) this.zza).zzn(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final void zzk(int i) throws IOException {
        ((zzabc) this.zza).zzo(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzm(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzn(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzn(bArr, 0, 8, true);
    }
}
