package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class zzaij extends zzain {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzfb zzfbVar) {
        return zzk(zzfbVar, zza);
    }

    private static boolean zzk(zzfb zzfbVar, byte[] bArr) {
        if (zzfbVar.zza() < 8) {
            return false;
        }
        int zzc = zzfbVar.zzc();
        byte[] bArr2 = new byte[8];
        zzfbVar.zzC(bArr2, 0, 8);
        zzfbVar.zzG(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final long zza(zzfb zzfbVar) {
        return zzg(zzaci.zzd(zzfbVar.zzI()));
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final boolean zzc(zzfb zzfbVar, long j, zzaik zzaikVar) throws zzcc {
        if (zzk(zzfbVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd());
            int i = copyOf[9] & 255;
            List zze = zzaci.zze(copyOf);
            if (zzaikVar.zza != null) {
                return true;
            }
            zzak zzakVar = new zzak();
            zzakVar.zzU("audio/opus");
            zzakVar.zzy(i);
            zzakVar.zzV(48000);
            zzakVar.zzK(zze);
            zzaikVar.zza = zzakVar.zzac();
            return true;
        }
        if (zzk(zzfbVar, zzb)) {
            zzdx.zzb(zzaikVar.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzfbVar.zzH(8);
            zzby zzb2 = zzacy.zzb(zzfvs.zzk(zzacy.zzc(zzfbVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzak zzb3 = zzaikVar.zza.zzb();
            zzb3.zzO(zzb2.zzd(zzaikVar.zza.zzk));
            zzaikVar.zza = zzb3.zzac();
            return true;
        }
        zzdx.zzb(zzaikVar.zza);
        return false;
    }
}
