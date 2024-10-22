package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzsz implements zzup {
    private final zzabt zza;
    private zzabm zzb;
    private zzabn zzc;

    public zzsz(zzabt zzabtVar) {
        this.zza = zzabtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final int zza(zzacj zzacjVar) throws IOException {
        zzabm zzabmVar = this.zzb;
        zzabmVar.getClass();
        zzabn zzabnVar = this.zzc;
        zzabnVar.getClass();
        return zzabmVar.zzb(zzabnVar, zzacjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzb() {
        zzabn zzabnVar = this.zzc;
        if (zzabnVar != null) {
            return zzabnVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzc() {
        zzabm zzabmVar = this.zzb;
        if (zzabmVar != null && (zzabmVar instanceof zzagr)) {
            ((zzagr) zzabmVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:            if (r6.zzf() != r11) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0062, code lost:            if (r6.zzf() != r11) goto L33;     */
    @Override // com.google.android.gms.internal.ads.zzup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzt r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzabp r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzabc r6 = new com.google.android.gms.internal.ads.zzabc
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzabm r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzabt r8 = r7.zza
            com.google.android.gms.internal.ads.zzabm[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L21
            r8 = r8[r13]
            r7.zzb = r8
            goto La8
        L21:
            r0 = 0
        L22:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.zze(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.zzb = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            com.google.android.gms.internal.ads.zzdx.zzf(r14)
            r6.zzj()
            goto L71
        L35:
            com.google.android.gms.internal.ads.zzabm r1 = r7.zzb
            if (r1 != 0) goto L67
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L42:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzabm r9 = r7.zzb
            if (r9 != 0) goto L4f
            long r9 = r6.zzf()
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L50
        L4f:
            r13 = 1
        L50:
            com.google.android.gms.internal.ads.zzdx.zzf(r13)
            r6.zzj()
            throw r8
        L57:
            com.google.android.gms.internal.ads.zzabm r1 = r7.zzb
            if (r1 != 0) goto L67
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            com.google.android.gms.internal.ads.zzdx.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L22
        L71:
            com.google.android.gms.internal.ads.zzabm r10 = r7.zzb
            if (r10 != 0) goto La8
            com.google.android.gms.internal.ads.zzvy r10 = new com.google.android.gms.internal.ads.zzvy
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L7c:
            int r12 = r8.length
            if (r13 >= r12) goto L98
            r14 = r8[r13]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r11.append(r14)
            int r12 = r12 + (-1)
            if (r13 >= r12) goto L95
            java.lang.String r12 = ", "
            r11.append(r12)
        L95:
            int r13 = r13 + 1
            goto L7c
        L98:
            java.lang.String r8 = r11.toString()
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = defpackage.hx2.q(r11, r8, r12)
            r10.<init>(r8, r9)
            throw r10
        La8:
            com.google.android.gms.internal.ads.zzabm r8 = r7.zzb
            r8.zzc(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzd(com.google.android.gms.internal.ads.zzt, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzabp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzf(long j, long j2) {
        zzabm zzabmVar = this.zzb;
        zzabmVar.getClass();
        zzabmVar.zzd(j, j2);
    }
}
