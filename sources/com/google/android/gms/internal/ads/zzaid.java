package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaid extends zzain {
    private zzabz zza;
    private zzaic zzb;

    private static boolean zzd(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final long zza(zzfb zzfbVar) {
        if (zzd(zzfbVar.zzI())) {
            int i = (zzfbVar.zzI()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int zza = zzabv.zza(zzfbVar, i);
                zzfbVar.zzG(0);
                return zza;
            }
            zzfbVar.zzH(4);
            zzfbVar.zzv();
            int zza2 = zzabv.zza(zzfbVar, i);
            zzfbVar.zzG(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final boolean zzc(zzfb zzfbVar, long j, zzaik zzaikVar) {
        byte[] zzI = zzfbVar.zzI();
        zzabz zzabzVar = this.zza;
        if (zzabzVar == null) {
            zzabz zzabzVar2 = new zzabz(zzI, 17);
            this.zza = zzabzVar2;
            zzaikVar.zza = zzabzVar2.zzc(Arrays.copyOfRange(zzI, 9, zzfbVar.zzd()), null);
            return true;
        }
        if ((zzI[0] & Byte.MAX_VALUE) == 3) {
            zzaby zzb = zzabw.zzb(zzfbVar);
            zzabz zzf = zzabzVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzaic(zzf, zzb);
            return true;
        }
        if (!zzd(zzI)) {
            return true;
        }
        zzaic zzaicVar = this.zzb;
        if (zzaicVar != null) {
            zzaicVar.zza(j);
            zzaikVar.zzb = this.zzb;
        }
        zzaikVar.zza.getClass();
        return false;
    }
}
