package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzacd {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public final String zzg;

    private zzacd(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = f;
        this.zzg = str;
    }

    public static zzacd zza(zzfb zzfbVar) throws zzcc {
        List singletonList;
        int i;
        int i2;
        int i3;
        try {
            zzfbVar.zzH(21);
            int zzl = zzfbVar.zzl() & 3;
            int zzl2 = zzfbVar.zzl();
            int zzc = zzfbVar.zzc();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < zzl2; i6++) {
                zzfbVar.zzH(1);
                int zzp = zzfbVar.zzp();
                for (int i7 = 0; i7 < zzp; i7++) {
                    int zzp2 = zzfbVar.zzp();
                    i5 += zzp2 + 4;
                    zzfbVar.zzH(zzp2);
                }
            }
            zzfbVar.zzG(zzc);
            byte[] bArr = new byte[i5];
            String str = null;
            int i8 = 0;
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            float f = 1.0f;
            while (i8 < zzl2) {
                int zzl3 = zzfbVar.zzl() & 63;
                int zzp3 = zzfbVar.zzp();
                int i15 = 0;
                while (i15 < zzp3) {
                    int zzp4 = zzfbVar.zzp();
                    int i16 = zzl2;
                    System.arraycopy(zzfy.zza, i4, bArr, i9, 4);
                    int i17 = i9 + 4;
                    System.arraycopy(zzfbVar.zzI(), zzfbVar.zzc(), bArr, i17, zzp4);
                    int i18 = i17 + zzp4;
                    if (zzl3 == 33 && i15 == 0) {
                        zzfv zzc2 = zzfy.zzc(bArr, i17 + 2, i18);
                        i10 = zzc2.zzg;
                        i11 = zzc2.zzh;
                        i12 = zzc2.zzj;
                        int i19 = zzc2.zzk;
                        int i20 = zzc2.zzl;
                        float f2 = zzc2.zzi;
                        i = i18;
                        i2 = zzl3;
                        i3 = zzp3;
                        str = zzdz.zzb(zzc2.zza, zzc2.zzb, zzc2.zzc, zzc2.zzd, zzc2.zze, zzc2.zzf);
                        f = f2;
                        i13 = i19;
                        i14 = i20;
                        i15 = 0;
                    } else {
                        i = i18;
                        i2 = zzl3;
                        i3 = zzp3;
                    }
                    zzfbVar.zzH(zzp4);
                    i15++;
                    zzl2 = i16;
                    i9 = i;
                    zzl3 = i2;
                    zzp3 = i3;
                    i4 = 0;
                }
                i8++;
                i4 = 0;
            }
            if (i5 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new zzacd(singletonList, zzl + 1, i10, i11, i12, i13, i14, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing HEVC config", e);
        }
    }
}
