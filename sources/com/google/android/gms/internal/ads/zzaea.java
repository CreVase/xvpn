package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzaea implements zzabm {
    private zzabp zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzafu zzg;
    private zzabn zzh;
    private zzaed zzi;
    private zzahr zzj;
    private final zzfb zza = new zzfb(6);
    private long zzf = -1;

    private final int zza(zzabn zzabnVar) throws IOException {
        this.zza.zzD(2);
        ((zzabc) zzabnVar).zzm(this.zza.zzI(), 0, 2, false);
        return this.zza.zzp();
    }

    private final void zzf() {
        zzg(new zzbx[0]);
        zzabp zzabpVar = this.zzb;
        zzabpVar.getClass();
        zzabpVar.zzD();
        this.zzb.zzO(new zzacl(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzbx... zzbxVarArr) {
        zzabp zzabpVar = this.zzb;
        zzabpVar.getClass();
        zzacs zzw = zzabpVar.zzw(UserVerificationMethods.USER_VERIFY_ALL, 4);
        zzak zzakVar = new zzak();
        zzakVar.zzB("image/jpeg");
        zzakVar.zzO(new zzby(-9223372036854775807L, zzbxVarArr));
        zzw.zzl(zzakVar.zzac());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r24, com.google.android.gms.internal.ads.zzacj r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaea.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzb = zzabpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzahr zzahrVar = this.zzj;
            zzahrVar.getClass();
            zzahrVar.zzd(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        if (zza(zzabnVar) != 65496) {
            return false;
        }
        int zza = zza(zzabnVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzD(2);
            zzabc zzabcVar = (zzabc) zzabnVar;
            zzabcVar.zzm(this.zza.zzI(), 0, 2, false);
            zzabcVar.zzl(this.zza.zzp() - 2, false);
            zza = zza(zzabnVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzabc zzabcVar2 = (zzabc) zzabnVar;
            zzabcVar2.zzl(2, false);
            this.zza.zzD(6);
            zzabcVar2.zzm(this.zza.zzI(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzp() == 0) {
                return true;
            }
        }
        return false;
    }
}
