package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzij implements zzkt {
    private final zzly zza;
    private final zzii zzb;
    private zzlr zzc;
    private zzkt zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzij(zzii zziiVar, zzdy zzdyVar) {
        this.zzb = zziiVar;
        this.zza = new zzly(zzdyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzlr zzlrVar = this.zzc;
        if (zzlrVar != null && !zzlrVar.zzT() && (this.zzc.zzU() || (!z && !this.zzc.zzN()))) {
            zzkt zzktVar = this.zzd;
            zzktVar.getClass();
            long zza = zzktVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzcg zzc = zzktVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        } else {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzkt zzktVar2 = this.zzd;
        zzktVar2.getClass();
        return zzktVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final zzcg zzc() {
        zzkt zzktVar = this.zzd;
        return zzktVar != null ? zzktVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzlr zzlrVar) {
        if (zzlrVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlr zzlrVar) throws zzil {
        zzkt zzktVar;
        zzkt zzk = zzlrVar.zzk();
        if (zzk != null && zzk != (zzktVar = this.zzd)) {
            if (zzktVar == null) {
                this.zzd = zzk;
                this.zzc = zzlrVar;
                zzk.zzg(this.zza.zzc());
                return;
            }
            throw zzil.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(zzcg zzcgVar) {
        zzkt zzktVar = this.zzd;
        if (zzktVar != null) {
            zzktVar.zzg(zzcgVar);
            zzcgVar = this.zzd.zzc();
        }
        this.zza.zzg(zzcgVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
