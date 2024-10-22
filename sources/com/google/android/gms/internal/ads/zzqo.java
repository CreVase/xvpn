package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class zzqo extends zzse implements zzkt {
    private final Context zzb;
    private final zzpb zzc;
    private final zzpi zzd;
    private int zze;
    private boolean zzf;
    private zzam zzg;
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private zzlq zzl;

    public zzqo(Context context, zzrv zzrvVar, zzsg zzsgVar, boolean z, Handler handler, zzpc zzpcVar, zzpi zzpiVar) {
        super(1, zzrvVar, zzsgVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzpiVar;
        this.zzc = new zzpb(handler, zzpcVar);
        zzpiVar.zzp(new zzqn(this, null));
    }

    private final int zzaH(zzrz zzrzVar, zzam zzamVar) {
        int i;
        if ("OMX.google.raw.decoder".equals(zzrzVar.zza) && (i = zzfk.zza) < 24 && (i != 23 || !zzfk.zzH(this.zzb))) {
            return -1;
        }
        return zzamVar.zzn;
    }

    private static List zzaI(zzsg zzsgVar, zzam zzamVar, boolean z, zzpi zzpiVar) throws zzsn {
        zzrz zzd;
        if (zzamVar.zzm == null) {
            return zzfvs.zzl();
        }
        if (zzpiVar.zzz(zzamVar) && (zzd = zzst.zzd()) != null) {
            return zzfvs.zzm(zzd);
        }
        return zzst.zzh(zzsgVar, zzamVar, false, false);
    }

    private final void zzaJ() {
        long zzb = this.zzd.zzb(zzT());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb = Math.max(this.zzi, zzb);
            }
            this.zzi = zzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    public final void zzA() {
        try {
            super.zzA();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzk();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzk();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzB() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzC() {
        zzaJ();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlt
    public final String zzR() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzlr
    public final boolean zzT() {
        if (super.zzT() && this.zzd.zzy()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzlr
    public final boolean zzU() {
        if (!this.zzd.zzx() && !super.zzU()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final float zzW(float f, zzam zzamVar, zzam[] zzamVarArr) {
        int i = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i2 = zzamVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final int zzX(zzsg zzsgVar, zzam zzamVar) throws zzsn {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 128;
        if (!zzcb.zzf(zzamVar.zzm)) {
            return 128;
        }
        if (zzfk.zza >= 21) {
            i = 32;
        } else {
            i = 0;
        }
        int i7 = zzamVar.zzH;
        boolean zzaG = zzse.zzaG(zzamVar);
        if (zzaG && (i7 == 0 || zzst.zzd() != null)) {
            zzoq zzd = this.zzd.zzd(zzamVar);
            if (!zzd.zzb) {
                i2 = 0;
            } else {
                if (true != zzd.zzc) {
                    i2 = 512;
                } else {
                    i2 = 1536;
                }
                if (zzd.zzd) {
                    i2 |= 2048;
                }
            }
            if (this.zzd.zzz(zzamVar)) {
                i5 = i | 140;
                return i5 | i2;
            }
        } else {
            i2 = 0;
        }
        if (("audio/raw".equals(zzamVar.zzm) && !this.zzd.zzz(zzamVar)) || !this.zzd.zzz(zzfk.zzx(2, zzamVar.zzz, zzamVar.zzA))) {
            return 129;
        }
        List zzaI = zzaI(zzsgVar, zzamVar, false, this.zzd);
        if (zzaI.isEmpty()) {
            return 129;
        }
        if (!zzaG) {
            return 130;
        }
        zzrz zzrzVar = (zzrz) zzaI.get(0);
        boolean zze = zzrzVar.zze(zzamVar);
        if (!zze) {
            for (int i8 = 1; i8 < zzaI.size(); i8++) {
                zzrz zzrzVar2 = (zzrz) zzaI.get(i8);
                if (zzrzVar2.zze(zzamVar)) {
                    zzrzVar = zzrzVar2;
                    z = false;
                    zze = true;
                    break;
                }
            }
        }
        z = true;
        if (true != zze) {
            i3 = 3;
        } else {
            i3 = 4;
        }
        int i9 = 8;
        if (zze && zzrzVar.zzf(zzamVar)) {
            i9 = 16;
        }
        if (true != zzrzVar.zzg) {
            i4 = 0;
        } else {
            i4 = 64;
        }
        if (true != z) {
            i6 = 0;
        }
        i5 = i3 | i9 | i | i4 | i6;
        return i5 | i2;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzie zzY(zzrz zzrzVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzie zzb = zzrzVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb.zze;
        if (zzaE(zzamVar2)) {
            i3 |= 32768;
        }
        if (zzaH(zzrzVar, zzamVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzrzVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb.zzd;
            i2 = 0;
        }
        return new zzie(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzie zzZ(zzkn zzknVar) throws zzil {
        zzam zzamVar = zzknVar.zza;
        zzamVar.getClass();
        this.zzg = zzamVar;
        zzie zzZ = super.zzZ(zzknVar);
        this.zzc.zzg(zzamVar, zzZ);
        return zzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
        if (zzbc() == 2) {
            zzaJ();
        }
        return this.zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:            if ("AXON 7 mini".equals(r10) == false) goto L92;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    @Override // com.google.android.gms.internal.ads.zzse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzru zzac(com.google.android.gms.internal.ads.zzrz r8, com.google.android.gms.internal.ads.zzam r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqo.zzac(com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzru");
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final List zzad(zzsg zzsgVar, zzam zzamVar, boolean z) throws zzsn {
        return zzst.zzi(zzaI(zzsgVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzae(zzht zzhtVar) {
        zzam zzamVar;
        if (zzfk.zza >= 29 && (zzamVar = zzhtVar.zza) != null) {
            String str = zzamVar.zzm;
            if ((str == "audio/opus" || (str != null && str.equals("audio/opus"))) && zzaD()) {
                ByteBuffer byteBuffer = zzhtVar.zzf;
                byteBuffer.getClass();
                zzam zzamVar2 = zzhtVar.zza;
                zzamVar2.getClass();
                if (byteBuffer.remaining() == 8) {
                    this.zzd.zzq(zzamVar2.zzC, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzaf(Exception exc) {
        zzer.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzag(String str, zzru zzruVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzah(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzai(zzam zzamVar, MediaFormat mediaFormat) throws zzil {
        int i;
        int i2;
        boolean z;
        zzam zzamVar2 = this.zzh;
        int[] iArr = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzar() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzamVar.zzm)) {
                i = zzamVar.zzB;
            } else if (zzfk.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = zzfk.zzk(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            zzak zzakVar = new zzak();
            zzakVar.zzU("audio/raw");
            zzakVar.zzP(i);
            zzakVar.zzE(zzamVar.zzC);
            zzakVar.zzF(zzamVar.zzD);
            zzakVar.zzO(zzamVar.zzk);
            zzakVar.zzJ(zzamVar.zzb);
            zzakVar.zzL(zzamVar.zzc);
            zzakVar.zzM(zzamVar.zzd);
            zzakVar.zzW(zzamVar.zze);
            zzakVar.zzy(mediaFormat.getInteger("channel-count"));
            zzakVar.zzV(mediaFormat.getInteger("sample-rate"));
            zzam zzac = zzakVar.zzac();
            if (this.zzf && zzac.zzz == 6 && (i2 = zzamVar.zzz) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzamVar.zzz; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzamVar = zzac;
        }
        try {
            int i4 = zzfk.zza;
            if (i4 >= 29) {
                if (zzaD()) {
                    zzm();
                }
                if (i4 >= 29) {
                    z = true;
                } else {
                    z = false;
                }
                zzdx.zzf(z);
            }
            this.zzd.zze(zzamVar, 0, iArr);
        } catch (zzpd e) {
            throw zzi(e, e.zza, false, 5001);
        }
    }

    public final void zzaj() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzak() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzal() throws zzil {
        try {
            this.zzd.zzj();
        } catch (zzph e) {
            throw zzi(e, e.zzc, e.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final boolean zzam(long j, long j2, zzrw zzrwVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzil {
        byteBuffer.getClass();
        if (this.zzh != null && (i2 & 2) != 0) {
            zzrwVar.getClass();
            zzrwVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zzrwVar != null) {
                zzrwVar.zzn(i, false);
            }
            ((zzse) this).zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzw(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzrwVar != null) {
                zzrwVar.zzn(i, false);
            }
            ((zzse) this).zza.zze += i3;
            return true;
        } catch (zzpe e) {
            throw zzi(e, this.zzg, e.zzb, 5001);
        } catch (zzph e2) {
            throw zzi(e2, zzamVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final boolean zzan(zzam zzamVar) {
        zzm();
        return this.zzd.zzz(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final zzcg zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(zzcg zzcgVar) {
        this.zzd.zzr(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlr
    public final zzkt zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlm
    public final void zzt(int i, Object obj) throws zzil {
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    switch (i) {
                        case 9:
                            zzpi zzpiVar = this.zzd;
                            obj.getClass();
                            zzpiVar.zzu(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            zzpi zzpiVar2 = this.zzd;
                            obj.getClass();
                            zzpiVar2.zzm(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.zzl = (zzlq) obj;
                            return;
                        case 12:
                            if (zzfk.zza >= 23) {
                                zzql.zza(this.zzd, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                zzl zzlVar = (zzl) obj;
                zzpi zzpiVar3 = this.zzd;
                zzlVar.getClass();
                zzpiVar3.zzn(zzlVar);
                return;
            }
            zzk zzkVar = (zzk) obj;
            zzpi zzpiVar4 = this.zzd;
            zzkVar.getClass();
            zzpiVar4.zzl(zzkVar);
            return;
        }
        zzpi zzpiVar5 = this.zzd;
        obj.getClass();
        zzpiVar5.zzv(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    public final void zzw() {
        this.zzk = true;
        this.zzg = null;
        try {
            this.zzd.zzf();
            try {
                super.zzw();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzw();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    public final void zzx(boolean z, boolean z2) throws zzil {
        super.zzx(z, z2);
        this.zzc.zzf(((zzse) this).zza);
        zzm();
        this.zzd.zzs(zzn());
        this.zzd.zzo(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzic
    public final void zzy(long j, boolean z) throws zzil {
        super.zzy(j, z);
        this.zzd.zzf();
        this.zzi = j;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzz() {
    }
}
