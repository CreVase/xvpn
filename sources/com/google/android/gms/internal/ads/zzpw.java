package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzpw {
    private boolean zzb;
    private zzpy zzd;
    private zzpq zze;
    private zzon zza = zzon.zza;
    private final zzpv zzc = zzpv.zza;

    @Deprecated
    public zzpw() {
    }

    public static /* bridge */ /* synthetic */ zzon zza(zzpw zzpwVar) {
        return zzpwVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzpv zzb(zzpw zzpwVar) {
        return zzpwVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzpy zzf(zzpw zzpwVar) {
        return zzpwVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzpq zzg(zzpw zzpwVar) {
        return zzpwVar.zze;
    }

    @Deprecated
    public final zzpw zzc(zzon zzonVar) {
        this.zza = zzonVar;
        return this;
    }

    public final zzpw zzd(zzdq[] zzdqVarArr) {
        this.zzd = new zzpy(zzdqVarArr);
        return this;
    }

    public final zzqi zze() {
        zzdx.zzf(!this.zzb);
        this.zzb = true;
        if (this.zzd == null) {
            this.zzd = new zzpy(new zzdq[0]);
        }
        zzqh zzqhVar = null;
        if (this.zze == null) {
            this.zze = new zzpq(null);
        }
        return new zzqi(this, zzqhVar);
    }
}
