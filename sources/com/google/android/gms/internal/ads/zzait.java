package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzait implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzais
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzait()};
        }
    };
    private final zzaiu zzb = new zzaiu(null);
    private final zzfb zzc = new zzfb(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        int zza2 = zzabnVar.zza(this.zzc.zzI(), 0, 2786);
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:            r9.zzj();        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:            if ((r5 - r3) >= 8192) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:            return false;     */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(com.google.android.gms.internal.ads.zzabn r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfb r0 = new com.google.android.gms.internal.ads.zzfb
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzI()
            r5 = r9
            com.google.android.gms.internal.ads.zzabc r5 = (com.google.android.gms.internal.ads.zzabc) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzG(r2)
            int r4 = r0.zzn()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.zzj()
            r4 = r9
            com.google.android.gms.internal.ads.zzabc r4 = (com.google.android.gms.internal.ads.zzabc) r4
            r4.zzl(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.zzI()
            r7 = 6
            r4.zzm(r6, r2, r7, r2)
            r0.zzG(r2)
            int r6 = r0.zzp()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r6) goto L4c
            r4.zzl(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.zzI()
            int r6 = com.google.android.gms.internal.ads.zzaan.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.zzl(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.zzH(r4)
            int r4 = r0.zzk()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzait.zze(com.google.android.gms.internal.ads.zzabn):boolean");
    }
}
