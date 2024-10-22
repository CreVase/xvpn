package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzva implements zztu, zzabp, zzye, zzyj, zzvm {
    private static final Map zzb;
    private static final zzam zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzyd zzN;
    private final zzxz zzO;
    private final Uri zzd;
    private final zzgi zze;
    private final zzrd zzf;
    private final zzuf zzg;
    private final zzqx zzh;
    private final zzuw zzi;
    private final long zzj;
    private final zzym zzk = new zzym("ProgressiveMediaPeriod");
    private final zzup zzl;
    private final zzea zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;
    private zztt zzr;
    private zzaeq zzs;
    private zzvn[] zzt;
    private zzuy[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzuz zzy;
    private zzacm zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzak zzakVar = new zzak();
        zzakVar.zzJ("icy");
        zzakVar.zzU("application/x-icy");
        zzc = zzakVar.zzac();
    }

    public zzva(Uri uri, zzgi zzgiVar, zzup zzupVar, zzrd zzrdVar, zzqx zzqxVar, zzyd zzydVar, zzuf zzufVar, zzuw zzuwVar, zzxz zzxzVar, String str, int i, long j) {
        boolean z;
        this.zzd = uri;
        this.zze = zzgiVar;
        this.zzf = zzrdVar;
        this.zzh = zzqxVar;
        this.zzN = zzydVar;
        this.zzg = zzufVar;
        this.zzi = zzuwVar;
        this.zzO = zzxzVar;
        this.zzj = i;
        this.zzl = zzupVar;
        this.zzA = j;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.zzq = z;
        this.zzm = new zzea(zzdy.zza);
        this.zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzur
            @Override // java.lang.Runnable
            public final void run() {
                zzva.this.zzU();
            }
        };
        this.zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzus
            @Override // java.lang.Runnable
            public final void run() {
                zzva.this.zzE();
            }
        };
        this.zzp = zzfk.zzv(null);
        this.zzu = new zzuy[0];
        this.zzt = new zzvn[0];
        this.zzI = -9223372036854775807L;
        this.zzC = 1;
    }

    private final int zzQ() {
        int i = 0;
        for (zzvn zzvnVar : this.zzt) {
            i += zzvnVar.zzd();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzR(boolean z) {
        int i = 0;
        long j = Long.MIN_VALUE;
        while (true) {
            zzvn[] zzvnVarArr = this.zzt;
            if (i < zzvnVarArr.length) {
                if (!z) {
                    zzuz zzuzVar = this.zzy;
                    zzuzVar.getClass();
                    if (!zzuzVar.zzc[i]) {
                        i++;
                    }
                }
                j = Math.max(j, zzvnVarArr[i].zzh());
                i++;
            } else {
                return j;
            }
        }
    }

    private final zzacs zzS(zzuy zzuyVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzuyVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        zzvn zzvnVar = new zzvn(this.zzO, this.zzf, this.zzh);
        zzvnVar.zzv(this);
        int i2 = length + 1;
        zzuy[] zzuyVarArr = (zzuy[]) Arrays.copyOf(this.zzu, i2);
        zzuyVarArr[length] = zzuyVar;
        int i3 = zzfk.zza;
        this.zzu = zzuyVarArr;
        zzvn[] zzvnVarArr = (zzvn[]) Arrays.copyOf(this.zzt, i2);
        zzvnVarArr[length] = zzvnVar;
        this.zzt = zzvnVarArr;
        return zzvnVar;
    }

    private final void zzT() {
        zzdx.zzf(this.zzw);
        this.zzy.getClass();
        this.zzz.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        boolean z;
        zzby zzc2;
        int i;
        if (!this.zzM && !this.zzw && this.zzv && this.zzz != null) {
            for (zzvn zzvnVar : this.zzt) {
                if (zzvnVar.zzi() == null) {
                    return;
                }
            }
            this.zzm.zzc();
            int length = this.zzt.length;
            zzcx[] zzcxVarArr = new zzcx[length];
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                zzam zzi = this.zzt[i2].zzi();
                zzi.getClass();
                String str = zzi.zzm;
                boolean zzf = zzcb.zzf(str);
                if (!zzf && !zzcb.zzg(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i2] = z;
                this.zzx = z | this.zzx;
                zzaeq zzaeqVar = this.zzs;
                if (zzaeqVar != null) {
                    if (zzf || this.zzu[i2].zzb) {
                        zzby zzbyVar = zzi.zzk;
                        if (zzbyVar == null) {
                            zzc2 = new zzby(-9223372036854775807L, zzaeqVar);
                        } else {
                            zzc2 = zzbyVar.zzc(zzaeqVar);
                        }
                        zzak zzb2 = zzi.zzb();
                        zzb2.zzO(zzc2);
                        zzi = zzb2.zzac();
                    }
                    if (zzf && zzi.zzg == -1 && zzi.zzh == -1 && (i = zzaeqVar.zza) != -1) {
                        zzak zzb3 = zzi.zzb();
                        zzb3.zzx(i);
                        zzi = zzb3.zzac();
                    }
                }
                zzcxVarArr[i2] = new zzcx(Integer.toString(i2), zzi.zzc(this.zzf.zza(zzi)));
            }
            this.zzy = new zzuz(new zzvx(zzcxVarArr), zArr);
            this.zzw = true;
            zztt zzttVar = this.zzr;
            zzttVar.getClass();
            zzttVar.zzi(this);
        }
    }

    private final void zzV(int i) {
        zzT();
        zzuz zzuzVar = this.zzy;
        boolean[] zArr = zzuzVar.zzd;
        if (!zArr[i]) {
            zzam zzb2 = zzuzVar.zza.zzb(i).zzb(0);
            this.zzg.zzc(new zzts(1, zzcb.zzb(zzb2.zzm), zzb2, 0, null, zzfk.zzs(this.zzH), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i] && !this.zzt[i].zzy(false)) {
            this.zzI = 0L;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0L;
            this.zzK = 0;
            for (zzvn zzvnVar : this.zzt) {
                zzvnVar.zzq(false);
            }
            zztt zzttVar = this.zzr;
            zzttVar.getClass();
            zzttVar.zzg(this);
        }
    }

    private final void zzX() {
        zzuv zzuvVar = new zzuv(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzdx.zzf(zzY());
            long j = this.zzA;
            if (j != -9223372036854775807L && this.zzI > j) {
                this.zzL = true;
                this.zzI = -9223372036854775807L;
                return;
            }
            zzacm zzacmVar = this.zzz;
            zzacmVar.getClass();
            zzuv.zzf(zzuvVar, zzacmVar.zzg(this.zzI).zza.zzc, this.zzI);
            for (zzvn zzvnVar : this.zzt) {
                zzvnVar.zzu(this.zzI);
            }
            this.zzI = -9223372036854775807L;
        }
        this.zzK = zzQ();
        long zza = this.zzk.zza(zzuvVar, this, zzyd.zza(this.zzC));
        zzgn zzd = zzuv.zzd(zzuvVar);
        this.zzg.zzg(new zztn(zzuv.zzb(zzuvVar), zzd, zzd.zza, Collections.emptyMap(), zza, 0L, 0L), new zzts(1, -1, null, 0, null, zzfk.zzs(zzuv.zzc(zzuvVar)), zzfk.zzs(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzE() {
        if (!this.zzM) {
            zztt zzttVar = this.zzr;
            zzttVar.getClass();
            zzttVar.zzg(this);
        }
    }

    public final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    public final /* synthetic */ void zzG(zzacm zzacmVar) {
        zzacm zzaclVar;
        if (this.zzs == null) {
            zzaclVar = zzacmVar;
        } else {
            zzaclVar = new zzacl(-9223372036854775807L, 0L);
        }
        this.zzz = zzaclVar;
        if (zzacmVar.zza() == -9223372036854775807L && this.zzA != -9223372036854775807L) {
            this.zzz = new zzuu(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z = false;
        int i = 1;
        if (!this.zzG && zzacmVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzB = z;
        if (true == z) {
            i = 7;
        }
        this.zzC = i;
        this.zzi.zza(this.zzA, zzacmVar.zzh(), this.zzB);
        if (!this.zzw) {
            zzU();
        }
    }

    public final void zzH() throws IOException {
        this.zzk.zzi(zzyd.zza(this.zzC));
    }

    public final void zzI(int i) throws IOException {
        this.zzt[i].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final /* bridge */ /* synthetic */ void zzJ(zzyi zzyiVar, long j, long j2, boolean z) {
        zzuv zzuvVar = (zzuv) zzyiVar;
        zzhj zze = zzuv.zze(zzuvVar);
        zztn zztnVar = new zztn(zzuv.zzb(zzuvVar), zzuv.zzd(zzuvVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zzuv.zzb(zzuvVar);
        this.zzg.zzd(zztnVar, new zzts(1, -1, null, 0, null, zzfk.zzs(zzuv.zzc(zzuvVar)), zzfk.zzs(this.zzA)));
        if (!z) {
            for (zzvn zzvnVar : this.zzt) {
                zzvnVar.zzq(false);
            }
            if (this.zzF > 0) {
                zztt zzttVar = this.zzr;
                zzttVar.getClass();
                zzttVar.zzg(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final /* bridge */ /* synthetic */ void zzK(zzyi zzyiVar, long j, long j2) {
        zzacm zzacmVar;
        long j3;
        if (this.zzA == -9223372036854775807L && (zzacmVar = this.zzz) != null) {
            boolean zzh = zzacmVar.zzh();
            long zzR = zzR(true);
            if (zzR == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = zzR + 10000;
            }
            this.zzA = j3;
            this.zzi.zza(j3, zzh, this.zzB);
        }
        zzuv zzuvVar = (zzuv) zzyiVar;
        zzhj zze = zzuv.zze(zzuvVar);
        zztn zztnVar = new zztn(zzuv.zzb(zzuvVar), zzuv.zzd(zzuvVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zzuv.zzb(zzuvVar);
        this.zzg.zze(zztnVar, new zzts(1, -1, null, 0, null, zzfk.zzs(zzuv.zzc(zzuvVar)), zzfk.zzs(this.zzA)));
        this.zzL = true;
        zztt zzttVar = this.zzr;
        zzttVar.getClass();
        zzttVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzL() {
        for (zzvn zzvnVar : this.zzt) {
            zzvnVar.zzp();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzM(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzvn zzvnVar : this.zzt) {
                zzvnVar.zzo();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzO(final zzacm zzacmVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // java.lang.Runnable
            public final void run() {
                zzva.this.zzG(zzacmVar);
            }
        });
    }

    public final boolean zzP(int i) {
        if (!zzZ() && this.zzt[i].zzy(this.zzL)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final long zza(long j, zzlv zzlvVar) {
        boolean z;
        zzT();
        if (!this.zzz.zzh()) {
            return 0L;
        }
        zzack zzg = this.zzz.zzg(j);
        zzacn zzacnVar = zzg.zza;
        zzacn zzacnVar2 = zzg.zzb;
        long j2 = zzlvVar.zzf;
        if (j2 == 0) {
            if (zzlvVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzacnVar.zzb;
        int i = zzfk.zza;
        long j4 = j - j2;
        long j5 = zzlvVar.zzg;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z2 = true;
        if (j4 <= j3 && j3 <= j6) {
            z = true;
        } else {
            z = false;
        }
        long j9 = zzacnVar2.zzb;
        if (j4 > j9 || j9 > j6) {
            z2 = false;
        }
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            if (z2) {
                return j9;
            }
            return j4;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final long zzb() {
        long j;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzuz zzuzVar = this.zzy;
                if (zzuzVar.zzb[i] && zzuzVar.zzc[i] && !this.zzt[i].zzx()) {
                    j = Math.min(j, this.zzt[i].zzh());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzR(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.zzH;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final long zzd() {
        if (this.zzE) {
            if (this.zzL || zzQ() > this.zzK) {
                this.zzE = false;
                return this.zzH;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final long zze(long j) {
        boolean zzA;
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (true != this.zzz.zzh()) {
            j = 0;
        }
        this.zzE = false;
        this.zzH = j;
        if (zzY()) {
            this.zzI = j;
            return j;
        }
        if (this.zzC != 7) {
            int length = this.zzt.length;
            for (int i = 0; i < length; i++) {
                zzvn zzvnVar = this.zzt[i];
                if (this.zzq) {
                    zzA = zzvnVar.zzz(zzvnVar.zza());
                } else {
                    zzA = zzvnVar.zzA(j, false);
                }
                if (zzA || (!zArr[i] && this.zzx)) {
                }
            }
            return j;
        }
        this.zzJ = false;
        this.zzI = j;
        this.zzL = false;
        zzym zzymVar = this.zzk;
        if (zzymVar.zzl()) {
            for (zzvn zzvnVar2 : this.zzt) {
                zzvnVar2.zzk();
            }
            this.zzk.zzg();
        } else {
            zzymVar.zzh();
            for (zzvn zzvnVar3 : this.zzt) {
                zzvnVar3.zzq(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:            if (r2 == 0) goto L21;     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    @Override // com.google.android.gms.internal.ads.zztu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzxk[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzvo[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzva.zzf(com.google.android.gms.internal.ads.zzxk[], boolean[], com.google.android.gms.internal.ads.zzvo[], boolean[], long):long");
    }

    public final int zzg(int i, zzkn zzknVar, zzht zzhtVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int zze = this.zzt[i].zze(zzknVar, zzhtVar, i2, this.zzL);
        if (zze == -3) {
            zzW(i);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zzvx zzh() {
        zzT();
        return this.zzy.zza;
    }

    public final int zzi(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzvn zzvnVar = this.zzt[i];
        int zzc2 = zzvnVar.zzc(j, this.zzL);
        zzvnVar.zzw(zzc2);
        if (zzc2 == 0) {
            zzW(i);
            return 0;
        }
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzj(long j, boolean z) {
        if (this.zzq) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzy.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzk() throws IOException {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzcc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzl(zztt zzttVar, long j) {
        this.zzr = zzttVar;
        this.zzm.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final boolean zzo(zzks zzksVar) {
        if (!this.zzL) {
            zzym zzymVar = this.zzk;
            if (!zzymVar.zzk() && !this.zzJ) {
                if (!this.zzw || this.zzF != 0) {
                    boolean zze = this.zzm.zze();
                    if (!zzymVar.zzl()) {
                        zzX();
                        return true;
                    }
                    return zze;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyg zzu(com.google.android.gms.internal.ads.zzyi r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzva.zzu(com.google.android.gms.internal.ads.zzyi, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzyg");
    }

    public final zzacs zzv() {
        return zzS(new zzuy(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final zzacs zzw(int i, int i2) {
        return zzS(new zzuy(i, false));
    }
}
