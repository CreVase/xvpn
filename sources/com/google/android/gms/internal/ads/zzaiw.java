package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zzaiw implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzaiv
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzaiw()};
        }
    };
    private final zzaix zzb = new zzaix(null);
    private final zzfb zzc = new zzfb(Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        int zza2 = zzabnVar.zza(this.zzc.zzI(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzb.zzb(zzabpVar, new zzakq(Integer.MIN_VALUE, 0, 1));
        zzabpVar.zzD();
        zzabpVar.zzO(new zzacl(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:            r16.zzj();        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:            if ((r5 - r3) >= 8192) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:            return false;     */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(com.google.android.gms.internal.ads.zzabn r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzfb r0 = new com.google.android.gms.internal.ads.zzfb
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzI()
            r5 = r16
            com.google.android.gms.internal.ads.zzabc r5 = (com.google.android.gms.internal.ads.zzabc) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzG(r2)
            int r4 = r0.zzn()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9c
            r16.zzj()
            r4 = r16
            com.google.android.gms.internal.ads.zzabc r4 = (com.google.android.gms.internal.ads.zzabc) r4
            r4.zzl(r3, r2)
            r5 = r3
        L2c:
            r1 = 0
        L2d:
            byte[] r6 = r0.zzI()
            r8 = 7
            r4.zzm(r6, r2, r8, r2)
            r0.zzG(r2)
            int r6 = r0.zzp()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L56
            if (r6 == r10) goto L56
            r16.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r6) goto L55
            r4.zzl(r5, r2)
            goto L2c
        L55:
            return r2
        L56:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L5c
            return r9
        L5c:
            byte[] r9 = r0.zzI()
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L66
            r12 = -1
            goto L93
        L66:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r14 = r9[r7]
            int r12 = r12 << 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8d
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r12 << 8
            r14 = 6
            r9 = r9[r14]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = r11 | r12
            r12 = r11 | r9
            goto L8e
        L8d:
            r8 = 4
        L8e:
            if (r6 != r10) goto L92
            int r8 = r8 + 2
        L92:
            int r12 = r12 + r8
        L93:
            if (r12 != r13) goto L96
            return r2
        L96:
            int r12 = r12 + (-7)
            r4.zzl(r12, r2)
            goto L2d
        L9c:
            r0.zzH(r7)
            int r4 = r0.zzk()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiw.zze(com.google.android.gms.internal.ads.zzabn):boolean");
    }
}
