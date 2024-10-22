package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzadf implements zzabm {
    private int zzc;
    private zzadg zze;
    private long zzh;
    private zzadi zzi;
    private int zzm;
    private boolean zzn;
    private final zzfb zza = new zzfb(12);
    private final zzade zzb = new zzade(null);
    private zzabp zzd = new zzabk();
    private zzadi[] zzg = new zzadi[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    private final zzadi zzf(int i) {
        for (zzadi zzadiVar : this.zzg) {
            if (zzadiVar.zzg(i)) {
                return zzadiVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r27, com.google.android.gms.internal.ads.zzacj r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadf.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzc = 0;
        this.zzd = zzabpVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        int i;
        this.zzh = -1L;
        this.zzi = null;
        for (zzadi zzadiVar : this.zzg) {
            zzadiVar.zzf(j);
        }
        if (j == 0) {
            if (this.zzg.length == 0) {
                this.zzc = 0;
                return;
            }
            i = 3;
        } else {
            i = 6;
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        ((zzabc) zzabnVar).zzm(this.zza.zzI(), 0, 12, false);
        this.zza.zzG(0);
        if (this.zza.zzh() != 1179011410) {
            return false;
        }
        this.zza.zzH(4);
        if (this.zza.zzh() != 541677121) {
            return false;
        }
        return true;
    }
}
