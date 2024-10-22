package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcfc implements zzgi {
    private final zzgi zza;
    private final long zzb;
    private final zzgi zzc;
    private long zzd;
    private Uri zze;

    public zzcfc(zzgi zzgiVar, int i, zzgi zzgiVar2) {
        this.zza = zzgiVar;
        this.zzb = i;
        this.zzc = zzgiVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
            int i4 = i3 + zza2;
            this.zzd += zza2;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        zzgn zzgnVar2;
        long j;
        long j2;
        this.zze = zzgnVar.zza;
        long j3 = this.zzb;
        long j4 = zzgnVar.zzf;
        zzgn zzgnVar3 = null;
        if (j4 >= j3) {
            zzgnVar2 = null;
        } else {
            long j5 = zzgnVar.zzg;
            long j6 = j3 - j4;
            if (j5 != -1) {
                j6 = Math.min(j5, j6);
            }
            zzgnVar2 = new zzgn(zzgnVar.zza, null, j4, j4, j6, null, 0);
        }
        long j7 = zzgnVar.zzg;
        if (j7 == -1 || zzgnVar.zzf + j7 > this.zzb) {
            long max = Math.max(this.zzb, zzgnVar.zzf);
            long j8 = zzgnVar.zzg;
            if (j8 != -1) {
                j = Math.min(j8, (zzgnVar.zzf + j8) - this.zzb);
            } else {
                j = -1;
            }
            zzgnVar3 = new zzgn(zzgnVar.zza, null, max, max, j, null, 0);
        }
        long j9 = 0;
        if (zzgnVar2 != null) {
            j2 = this.zza.zzb(zzgnVar2);
        } else {
            j2 = 0;
        }
        if (zzgnVar3 != null) {
            j9 = this.zzc.zzb(zzgnVar3);
        }
        this.zzd = zzgnVar.zzf;
        if (j2 == -1 || j9 == -1) {
            return -1L;
        }
        return j2 + j9;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        return zzfvv.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
    }
}
