package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* loaded from: classes.dex */
final class zzefh implements zzdhf {
    private final zzcaz zza;
    private final ml1 zzb;
    private final zzfcr zzc;
    private final zzcgb zzd;
    private final zzfdn zze;
    private final zzbjl zzf;
    private final boolean zzg;
    private final zzedz zzh;

    public zzefh(zzcaz zzcazVar, ml1 ml1Var, zzfcr zzfcrVar, zzcgb zzcgbVar, zzfdn zzfdnVar, boolean z, zzbjl zzbjlVar, zzedz zzedzVar) {
        this.zza = zzcazVar;
        this.zzb = ml1Var;
        this.zzc = zzfcrVar;
        this.zzd = zzcgbVar;
        this.zze = zzfdnVar;
        this.zzg = z;
        this.zzf = zzbjlVar;
        this.zzh = zzedzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzdhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(boolean r19, android.content.Context r20, com.google.android.gms.internal.ads.zzcxy r21) {
        /*
            r18 = this;
            r0 = r18
            ml1 r1 = r0.zzb
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzfzt.zzq(r1)
            com.google.android.gms.internal.ads.zzcqg r1 = (com.google.android.gms.internal.ads.zzcqg) r1
            com.google.android.gms.internal.ads.zzcgb r2 = r0.zzd
            r3 = 1
            r2.zzan(r3)
            com.google.android.gms.ads.internal.zzj r2 = new com.google.android.gms.ads.internal.zzj
            boolean r4 = r0.zzg
            if (r4 == 0) goto L1e
            com.google.android.gms.internal.ads.zzbjl r4 = r0.zzf
            boolean r4 = r4.zze(r3)
            r5 = r4
            goto L1f
        L1e:
            r5 = 1
        L1f:
            boolean r4 = r0.zzg
            if (r4 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbjl r6 = r0.zzf
            boolean r6 = r6.zzd()
            r7 = r6
            goto L2d
        L2b:
            r6 = 0
            r7 = 0
        L2d:
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.zzbjl r4 = r0.zzf
            float r4 = r4.zza()
            r8 = r4
            goto L39
        L37:
            r4 = 0
            r8 = 0
        L39:
            r6 = 1
            r9 = -1
            com.google.android.gms.internal.ads.zzfcr r4 = r0.zzc
            boolean r11 = r4.zzQ
            r12 = 0
            r4 = r2
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r21 == 0) goto L4b
            r21.zzf()
        L4b:
            com.google.android.gms.ads.internal.zzt.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdgu r6 = r1.zzg()
            com.google.android.gms.internal.ads.zzcgb r8 = r0.zzd
            com.google.android.gms.internal.ads.zzfcr r1 = r0.zzc
            int r1 = r1.zzS
            r4 = -1
            if (r1 == r4) goto L5f
        L5d:
            r9 = r1
            goto L7c
        L5f:
            com.google.android.gms.internal.ads.zzfdn r1 = r0.zze
            com.google.android.gms.ads.internal.client.zzw r1 = r1.zzj
            if (r1 == 0) goto L72
            int r1 = r1.zza
            if (r1 != r3) goto L6c
            r1 = 7
            r9 = 7
            goto L7c
        L6c:
            r4 = 2
            if (r1 != r4) goto L72
            r1 = 6
            r9 = 6
            goto L7c
        L72:
            java.lang.String r1 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.internal.ads.zzcat.zze(r1)
            com.google.android.gms.internal.ads.zzfcr r1 = r0.zzc
            int r1 = r1.zzS
            goto L5d
        L7c:
            com.google.android.gms.internal.ads.zzcaz r10 = r0.zza
            com.google.android.gms.internal.ads.zzfcr r1 = r0.zzc
            java.lang.String r11 = r1.zzD
            com.google.android.gms.internal.ads.zzfcx r4 = r1.zzu
            java.lang.String r13 = r4.zzb
            java.lang.String r14 = r4.zza
            com.google.android.gms.internal.ads.zzfdn r4 = r0.zze
            boolean r1 = r1.zzak
            if (r1 == 0) goto L91
            com.google.android.gms.internal.ads.zzedz r1 = r0.zzh
            goto L92
        L91:
            r1 = 0
        L92:
            r17 = r1
            r5 = 0
            r7 = 0
            java.lang.String r1 = r4.zzf
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r20
            com.google.android.gms.ads.internal.overlay.zzm.zza(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefh.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzcxy):void");
    }
}
