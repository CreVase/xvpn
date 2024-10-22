package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zztd implements zzug, zzqy {
    final /* synthetic */ zztf zza;
    private final Object zzb;
    private zzuf zzc;
    private zzqx zzd;

    public zztd(zztf zztfVar, Object obj) {
        this.zza = zztfVar;
        this.zzc = zztfVar.zze(null);
        this.zzd = zztfVar.zzc(null);
        this.zzb = obj;
    }

    private final zzts zzf(zzts zztsVar) {
        zztf zztfVar = this.zza;
        Object obj = this.zzb;
        long j = zztsVar.zzc;
        zztfVar.zzx(obj, j);
        zztf zztfVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zztsVar.zzd;
        zztfVar2.zzx(obj2, j2);
        if (j == zztsVar.zzc && j2 == zztsVar.zzd) {
            return zztsVar;
        }
        return new zzts(1, zztsVar.zza, zztsVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, zztw zztwVar) {
        zztw zztwVar2;
        if (zztwVar != null) {
            zztwVar2 = this.zza.zzy(this.zzb, zztwVar);
            if (zztwVar2 == null) {
                return false;
            }
        } else {
            zztwVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzuf zzufVar = this.zzc;
        int i2 = zzufVar.zza;
        if (!zzfk.zzE(zzufVar.zzb, zztwVar2)) {
            this.zzc = this.zza.zzf(0, zztwVar2);
        }
        zzqx zzqxVar = this.zzd;
        int i3 = zzqxVar.zza;
        if (!zzfk.zzE(zzqxVar.zzb, zztwVar2)) {
            this.zzd = this.zza.zzd(0, zztwVar2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzac(int i, zztw zztwVar, zzts zztsVar) {
        if (zzg(0, zztwVar)) {
            this.zzc.zzc(zzf(zztsVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzad(int i, zztw zztwVar, zztn zztnVar, zzts zztsVar) {
        if (zzg(0, zztwVar)) {
            this.zzc.zzd(zztnVar, zzf(zztsVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzae(int i, zztw zztwVar, zztn zztnVar, zzts zztsVar) {
        if (zzg(0, zztwVar)) {
            this.zzc.zze(zztnVar, zzf(zztsVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzaf(int i, zztw zztwVar, zztn zztnVar, zzts zztsVar, IOException iOException, boolean z) {
        if (zzg(0, zztwVar)) {
            this.zzc.zzf(zztnVar, zzf(zztsVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzag(int i, zztw zztwVar, zztn zztnVar, zzts zztsVar) {
        if (zzg(0, zztwVar)) {
            this.zzc.zzg(zztnVar, zzf(zztsVar));
        }
    }
}
