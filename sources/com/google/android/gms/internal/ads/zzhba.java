package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhba implements zzhbc {
    private zzhbp zza;

    public static void zza(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        zzhba zzhbaVar = (zzhba) zzhbpVar;
        if (zzhbaVar.zza == null) {
            zzhbaVar.zza = zzhbpVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final Object zzb() {
        zzhbp zzhbpVar = this.zza;
        if (zzhbpVar != null) {
            return zzhbpVar.zzb();
        }
        throw new IllegalStateException();
    }
}
