package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class zzzf extends zzse implements zzaaf {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private zzdm zzC;
    private zzdm zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzzj zzH;
    private zzaah zzI;
    private final Context zze;
    private final zzzr zzf;
    private final zzyv zzg;
    private final zzaac zzh;
    private final boolean zzi;
    private zzzb zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private zzzi zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzf(Context context, zzrv zzrvVar, zzsg zzsgVar, long j, boolean z, Handler handler, zzaad zzaadVar, int i, float f) {
        super(2, zzrvVar, zzsgVar, false, 30.0f);
        zzze zzzeVar = new zzze(null);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzzr(applicationContext);
        this.zzh = new zzaac(handler, zzaadVar);
        this.zzg = new zzyv(context, zzzeVar, this);
        this.zzi = "NVIDIA".equals(zzfk.zzc);
        this.zzs = -9223372036854775807L;
        this.zzp = 1;
        this.zzC = zzdm.zza;
        this.zzG = 0;
        this.zzq = 0;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04c0, code lost:            if (r0.equals("deb") != false) goto L506;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x07a0, code lost:            if (r10 != 0) goto L515;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzaL(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzf.zzaL(java.lang.String):boolean");
    }

    private static List zzaM(Context context, zzsg zzsgVar, zzam zzamVar, boolean z, boolean z2) throws zzsn {
        String str = zzamVar.zzm;
        if (str == null) {
            return zzfvs.zzl();
        }
        if (zzfk.zza >= 26 && "video/dolby-vision".equals(str) && !zzza.zza(context)) {
            List zzf = zzst.zzf(zzsgVar, zzamVar, z, z2);
            if (!zzf.isEmpty()) {
                return zzf;
            }
        }
        return zzst.zzh(zzsgVar, zzamVar, z, z2);
    }

    private final void zzaN(int i) {
        this.zzq = Math.min(this.zzq, i);
        int i2 = zzfk.zza;
    }

    private final void zzaO() {
        Surface surface = this.zzm;
        if (surface != null && this.zzq != 3) {
            this.zzq = 3;
            this.zzh.zzq(surface);
            this.zzo = true;
        }
    }

    private final void zzaP(zzdm zzdmVar) {
        if (!zzdmVar.equals(zzdm.zza) && !zzdmVar.equals(this.zzD)) {
            this.zzD = zzdmVar;
            this.zzh.zzt(zzdmVar);
        }
    }

    private final void zzaQ() {
        zzdm zzdmVar = this.zzD;
        if (zzdmVar != null) {
            this.zzh.zzt(zzdmVar);
        }
    }

    private final void zzaR() {
        Surface surface = this.zzm;
        zzzi zzziVar = this.zzn;
        if (surface == zzziVar) {
            this.zzm = null;
        }
        if (zzziVar != null) {
            zzziVar.release();
            this.zzn = null;
        }
    }

    private static boolean zzaS(long j) {
        return j < -30000;
    }

    private final boolean zzaT(zzrz zzrzVar) {
        if (zzfk.zza < 23 || zzaL(zzrzVar.zza)) {
            return false;
        }
        if (zzrzVar.zzf && !zzzi.zzb(this.zze)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0075, code lost:            if (r3.equals("video/av01") != false) goto L41;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzaa(com.google.android.gms.internal.ads.zzrz r10, com.google.android.gms.internal.ads.zzam r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzf.zzaa(com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zzam):int");
    }

    public static int zzab(zzrz zzrzVar, zzam zzamVar) {
        if (zzamVar.zzn != -1) {
            int size = zzamVar.zzo.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) zzamVar.zzo.get(i2)).length;
            }
            return zzamVar.zzn + i;
        }
        return zzaa(zzrzVar, zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    @TargetApi(17)
    public final void zzA() {
        try {
            super.zzA();
            this.zzF = false;
            if (this.zzn != null) {
                zzaR();
            }
        } catch (Throwable th) {
            this.zzF = false;
            if (this.zzn != null) {
                zzaR();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzB() {
        this.zzu = 0;
        zzh();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzt = elapsedRealtime;
        this.zzy = zzfk.zzq(elapsedRealtime);
        this.zzz = 0L;
        this.zzA = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzC() {
        this.zzs = -9223372036854775807L;
        if (this.zzu > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzh.zzd(this.zzu, elapsedRealtime - this.zzt);
            this.zzu = 0;
            this.zzt = elapsedRealtime;
        }
        int i = this.zzA;
        if (i != 0) {
            this.zzh.zzr(this.zzz, i);
            this.zzz = 0L;
            this.zzA = 0;
        }
        this.zzf.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlr
    public final void zzK(float f, float f2) throws zzil {
        boolean z;
        super.zzK(f, f2);
        this.zzf.zze(f);
        if (this.zzI != null) {
            if (f >= 0.0d) {
                z = true;
            } else {
                z = false;
            }
            zzdx.zzd(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlt
    public final String zzR() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzlr
    public final boolean zzT() {
        return super.zzT() && this.zzI == null;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzlr
    public final boolean zzU() {
        zzaah zzaahVar;
        zzzi zzziVar;
        if (super.zzU() && (((zzaahVar = this.zzI) == null || zzaahVar.zzg()) && (this.zzq == 3 || (((zzziVar = this.zzn) != null && this.zzm == zzziVar) || zzar() == null)))) {
            this.zzs = -9223372036854775807L;
            return true;
        }
        if (this.zzs == -9223372036854775807L) {
            return false;
        }
        zzh();
        if (SystemClock.elapsedRealtime() < this.zzs) {
            return true;
        }
        this.zzs = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final float zzW(float f, zzam zzamVar, zzam[] zzamVarArr) {
        float f2 = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f3 = zzamVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final int zzX(zzsg zzsgVar, zzam zzamVar) throws zzsn {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4 = 128;
        if (!zzcb.zzg(zzamVar.zzm)) {
            return 128;
        }
        int i5 = 0;
        if (zzamVar.zzp != null) {
            z = true;
        } else {
            z = false;
        }
        List zzaM = zzaM(this.zze, zzsgVar, zzamVar, z, false);
        if (z && zzaM.isEmpty()) {
            zzaM = zzaM(this.zze, zzsgVar, zzamVar, false, false);
        }
        if (zzaM.isEmpty()) {
            return 129;
        }
        if (!zzse.zzaG(zzamVar)) {
            return 130;
        }
        zzrz zzrzVar = (zzrz) zzaM.get(0);
        boolean zze = zzrzVar.zze(zzamVar);
        if (!zze) {
            for (int i6 = 1; i6 < zzaM.size(); i6++) {
                zzrz zzrzVar2 = (zzrz) zzaM.get(i6);
                if (zzrzVar2.zze(zzamVar)) {
                    zzrzVar = zzrzVar2;
                    z2 = false;
                    zze = true;
                    break;
                }
            }
        }
        z2 = true;
        if (true != zze) {
            i = 3;
        } else {
            i = 4;
        }
        if (true != zzrzVar.zzf(zzamVar)) {
            i2 = 8;
        } else {
            i2 = 16;
        }
        if (true != zzrzVar.zzg) {
            i3 = 0;
        } else {
            i3 = 64;
        }
        if (true != z2) {
            i4 = 0;
        }
        if (zzfk.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzza.zza(this.zze)) {
            i4 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zze) {
            List zzaM2 = zzaM(this.zze, zzsgVar, zzamVar, z, true);
            if (!zzaM2.isEmpty()) {
                zzrz zzrzVar3 = (zzrz) zzst.zzi(zzaM2, zzamVar).get(0);
                if (zzrzVar3.zze(zzamVar) && zzrzVar3.zzf(zzamVar)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzie zzY(zzrz zzrzVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzie zzb2 = zzrzVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb2.zze;
        zzzb zzzbVar = this.zzj;
        zzzbVar.getClass();
        if (zzamVar2.zzr > zzzbVar.zza || zzamVar2.zzs > zzzbVar.zzb) {
            i3 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zzab(zzrzVar, zzamVar2) > zzzbVar.zzc) {
            i3 |= 64;
        }
        String str = zzrzVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb2.zzd;
            i2 = 0;
        }
        return new zzie(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzie zzZ(zzkn zzknVar) throws zzil {
        zzie zzZ = super.zzZ(zzknVar);
        zzam zzamVar = zzknVar.zza;
        zzamVar.getClass();
        this.zzh.zzf(zzamVar, zzZ);
        return zzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final boolean zzaF(zzrz zzrzVar) {
        if (this.zzm == null && !zzaT(zzrzVar)) {
            return false;
        }
        return true;
    }

    public final void zzaH(zzrw zzrwVar, int i, long j, long j2) {
        int i2 = zzfk.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrwVar.zzm(i, j2);
        Trace.endSection();
        ((zzse) this).zza.zze++;
        this.zzv = 0;
        if (this.zzI == null) {
            zzh();
            this.zzy = zzfk.zzq(SystemClock.elapsedRealtime());
            zzaP(this.zzC);
            zzaO();
        }
    }

    public final void zzaI(zzrw zzrwVar, int i, long j) {
        int i2 = zzfk.zza;
        Trace.beginSection("skipVideoBuffer");
        zzrwVar.zzn(i, false);
        Trace.endSection();
        ((zzse) this).zza.zzf++;
    }

    public final void zzaJ(int i, int i2) {
        zzid zzidVar = ((zzse) this).zza;
        zzidVar.zzh += i;
        int i3 = i + i2;
        zzidVar.zzg += i3;
        this.zzu += i3;
        int i4 = this.zzv + i3;
        this.zzv = i4;
        zzidVar.zzi = Math.max(i4, zzidVar.zzi);
    }

    public final void zzaK(long j) {
        zzid zzidVar = ((zzse) this).zza;
        zzidVar.zzk += j;
        zzidVar.zzl++;
        this.zzz += j;
        this.zzA++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:            if (true == r12) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0117, code lost:            r13 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x011a, code lost:            if (true == r12) goto L75;     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x011c, code lost:            r4 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0120, code lost:            r3 = new android.graphics.Point(r13, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0119, code lost:            r13 = r3;     */
    @Override // com.google.android.gms.internal.ads.zzse
    @android.annotation.TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzru zzac(com.google.android.gms.internal.ads.zzrz r20, com.google.android.gms.internal.ads.zzam r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzf.zzac(com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzru");
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final List zzad(zzsg zzsgVar, zzam zzamVar, boolean z) throws zzsn {
        return zzst.zzi(zzaM(this.zze, zzsgVar, zzamVar, false, false), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    @TargetApi(29)
    public final void zzae(zzht zzhtVar) throws zzil {
        if (!this.zzl) {
            return;
        }
        ByteBuffer byteBuffer = zzhtVar.zzf;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b2 = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b3 = byteBuffer.get();
            byte b4 = byteBuffer.get();
            byteBuffer.position(0);
            if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                if (b4 == 0 || b4 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzrw zzar = zzar();
                    zzar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzar.zzp(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzaf(Exception exc) {
        zzer.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzh.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzag(String str, zzru zzruVar, long j, long j2) {
        this.zzh.zza(str, j, j2);
        this.zzk = zzaL(str);
        zzrz zzat = zzat();
        zzat.getClass();
        boolean z = false;
        if (zzfk.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzat.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzat.zzh();
            int length = zzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzh[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzl = z;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzah(String str) {
        this.zzh.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzai(zzam zzamVar, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        zzrw zzar = zzar();
        if (zzar != null) {
            zzar.zzq(this.zzp);
        }
        mediaFormat.getClass();
        int i = 0;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f = zzamVar.zzv;
        if (zzfk.zza >= 21) {
            int i2 = zzamVar.zzu;
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                int i3 = integer2;
                integer2 = integer;
                integer = i3;
            }
        } else if (this.zzI == null) {
            i = zzamVar.zzu;
        }
        this.zzC = new zzdm(integer, integer2, i, f);
        this.zzf.zzc(zzamVar.zzt);
        zzaah zzaahVar = this.zzI;
        if (zzaahVar != null) {
            zzak zzb2 = zzamVar.zzb();
            zzb2.zzab(integer);
            zzb2.zzH(integer2);
            zzb2.zzT(i);
            zzb2.zzR(f);
            zzaahVar.zza(1, zzb2.zzac());
        }
    }

    public final void zzaj(zzrw zzrwVar, int i, long j) {
        int i2 = zzfk.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrwVar.zzn(i, true);
        Trace.endSection();
        ((zzse) this).zza.zze++;
        this.zzv = 0;
        if (this.zzI == null) {
            zzh();
            this.zzy = zzfk.zzq(SystemClock.elapsedRealtime());
            zzaP(this.zzC);
            zzaO();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzak() {
        zzaN(2);
        if (this.zzg.zzi()) {
            this.zzg.zzf(zzap());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00bd, code lost:            if (r19 >= zzaq()) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00c3, code lost:            if (r13 == 2) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ac, code lost:            if (r16 > 100000) goto L54;     */
    @Override // com.google.android.gms.internal.ads.zzse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzam(long r19, long r21, com.google.android.gms.internal.ads.zzrw r23, java.nio.ByteBuffer r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.zzam r32) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzf.zzam(long, long, com.google.android.gms.internal.ads.zzrw, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.zzam):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzrx zzas(Throwable th, zzrz zzrzVar) {
        return new zzyy(th, zzrzVar, this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzav(long j) {
        super.zzav(j);
        this.zzw--;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzaw(zzht zzhtVar) throws zzil {
        this.zzw++;
        int i = zzfk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzax(zzam zzamVar) throws zzil {
        if (this.zzE && !this.zzF && !this.zzg.zzi()) {
            try {
                this.zzg.zzc(zzamVar);
                this.zzg.zzf(zzap());
                zzzj zzzjVar = this.zzH;
                if (zzzjVar != null) {
                    this.zzg.zzh(zzzjVar);
                }
            } catch (zzaag e) {
                throw zzi(e, zzamVar, false, 7000);
            }
        }
        if (this.zzI == null && this.zzg.zzi()) {
            zzaah zza = this.zzg.zza();
            this.zzI = zza;
            zza.zzb(new zzyz(this), zzgaj.zzb());
        }
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzaz() {
        super.zzaz();
        this.zzw = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlr
    public final void zzs() {
        if (this.zzq == 0) {
            this.zzq = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlm
    public final void zzt(int i, Object obj) throws zzil {
        zzzi zzziVar;
        Surface surface;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i == 14) {
                                    obj.getClass();
                                    zzfc zzfcVar = (zzfc) obj;
                                    if (this.zzg.zzi() && zzfcVar.zzb() != 0 && zzfcVar.zza() != 0 && (surface = this.zzm) != null) {
                                        this.zzg.zze(surface, zzfcVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            this.zzg.zzg((List) obj);
                            this.zzE = true;
                            return;
                        }
                        zzzr zzzrVar = this.zzf;
                        obj.getClass();
                        zzzrVar.zzj(((Integer) obj).intValue());
                        return;
                    }
                    obj.getClass();
                    int intValue = ((Integer) obj).intValue();
                    this.zzp = intValue;
                    zzrw zzar = zzar();
                    if (zzar != null) {
                        zzar.zzq(intValue);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                if (this.zzG != intValue2) {
                    this.zzG = intValue2;
                    return;
                }
                return;
            }
            obj.getClass();
            zzzj zzzjVar = (zzzj) obj;
            this.zzH = zzzjVar;
            this.zzg.zzh(zzzjVar);
            return;
        }
        if (obj instanceof Surface) {
            zzziVar = (Surface) obj;
        } else {
            zzziVar = null;
        }
        if (zzziVar == null) {
            zzzi zzziVar2 = this.zzn;
            if (zzziVar2 != null) {
                zzziVar = zzziVar2;
            } else {
                zzrz zzat = zzat();
                if (zzat != null && zzaT(zzat)) {
                    zzziVar = zzzi.zza(this.zze, zzat.zzf);
                    this.zzn = zzziVar;
                }
            }
        }
        if (this.zzm != zzziVar) {
            this.zzm = zzziVar;
            this.zzf.zzi(zzziVar);
            this.zzo = false;
            int zzbc = zzbc();
            zzrw zzar2 = zzar();
            zzzi zzziVar3 = zzziVar;
            if (zzar2 != null) {
                zzziVar3 = zzziVar;
                if (!this.zzg.zzi()) {
                    zzzi zzziVar4 = zzziVar;
                    if (zzfk.zza >= 23) {
                        if (zzziVar != null) {
                            zzziVar4 = zzziVar;
                            if (!this.zzk) {
                                zzar2.zzo(zzziVar);
                                zzziVar3 = zzziVar;
                            }
                        } else {
                            zzziVar4 = null;
                        }
                    }
                    zzay();
                    zzau();
                    zzziVar3 = zzziVar4;
                }
            }
            if (zzziVar3 != null && zzziVar3 != this.zzn) {
                zzaQ();
                zzaN(1);
                if (zzbc == 2) {
                    this.zzs = -9223372036854775807L;
                }
                if (this.zzg.zzi()) {
                    this.zzg.zze(zzziVar3, zzfc.zza);
                    return;
                }
                return;
            }
            this.zzD = null;
            zzaN(1);
            if (this.zzg.zzi()) {
                this.zzg.zzb();
                return;
            }
            return;
        }
        if (zzziVar != null && zzziVar != this.zzn) {
            zzaQ();
            Surface surface2 = this.zzm;
            if (surface2 != null && this.zzo) {
                this.zzh.zzq(surface2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    public final void zzw() {
        this.zzD = null;
        zzaN(0);
        this.zzo = false;
        try {
            super.zzw();
        } finally {
            this.zzh.zzc(((zzse) this).zza);
            this.zzh.zzt(zzdm.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    public final void zzx(boolean z, boolean z2) throws zzil {
        super.zzx(z, z2);
        zzm();
        this.zzh.zze(((zzse) this).zza);
        this.zzq = z2 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    public final void zzy(long j, boolean z) throws zzil {
        super.zzy(j, z);
        if (this.zzI == null) {
            if (this.zzg.zzi()) {
                this.zzg.zzf(zzap());
            }
            zzaN(1);
            this.zzf.zzf();
            this.zzx = -9223372036854775807L;
            this.zzr = -9223372036854775807L;
            this.zzv = 0;
            this.zzs = -9223372036854775807L;
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzz() {
        if (this.zzg.zzi()) {
            this.zzg.zzd();
        }
    }
}
