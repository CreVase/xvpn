package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzate extends zzaud {
    public zzate(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", zzaomVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            this.zze.zzm(iArr[0]);
            this.zze.zzl(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzk(i);
            }
        }
    }
}
