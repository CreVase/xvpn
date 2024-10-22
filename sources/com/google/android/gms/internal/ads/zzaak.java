package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaak {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzaaj zza(byte[] bArr) throws zzcc {
        return zzb(new zzfa(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:            if (r11 != 3) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzaaj zzb(com.google.android.gms.internal.ads.zzfa r11, boolean r12) throws com.google.android.gms.internal.ads.zzcc {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.String r4 = "mp4a.40."
            java.lang.String r4 = defpackage.hx2.m(r4, r0)
            r5 = 5
            r6 = 22
            if (r0 == r5) goto L1c
            r5 = 29
            if (r0 != r5) goto L2a
        L1c:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r6) goto L2a
            int r3 = r11.zzd(r2)
        L2a:
            if (r12 == 0) goto Lc4
            r12 = 17
            r5 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L57
            if (r0 == r8) goto L57
            if (r0 == r9) goto L57
            if (r0 == r2) goto L57
            if (r0 == r5) goto L57
            r2 = 7
            if (r0 == r2) goto L57
            if (r0 == r12) goto L57
            switch(r0) {
                case 19: goto L57;
                case 20: goto L57;
                case 21: goto L57;
                case 22: goto L57;
                case 23: goto L57;
                default: goto L44;
            }
        L44:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported audio object type: "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.zzc(r11)
            throw r11
        L57:
            boolean r2 = r11.zzn()
            if (r2 == 0) goto L64
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzer.zzf(r2, r10)
        L64:
            boolean r2 = r11.zzn()
            if (r2 == 0) goto L6f
            r2 = 14
            r11.zzl(r2)
        L6f:
            boolean r2 = r11.zzn()
            if (r3 == 0) goto Lbe
            r10 = 20
            if (r0 == r5) goto L7d
            if (r0 != r10) goto L80
            r0 = 20
        L7d:
            r11.zzl(r9)
        L80:
            if (r2 == 0) goto L9d
            if (r0 != r6) goto L8a
            r2 = 16
            r11.zzl(r2)
            goto L8b
        L8a:
            r6 = r0
        L8b:
            if (r6 == r12) goto L97
            r12 = 19
            if (r6 == r12) goto L97
            if (r6 == r10) goto L97
            r12 = 23
            if (r6 != r12) goto L9a
        L97:
            r11.zzl(r9)
        L9a:
            r11.zzl(r7)
        L9d:
            switch(r0) {
                case 17: goto La1;
                case 18: goto La0;
                case 19: goto La1;
                case 20: goto La1;
                case 21: goto La1;
                case 22: goto La1;
                case 23: goto La1;
                default: goto La0;
            }
        La0:
            goto Lc4
        La1:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto Laa
            if (r11 == r9) goto Lab
            goto Lc4
        Laa:
            r9 = r11
        Lab:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported epConfig: "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.zzc(r11)
            throw r11
        Lbe:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Lc4:
            int[] r11 = com.google.android.gms.internal.ads.zzaak.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Ld2
            com.google.android.gms.internal.ads.zzaaj r12 = new com.google.android.gms.internal.ads.zzaaj
            r12.<init>(r1, r11, r4, r0)
            return r12
        Ld2:
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaak.zzb(com.google.android.gms.internal.ads.zzfa, boolean):com.google.android.gms.internal.ads.zzaaj");
    }

    private static int zzc(zzfa zzfaVar) {
        int zzd = zzfaVar.zzd(5);
        if (zzd == 31) {
            return zzfaVar.zzd(6) + 32;
        }
        return zzd;
    }

    private static int zzd(zzfa zzfaVar) throws zzcc {
        int zzd = zzfaVar.zzd(4);
        if (zzd == 15) {
            if (zzfaVar.zza() >= 24) {
                return zzfaVar.zzd(24);
            }
            throw zzcc.zza("AAC header insufficient data", null);
        }
        if (zzd < 13) {
            return zzb[zzd];
        }
        throw zzcc.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
