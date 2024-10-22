package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import defpackage.p71;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzagj implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzagf
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzagj(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private zzagi zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzes zzJ;
    private zzes zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzabp zzai;
    private final zzage zzh;
    private final zzagl zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfb zzl;
    private final zzfb zzm;
    private final zzfb zzn;
    private final zzfb zzo;
    private final zzfb zzp;
    private final zzfb zzq;
    private final zzfb zzr;
    private final zzfb zzs;
    private final zzfb zzt;
    private final zzfb zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzfk.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfsi.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        p71.s(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", SubsamplingScaleImageView.ORIENTATION_180, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzagj() {
        this(0);
    }

    private final int zzn(zzabn zzabnVar, zzagi zzagiVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzagiVar.zzb)) {
            zzv(zzabnVar, zzb, i);
            int i3 = this.zzaa;
            zzu();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzagiVar.zzb)) {
            zzv(zzabnVar, zzd, i);
            int i4 = this.zzaa;
            zzu();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzagiVar.zzb)) {
            zzv(zzabnVar, zze, i);
            int i5 = this.zzaa;
            zzu();
            return i5;
        }
        zzacs zzacsVar = zzagiVar.zzV;
        boolean z2 = true;
        if (!this.zzac) {
            if (zzagiVar.zzg) {
                this.zzV &= -1073741825;
                int i6 = 128;
                if (!this.zzad) {
                    ((zzabc) zzabnVar).zzn(this.zzn.zzI(), 0, 1, false);
                    this.zzZ++;
                    if ((this.zzn.zzI()[0] & 128) != 128) {
                        this.zzag = this.zzn.zzI()[0];
                        this.zzad = true;
                    } else {
                        throw zzcc.zza("Extension bit is set in signal byte", null);
                    }
                }
                byte b2 = this.zzag;
                if ((b2 & 1) == 1) {
                    int i7 = b2 & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        ((zzabc) zzabnVar).zzn(this.zzs.zzI(), 0, 8, false);
                        this.zzZ += 8;
                        this.zzah = true;
                        zzfb zzfbVar = this.zzn;
                        if (i7 != 2) {
                            i6 = 0;
                        }
                        zzfbVar.zzI()[0] = (byte) (i6 | 8);
                        this.zzn.zzG(0);
                        zzacsVar.zzs(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzG(0);
                        zzacsVar.zzs(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzae) {
                            ((zzabc) zzabnVar).zzn(this.zzn.zzI(), 0, 1, false);
                            this.zzZ++;
                            this.zzn.zzG(0);
                            this.zzaf = this.zzn.zzl();
                            this.zzae = true;
                        }
                        int i8 = this.zzaf * 4;
                        this.zzn.zzD(i8);
                        ((zzabc) zzabnVar).zzn(this.zzn.zzI(), 0, i8, false);
                        this.zzZ += i8;
                        int i9 = (this.zzaf >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzv = ByteBuffer.allocate(i10);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i2 = this.zzaf;
                            if (i11 >= i2) {
                                break;
                            }
                            int zzo = this.zzn.zzo();
                            int i13 = zzo - i12;
                            if (i11 % 2 == 0) {
                                this.zzv.putShort((short) i13);
                            } else {
                                this.zzv.putInt(i13);
                            }
                            i11++;
                            i12 = zzo;
                        }
                        int i14 = (i - this.zzZ) - i12;
                        if ((i2 & 1) == 1) {
                            this.zzv.putInt(i14);
                        } else {
                            this.zzv.putShort((short) i14);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzE(this.zzv.array(), i10);
                        zzacsVar.zzs(this.zzt, i10, 1);
                        this.zzaa += i10;
                    }
                }
            } else {
                byte[] bArr = zzagiVar.zzh;
                if (bArr != null) {
                    this.zzq.zzE(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzagiVar.zzb) ? zzagiVar.zzf > 0 : z) {
                this.zzV |= 268435456;
                this.zzu.zzD(0);
                int zzd2 = (this.zzq.zzd() + i) - this.zzZ;
                this.zzn.zzD(4);
                this.zzn.zzI()[0] = (byte) ((zzd2 >> 24) & 255);
                this.zzn.zzI()[1] = (byte) ((zzd2 >> 16) & 255);
                this.zzn.zzI()[2] = (byte) ((zzd2 >> 8) & 255);
                this.zzn.zzI()[3] = (byte) (zzd2 & 255);
                zzacsVar.zzs(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int zzd3 = this.zzq.zzd() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzagiVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzagiVar.zzb)) {
            if (zzagiVar.zzS != null) {
                if (this.zzq.zzd() != 0) {
                    z2 = false;
                }
                zzdx.zzf(z2);
                zzagiVar.zzS.zzd(zzabnVar);
            }
            while (true) {
                int i15 = this.zzZ;
                if (i15 >= zzd3) {
                    break;
                }
                int zzo2 = zzo(zzabnVar, zzacsVar, zzd3 - i15);
                this.zzZ += zzo2;
                this.zzaa += zzo2;
            }
        } else {
            byte[] zzI = this.zzm.zzI();
            zzI[0] = 0;
            zzI[1] = 0;
            zzI[2] = 0;
            int i16 = zzagiVar.zzW;
            int i17 = 4 - i16;
            while (this.zzZ < zzd3) {
                int i18 = this.zzab;
                if (i18 == 0) {
                    int min = Math.min(i16, this.zzq.zza());
                    ((zzabc) zzabnVar).zzn(zzI, i17 + min, i16 - min, false);
                    if (min > 0) {
                        this.zzq.zzC(zzI, i17, min);
                    }
                    this.zzZ += i16;
                    this.zzm.zzG(0);
                    this.zzab = this.zzm.zzo();
                    this.zzl.zzG(0);
                    zzacq.zzb(zzacsVar, this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int zzo3 = zzo(zzabnVar, zzacsVar, i18);
                    this.zzZ += zzo3;
                    this.zzaa += zzo3;
                    this.zzab -= zzo3;
                }
            }
        }
        if ("A_VORBIS".equals(zzagiVar.zzb)) {
            this.zzo.zzG(0);
            zzacq.zzb(zzacsVar, this.zzo, 4);
            this.zzaa += 4;
        }
        int i19 = this.zzaa;
        zzu();
        return i19;
    }

    private final int zzo(zzabn zzabnVar, zzacs zzacsVar, int i) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 > 0) {
            int min = Math.min(i, zza2);
            zzacq.zzb(zzacsVar, this.zzq, min);
            return min;
        }
        return zzacq.zza(zzacsVar, zzabnVar, i, false);
    }

    private final long zzp(long j) throws zzcc {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzfk.zzr(j, j2, 1000L);
        }
        throw zzcc.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzq(int i) throws zzcc {
        if (this.zzJ != null && this.zzK != null) {
            return;
        }
        throw zzcc.zza("Element " + i + " must be in a Cues", null);
    }

    private final void zzr(int i) throws zzcc {
        if (this.zzB != null) {
            return;
        }
        throw zzcc.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzs(com.google.android.gms.internal.ads.zzagi r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.zzs(com.google.android.gms.internal.ads.zzagi, long, int, int, int):void");
    }

    private final void zzt(zzabn zzabnVar, int i) throws IOException {
        if (this.zzn.zzd() >= i) {
            return;
        }
        if (this.zzn.zzb() < i) {
            zzfb zzfbVar = this.zzn;
            int zzb2 = zzfbVar.zzb();
            zzfbVar.zzA(Math.max(zzb2 + zzb2, i));
        }
        zzfb zzfbVar2 = this.zzn;
        ((zzabc) zzabnVar).zzn(zzfbVar2.zzI(), zzfbVar2.zzd(), i - zzfbVar2.zzd(), false);
        this.zzn.zzF(i);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzD(0);
    }

    private final void zzv(zzabn zzabnVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzfb zzfbVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzfbVar.zzE(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzI(), 0, length);
        }
        ((zzabc) zzabnVar).zzn(this.zzr.zzI(), length, i, false);
        this.zzr.zzG(0);
        this.zzr.zzF(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zzfk.zza;
        return format.getBytes(zzfsi.zzc);
    }

    private static int[] zzx(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        if (length >= i) {
            return iArr;
        }
        return new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (this.zzh.zzc(zzabnVar)) {
                long zzf2 = zzabnVar.zzf();
                if (this.zzF) {
                    this.zzH = zzf2;
                    zzacjVar.zza = this.zzG;
                    this.zzF = false;
                    return 1;
                }
                if (this.zzC) {
                    long j = this.zzH;
                    if (j != -1) {
                        zzacjVar.zza = j;
                        this.zzH = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzagi zzagiVar = (zzagi) this.zzj.valueAt(i);
                    zzagi.zzd(zzagiVar);
                    zzact zzactVar = zzagiVar.zzS;
                    if (zzactVar != null) {
                        zzactVar.zza(zzagiVar.zzV, zzagiVar.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzai = zzabpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzact zzactVar = ((zzagi) this.zzj.valueAt(i)).zzS;
            if (zzactVar != null) {
                zzactVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        return new zzagk().zza(zzabnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x027b, code lost:            throw com.google.android.gms.internal.ads.zzcc.zza("EBML lacing sample size out of range.", null);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(int r20, int r21, com.google.android.gms.internal.ads.zzabn r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.zzg(int, int, com.google.android.gms.internal.ads.zzabn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e5, code lost:            if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L188;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r22) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.zzh(int):void");
    }

    public final void zzi(int i, double d) throws zzcc {
        if (i != 181) {
            if (i != 17545) {
                switch (i) {
                    case 21969:
                        zzr(i);
                        this.zzB.zzC = (float) d;
                        return;
                    case 21970:
                        zzr(i);
                        this.zzB.zzD = (float) d;
                        return;
                    case 21971:
                        zzr(i);
                        this.zzB.zzE = (float) d;
                        return;
                    case 21972:
                        zzr(i);
                        this.zzB.zzF = (float) d;
                        return;
                    case 21973:
                        zzr(i);
                        this.zzB.zzG = (float) d;
                        return;
                    case 21974:
                        zzr(i);
                        this.zzB.zzH = (float) d;
                        return;
                    case 21975:
                        zzr(i);
                        this.zzB.zzI = (float) d;
                        return;
                    case 21976:
                        zzr(i);
                        this.zzB.zzJ = (float) d;
                        return;
                    case 21977:
                        zzr(i);
                        this.zzB.zzK = (float) d;
                        return;
                    case 21978:
                        zzr(i);
                        this.zzB.zzL = (float) d;
                        return;
                    default:
                        switch (i) {
                            case 30323:
                                zzr(i);
                                this.zzB.zzr = (float) d;
                                return;
                            case 30324:
                                zzr(i);
                                this.zzB.zzs = (float) d;
                                return;
                            case 30325:
                                zzr(i);
                                this.zzB.zzt = (float) d;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.zzz = (long) d;
            return;
        }
        zzr(i);
        this.zzB.zzP = (int) d;
    }

    public final void zzj(int i, long j) throws zzcc {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        zzr(i);
                        this.zzB.zzd = (int) j;
                        return;
                    case PRIVACY_URL_ERROR_VALUE:
                        if (j == 1) {
                            z = true;
                        }
                        zzr(i);
                        this.zzB.zzU = z;
                        return;
                    case 155:
                        this.zzP = zzp(j);
                        return;
                    case 159:
                        zzr(i);
                        this.zzB.zzN = (int) j;
                        return;
                    case 176:
                        zzr(i);
                        this.zzB.zzl = (int) j;
                        return;
                    case 179:
                        zzq(i);
                        this.zzJ.zzc(zzp(j));
                        return;
                    case 186:
                        zzr(i);
                        this.zzB.zzm = (int) j;
                        return;
                    case 215:
                        zzr(i);
                        this.zzB.zzc = (int) j;
                        return;
                    case 231:
                        this.zzI = zzp(j);
                        return;
                    case 238:
                        this.zzW = (int) j;
                        return;
                    case 241:
                        if (!this.zzL) {
                            zzq(i);
                            this.zzK.zzc(j);
                            this.zzL = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzX = true;
                        return;
                    case 16871:
                        zzr(i);
                        zzagi.zzb(this.zzB, (int) j);
                        return;
                    case 16980:
                        if (j != 3) {
                            throw zzcc.zza("ContentCompAlgo " + j + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw zzcc.zza("DocTypeReadVersion " + j + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw zzcc.zza("EBMLReadVersion " + j + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw zzcc.zza("ContentEncAlgo " + j + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw zzcc.zza("AESSettingsCipherMode " + j + " not supported", null);
                        }
                        return;
                    case 21420:
                        this.zzE = j + this.zzx;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        zzr(i);
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 == 15) {
                                        this.zzB.zzv = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzv = 1;
                                return;
                            }
                            this.zzB.zzv = 2;
                            return;
                        }
                        this.zzB.zzv = 0;
                        return;
                    case 21680:
                        zzr(i);
                        this.zzB.zzn = (int) j;
                        return;
                    case 21682:
                        zzr(i);
                        this.zzB.zzp = (int) j;
                        return;
                    case 21690:
                        zzr(i);
                        this.zzB.zzo = (int) j;
                        return;
                    case 21930:
                        if (j == 1) {
                            z = true;
                        }
                        zzr(i);
                        this.zzB.zzT = z;
                        return;
                    case 21998:
                        zzr(i);
                        this.zzB.zzf = (int) j;
                        return;
                    case 22186:
                        zzr(i);
                        this.zzB.zzQ = j;
                        return;
                    case 22203:
                        zzr(i);
                        this.zzB.zzR = j;
                        return;
                    case 25188:
                        zzr(i);
                        this.zzB.zzO = (int) j;
                        return;
                    case 30114:
                        this.zzY = j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        zzr(i);
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        this.zzB.zzq = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzq = 2;
                                return;
                            }
                            this.zzB.zzq = 1;
                            return;
                        }
                        this.zzB.zzq = 0;
                        return;
                    case 2352003:
                        zzr(i);
                        this.zzB.zze = (int) j;
                        return;
                    case 2807729:
                        this.zzy = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                zzr(i);
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        this.zzB.zzz = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzz = 2;
                                return;
                            case 21946:
                                zzr(i);
                                int zzb2 = zzs.zzb((int) j);
                                if (zzb2 != -1) {
                                    this.zzB.zzy = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzr(i);
                                this.zzB.zzw = true;
                                int zza2 = zzs.zza((int) j);
                                if (zza2 != -1) {
                                    this.zzB.zzx = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzr(i);
                                this.zzB.zzA = (int) j;
                                return;
                            case 21949:
                                zzr(i);
                                this.zzB.zzB = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j != 1) {
                throw zzcc.zza("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        if (j == 0) {
            return;
        }
        throw zzcc.zza("ContentEncodingOrder " + j + " not supported", null);
    }

    public final void zzk(int i, long j, long j2) throws zzcc {
        zzdx.zzb(this.zzai);
        if (i != 160) {
            if (i != 174) {
                if (i != 187) {
                    if (i != 19899) {
                        if (i != 20533) {
                            if (i != 21968) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i == 524531317 && !this.zzC) {
                                            if (this.zzk && this.zzG != -1) {
                                                this.zzF = true;
                                                return;
                                            } else {
                                                this.zzai.zzO(new zzacl(this.zzA, 0L));
                                                this.zzC = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.zzJ = new zzes(32);
                                    this.zzK = new zzes(32);
                                    return;
                                }
                                long j3 = this.zzx;
                                if (j3 != -1 && j3 != j) {
                                    throw zzcc.zza("Multiple Segment elements not supported", null);
                                }
                                this.zzx = j;
                                this.zzw = j2;
                                return;
                            }
                            zzr(i);
                            this.zzB.zzw = true;
                            return;
                        }
                        zzr(i);
                        this.zzB.zzg = true;
                        return;
                    }
                    this.zzD = -1;
                    this.zzE = -1L;
                    return;
                }
                this.zzL = false;
                return;
            }
            this.zzB = new zzagi();
            return;
        }
        this.zzX = false;
        this.zzY = 0L;
    }

    public final void zzl(int i, String str) throws zzcc {
        if (i != 134) {
            if (i != 17026) {
                if (i != 21358) {
                    if (i == 2274716) {
                        zzr(i);
                        zzagi.zzc(this.zzB, str);
                        return;
                    }
                    return;
                }
                zzr(i);
                this.zzB.zza = str;
                return;
            }
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw zzcc.zza("DocType " + str + " not supported", null);
            }
            return;
        }
        zzr(i);
        this.zzB.zzb = str;
    }

    public zzagj(int i) {
        zzagc zzagcVar = new zzagc();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzagcVar;
        zzagcVar.zza(new zzagh(this, null));
        this.zzk = true;
        this.zzi = new zzagl();
        this.zzj = new SparseArray();
        this.zzn = new zzfb(4);
        this.zzo = new zzfb(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfb(4);
        this.zzl = new zzfb(zzfy.zza);
        this.zzm = new zzfb(4);
        this.zzq = new zzfb();
        this.zzr = new zzfb();
        this.zzs = new zzfb(8);
        this.zzt = new zzfb();
        this.zzu = new zzfb();
        this.zzS = new int[1];
    }
}
