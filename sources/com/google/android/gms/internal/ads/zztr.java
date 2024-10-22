package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zztr extends zzvz {
    private final boolean zzb;
    private final zzcu zzc;
    private final zzcs zzd;
    private zztp zze;
    private zzto zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztr(zzty zztyVar, boolean z) {
        super(zztyVar);
        boolean z2;
        if (z) {
            zztyVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcu();
        this.zzd = new zzcs();
        zztyVar.zzM();
        this.zze = zztp.zzq(zztyVar.zzJ());
    }

    private final Object zzK(Object obj) {
        if (this.zze.zzf != null && obj.equals(zztp.zzd)) {
            return this.zze.zzf;
        }
        return obj;
    }

    private final void zzL(long j) {
        zzto zztoVar = this.zzf;
        int zza = this.zze.zza(zztoVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zztp zztpVar = this.zze;
        zzcs zzcsVar = this.zzd;
        zztpVar.zzd(zza, zzcsVar, false);
        long j2 = zzcsVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zztoVar.zzs(j);
    }

    public final zzcv zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zztw zzD(zztw zztwVar) {
        Object obj = this.zze.zzf;
        Object obj2 = zztwVar.zza;
        if (obj != null && this.zze.zzf.equals(obj2)) {
            obj2 = zztp.zzd;
        }
        return zztwVar.zza(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzE(com.google.android.gms.internal.ads.zzcv r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zztp r0 = r14.zze
            com.google.android.gms.internal.ads.zztp r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzto r15 = r14.zzf
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zztp r0 = r14.zze
            com.google.android.gms.internal.ads.zztp r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcu.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zztp.zzd
            com.google.android.gms.internal.ads.zztp r15 = com.google.android.gms.internal.ads.zztp.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.zzcu r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcu r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzto r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zztp r8 = r14.zze
            com.google.android.gms.internal.ads.zzcs r9 = r14.zzd
            com.google.android.gms.internal.ads.zztw r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zztp r5 = r14.zze
            com.google.android.gms.internal.ads.zzcu r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcu r9 = r14.zzc
            com.google.android.gms.internal.ads.zzcs r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zztp r0 = r14.zze
            com.google.android.gms.internal.ads.zztp r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zztp r15 = com.google.android.gms.internal.ads.zztp.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzto r15 = r14.zzf
            if (r15 == 0) goto L9b
            r14.zzL(r4)
            com.google.android.gms.internal.ads.zztw r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zztw r1 = r15.zza(r0)
        L9b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zztp r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.zzto r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztr.zzE(com.google.android.gms.internal.ads.zzcv):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB(null, ((zzvz) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzty
    public final void zzG(zztu zztuVar) {
        ((zzto) zztuVar).zzt();
        if (zztuVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzty
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzto zzI(zztw zztwVar, zzxz zzxzVar, long j) {
        zzto zztoVar = new zzto(zztwVar, zzxzVar, j);
        zztoVar.zzu(((zzvz) this).zza);
        if (this.zzh) {
            zztoVar.zzr(zztwVar.zza(zzK(zztwVar.zza)));
        } else {
            this.zzf = zztoVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzvz) this).zza);
            }
        }
        return zztoVar;
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzsx
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzty
    public final void zzt(zzbp zzbpVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzvv(this.zze.zzc, zzbpVar));
        } else {
            this.zze = zztp.zzq(zzbpVar);
        }
        ((zzvz) this).zza.zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzty
    public final void zzz() {
    }
}
