package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzvn implements zzacs {
    private boolean zzB;
    private zzre zzC;
    private final zzvh zza;
    private final zzrd zzd;
    private final zzqx zze;
    private zzvm zzf;
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzam zzy;
    private zzam zzz;
    private final zzvj zzb = new zzvj();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzacr[] zzn = new zzacr[1000];
    private final zzvu zzc = new zzvu(new zzeb() { // from class: com.google.android.gms.internal.ads.zzvi
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    public zzvn(zzxz zzxzVar, zzrd zzrdVar, zzqx zzqxVar) {
        this.zzd = zzrdVar;
        this.zze = zzqxVar;
        this.zza = new zzvh(zzxzVar);
    }

    private final int zzB(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzC(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzD(zzkn zzknVar, zzht zzhtVar, boolean z, boolean z2, zzvj zzvjVar) {
        zzhtVar.zzd = false;
        if (!zzL()) {
            if (!z2 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z && zzamVar == this.zzg)) {
                    return -3;
                }
                zzI(zzamVar, zzknVar);
                return -5;
            }
            zzhtVar.zzc(4);
            zzhtVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzam zzamVar2 = ((zzvl) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzamVar2 == this.zzg) {
            int zzC = zzC(this.zzr);
            if (!zzM(zzC)) {
                zzhtVar.zzd = true;
                return -3;
            }
            zzhtVar.zzc(this.zzl[zzC]);
            if (this.zzr == this.zzo - 1 && (z2 || this.zzv)) {
                zzhtVar.zza(536870912);
            }
            long j = this.zzm[zzC];
            zzhtVar.zze = j;
            if (j < this.zzs) {
                zzhtVar.zza(Integer.MIN_VALUE);
            }
            zzvjVar.zza = this.zzk[zzC];
            zzvjVar.zzb = this.zzj[zzC];
            zzvjVar.zzc = this.zzn[zzC];
            return -4;
        }
        zzI(zzamVar2, zzknVar);
        return -5;
    }

    private final synchronized long zzE(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int zzB = zzB(i3, i2, j, false);
                if (zzB == -1) {
                    return -1L;
                }
                return zzG(zzB);
            }
        }
        return -1L;
    }

    private final synchronized long zzF() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzG(i);
    }

    private final long zzG(int i) {
        long j = this.zzt;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzC = zzC(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzm[zzC]);
                if ((this.zzl[zzC] & 1) != 0) {
                    break;
                }
                zzC--;
                if (zzC == -1) {
                    zzC = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, j2);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo == 0) {
            int i7 = this.zzq;
            if (i7 == 0) {
                i7 = this.zzh;
            }
            return this.zzj[i7 - 1] + this.zzk[r12];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzH(long j, int i, long j2, int i2, zzacr zzacrVar) {
        boolean z;
        boolean z2;
        int i3 = this.zzo;
        if (i3 > 0) {
            if (this.zzj[zzC(i3 - 1)] + this.zzk[r0] <= j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzdx.zzd(z2);
        }
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.zzv = z;
        this.zzu = Math.max(this.zzu, j);
        int zzC = zzC(this.zzo);
        this.zzm[zzC] = j;
        this.zzj[zzC] = j2;
        this.zzk[zzC] = i2;
        this.zzl[zzC] = i;
        this.zzn[zzC] = zzacrVar;
        this.zzi[zzC] = 0;
        if (this.zzc.zzf() || !((zzvl) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzam zzamVar = this.zzz;
            zzamVar.getClass();
            this.zzc.zzc(this.zzp + this.zzo, new zzvl(zzamVar, zzrc.zzb, null));
        }
        int i4 = this.zzo + 1;
        this.zzo = i4;
        int i5 = this.zzh;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            zzacr[] zzacrVarArr = new zzacr[i6];
            int i7 = this.zzq;
            int i8 = i5 - i7;
            System.arraycopy(this.zzj, i7, jArr2, 0, i8);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i8);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i8);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i8);
            System.arraycopy(this.zzn, this.zzq, zzacrVarArr, 0, i8);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i8);
            int i9 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i8, i9);
            System.arraycopy(this.zzm, 0, jArr3, i8, i9);
            System.arraycopy(this.zzl, 0, iArr, i8, i9);
            System.arraycopy(this.zzk, 0, iArr2, i8, i9);
            System.arraycopy(this.zzn, 0, zzacrVarArr, i8, i9);
            System.arraycopy(this.zzi, 0, jArr, i8, i9);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzacrVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i6;
        }
    }

    private final void zzI(zzam zzamVar, zzkn zzknVar) {
        zzad zzadVar;
        zzam zzamVar2 = this.zzg;
        zzre zzreVar = null;
        if (zzamVar2 == null) {
            zzadVar = null;
        } else {
            zzadVar = zzamVar2.zzp;
        }
        this.zzg = zzamVar;
        zzad zzadVar2 = zzamVar.zzp;
        zzknVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzknVar.zzb = this.zzC;
        if (zzamVar2 != null && zzfk.zzE(zzadVar, zzadVar2)) {
            return;
        }
        if (zzamVar.zzp != null) {
            zzreVar = new zzre(new zzqv(new zzrg(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }
        this.zzC = zzreVar;
        zzknVar.zzb = zzreVar;
    }

    private final void zzJ() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzN(zzam zzamVar) {
        this.zzx = false;
        if (zzfk.zzE(zzamVar, this.zzz)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzvl) this.zzc.zzb()).zza.equals(zzamVar)) {
            this.zzz = ((zzvl) this.zzc.zzb()).zza;
        } else {
            this.zzz = zzamVar;
        }
        boolean z = this.zzA;
        zzam zzamVar2 = this.zzz;
        this.zzA = z & zzcb.zze(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    public static /* synthetic */ void zzm(zzvl zzvlVar) {
        zzrc zzrcVar = zzvlVar.zzb;
        int i = zzrb.zza;
    }

    public final synchronized boolean zzA(long j, boolean z) {
        int zzB;
        zzK();
        int i = this.zzr;
        int zzC = zzC(i);
        if (zzL() && j >= this.zzm[zzC]) {
            if (j > this.zzu) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzA) {
                zzB = this.zzo - i;
                int i2 = 0;
                while (true) {
                    if (i2 < zzB) {
                        if (this.zzm[zzC] < j) {
                            zzC++;
                            if (zzC == this.zzh) {
                                zzC = 0;
                            }
                            i2++;
                        } else {
                            zzB = i2;
                            break;
                        }
                    } else if (!z) {
                        zzB = -1;
                    }
                }
            } else {
                zzB = zzB(zzC, this.zzo - i, j, true);
            }
            if (zzB == -1) {
                return false;
            }
            this.zzs = j;
            this.zzr += zzB;
            return true;
        }
        return false;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j, boolean z) {
        int i = this.zzr;
        int zzC = zzC(i);
        if (zzL() && j >= this.zzm[zzC]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int zzB = zzB(zzC, this.zzo - i, j, true);
            if (zzB == -1) {
                return 0;
            }
            return zzB;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:            if (r9 != 0) goto L19;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(com.google.android.gms.internal.ads.zzkn r9, com.google.android.gms.internal.ads.zzht r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zzvj r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzD(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzvh r9 = r8.zza
            com.google.android.gms.internal.ads.zzvj r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzvh r9 = r8.zza
            com.google.android.gms.internal.ads.zzvj r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zze(com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzht, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final /* synthetic */ int zzf(zzt zztVar, int i, boolean z) {
        return zzacq.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final int zzg(zzt zztVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zztVar, i, z);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzam zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzj(long j, boolean z, boolean z2) {
        this.zza.zzc(zzE(j, false, z2));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final void zzl(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zzN = zzN(zzamVar);
        zzvm zzvmVar = this.zzf;
        if (zzvmVar != null && zzN) {
            zzvmVar.zzM(zzamVar);
        }
    }

    public final void zzn() throws IOException {
        zzre zzreVar = this.zzC;
        if (zzreVar == null) {
        } else {
            throw zzreVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final /* synthetic */ void zzr(zzfb zzfbVar, int i) {
        zzacq.zzb(this, zzfbVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final void zzs(zzfb zzfbVar, int i, int i2) {
        this.zza.zzh(zzfbVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final void zzt(long j, int i, int i2, int i3, zzacr zzacrVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzer.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzH(j, i, (this.zza.zzb() - i2) - i3, i2, zzacrVar);
    }

    public final void zzu(long j) {
        this.zzs = j;
    }

    public final void zzv(zzvm zzvmVar) {
        this.zzf = zzvmVar;
    }

    public final synchronized void zzw(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdx.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z) {
        boolean z2 = true;
        if (!zzL()) {
            if (!z && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar != null) {
                    if (zzamVar == this.zzg) {
                        return false;
                    }
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        if (((zzvl) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
            return true;
        }
        return zzM(zzC(this.zzr));
    }

    public final synchronized boolean zzz(int i) {
        zzK();
        int i2 = this.zzp;
        if (i >= i2 && i <= this.zzo + i2) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i - i2;
            return true;
        }
        return false;
    }
}
