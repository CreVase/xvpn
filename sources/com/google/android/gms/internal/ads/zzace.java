package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzace {
    private final zzfb zza = new zzfb(10);

    public final zzby zza(zzabn zzabnVar, zzafe zzafeVar) throws IOException {
        zzby zzbyVar = null;
        int i = 0;
        while (true) {
            try {
                ((zzabc) zzabnVar).zzm(this.zza.zzI(), 0, 10, false);
                this.zza.zzG(0);
                if (this.zza.zzn() != 4801587) {
                    break;
                }
                this.zza.zzH(3);
                int zzk = this.zza.zzk();
                int i2 = zzk + 10;
                if (zzbyVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzI(), 0, bArr, 0, 10);
                    ((zzabc) zzabnVar).zzm(bArr, 10, zzk, false);
                    zzbyVar = zzafg.zza(bArr, i2, zzafeVar, new zzaeh());
                } else {
                    ((zzabc) zzabnVar).zzl(zzk, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzabnVar.zzj();
        ((zzabc) zzabnVar).zzl(i, false);
        return zzbyVar;
    }
}
