package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzwe extends zzwg {
    private final zzxy zzd;
    private final zzfvs zze;
    private final zzdy zzf;

    public zzwe(zzcx zzcxVar, int[] iArr, int i, zzxy zzxyVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdy zzdyVar) {
        super(zzcxVar, iArr, 0);
        this.zzd = zzxyVar;
        this.zze = zzfvs.zzj(list);
        this.zzf = zzdyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ zzfvs zzf(zzxj[] zzxjVarArr) {
        int i;
        int i2;
        zzfvs zzi;
        double d;
        long j;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzxj zzxjVar = zzxjVarArr[i3];
            if (zzxjVar != null && zzxjVar.zzb.length > 1) {
                zzfvp zzfvpVar = new zzfvp();
                zzfvpVar.zzf(new zzwc(0L, 0L));
                arrayList.add(zzfvpVar);
            } else {
                arrayList.add(null);
            }
            i3++;
        }
        long[][] jArr = new long[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzxj zzxjVar2 = zzxjVarArr[i4];
            if (zzxjVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzxjVar2.zzb.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzxjVar2.zzb;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j2 = zzxjVar2.zza.zzb(iArr[i5]).zzi;
                    long[] jArr2 = jArr[i4];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i5] = j2;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            if (jArr4.length == 0) {
                j = 0;
            } else {
                j = jArr4[0];
            }
            jArr3[i6] = j;
        }
        zzg(arrayList, jArr3);
        zzfwd zza = zzfww.zzc(zzfxb.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double d2 = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j3 = jArr5[i8];
                    if (j3 != -1) {
                        d2 = Math.log(j3);
                    }
                    dArr[i8] = d2;
                    i8++;
                }
                int i9 = length - 1;
                double d3 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    double d4 = dArr[i10];
                    i10++;
                    double d5 = d4 + dArr[i10];
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = ((d5 * 0.5d) - dArr[c]) / d3;
                    }
                    zza.zzq(Double.valueOf(d), Integer.valueOf(i7));
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfvs zzj = zzfvs.zzj(zza.zzr());
        for (int i11 = 0; i11 < zzj.size(); i11++) {
            int intValue = ((Integer) zzj.get(i11)).intValue();
            int i12 = iArr2[intValue] + 1;
            iArr2[intValue] = i12;
            jArr3[intValue] = jArr[intValue][i12];
            zzg(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (arrayList.get(i13) != null) {
                long j4 = jArr3[i13];
                jArr3[i13] = j4 + j4;
            }
        }
        zzg(arrayList, jArr3);
        zzfvp zzfvpVar2 = new zzfvp();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            zzfvp zzfvpVar3 = (zzfvp) arrayList.get(i14);
            if (zzfvpVar3 == null) {
                zzi = zzfvs.zzl();
            } else {
                zzi = zzfvpVar3.zzi();
            }
            zzfvpVar2.zzf(zzi);
        }
        return zzfvpVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfvp zzfvpVar = (zzfvp) list.get(i2);
            if (zzfvpVar != null) {
                zzfvpVar.zzf(new zzwc(j, jArr[i2]));
            }
        }
    }
}
