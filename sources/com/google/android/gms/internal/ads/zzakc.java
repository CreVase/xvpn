package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.google.protobuf.v;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzakc implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzaka
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzakc()};
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzajy zzj;
    private zzabp zzk;
    private boolean zzl;
    private final zzfi zzb = new zzfi(0);
    private final zzfb zzd = new zzfb(v.DEFAULT_BUFFER_SIZE);
    private final SparseArray zzc = new SparseArray();
    private final zzajz zze = new zzajz();

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r17, com.google.android.gms.internal.ads.zzacj r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakc.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzk = zzabpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:            if (r0 != r7) goto L10;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzfi r5 = r4.zzb
            long r0 = r5.zze()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.zzc()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.zzf(r7)
        L24:
            com.google.android.gms.internal.ads.zzajy r5 = r4.zzj
            r6 = 0
            if (r5 == 0) goto L2c
            r5.zzd(r7)
        L2c:
            android.util.SparseArray r5 = r4.zzc
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.zzc
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzakb r5 = (com.google.android.gms.internal.ads.zzakb) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakc.zzd(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        byte[] bArr = new byte[14];
        zzabc zzabcVar = (zzabc) zzabnVar;
        zzabcVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzabcVar.zzl(bArr[13] & 7, false);
        zzabcVar.zzm(bArr, 0, 3, false);
        if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) != 1) {
            return false;
        }
        return true;
    }
}
