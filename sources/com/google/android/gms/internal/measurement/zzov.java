package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzov implements zzos {
    private static final zzgn<Boolean> zza;
    private static final zzgn<Boolean> zzb;
    private static final zzgn<Long> zzc;

    static {
        zzgv zza2 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.item_scoped_custom_parameters.client", true);
        zzb = zza2.zza("measurement.item_scoped_custom_parameters.service", false);
        zzc = zza2.zza("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzos
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzos
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzos
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
