package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkx {
    private final zzcs zza = new zzcs();
    private final zzcu zzb = new zzcu();
    private final zzmb zzc;
    private final zzei zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzku zzh;
    private zzku zzi;
    private zzku zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzkx(zzmb zzmbVar, zzei zzeiVar) {
        this.zzc = zzmbVar;
        this.zzd = zzeiVar;
    }

    private final boolean zzA(zzcv zzcvVar, zztw zztwVar) {
        if (!zzC(zztwVar)) {
            return false;
        }
        int i = zzcvVar.zzn(zztwVar.zza, this.zza).zzd;
        if (zzcvVar.zze(i, this.zzb, 0L).zzq != zzcvVar.zza(zztwVar.zza)) {
            return false;
        }
        return true;
    }

    private final boolean zzB(zzcv zzcvVar) {
        zzku zzkuVar = this.zzh;
        if (zzkuVar == null) {
            return true;
        }
        int zza = zzcvVar.zza(zzkuVar.zzb);
        while (true) {
            zza = zzcvVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkuVar.getClass();
                if (zzkuVar.zzg() == null || zzkuVar.zzf.zzg) {
                    break;
                }
                zzkuVar = zzkuVar.zzg();
            }
            zzku zzg = zzkuVar.zzg();
            if (zza == -1 || zzg == null || zzcvVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkuVar = zzg;
        }
        boolean zzm = zzm(zzkuVar);
        zzkuVar.zzf = zzg(zzcvVar, zzkuVar.zzf);
        if (!zzm) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zztw zztwVar) {
        return !zztwVar.zzb() && zztwVar.zze == -1;
    }

    private final long zzs(zzcv zzcvVar, Object obj, int i) {
        zzcvVar.zzn(obj, this.zza);
        this.zza.zzi(i);
        this.zza.zzk(i);
        return 0L;
    }

    private final zzkv zzt(zzcv zzcvVar, zzku zzkuVar, long j) {
        long j2;
        zzkv zzkvVar = zzkuVar.zzf;
        long zze = (zzkuVar.zze() + zzkvVar.zze) - j;
        if (zzkvVar.zzg) {
            long j3 = 0;
            int zzi = zzcvVar.zzi(zzcvVar.zza(zzkvVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i = zzcvVar.zzd(zzi, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                obj.getClass();
                long j4 = zzkvVar.zza.zzd;
                if (zzcvVar.zze(i, this.zzb, 0L).zzp == zzi) {
                    Pair zzm = zzcvVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzku zzg = zzkuVar.zzg();
                        if (zzg != null && zzg.zzb.equals(obj)) {
                            j4 = zzg.zzf.zza.zzd;
                        } else {
                            j4 = this.zze;
                            this.zze = 1 + j4;
                        }
                        j2 = longValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zztw zzx = zzx(zzcvVar, obj, j2, j4, this.zzb, this.zza);
                if (j3 != -9223372036854775807L && zzkvVar.zzc != -9223372036854775807L) {
                    zzcvVar.zzn(zzkvVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcvVar, zzx, j3, j2);
            }
        } else {
            zztw zztwVar = zzkvVar.zza;
            zzcvVar.zzn(zztwVar.zza, this.zza);
            if (zztwVar.zzb()) {
                int i2 = zztwVar.zzb;
                if (this.zza.zza(i2) != -1) {
                    int zzf = this.zza.zzf(i2, zztwVar.zzc);
                    if (zzf < 0) {
                        return zzv(zzcvVar, zztwVar.zza, i2, zzf, zzkvVar.zzc, zztwVar.zzd);
                    }
                    long j5 = zzkvVar.zzc;
                    if (j5 == -9223372036854775807L) {
                        zzcu zzcuVar = this.zzb;
                        zzcs zzcsVar = this.zza;
                        Pair zzm2 = zzcvVar.zzm(zzcuVar, zzcsVar, zzcsVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                        if (zzm2 != null) {
                            j5 = ((Long) zzm2.second).longValue();
                        }
                    }
                    zzs(zzcvVar, zztwVar.zza, zztwVar.zzb);
                    return zzw(zzcvVar, zztwVar.zza, Math.max(0L, j5), zzkvVar.zzc, zztwVar.zzd);
                }
            } else {
                int i3 = zztwVar.zze;
                if (i3 != -1) {
                    this.zza.zzm(i3);
                }
                zzcs zzcsVar2 = this.zza;
                int i4 = zztwVar.zze;
                int zze2 = zzcsVar2.zze(i4);
                zzcsVar2.zzn(i4);
                if (zze2 != this.zza.zza(zztwVar.zze)) {
                    return zzv(zzcvVar, zztwVar.zza, zztwVar.zze, zze2, zzkvVar.zze, zztwVar.zzd);
                }
                zzs(zzcvVar, zztwVar.zza, zztwVar.zze);
                return zzw(zzcvVar, zztwVar.zza, 0L, zzkvVar.zze, zztwVar.zzd);
            }
        }
        return null;
    }

    private final zzkv zzu(zzcv zzcvVar, zztw zztwVar, long j, long j2) {
        zzcvVar.zzn(zztwVar.zza, this.zza);
        if (zztwVar.zzb()) {
            return zzv(zzcvVar, zztwVar.zza, zztwVar.zzb, zztwVar.zzc, j, zztwVar.zzd);
        }
        return zzw(zzcvVar, zztwVar.zza, j2, j, zztwVar.zzd);
    }

    private final zzkv zzv(zzcv zzcvVar, Object obj, int i, int i2, long j, long j2) {
        zztw zztwVar = new zztw(obj, i, i2, j2);
        Object obj2 = zztwVar.zza;
        long zzh = zzcvVar.zzn(obj2, this.zza).zzh(zztwVar.zzb, zztwVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzj();
        }
        this.zza.zzn(zztwVar.zzb);
        long j3 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j3 = Math.max(0L, (-1) + zzh);
        }
        return new zzkv(zztwVar, j3, j, -9223372036854775807L, zzh, false, false, false, false);
    }

    private final zzkv zzw(zzcv zzcvVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzcvVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(zzc);
        }
        zztw zztwVar = new zztw(obj, j3, zzc);
        boolean zzC = zzC(zztwVar);
        boolean zzA = zzA(zzcvVar, zztwVar);
        boolean zzz = zzz(zzcvVar, zztwVar, zzC);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zze;
        }
        if (j6 != -9223372036854775807L && j7 >= j6) {
            j7 = Math.max(0L, j6 - 1);
        }
        return new zzkv(zztwVar, j7, j2, j5, j6, false, zzC, zzA, zzz);
    }

    private static zztw zzx(zzcv zzcvVar, Object obj, long j, long j2, zzcu zzcuVar, zzcs zzcsVar) {
        zzcvVar.zzn(obj, zzcsVar);
        zzcvVar.zze(zzcsVar.zzd, zzcuVar, 0L);
        zzcvVar.zza(obj);
        zzcsVar.zzb();
        zzcvVar.zzn(obj, zzcsVar);
        int zzd = zzcsVar.zzd(j);
        if (zzd == -1) {
            return new zztw(obj, j2, zzcsVar.zzc(j));
        }
        return new zztw(obj, zzd, zzcsVar.zze(zzd), j2);
    }

    private final void zzy() {
        final zztw zztwVar;
        final zzfvp zzfvpVar = new zzfvp();
        for (zzku zzkuVar = this.zzh; zzkuVar != null; zzkuVar = zzkuVar.zzg()) {
            zzfvpVar.zzf(zzkuVar.zzf.zza);
        }
        zzku zzkuVar2 = this.zzi;
        if (zzkuVar2 == null) {
            zztwVar = null;
        } else {
            zztwVar = zzkuVar2.zzf.zza;
        }
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // java.lang.Runnable
            public final void run() {
                zzkx.this.zzj(zzfvpVar, zztwVar);
            }
        });
    }

    private final boolean zzz(zzcv zzcvVar, zztw zztwVar, boolean z) {
        int zza = zzcvVar.zza(zztwVar.zza);
        if (zzcvVar.zze(zzcvVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzj || zzcvVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final zzku zza() {
        zzku zzkuVar = this.zzh;
        if (zzkuVar == null) {
            return null;
        }
        if (zzkuVar == this.zzi) {
            this.zzi = zzkuVar.zzg();
        }
        zzkuVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzku zzkuVar2 = this.zzh;
            this.zzl = zzkuVar2.zzb;
            this.zzm = zzkuVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzku zzb() {
        zzku zzkuVar = this.zzi;
        zzdx.zzb(zzkuVar);
        this.zzi = zzkuVar.zzg();
        zzy();
        zzku zzkuVar2 = this.zzi;
        zzdx.zzb(zzkuVar2);
        return zzkuVar2;
    }

    public final zzku zzc() {
        return this.zzj;
    }

    public final zzku zzd() {
        return this.zzh;
    }

    public final zzku zze() {
        return this.zzi;
    }

    public final zzkv zzf(long j, zzlk zzlkVar) {
        zzku zzkuVar = this.zzj;
        if (zzkuVar == null) {
            return zzu(zzlkVar.zza, zzlkVar.zzb, zzlkVar.zzc, zzlkVar.zzr);
        }
        return zzt(zzlkVar.zza, zzkuVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzkv zzg(com.google.android.gms.internal.ads.zzcv r19, com.google.android.gms.internal.ads.zzkv r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zztw r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zztw r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcs r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzcs r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcs r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzcs r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzcs r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzcs r4 = r0.zza
            r4.zzn(r1)
        L6e:
            com.google.android.gms.internal.ads.zzkv r15 = new com.google.android.gms.internal.ads.zzkv
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkx.zzg(com.google.android.gms.internal.ads.zzcv, com.google.android.gms.internal.ads.zzkv):com.google.android.gms.internal.ads.zzkv");
    }

    public final zztw zzh(zzcv zzcvVar, Object obj, long j) {
        long j2;
        int zza;
        int i = zzcvVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 != null && (zza = zzcvVar.zza(obj2)) != -1 && zzcvVar.zzd(zza, this.zza, false).zzd == i) {
            j2 = this.zzm;
        } else {
            zzku zzkuVar = this.zzh;
            while (true) {
                if (zzkuVar != null) {
                    if (zzkuVar.zzb.equals(obj)) {
                        j2 = zzkuVar.zzf.zza.zzd;
                        break;
                    }
                    zzkuVar = zzkuVar.zzg();
                } else {
                    zzku zzkuVar2 = this.zzh;
                    while (true) {
                        if (zzkuVar2 != null) {
                            int zza2 = zzcvVar.zza(zzkuVar2.zzb);
                            if (zza2 != -1 && zzcvVar.zzd(zza2, this.zza, false).zzd == i) {
                                j2 = zzkuVar2.zzf.zza.zzd;
                                break;
                            }
                            zzkuVar2 = zzkuVar2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                }
            }
        }
        long j3 = j2;
        zzcvVar.zzn(obj, this.zza);
        zzcvVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzcvVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcu zzcuVar = this.zzb;
            if (zza3 >= zzcuVar.zzp) {
                zzcvVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzcs zzcsVar = this.zza;
                if (zzcsVar.zzd(zzcsVar.zze) != -1) {
                    obj3 = this.zza.zzc;
                    obj3.getClass();
                }
                zza3--;
            } else {
                return zzx(zzcvVar, obj3, j, j3, zzcuVar, this.zza);
            }
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzku zzkuVar = this.zzh;
        zzdx.zzb(zzkuVar);
        this.zzl = zzkuVar.zzb;
        this.zzm = zzkuVar.zzf.zza.zzd;
        while (zzkuVar != null) {
            zzkuVar.zzn();
            zzkuVar = zzkuVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    public final /* synthetic */ void zzj(zzfvp zzfvpVar, zztw zztwVar) {
        this.zzc.zzQ(zzfvpVar.zzi(), zztwVar);
    }

    public final void zzk(long j) {
        zzku zzkuVar = this.zzj;
        if (zzkuVar != null) {
            zzkuVar.zzm(j);
        }
    }

    public final boolean zzl(zztu zztuVar) {
        zzku zzkuVar = this.zzj;
        return zzkuVar != null && zzkuVar.zza == zztuVar;
    }

    public final boolean zzm(zzku zzkuVar) {
        zzdx.zzb(zzkuVar);
        boolean z = false;
        if (zzkuVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkuVar;
        while (zzkuVar.zzg() != null) {
            zzkuVar = zzkuVar.zzg();
            zzkuVar.getClass();
            if (zzkuVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzkuVar.zzn();
            this.zzk--;
        }
        zzku zzkuVar2 = this.zzj;
        zzkuVar2.getClass();
        zzkuVar2.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzku zzkuVar = this.zzj;
        if (zzkuVar == null) {
            return true;
        }
        if (!zzkuVar.zzf.zzi && zzkuVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100) {
            return true;
        }
        return false;
    }

    public final boolean zzo(zzcv zzcvVar, long j, long j2) {
        zzkv zzkvVar;
        long zze;
        boolean z;
        zzku zzkuVar = null;
        for (zzku zzkuVar2 = this.zzh; zzkuVar2 != null; zzkuVar2 = zzkuVar2.zzg()) {
            zzkv zzkvVar2 = zzkuVar2.zzf;
            if (zzkuVar == null) {
                zzkvVar = zzg(zzcvVar, zzkvVar2);
            } else {
                zzkv zzt = zzt(zzcvVar, zzkuVar, j);
                if (zzt == null) {
                    if (!zzm(zzkuVar)) {
                        return true;
                    }
                    return false;
                }
                if (zzkvVar2.zzb == zzt.zzb && zzkvVar2.zza.equals(zzt.zza)) {
                    zzkvVar = zzt;
                } else {
                    if (!zzm(zzkuVar)) {
                        return true;
                    }
                    return false;
                }
            }
            zzkuVar2.zzf = zzkvVar.zza(zzkvVar2.zzc);
            long j3 = zzkvVar2.zze;
            long j4 = zzkvVar.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzkuVar2.zzq();
                long j5 = zzkvVar.zze;
                if (j5 == -9223372036854775807L) {
                    zze = Long.MAX_VALUE;
                } else {
                    zze = j5 + zzkuVar2.zze();
                }
                if (zzkuVar2 == this.zzi) {
                    boolean z2 = zzkuVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        if (zzm(zzkuVar2) && !z) {
                            return true;
                        }
                        return false;
                    }
                }
                z = false;
                if (zzm(zzkuVar2)) {
                }
                return false;
            }
            zzkuVar = zzkuVar2;
        }
        return true;
    }

    public final boolean zzp(zzcv zzcvVar, int i) {
        this.zzf = i;
        return zzB(zzcvVar);
    }

    public final boolean zzq(zzcv zzcvVar, boolean z) {
        this.zzg = z;
        return zzB(zzcvVar);
    }

    public final zzku zzr(zzlt[] zzltVarArr, zzxq zzxqVar, zzxz zzxzVar, zzlj zzljVar, zzkv zzkvVar, zzxr zzxrVar) {
        long zze;
        zzku zzkuVar = this.zzj;
        if (zzkuVar == null) {
            zze = 1000000000000L;
        } else {
            zze = (zzkuVar.zze() + zzkuVar.zzf.zze) - zzkvVar.zzb;
        }
        zzku zzkuVar2 = new zzku(zzltVarArr, zze, zzxqVar, zzxzVar, zzljVar, zzkvVar, zzxrVar);
        zzku zzkuVar3 = this.zzj;
        if (zzkuVar3 != null) {
            zzkuVar3.zzo(zzkuVar2);
        } else {
            this.zzh = zzkuVar2;
            this.zzi = zzkuVar2;
        }
        this.zzl = null;
        this.zzj = zzkuVar2;
        this.zzk++;
        zzy();
        return zzkuVar2;
    }
}
