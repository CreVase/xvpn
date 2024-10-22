package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzta implements zzvo {
    public final zzvo zza;
    final /* synthetic */ zztb zzb;
    private boolean zzc;

    public zzta(zztb zztbVar, zzvo zzvoVar) {
        this.zzb = zztbVar;
        this.zza = zzvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i) {
        zztb zztbVar = this.zzb;
        if (zztbVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhtVar.zzc(4);
            return -4;
        }
        long zzb = zztbVar.zzb();
        int zza = this.zza.zza(zzknVar, zzhtVar, i);
        if (zza == -5) {
            zzam zzamVar = zzknVar.zza;
            zzamVar.getClass();
            int i2 = zzamVar.zzC;
            int i3 = 0;
            if (i2 == 0) {
                if (zzamVar.zzD != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i3 = zzamVar.zzD;
            }
            zzak zzb2 = zzamVar.zzb();
            zzb2.zzE(i2);
            zzb2.zzF(i3);
            zzknVar.zza = zzb2.zzac();
            return -5;
        }
        long j = this.zzb.zzb;
        if (j != Long.MIN_VALUE && ((zza == -4 && zzhtVar.zze >= j) || (zza == -3 && zzb == Long.MIN_VALUE && !zzhtVar.zzd))) {
            zzhtVar.zzb();
            zzhtVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final boolean zze() {
        if (!this.zzb.zzq() && this.zza.zze()) {
            return true;
        }
        return false;
    }
}
