package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzqa implements zzqb {
    private static final zzgn<Boolean> zza;
    private static final zzgn<Boolean> zzb;

    static {
        zzgv zza2 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.sfmc.client", true);
        zzb = zza2.zza("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqb
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqb
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
