package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class zzajr implements zzaje {
    private final String zza;
    private final zzfb zzb;
    private final zzfa zzc;
    private zzacs zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzajr(String str) {
        this.zza = str;
        zzfb zzfbVar = new zzfb(UserVerificationMethods.USER_VERIFY_ALL);
        this.zzb = zzfbVar;
        byte[] zzI = zzfbVar.zzI();
        this.zzc = new zzfa(zzI, zzI.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzfa zzfaVar) throws zzcc {
        int zza = zzfaVar.zza();
        zzaaj zzb = zzaak.zzb(zzfaVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzfaVar.zza();
    }

    private static long zzg(zzfa zzfaVar) {
        return zzfaVar.zzd((zzfaVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0154, code lost:            if (r14.zzl == false) goto L88;     */
    @Override // com.google.android.gms.internal.ads.zzaje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r15) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajr.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzb(zzabp zzabpVar, zzakq zzakqVar) {
        zzakqVar.zzc();
        this.zzd = zzabpVar.zzw(zzakqVar.zza(), 1);
        this.zze = zzakqVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
