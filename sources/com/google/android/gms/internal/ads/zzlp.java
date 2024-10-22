package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlp extends zzhu {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcv[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzlp(java.util.Collection r7, com.google.android.gms.internal.ads.zzvr r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzcv[] r0 = new com.google.android.gms.internal.ads.zzcv[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = 0
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzky r4 = (com.google.android.gms.internal.ads.zzky) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzcv r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzky r3 = (com.google.android.gms.internal.ads.zzky) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlp.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzvr):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final int zzq(int i) {
        return zzfk.zzb(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final int zzr(int i) {
        return zzfk.zzb(this.zzg, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final int zzs(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final int zzt(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final zzcv zzu(int i) {
        return this.zzh[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final Object zzv(int i) {
        return this.zzi[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzlp zzx(zzvr zzvrVar) {
        zzcv[] zzcvVarArr = new zzcv[this.zzh.length];
        int i = 0;
        while (true) {
            zzcv[] zzcvVarArr2 = this.zzh;
            if (i < zzcvVarArr2.length) {
                zzcvVarArr[i] = new zzlo(this, zzcvVarArr2[i]);
                i++;
            } else {
                return new zzlp(zzcvVarArr, this.zzi, zzvrVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlp(zzcv[] zzcvVarArr, Object[] objArr, zzvr zzvrVar) {
        super(false, zzvrVar);
        int i = 0;
        this.zzh = zzcvVarArr;
        int length = zzcvVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzcvVarArr.length) {
            zzcv zzcvVar = zzcvVarArr[i];
            this.zzh[i4] = zzcvVar;
            this.zzg[i4] = i2;
            this.zzf[i4] = i3;
            i2 += zzcvVar.zzc();
            i3 += this.zzh[i4].zzb();
            this.zzj.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.zzd = i2;
        this.zze = i3;
    }
}
