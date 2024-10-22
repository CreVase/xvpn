package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzada implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzacz
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzada(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzabp zzp;
    private zzacs zzq;
    private zzacm zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i = zzfk.zza;
        Charset charset = zzfsi.zzc;
        zzd = "#!AMR\n".getBytes(charset);
        zze = "#!AMR-WB\n".getBytes(charset);
        zzf = iArr[8];
    }

    public zzada(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043 A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(com.google.android.gms.internal.ads.zzabn r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r13.zzk
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto Lc
            goto L5a
        Lc:
            r14.zzj()     // Catch: java.io.EOFException -> Lb0
            byte[] r2 = r13.zzg     // Catch: java.io.EOFException -> Lb0
            r6 = r14
            com.google.android.gms.internal.ads.zzabc r6 = (com.google.android.gms.internal.ads.zzabc) r6     // Catch: java.io.EOFException -> Lb0
            r6.zzm(r2, r5, r4, r5)     // Catch: java.io.EOFException -> Lb0
            byte[] r2 = r13.zzg     // Catch: java.io.EOFException -> Lb0
            r2 = r2[r5]     // Catch: java.io.EOFException -> Lb0
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto L9f
            int r1 = r2 >> 3
            boolean r2 = r13.zzh     // Catch: java.io.EOFException -> Lb0
            r1 = r1 & 15
            if (r2 == 0) goto L31
            r6 = 10
            if (r1 < r6) goto L3c
            r6 = 13
            if (r1 <= r6) goto L31
            goto L3c
        L31:
            if (r2 != 0) goto L7f
            r6 = 12
            if (r1 < r6) goto L3c
            r6 = 14
            if (r1 > r6) goto L3c
            goto L7f
        L3c:
            if (r2 == 0) goto L43
            int[] r0 = com.google.android.gms.internal.ads.zzada.zzc     // Catch: java.io.EOFException -> Lb0
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lb0
            goto L47
        L43:
            int[] r0 = com.google.android.gms.internal.ads.zzada.zzb     // Catch: java.io.EOFException -> Lb0
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lb0
        L47:
            r2 = r0
            r13.zzj = r2     // Catch: java.io.EOFException -> Lb0
            r13.zzk = r2
            int r0 = r13.zzm
            if (r0 != r3) goto L53
            r13.zzm = r2
            r0 = r2
        L53:
            if (r0 != r2) goto L5a
            int r0 = r13.zzn
            int r0 = r0 + r4
            r13.zzn = r0
        L5a:
            com.google.android.gms.internal.ads.zzacs r0 = r13.zzq
            int r14 = com.google.android.gms.internal.ads.zzacq.zza(r0, r14, r2, r4)
            if (r14 != r3) goto L63
            return r3
        L63:
            int r0 = r13.zzk
            int r0 = r0 - r14
            r13.zzk = r0
            if (r0 <= 0) goto L6b
            return r5
        L6b:
            com.google.android.gms.internal.ads.zzacs r6 = r13.zzq
            long r7 = r13.zzi
            r9 = 1
            int r10 = r13.zzj
            r11 = 0
            r12 = 0
            r6.zzt(r7, r9, r10, r11, r12)
            long r0 = r13.zzi
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r2
            r13.zzi = r0
            return r5
        L7f:
            java.lang.String r14 = "WB"
            java.lang.String r5 = "NB"
            if (r4 == r2) goto L86
            r14 = r5
        L86:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb0
            r2.<init>(r0)     // Catch: java.io.EOFException -> Lb0
            r2.append(r14)     // Catch: java.io.EOFException -> Lb0
            java.lang.String r14 = " frame type "
            r2.append(r14)     // Catch: java.io.EOFException -> Lb0
            r2.append(r1)     // Catch: java.io.EOFException -> Lb0
            java.lang.String r14 = r2.toString()     // Catch: java.io.EOFException -> Lb0
            com.google.android.gms.internal.ads.zzcc r14 = com.google.android.gms.internal.ads.zzcc.zza(r14, r7)     // Catch: java.io.EOFException -> Lb0
            throw r14     // Catch: java.io.EOFException -> Lb0
        L9f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb0
            r14.<init>(r1)     // Catch: java.io.EOFException -> Lb0
            r14.append(r2)     // Catch: java.io.EOFException -> Lb0
            java.lang.String r14 = r14.toString()     // Catch: java.io.EOFException -> Lb0
            com.google.android.gms.internal.ads.zzcc r14 = com.google.android.gms.internal.ads.zzcc.zza(r14, r7)     // Catch: java.io.EOFException -> Lb0
            throw r14     // Catch: java.io.EOFException -> Lb0
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzada.zza(com.google.android.gms.internal.ads.zzabn):int");
    }

    private static boolean zzf(zzabn zzabnVar, byte[] bArr) throws IOException {
        zzabnVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzabc) zzabnVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzabn zzabnVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzabnVar, bArr)) {
            this.zzh = false;
            ((zzabc) zzabnVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzabnVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzabc) zzabnVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        String str;
        int i;
        zzdx.zzb(this.zzq);
        int i2 = zzfk.zza;
        if (zzabnVar.zzf() == 0 && !zzg(zzabnVar)) {
            throw zzcc.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            if (true != z) {
                str = "audio/3gpp";
            } else {
                str = "audio/amr-wb";
            }
            if (true != z) {
                i = 8000;
            } else {
                i = 16000;
            }
            zzacs zzacsVar = this.zzq;
            zzak zzakVar = new zzak();
            zzakVar.zzU(str);
            zzakVar.zzN(zzf);
            zzakVar.zzy(1);
            zzakVar.zzV(i);
            zzacsVar.zzl(zzakVar.zzac());
        }
        int zza2 = zza(zzabnVar);
        if (this.zzl) {
            return zza2;
        }
        zzacl zzaclVar = new zzacl(-9223372036854775807L, 0L);
        this.zzr = zzaclVar;
        this.zzp.zzO(zzaclVar);
        this.zzl = true;
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzp = zzabpVar;
        this.zzq = zzabpVar.zzw(0, 1);
        zzabpVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        return zzg(zzabnVar);
    }

    public zzada() {
        this(0);
    }
}
