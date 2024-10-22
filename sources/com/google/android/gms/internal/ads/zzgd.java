package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzgd extends zzgc {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzgd(byte[] bArr) {
        super(false);
        zzdx.zzd(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.zza, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        this.zzb = zzgnVar.zza;
        zzi(zzgnVar);
        long j = zzgnVar.zzf;
        int length = this.zza.length;
        if (j <= length) {
            int i = (int) j;
            this.zzc = i;
            int i2 = length - i;
            this.zzd = i2;
            long j2 = zzgnVar.zzg;
            if (j2 != -1) {
                this.zzd = (int) Math.min(i2, j2);
            }
            this.zze = true;
            zzj(zzgnVar);
            long j3 = zzgnVar.zzg;
            if (j3 != -1) {
                return j3;
            }
            return this.zzd;
        }
        throw new zzgj(2008);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
