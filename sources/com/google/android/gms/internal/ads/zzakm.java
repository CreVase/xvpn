package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzakm implements zzabm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzakj
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzakm(0)};
        }
    };
    private final List zzb;
    private final zzfb zzc;
    private final SparseIntArray zzd;
    private final zzakp zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzaki zzi;
    private zzakh zzj;
    private zzabp zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzakm() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b3, code lost:            if (r1 == false) goto L95;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r19, com.google.android.gms.internal.ads.zzacj r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzk = zzabpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        zzakh zzakhVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzfi zzfiVar = (zzfi) this.zzb.get(i);
            if (zzfiVar.zze() != -9223372036854775807L) {
                long zzc = zzfiVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j2) {
                        }
                    }
                }
            }
            zzfiVar.zzf(j2);
        }
        if (j2 != 0 && (zzakhVar = this.zzj) != null) {
            zzakhVar.zzd(j2);
        }
        this.zzc.zzD(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            ((zzakr) this.zzf.valueAt(i2)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:            r1 = r1 + 1;     */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(com.google.android.gms.internal.ads.zzabn r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfb r0 = r6.zzc
            byte[] r0 = r0.zzI()
            com.google.android.gms.internal.ads.zzabc r7 = (com.google.android.gms.internal.ads.zzabc) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zze(com.google.android.gms.internal.ads.zzabn):boolean");
    }

    public zzakm(int i) {
        this(1, new zzfi(0L), new zzajb(0), 112800);
    }

    public zzakm(int i, zzfi zzfiVar, zzakp zzakpVar, int i2) {
        this.zze = zzakpVar;
        this.zzb = Collections.singletonList(zzfiVar);
        this.zzc = new zzfb(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzaki(112800);
        this.zzk = zzabp.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.zzf.put(sparseArray2.keyAt(i3), (zzakr) sparseArray2.valueAt(i3));
        }
        this.zzf.put(0, new zzake(new zzakk(this)));
    }
}
