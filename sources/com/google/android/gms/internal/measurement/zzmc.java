package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzmc extends zzma<zzlz, zzlz> {
    @Override // com.google.android.gms.internal.measurement.zzma
    public final boolean zza(zzlc zzlcVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ int zzb(zzlz zzlzVar) {
        return zzlzVar.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz zzc(Object obj) {
        zzlz zzlzVar = ((zzix) obj).zzb;
        if (zzlzVar != zzlz.zzc()) {
            return zzlzVar;
        }
        zzlz zzd = zzlz.zzd();
        zza(obj, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz zzd(Object obj) {
        return ((zzix) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz zze(zzlz zzlzVar) {
        zzlz zzlzVar2 = zzlzVar;
        zzlzVar2.zze();
        return zzlzVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zzf(Object obj) {
        ((zzix) obj).zzb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ int zza(zzlz zzlzVar) {
        return zzlzVar.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zzb(zzlz zzlzVar, int i, long j) {
        zzlzVar.zza(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz zza(zzlz zzlzVar, zzlz zzlzVar2) {
        zzlz zzlzVar3 = zzlzVar;
        zzlz zzlzVar4 = zzlzVar2;
        if (zzlz.zzc().equals(zzlzVar4)) {
            return zzlzVar3;
        }
        if (zzlz.zzc().equals(zzlzVar3)) {
            return zzlz.zza(zzlzVar3, zzlzVar4);
        }
        return zzlzVar3.zza(zzlzVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zzb(Object obj, zzlz zzlzVar) {
        zza(obj, zzlzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zzc(Object obj, zzlz zzlzVar) {
        zza(obj, zzlzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zzb(zzlz zzlzVar, zzmw zzmwVar) throws IOException {
        zzlzVar.zzb(zzmwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz zza() {
        return zzlz.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zza(zzlz zzlzVar, int i, int i2) {
        zzlzVar.zza((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zza(zzlz zzlzVar, int i, long j) {
        zzlzVar.zza((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zza(zzlz zzlzVar, int i, zzlz zzlzVar2) {
        zzlzVar.zza((i << 3) | 3, zzlzVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zza(zzlz zzlzVar, int i, zzhm zzhmVar) {
        zzlzVar.zza((i << 3) | 2, zzhmVar);
    }

    private static void zza(Object obj, zzlz zzlzVar) {
        ((zzix) obj).zzb = zzlzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void zza(zzlz zzlzVar, zzmw zzmwVar) throws IOException {
        zzlzVar.zza(zzmwVar);
    }
}
