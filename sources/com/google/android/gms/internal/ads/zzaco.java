package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzaco {
    private int zza;
    private int zzb;
    private zzabp zzc;
    private zzacs zzd;

    public static final boolean zzd(zzabn zzabnVar, int i, int i2) throws IOException {
        zzfb zzfbVar = new zzfb(2);
        ((zzabc) zzabnVar).zzm(zzfbVar.zzI(), 0, 2, false);
        if (zzfbVar.zzp() != i) {
            return false;
        }
        return true;
    }

    public final int zza(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        int i = this.zzb;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzacs zzacsVar = this.zzd;
        zzacsVar.getClass();
        int zza = zzacq.zza(zzacsVar, zzabnVar, UserVerificationMethods.USER_VERIFY_ALL, true);
        if (zza == -1) {
            this.zzb = 2;
            this.zzd.zzt(0L, 1, this.zza, 0, null);
            this.zza = 0;
        } else {
            this.zza += zza;
        }
        return 0;
    }

    public final void zzb(zzabp zzabpVar, String str) {
        this.zzc = zzabpVar;
        zzacs zzw = zzabpVar.zzw(UserVerificationMethods.USER_VERIFY_ALL, 4);
        this.zzd = zzw;
        zzak zzakVar = new zzak();
        zzakVar.zzB(str);
        zzakVar.zzZ(1);
        zzakVar.zzaa(1);
        zzw.zzl(zzakVar.zzac());
        this.zzc.zzD();
        this.zzc.zzO(new zzacp(-9223372036854775807L));
        this.zzb = 1;
    }

    public final void zzc(long j) {
        if (j == 0 || this.zzb == 1) {
            this.zzb = 1;
            this.zza = 0;
        }
    }
}
