package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzxq {
    private zzxp zza;
    private zzxy zzb;

    public zzls zzc() {
        throw null;
    }

    public void zzi() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzj(zzk zzkVar) {
        throw null;
    }

    public boolean zzm() {
        throw null;
    }

    public abstract zzxr zzo(zzlt[] zzltVarArr, zzvx zzvxVar, zztw zztwVar, zzcv zzcvVar) throws zzil;

    public abstract void zzp(Object obj);

    public final zzxy zzq() {
        zzxy zzxyVar = this.zzb;
        zzdx.zzb(zzxyVar);
        return zzxyVar;
    }

    public final void zzr(zzxp zzxpVar, zzxy zzxyVar) {
        this.zza = zzxpVar;
        this.zzb = zzxyVar;
    }

    public final void zzs() {
        zzxp zzxpVar = this.zza;
        if (zzxpVar != null) {
            zzxpVar.zzj();
        }
    }
}
