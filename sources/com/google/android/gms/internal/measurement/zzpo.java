package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzpo implements zzpp {
    private static final zzgn<Boolean> zza;
    private static final zzgn<Long> zzb;

    static {
        zzgv zza2 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.remove_app_background.client", false);
        zzb = zza2.zza("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpp
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpp
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
