package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzadv implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzadu
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzadv()};
        }
    };
    private zzabp zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzadt zzp;
    private zzadz zzq;
    private final zzfb zzb = new zzfb(4);
    private final zzfb zzc = new zzfb(9);
    private final zzfb zzd = new zzfb(11);
    private final zzfb zze = new zzfb();
    private final zzadw zzf = new zzadw();
    private int zzh = 1;

    private final zzfb zza(zzabn zzabnVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzfb zzfbVar = this.zze;
            int zzb = zzfbVar.zzb();
            zzfbVar.zzE(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzG(0);
        }
        this.zze.zzF(this.zzm);
        ((zzabc) zzabnVar).zzn(this.zze.zzI(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzf() {
        if (!this.zzo) {
            this.zzg.zzO(new zzacl(-9223372036854775807L, 0L));
            this.zzo = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r17, com.google.android.gms.internal.ads.zzacj r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadv.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzg = zzabpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        zzabc zzabcVar = (zzabc) zzabnVar;
        zzabcVar.zzm(this.zzb.zzI(), 0, 3, false);
        this.zzb.zzG(0);
        if (this.zzb.zzn() != 4607062) {
            return false;
        }
        zzabcVar.zzm(this.zzb.zzI(), 0, 2, false);
        this.zzb.zzG(0);
        if ((this.zzb.zzp() & 250) != 0) {
            return false;
        }
        zzabcVar.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        int zzf = this.zzb.zzf();
        zzabnVar.zzj();
        zzabc zzabcVar2 = (zzabc) zzabnVar;
        zzabcVar2.zzl(zzf, false);
        zzabcVar2.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        if (this.zzb.zzf() != 0) {
            return false;
        }
        return true;
    }
}
