package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class zzagc implements zzage {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzagl zzc = new zzagl();
    private zzagd zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzabn zzabnVar, int i) throws IOException {
        ((zzabc) zzabnVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final void zza(zzagd zzagdVar) {
        this.zzd = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0097, code lost:            if (r0 == 1) goto L34;     */
    @Override // com.google.android.gms.internal.ads.zzage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzabn r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzc(com.google.android.gms.internal.ads.zzabn):boolean");
    }
}
