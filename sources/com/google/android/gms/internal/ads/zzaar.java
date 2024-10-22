package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaar {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzaar(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = f;
        this.zzi = str;
    }

    public static zzaar zza(zzfb zzfbVar) throws zzcc {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        try {
            zzfbVar.zzH(4);
            int zzl = (zzfbVar.zzl() & 3) + 1;
            if (zzl != 3) {
                ArrayList arrayList = new ArrayList();
                int zzl2 = zzfbVar.zzl() & 31;
                for (int i6 = 0; i6 < zzl2; i6++) {
                    arrayList.add(zzb(zzfbVar));
                }
                int zzl3 = zzfbVar.zzl();
                for (int i7 = 0; i7 < zzl3; i7++) {
                    arrayList.add(zzb(zzfbVar));
                }
                if (zzl2 > 0) {
                    zzfx zze = zzfy.zze((byte[]) arrayList.get(0), zzl + 1, ((byte[]) arrayList.get(0)).length);
                    int i8 = zze.zze;
                    int i9 = zze.zzf;
                    int i10 = zze.zzh;
                    int i11 = zze.zzi;
                    int i12 = zze.zzj;
                    float f2 = zze.zzg;
                    str = zzdz.zza(zze.zza, zze.zzb, zze.zzc);
                    i4 = i11;
                    i5 = i12;
                    f = f2;
                    i = i8;
                    i2 = i9;
                    i3 = i10;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    f = 1.0f;
                }
                return new zzaar(arrayList, zzl, i, i2, i3, i4, i5, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzfb zzfbVar) {
        int zzp = zzfbVar.zzp();
        int zzc = zzfbVar.zzc();
        zzfbVar.zzH(zzp);
        return zzdz.zzc(zzfbVar.zzI(), zzc, zzp);
    }
}
