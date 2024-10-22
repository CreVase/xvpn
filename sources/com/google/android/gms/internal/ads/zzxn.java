package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzxn extends zzxq {
    private zzxm zza;

    public abstract Pair zzb(zzxm zzxmVar, int[][][] iArr, int[] iArr2, zztw zztwVar, zzcv zzcvVar) throws zzil;

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxr zzo(zzlt[] zzltVarArr, zzvx zzvxVar, zztw zztwVar, zzcv zzcvVar) throws zzil {
        boolean z;
        boolean z2;
        zzfvs zzl;
        int[] iArr;
        boolean z3;
        int[] iArr2 = new int[3];
        zzcx[][] zzcxVarArr = new zzcx[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzvxVar.zzc;
            zzcxVarArr[i] = new zzcx[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzltVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzvxVar.zzc) {
            zzcx zzb = zzvxVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z4 = true;
            while (i7 < i3) {
                zzlt zzltVar = zzltVarArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, zzltVar.zzV(zzb.zzb(i11)) & 7);
                }
                if (iArr2[i7] == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i10 <= i9) {
                    if (i10 == i9 && i6 == 5 && !z4 && z3) {
                        i8 = i7;
                        i9 = i10;
                        z4 = true;
                    }
                } else {
                    z4 = z3;
                    i8 = i7;
                    i9 = i10;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                zzlt zzltVar2 = zzltVarArr[i8];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zzltVar2.zzV(zzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            zzcxVarArr[i8][i13] = zzb;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzvx[] zzvxVarArr = new zzvx[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zzvxVarArr[i14] = new zzvx((zzcx[]) zzfk.zzJ(zzcxVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzfk.zzJ(iArr3[i14], i15);
            strArr[i14] = zzltVarArr[i14].zzR();
            iArr6[i14] = zzltVarArr[i14].zzb();
            i14++;
            i3 = 2;
        }
        zzxm zzxmVar = new zzxm(strArr, iArr6, zzvxVarArr, iArr4, iArr3, new zzvx((zzcx[]) zzfk.zzJ(zzcxVarArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzxmVar, iArr3, iArr4, zztwVar, zzcvVar);
        zzxo[] zzxoVarArr = (zzxo[]) zzb2.second;
        List[] listArr = new List[zzxoVarArr.length];
        for (int i16 = 0; i16 < zzxoVarArr.length; i16++) {
            zzxo zzxoVar = zzxoVarArr[i16];
            if (zzxoVar != null) {
                zzl = zzfvs.zzm(zzxoVar);
            } else {
                zzl = zzfvs.zzl();
            }
            listArr[i16] = zzl;
        }
        zzfvp zzfvpVar = new zzfvp();
        for (int i17 = 0; i17 < 2; i17++) {
            zzvx zzd = zzxmVar.zzd(i17);
            List list = listArr[i17];
            for (int i18 = 0; i18 < zzd.zzc; i18++) {
                zzcx zzb3 = zzd.zzb(i18);
                if (zzxmVar.zza(i17, i18, false) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i19 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr7[i20] = zzxmVar.zzb(i17, i18, i20) & 7;
                    int i21 = 0;
                    while (true) {
                        if (i21 < list.size()) {
                            zzxo zzxoVar2 = (zzxo) list.get(i21);
                            if (zzxoVar2.zze().equals(zzb3) && zzxoVar2.zzb(i20) != -1) {
                                z2 = true;
                                break;
                            }
                            i21++;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    zArr[i20] = z2;
                }
                zzfvpVar.zzf(new zzdf(zzb3, z, iArr7, zArr));
            }
        }
        zzvx zze = zzxmVar.zze();
        for (int i22 = 0; i22 < zze.zzc; i22++) {
            zzcx zzb4 = zze.zzb(i22);
            int i23 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfvpVar.zzf(new zzdf(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzxr((zzlu[]) zzb2.first, (zzxk[]) zzb2.second, new zzdg(zzfvpVar.zzi()), zzxmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzp(Object obj) {
        this.zza = (zzxm) obj;
    }
}
