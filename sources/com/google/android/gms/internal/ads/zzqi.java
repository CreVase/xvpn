package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import defpackage.p71;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzqi implements zzpi {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpu zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzpy zzY;
    private final zzpq zzZ;
    private final zzpn zzd;
    private final zzqs zze;
    private final zzfvs zzf;
    private final zzfvs zzg;
    private final zzea zzh;
    private final zzpm zzi;
    private final ArrayDeque zzj;
    private zzqg zzk;
    private final zzqb zzl;
    private final zzqb zzm;
    private final zzpv zzn;
    private zzol zzo;
    private zzpf zzp;
    private zzpx zzq;
    private zzpx zzr;
    private zzdn zzs;
    private AudioTrack zzt;
    private zzon zzu;
    private zzk zzv;
    private zzqa zzw;
    private zzqa zzx;
    private zzcg zzy;
    private boolean zzz;

    public /* synthetic */ zzqi(zzpw zzpwVar, zzqh zzqhVar) {
        zzon zzonVar;
        zzpy zzpyVar;
        zzpv zzpvVar;
        zzpq zzpqVar;
        zzonVar = zzpwVar.zza;
        this.zzu = zzonVar;
        zzpyVar = zzpwVar.zzd;
        this.zzY = zzpyVar;
        int i = zzfk.zza;
        zzpvVar = zzpwVar.zzc;
        this.zzn = zzpvVar;
        zzpqVar = zzpwVar.zze;
        zzpqVar.getClass();
        this.zzZ = zzpqVar;
        zzea zzeaVar = new zzea(zzdy.zza);
        this.zzh = zzeaVar;
        zzeaVar.zze();
        this.zzi = new zzpm(new zzqd(this, null));
        zzpn zzpnVar = new zzpn();
        this.zzd = zzpnVar;
        zzqs zzqsVar = new zzqs();
        this.zze = zzqsVar;
        this.zzf = zzfvs.zzo(new zzdu(), zzpnVar, zzqsVar);
        this.zzg = zzfvs.zzm(new zzqr());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        zzcg zzcgVar = zzcg.zza;
        this.zzx = new zzqa(zzcgVar, 0L, 0L, null);
        this.zzy = zzcgVar;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqb(100L);
        this.zzm = new zzqb(100L);
    }

    public static /* bridge */ /* synthetic */ AudioTrack zzD(zzqi zzqiVar) {
        return zzqiVar.zzt;
    }

    public static /* bridge */ /* synthetic */ zzpf zzE(zzqi zzqiVar) {
        return zzqiVar.zzp;
    }

    public static /* synthetic */ void zzF(AudioTrack audioTrack, zzea zzeaVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzeaVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzeaVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzG(zzqi zzqiVar) {
        return zzqiVar.zzQ;
    }

    public final long zzH() {
        if (this.zzr.zzc == 0) {
            return this.zzA / r0.zzb;
        }
        return this.zzB;
    }

    public final long zzI() {
        zzpx zzpxVar = this.zzr;
        if (zzpxVar.zzc == 0) {
            long j = this.zzC;
            long j2 = zzpxVar.zzd;
            int i = zzfk.zza;
            return ((j + j2) - 1) / j2;
        }
        return this.zzD;
    }

    private final AudioTrack zzJ(zzpx zzpxVar) throws zzpe {
        try {
            return zzpxVar.zza(false, this.zzv, this.zzS);
        } catch (zzpe e) {
            zzpf zzpfVar = this.zzp;
            if (zzpfVar != null) {
                zzpfVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzK(long j) {
        zzcg zzcgVar;
        boolean z;
        zzpb zzpbVar;
        if (zzU()) {
            zzpy zzpyVar = this.zzY;
            zzcgVar = this.zzy;
            zzpyVar.zzc(zzcgVar);
        } else {
            zzcgVar = zzcg.zza;
        }
        zzcg zzcgVar2 = zzcgVar;
        this.zzy = zzcgVar2;
        if (zzU()) {
            zzpy zzpyVar2 = this.zzY;
            z = this.zzz;
            zzpyVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzz = z;
        ArrayDeque arrayDeque = this.zzj;
        long max = Math.max(0L, j);
        zzpx zzpxVar = this.zzr;
        long zzI = zzI();
        int i = zzpxVar.zze;
        int i2 = zzfk.zza;
        arrayDeque.add(new zzqa(zzcgVar2, max, (zzI * 1000000) / i, null));
        zzP();
        zzpf zzpfVar = this.zzp;
        if (zzpfVar != null) {
            boolean z2 = this.zzz;
            zzpbVar = ((zzqn) zzpfVar).zza.zzc;
            zzpbVar.zzs(z2);
        }
    }

    private final void zzL() {
        if (!this.zzP) {
            this.zzP = true;
            this.zzi.zzc(zzI());
            this.zzt.stop();
        }
    }

    private final void zzM(long j) throws zzph {
        ByteBuffer zzb2;
        if (this.zzs.zzh()) {
            while (!this.zzs.zzg()) {
                do {
                    zzb2 = this.zzs.zzb();
                    if (zzb2.hasRemaining()) {
                        zzQ(zzb2, j);
                    } else {
                        ByteBuffer byteBuffer = this.zzJ;
                        if (byteBuffer != null && byteBuffer.hasRemaining()) {
                            this.zzs.zze(this.zzJ);
                        } else {
                            return;
                        }
                    }
                } while (!zzb2.hasRemaining());
                return;
            }
            return;
        }
        ByteBuffer byteBuffer2 = this.zzJ;
        if (byteBuffer2 == null) {
            byteBuffer2 = zzdq.zza;
        }
        zzQ(byteBuffer2, j);
    }

    private final void zzN(zzcg zzcgVar) {
        zzqa zzqaVar = new zzqa(zzcgVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzS()) {
            this.zzw = zzqaVar;
        } else {
            this.zzx = zzqaVar;
        }
    }

    private final void zzO() {
        if (!zzS()) {
            return;
        }
        if (zzfk.zza >= 21) {
            this.zzt.setVolume(this.zzI);
            return;
        }
        AudioTrack audioTrack = this.zzt;
        float f = this.zzI;
        audioTrack.setStereoVolume(f, f);
    }

    private final void zzP() {
        zzdn zzdnVar = this.zzr.zzi;
        this.zzs = zzdnVar;
        zzdnVar.zzc();
    }

    private final void zzQ(ByteBuffer byteBuffer, long j) throws zzph {
        int write;
        zzpf zzpfVar;
        zzlq zzlqVar;
        zzlq zzlqVar2;
        boolean z;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        boolean z2 = true;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z = true;
            } else {
                z = false;
            }
            zzdx.zzd(z);
        } else {
            this.zzL = byteBuffer;
            if (zzfk.zza < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.zzM;
                if (bArr == null || bArr.length < remaining) {
                    this.zzM = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.zzM, 0, remaining);
                byteBuffer.position(position);
                this.zzN = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i = zzfk.zza;
        if (i < 21) {
            int zza2 = this.zzi.zza(this.zzC);
            if (zza2 > 0) {
                write = this.zzt.write(this.zzM, this.zzN, Math.min(remaining2, zza2));
                if (write > 0) {
                    this.zzN += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            } else {
                write = 0;
            }
        } else {
            write = this.zzt.write(byteBuffer, remaining2, 1);
        }
        this.zzV = SystemClock.elapsedRealtime();
        if (write < 0) {
            if (((i < 24 || write != -6) && write != -32) || zzI() <= 0) {
                z2 = false;
            }
            zzph zzphVar = new zzph(write, this.zzr.zza, z2);
            zzpf zzpfVar2 = this.zzp;
            if (zzpfVar2 != null) {
                zzpfVar2.zza(zzphVar);
            }
            if (!zzphVar.zzb) {
                this.zzm.zzb(zzphVar);
                return;
            } else {
                this.zzu = zzon.zza;
                throw zzphVar;
            }
        }
        this.zzm.zza();
        if (zzT(this.zzt)) {
            if (this.zzD > 0) {
                this.zzX = false;
            }
            if (this.zzQ && (zzpfVar = this.zzp) != null && write < remaining2) {
                zzqo zzqoVar = ((zzqn) zzpfVar).zza;
                zzlqVar = zzqoVar.zzl;
                if (zzlqVar != null) {
                    zzlqVar2 = zzqoVar.zzl;
                    zzlqVar2.zza();
                }
            }
        }
        int i2 = this.zzr.zzc;
        if (i2 == 0) {
            this.zzC += write;
        }
        if (write == remaining2) {
            if (i2 != 0) {
                if (byteBuffer != this.zzJ) {
                    z2 = false;
                }
                zzdx.zzf(z2);
                this.zzD = (this.zzE * this.zzK) + this.zzD;
            }
            this.zzL = null;
        }
    }

    private final boolean zzR() throws zzph {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzQ(byteBuffer, Long.MIN_VALUE);
            if (this.zzL != null) {
                return false;
            }
            return true;
        }
        this.zzs.zzd();
        zzM(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    private final boolean zzS() {
        return this.zzt != null;
    }

    private static boolean zzT(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzfk.zza >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean zzU() {
        zzpx zzpxVar = this.zzr;
        if (zzpxVar.zzc == 0) {
            int i = zzpxVar.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final int zza(zzam zzamVar) {
        if ("audio/raw".equals(zzamVar.zzm)) {
            if (!zzfk.zzF(zzamVar.zzB)) {
                p71.y("Invalid PCM encoding: ", zzamVar.zzB, "DefaultAudioSink");
                return 0;
            }
            if (zzamVar.zzB == 2) {
                return 2;
            }
            return 1;
        }
        if (this.zzu.zza(zzamVar) == null) {
            return 0;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final long zzb(boolean z) {
        long zzo;
        if (zzS() && !this.zzG) {
            long zzb2 = this.zzi.zzb(z);
            zzpx zzpxVar = this.zzr;
            long zzI = zzI();
            int i = zzpxVar.zze;
            int i2 = zzfk.zza;
            long min = Math.min(zzb2, (zzI * 1000000) / i);
            while (!this.zzj.isEmpty() && min >= ((zzqa) this.zzj.getFirst()).zzc) {
                this.zzx = (zzqa) this.zzj.remove();
            }
            zzqa zzqaVar = this.zzx;
            long j = min - zzqaVar.zzc;
            if (zzqaVar.zza.equals(zzcg.zza)) {
                zzo = this.zzx.zzb + j;
            } else if (this.zzj.isEmpty()) {
                zzo = this.zzY.zza(j) + this.zzx.zzb;
            } else {
                zzqa zzqaVar2 = (zzqa) this.zzj.getFirst();
                zzo = zzqaVar2.zzb - zzfk.zzo(zzqaVar2.zzc - min, this.zzx.zza.zzc);
            }
            zzpx zzpxVar2 = this.zzr;
            return ((this.zzY.zzb() * 1000000) / zzpxVar2.zze) + zzo;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final zzcg zzc() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final zzoq zzd(zzam zzamVar) {
        if (this.zzW) {
            return zzoq.zza;
        }
        return this.zzZ.zza(zzamVar, this.zzv);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    @Override // com.google.android.gms.internal.ads.zzpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzam r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.zzpd {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zze(com.google.android.gms.internal.ads.zzam, int, int[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzf() {
        if (zzS()) {
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzqa(this.zzy, 0L, 0L, null);
            this.zzH = 0L;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            zzP();
            if (this.zzi.zzi()) {
                this.zzt.pause();
            }
            if (zzT(this.zzt)) {
                zzqg zzqgVar = this.zzk;
                zzqgVar.getClass();
                zzqgVar.zzb(this.zzt);
            }
            if (zzfk.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            zzpx zzpxVar = this.zzq;
            if (zzpxVar != null) {
                this.zzr = zzpxVar;
                this.zzq = null;
            }
            this.zzi.zzd();
            final AudioTrack audioTrack = this.zzt;
            final zzea zzeaVar = this.zzh;
            zzeaVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfk.zzC("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqi.zzF(audioTrack, zzeaVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzg() {
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzh() {
        this.zzQ = false;
        if (zzS() && this.zzi.zzl()) {
            this.zzt.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzi() {
        this.zzQ = true;
        if (zzS()) {
            this.zzi.zzg();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzj() throws zzph {
        if (!this.zzO && zzS() && zzR()) {
            zzL();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzk() {
        zzf();
        zzfvs zzfvsVar = this.zzf;
        int size = zzfvsVar.size();
        for (int i = 0; i < size; i++) {
            ((zzdq) zzfvsVar.get(i)).zzf();
        }
        zzfvs zzfvsVar2 = this.zzg;
        int size2 = zzfvsVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzdq) zzfvsVar2.get(i2)).zzf();
        }
        zzdn zzdnVar = this.zzs;
        if (zzdnVar != null) {
            zzdnVar.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzl(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzm(int i) {
        boolean z;
        if (this.zzS != i) {
            this.zzS = i;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.zzR = z;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzn(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        if (this.zzt != null) {
            int i = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzo(zzdy zzdyVar) {
        this.zzi.zzf(zzdyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzp(zzpf zzpfVar) {
        this.zzp = zzpfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzq(int i, int i2) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzT(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzr(zzcg zzcgVar) {
        this.zzy = new zzcg(Math.max(0.1f, Math.min(zzcgVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzcgVar.zzd, 8.0f)));
        zzN(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzs(zzol zzolVar) {
        this.zzo = zzolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzt(AudioDeviceInfo audioDeviceInfo) {
        zzpu zzpuVar;
        if (audioDeviceInfo == null) {
            zzpuVar = null;
        } else {
            zzpuVar = new zzpu(audioDeviceInfo);
        }
        this.zzU = zzpuVar;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzps.zza(audioTrack, zzpuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzu(boolean z) {
        this.zzz = z;
        zzN(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzv(float f) {
        if (this.zzI != f) {
            this.zzI = f;
            zzO();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0173. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0384 A[Catch: zzpe -> 0x0388, TryCatch #3 {zzpe -> 0x0388, blocks: (B:147:0x0071, B:154:0x00b8, B:156:0x00c0, B:158:0x00c6, B:159:0x00cd, B:160:0x00d6, B:162:0x00dc, B:164:0x00e0, B:165:0x00e5, B:168:0x00fb, B:172:0x0113, B:173:0x0118, B:178:0x0086, B:180:0x008f, B:189:0x037c, B:191:0x0384, B:192:0x0387, B:151:0x007a, B:153:0x007f), top: B:146:0x0071, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[Catch: zzpe -> 0x0388, SYNTHETIC, TRY_LEAVE, TryCatch #3 {zzpe -> 0x0388, blocks: (B:147:0x0071, B:154:0x00b8, B:156:0x00c0, B:158:0x00c6, B:159:0x00cd, B:160:0x00d6, B:162:0x00dc, B:164:0x00e0, B:165:0x00e5, B:168:0x00fb, B:172:0x0113, B:173:0x0118, B:178:0x0086, B:180:0x008f, B:189:0x037c, B:191:0x0384, B:192:0x0387, B:151:0x007a, B:153:0x007f), top: B:146:0x0071, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a4 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzw(java.nio.ByteBuffer r23, long r24, int r26) throws com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzph {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzw(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final boolean zzx() {
        if (zzS() && this.zzi.zzh(zzI())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final boolean zzy() {
        if (!zzS()) {
            return true;
        }
        if (this.zzO && !zzx()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final boolean zzz(zzam zzamVar) {
        if (zza(zzamVar) != 0) {
            return true;
        }
        return false;
    }
}
