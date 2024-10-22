package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzahm implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzahi
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzahm(0, null)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzabp zzD;
    private zzacs[] zzE;
    private zzacs[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private final zzfb zzh;
    private final byte[] zzi;
    private final zzfb zzj;
    private final zzaek zzk;
    private final zzfb zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzfb zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzahl zzy;
    private int zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzU("application/x-emsg");
        zzc = zzakVar.zzac();
    }

    public zzahm() {
        this(0, null);
    }

    private static int zza(int i) throws zzcc {
        if (i >= 0) {
            return i;
        }
        throw zzcc.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzad zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r2
        L8:
            if (r3 >= r0) goto Laa
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzagx r5 = (com.google.android.gms.internal.ads.zzagx) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto La6
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.zzfb r5 = r5.zza
            byte[] r5 = r5.zzI()
            com.google.android.gms.internal.ads.zzfb r6 = new com.google.android.gms.internal.ads.zzfb
            r6.<init>(r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L32
            goto L7e
        L32:
            r6.zzG(r1)
            int r8 = r6.zzf()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L42
            goto L7e
        L42:
            int r8 = r6.zzf()
            if (r8 == r7) goto L49
            goto L7e
        L49:
            int r7 = r6.zzf()
            int r7 = com.google.android.gms.internal.ads.zzagy.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L5c
            java.lang.String r6 = "Unsupported pssh version: "
            java.lang.String r8 = "PsshAtomUtil"
            defpackage.p71.y(r6, r7, r8)
            goto L7e
        L5c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzs()
            long r12 = r6.zzs()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L74
            int r8 = r6.zzo()
            int r8 = r8 * 16
            r6.zzH(r8)
        L74:
            int r8 = r6.zzo()
            int r10 = r6.zza()
            if (r8 == r10) goto L80
        L7e:
            r6 = r2
            goto L8a
        L80:
            byte[] r10 = new byte[r8]
            r6.zzC(r10, r1, r8)
            com.google.android.gms.internal.ads.zzahs r6 = new com.google.android.gms.internal.ads.zzahs
            r6.<init>(r9, r7, r10)
        L8a:
            if (r6 != 0) goto L8e
            r6 = r2
            goto L92
        L8e:
            java.util.UUID r6 = com.google.android.gms.internal.ads.zzahs.zza(r6)
        L92:
            if (r6 != 0) goto L9c
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzer.zzf(r5, r6)
            goto La6
        L9c:
            com.google.android.gms.internal.ads.zzac r7 = new com.google.android.gms.internal.ads.zzac
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        La6:
            int r3 = r3 + 1
            goto L8
        Laa:
            if (r4 != 0) goto Lad
            return r2
        Lad:
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzf(java.util.List):com.google.android.gms.internal.ads.zzad");
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzfb zzfbVar, int i, zzahx zzahxVar) throws zzcc {
        boolean z;
        zzfbVar.zzG(i + 8);
        int zzf = zzfbVar.zzf() & 16777215;
        if ((zzf & 1) == 0) {
            if ((zzf & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int zzo = zzfbVar.zzo();
            if (zzo == 0) {
                Arrays.fill(zzahxVar.zzl, 0, zzahxVar.zze, false);
                return;
            }
            int i2 = zzahxVar.zze;
            if (zzo == i2) {
                Arrays.fill(zzahxVar.zzl, 0, zzo, z);
                zzahxVar.zza(zzfbVar.zza());
                zzfb zzfbVar2 = zzahxVar.zzn;
                zzfbVar.zzC(zzfbVar2.zzI(), 0, zzfbVar2.zzd());
                zzahxVar.zzn.zzG(0);
                zzahxVar.zzo = false;
                return;
            }
            throw zzcc.zza("Senc sample count " + zzo + " is different from fragment sample count" + i2, null);
        }
        throw zzcc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0315, code lost:            if (com.google.android.gms.internal.ads.zzfk.zzr(r35, 1000000, r5.zzd) < r5.zze) goto L120;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzi(long r46) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzi(long):void");
    }

    private static final zzahh zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzahh) sparseArray.valueAt(0);
        }
        zzahh zzahhVar = (zzahh) sparseArray.get(i);
        zzahhVar.getClass();
        return zzahhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0165, code lost:            if (r0.zzA >= r0.zzz) goto L336;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0167, code lost:            r12 = r0.zzB;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x016b, code lost:            if (r12 != 0) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016d, code lost:            ((com.google.android.gms.internal.ads.zzabc) r1).zzn(r10, r5, r11, r8);        r0.zzg.zzG(r8);        r12 = r0.zzg.zzf();     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017e, code lost:            if (r12 <= 0) goto L337;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0180, code lost:            r0.zzB = r12 - 1;        r0.zzf.zzG(r8);        r9.zzr(r0.zzf, 4);        r9.zzr(r0.zzg, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0197, code lost:            if (r0.zzF.length <= 0) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0199, code lost:            r8 = r3.zzf.zzm;        r12 = r10[4];        r16 = com.google.android.gms.internal.ads.zzfy.zza;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a7, code lost:            if ("video/avc".equals(r8) == false) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ab, code lost:            if ((r12 & 31) == r4) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ba, code lost:            r6 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bd, code lost:            r0.zzC = r6;        r0.zzA += 5;        r0.zzz += r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022e, code lost:            r8 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b1, code lost:            if ("video/hevc".equals(r8) == false) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b8, code lost:            if (((r12 & 126) >> r7) != 39) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bc, code lost:            r6 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d2, code lost:            throw com.google.android.gms.internal.ads.zzcc.zza("Invalid NAL length", null);     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d5, code lost:            if (r0.zzC == false) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d7, code lost:            r0.zzh.zzD(r12);        ((com.google.android.gms.internal.ads.zzabc) r1).zzn(r0.zzh.zzI(), 0, r0.zzB, false);        r9.zzr(r0.zzh, r0.zzB);        r4 = r0.zzB;        r6 = r0.zzh;        r6 = com.google.android.gms.internal.ads.zzfy.zzb(r6.zzI(), r6.zzd());        r0.zzh.zzG("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);        r0.zzh.zzF(r6);        com.google.android.gms.internal.ads.zzaaz.zza(r14, r0.zzh, r0.zzF);     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0221, code lost:            r0.zzA += r4;        r0.zzB -= r4;        r4 = 6;        r7 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021c, code lost:            r4 = r9.zzf(r1, r12, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:            r4 = 6;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:            if (r0.zzo != 3) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:            r3 = r2.zzb();        r0.zzz = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:            if (r2.zzf >= r2.zzi) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:            ((com.google.android.gms.internal.ads.zzabc) r1).zzo(r3, false);        r1 = r2.zzf();     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:            if (r1 != null) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:            r3 = r2.zzb.zzn;        r1 = r1.zzd;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:            if (r1 == 0) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:            r3.zzH(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:            if (r2.zzb.zzb(r2.zzf) == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:            r3.zzH(r3.zzp() * 6);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:            if (r2.zzk() != false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:            r0.zzy = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:            r0.zzo = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:            if (r2.zzd.zza.zzg != 1) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e6, code lost:            r0.zzz = r3 - 8;        ((com.google.android.gms.internal.ads.zzabc) r1).zzo(8, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:            if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0102, code lost:            r0.zzA = r2.zzc(r0.zzz, 7);        com.google.android.gms.internal.ads.zzaaq.zzb(r0.zzz, r0.zzj);        r2.zza.zzr(r0.zzj, 7);        r3 = r0.zzA + 7;        r0.zzA = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:            r0.zzz += r3;        r0.zzo = 4;        r0.zzB = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:            r3 = r2.zzc(r0.zzz, 0);        r0.zzA = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0131, code lost:            r3 = r2.zzd.zza;        r9 = r2.zza;        r14 = r2.zze();        r5 = r3.zzj;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013d, code lost:            if (r5 != 0) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:            r3 = r0.zzA;        r4 = r0.zzz;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:            if (r3 >= r4) goto L331;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0145, code lost:            r0.zzA += r9.zzf(r1, r4 - r3, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0232, code lost:            r12 = r2.zza();        r1 = r2.zzf();     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x023a, code lost:            if (r1 == null) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023c, code lost:            r1 = r1.zzc;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0240, code lost:            r9.zzt(r14, r12, r0.zzz, 0, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0250, code lost:            if (r0.zzn.isEmpty() != false) goto L332;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0252, code lost:            r1 = (com.google.android.gms.internal.ads.zzahk) r0.zzn.removeFirst();        r0.zzu -= r1.zzc;        r6 = r1.zza;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0265, code lost:            if (r1.zzb == false) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0267, code lost:            r6 = r6 + r14;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0268, code lost:            r3 = r0.zzE;        r15 = r3.length;        r14 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x026d, code lost:            if (r14 >= r15) goto L335;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x026f, code lost:            r3[r14].zzt(r6, 1, r1.zzc, r0.zzu, null);        r14 = r14 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0287, code lost:            if (r2.zzk() != false) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0289, code lost:            r0.zzy = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x028c, code lost:            r0.zzo = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028f, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023f, code lost:            r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0150, code lost:            r10 = r0.zzg.zzI();        r10[0] = 0;        r10[1] = 0;        r10[2] = 0;        r11 = r5 + 1;        r5 = 4 - r5;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r29, com.google.android.gms.internal.ads.zzacj r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzD = zzabpVar;
        zzg();
        zzacs[] zzacsVarArr = new zzacs[2];
        this.zzE = zzacsVarArr;
        int i = 0;
        zzacs[] zzacsVarArr2 = (zzacs[]) zzfk.zzJ(zzacsVarArr, 0);
        this.zzE = zzacsVarArr2;
        for (zzacs zzacsVar : zzacsVarArr2) {
            zzacsVar.zzl(zzc);
        }
        this.zzF = new zzacs[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzacs zzw = this.zzD.zzw(i2, 3);
            zzw.zzl((zzam) this.zzd.get(i));
            this.zzF[i] = zzw;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzahl) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        return zzahu.zza(zzabnVar);
    }

    public zzahm(int i, zzfi zzfiVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzaek();
        this.zzl = new zzfb(16);
        this.zzf = new zzfb(zzfy.zza);
        this.zzg = new zzfb(5);
        this.zzh = new zzfb();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzfb(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzabp.zza;
        this.zzE = new zzacs[0];
        this.zzF = new zzacs[0];
    }
}
