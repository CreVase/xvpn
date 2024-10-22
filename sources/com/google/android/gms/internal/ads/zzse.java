package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzse extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private zzrz zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzid zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzsd zzag;
    private long zzah;
    private boolean zzai;
    private zzre zzaj;
    private zzre zzak;
    private final zzrv zzc;
    private final zzsg zzd;
    private final float zze;
    private final zzht zzf;
    private final zzht zzg;
    private final zzht zzh;
    private final zzrs zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqp zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private boolean zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zzrw zzt;
    private zzam zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zzsc zzz;

    public zzse(int i, zzrv zzrvVar, zzsg zzsgVar, boolean z, float f) {
        super(i);
        this.zzc = zzrvVar;
        zzsgVar.getClass();
        this.zzd = zzsgVar;
        this.zze = f;
        this.zzf = new zzht(0, 0);
        this.zzg = new zzht(0, 0);
        this.zzh = new zzht(2, 0);
        zzrs zzrsVar = new zzrs();
        this.zzi = zzrsVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        zzaL(zzsd.zza);
        zzrsVar.zzi(0);
        zzrsVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqp();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
    }

    public static boolean zzaG(zzam zzamVar) {
        if (zzamVar.zzH != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0345, code lost:            if ("stvm8".equals(r5) == false) goto L163;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0355, code lost:            if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L163;     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x041d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaH(com.google.android.gms.internal.ads.zzrz r19, android.media.MediaCrypto r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzaH(com.google.android.gms.internal.ads.zzrz, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzaI() throws zzil {
        int i = this.zzX;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.zzae = true;
                    zzal();
                    return;
                } else {
                    zzay();
                    zzau();
                    return;
                }
            }
            zzaj();
            zzaM();
            return;
        }
        zzaj();
    }

    private final void zzaJ() {
        this.zzM = -1;
        this.zzg.zzc = null;
    }

    private final void zzaK() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final void zzaL(zzsd zzsdVar) {
        this.zzag = zzsdVar;
        if (zzsdVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final void zzaM() throws zzil {
        this.zzaj = this.zzak;
        this.zzW = 0;
        this.zzX = 0;
    }

    @TargetApi(23)
    private final boolean zzaN() throws zzil {
        if (this.zzY) {
            this.zzW = 1;
            if (!this.zzD && !this.zzF) {
                this.zzX = 2;
            } else {
                this.zzX = 3;
                return false;
            }
        } else {
            zzaM();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaO() throws zzil {
        zzrw zzrwVar = this.zzt;
        boolean z = 0;
        if (zzrwVar == null || this.zzW == 2 || this.zzad) {
            return false;
        }
        if (this.zzM < 0) {
            int zza = zzrwVar.zza();
            this.zzM = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = this.zzt.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzW == 1) {
            if (!this.zzK) {
                this.zzZ = true;
                this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                zzaJ();
            }
            this.zzW = 2;
            return false;
        }
        if (this.zzI) {
            this.zzI = false;
            this.zzg.zzc.put(zzb);
            this.zzt.zzj(this.zzM, 0, 38, 0L, 0);
            zzaJ();
            this.zzY = true;
            return true;
        }
        if (this.zzV == 1) {
            for (int i = 0; i < this.zzu.zzo.size(); i++) {
                this.zzg.zzc.put((byte[]) this.zzu.zzo.get(i));
            }
            this.zzV = 2;
        }
        int position = this.zzg.zzc.position();
        zzkn zzj = zzj();
        try {
            int zzbd = zzbd(zzj, this.zzg, 0);
            if (zzbd == -3) {
                if (zzN()) {
                    this.zzac = this.zzab;
                }
                return false;
            }
            if (zzbd == -5) {
                if (this.zzV == 2) {
                    this.zzg.zzb();
                    this.zzV = 1;
                }
                zzZ(zzj);
                return true;
            }
            zzht zzhtVar = this.zzg;
            if (zzhtVar.zzf()) {
                this.zzac = this.zzab;
                if (this.zzV == 2) {
                    zzhtVar.zzb();
                    this.zzV = 1;
                }
                this.zzad = true;
                if (!this.zzY) {
                    zzaI();
                    return false;
                }
                try {
                    if (!this.zzK) {
                        this.zzZ = true;
                        this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                        zzaJ();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzi(e, this.zzm, false, zzfk.zzi(e.getErrorCode()));
                }
            }
            if (!this.zzY && !zzhtVar.zzg()) {
                zzhtVar.zzb();
                if (this.zzV == 2) {
                    this.zzV = 1;
                }
                return true;
            }
            boolean zzk = zzhtVar.zzk();
            if (zzk) {
                zzhtVar.zzb.zzb(position);
            }
            if (this.zzC && !zzk) {
                ByteBuffer byteBuffer = this.zzg.zzc;
                byte[] bArr = zzfy.zza;
                int position2 = byteBuffer.position();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    if (i4 < position2) {
                        int i5 = byteBuffer.get(i2) & 255;
                        if (i3 == 3) {
                            if (i5 == 1) {
                                if ((byteBuffer.get(i4) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i2 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
                                    break;
                                }
                                i5 = 1;
                            }
                        } else if (i5 == 0) {
                            i3++;
                        }
                        if (i5 != 0) {
                            i3 = 0;
                        }
                        i2 = i4;
                    } else {
                        byteBuffer.clear();
                        break;
                    }
                }
                if (this.zzg.zzc.position() == 0) {
                    return true;
                }
                this.zzC = false;
            }
            long j = this.zzg.zze;
            if (this.zzaf) {
                if (!this.zzk.isEmpty()) {
                    ((zzsd) this.zzk.peekLast()).zze.zzd(j, this.zzm);
                } else {
                    this.zzag.zze.zzd(j, this.zzm);
                }
                this.zzaf = false;
            }
            long max = Math.max(this.zzab, j);
            this.zzab = max;
            if (zzN() || this.zzg.zzh()) {
                this.zzac = max;
            }
            this.zzg.zzj();
            zzht zzhtVar2 = this.zzg;
            if (zzhtVar2.zze()) {
                zzae(zzhtVar2);
            }
            zzaw(this.zzg);
            try {
                if (zzk) {
                    this.zzt.zzk(this.zzM, 0, this.zzg.zzb, j, 0);
                } else {
                    this.zzt.zzj(this.zzM, 0, this.zzg.zzc.limit(), j, 0);
                }
                zzaJ();
                this.zzY = true;
                this.zzV = 0;
                zzid zzidVar = this.zza;
                z = zzidVar.zzc + 1;
                zzidVar.zzc = z;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzi(e2, this.zzm, z, zzfk.zzi(e2.getErrorCode()));
            }
        } catch (zzhs e3) {
            zzaf(e3);
            zzaQ(0);
            zzaj();
            return true;
        }
    }

    private final boolean zzaP() {
        return this.zzN >= 0;
    }

    private final boolean zzaQ(int i) throws zzil {
        zzht zzhtVar = this.zzf;
        zzkn zzj = zzj();
        zzhtVar.zzb();
        int zzbd = zzbd(zzj, this.zzf, i | 4);
        if (zzbd == -5) {
            zzZ(zzj);
            return true;
        }
        if (zzbd == -4 && this.zzf.zzf()) {
            this.zzad = true;
            zzaI();
            return false;
        }
        return false;
    }

    private final boolean zzaR(long j) {
        if (this.zzq != -9223372036854775807L) {
            zzh();
            if (SystemClock.elapsedRealtime() - j >= this.zzq) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean zzaS(zzam zzamVar) throws zzil {
        if (zzfk.zza >= 23 && this.zzt != null && this.zzX != 3 && zzbc() != 0) {
            float zzW = zzW(this.zzs, zzamVar, zzQ());
            float f = this.zzx;
            if (f == zzW) {
                return true;
            }
            if (zzW == -1.0f) {
                zzab();
                return false;
            }
            if (f == -1.0f && zzW <= this.zze) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", zzW);
            this.zzt.zzp(bundle);
            this.zzx = zzW;
        }
        return true;
    }

    private final void zzaa() {
        this.zzT = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzS = false;
        this.zzR = false;
        this.zzl.zzb();
    }

    private final void zzab() throws zzil {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzay();
            zzau();
        }
    }

    private final void zzaj() {
        try {
            this.zzt.zzi();
        } finally {
            zzaz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzA() {
        try {
            zzaa();
            zzay();
        } finally {
            this.zzak = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:            if (r5 >= r1) goto L14;     */
    @Override // com.google.android.gms.internal.ads.zzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzD(com.google.android.gms.internal.ads.zzam[] r16, long r17, long r19) throws com.google.android.gms.internal.ads.zzil {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.zzsd r1 = r0.zzag
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            com.google.android.gms.internal.ads.zzsd r1 = new com.google.android.gms.internal.ads.zzsd
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.zzaL(r1)
            return
        L21:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.zzab
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.zzah
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            com.google.android.gms.internal.ads.zzsd r1 = new com.google.android.gms.internal.ads.zzsd
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.zzaL(r1)
            com.google.android.gms.internal.ads.zzsd r1 = r0.zzag
            long r1 = r1.zzd
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L56
            r15.zzak()
        L56:
            return
        L57:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzsd r9 = new com.google.android.gms.internal.ads.zzsd
            long r3 = r0.zzab
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzD(com.google.android.gms.internal.ads.zzam[], long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlr
    public void zzK(float f, float f2) throws zzil {
        this.zzr = f;
        this.zzs = f2;
        zzaS(this.zzu);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzS(long r24, long r26) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzS(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public boolean zzT() {
        return this.zzae;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public boolean zzU() {
        if (this.zzm == null) {
            return false;
        }
        if (!zzP() && !zzaP()) {
            if (this.zzL == -9223372036854775807L) {
                return false;
            }
            zzh();
            if (SystemClock.elapsedRealtime() >= this.zzL) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final int zzV(zzam zzamVar) throws zzil {
        try {
            return zzX(this.zzd, zzamVar);
        } catch (zzsn e) {
            throw zzi(e, zzamVar, false, 4002);
        }
    }

    public float zzW(float f, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    public abstract int zzX(zzsg zzsgVar, zzam zzamVar) throws zzsn;

    public zzie zzY(zzrz zzrzVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:            if (zzaN() == false) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:            if (zzaN() == false) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:            if (zzaN() == false) goto L72;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzie zzZ(com.google.android.gms.internal.ads.zzkn r12) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzZ(com.google.android.gms.internal.ads.zzkn):com.google.android.gms.internal.ads.zzie");
    }

    public final void zzaA() {
        zzaz();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzaa = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
        this.zzp = false;
    }

    public final boolean zzaB() throws zzil {
        boolean zzaC = zzaC();
        if (zzaC) {
            zzau();
        }
        return zzaC;
    }

    public final boolean zzaC() {
        boolean z;
        if (this.zzt == null) {
            return false;
        }
        int i = this.zzX;
        if (i != 3 && !this.zzD && ((!this.zzE || this.zzaa) && (!this.zzF || !this.zzZ))) {
            if (i == 2) {
                int i2 = zzfk.zza;
                if (i2 >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                zzdx.zzf(z);
                if (i2 >= 23) {
                    try {
                        zzaM();
                    } catch (zzil e) {
                        zzer.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                        zzay();
                        return true;
                    }
                }
            }
            zzaj();
            return false;
        }
        zzay();
        return true;
    }

    public final boolean zzaD() {
        return this.zzR;
    }

    public final boolean zzaE(zzam zzamVar) {
        if (this.zzak == null && zzan(zzamVar)) {
            return true;
        }
        return false;
    }

    public boolean zzaF(zzrz zzrzVar) {
        return true;
    }

    public abstract zzru zzac(zzrz zzrzVar, zzam zzamVar, MediaCrypto mediaCrypto, float f);

    public abstract List zzad(zzsg zzsgVar, zzam zzamVar, boolean z) throws zzsn;

    public void zzae(zzht zzhtVar) throws zzil {
        throw null;
    }

    public void zzaf(Exception exc) {
        throw null;
    }

    public void zzag(String str, zzru zzruVar, long j, long j2) {
        throw null;
    }

    public void zzah(String str) {
        throw null;
    }

    public void zzai(zzam zzamVar, MediaFormat mediaFormat) throws zzil {
        throw null;
    }

    public void zzak() {
    }

    public void zzal() throws zzil {
    }

    public abstract boolean zzam(long j, long j2, zzrw zzrwVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzil;

    public boolean zzan(zzam zzamVar) {
        return false;
    }

    public final float zzao() {
        return this.zzr;
    }

    public final long zzap() {
        return this.zzag.zzd;
    }

    public final long zzaq() {
        return this.zzag.zzc;
    }

    public final zzrw zzar() {
        return this.zzt;
    }

    public zzrx zzas(Throwable th, zzrz zzrzVar) {
        return new zzrx(th, zzrzVar);
    }

    public final zzrz zzat() {
        return this.zzA;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2 A[Catch: zzsc -> 0x0105, TryCatch #2 {zzsc -> 0x0105, blocks: (B:25:0x0051, B:70:0x0056, B:72:0x006c, B:73:0x0077, B:28:0x0086, B:30:0x008e, B:31:0x0096, B:33:0x009a, B:47:0x00c2, B:49:0x00e2, B:50:0x00eb, B:55:0x00f4, B:56:0x00f6, B:57:0x00e5, B:65:0x00f7, B:67:0x00fa, B:68:0x0104, B:76:0x007b, B:77:0x0085, B:36:0x00a9, B:44:0x00b2, B:59:0x00c0), top: B:24:0x0051, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5 A[Catch: zzsc -> 0x0105, TryCatch #2 {zzsc -> 0x0105, blocks: (B:25:0x0051, B:70:0x0056, B:72:0x006c, B:73:0x0077, B:28:0x0086, B:30:0x008e, B:31:0x0096, B:33:0x009a, B:47:0x00c2, B:49:0x00e2, B:50:0x00eb, B:55:0x00f4, B:56:0x00f6, B:57:0x00e5, B:65:0x00f7, B:67:0x00fa, B:68:0x0104, B:76:0x007b, B:77:0x0085, B:36:0x00a9, B:44:0x00b2, B:59:0x00c0), top: B:24:0x0051, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzau() throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzau():void");
    }

    public void zzav(long j) {
        this.zzah = j;
        while (!this.zzk.isEmpty() && j >= ((zzsd) this.zzk.peek()).zzb) {
            zzaL((zzsd) this.zzk.poll());
            zzak();
        }
    }

    public void zzaw(zzht zzhtVar) throws zzil {
    }

    public void zzax(zzam zzamVar) throws zzil {
    }

    public final void zzay() {
        try {
            zzrw zzrwVar = this.zzt;
            if (zzrwVar != null) {
                zzrwVar.zzl();
                this.zza.zzb++;
                zzah(this.zzA.zza);
            }
        } finally {
            this.zzt = null;
            this.zzo = null;
            this.zzaj = null;
            zzaA();
        }
    }

    public void zzaz() {
        zzaJ();
        zzaK();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzY = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlt
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzw() {
        this.zzm = null;
        zzaL(zzsd.zza);
        this.zzk.clear();
        zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzx(boolean z, boolean z2) throws zzil {
        this.zza = new zzid();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzy(long j, boolean z) throws zzil {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzS = false;
            this.zzl.zzb();
        } else {
            zzaB();
        }
        zzfh zzfhVar = this.zzag.zze;
        if (zzfhVar.zza() > 0) {
            this.zzaf = true;
        }
        zzfhVar.zze();
        this.zzk.clear();
    }
}
