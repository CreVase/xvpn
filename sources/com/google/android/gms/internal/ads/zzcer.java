package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcer extends zzcen {
    public zzcer(zzcdc zzcdcVar) {
        super(zzcdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final boolean zzt(String str) {
        String zze = zzcam.zze(str);
        zzcdc zzcdcVar = (zzcdc) this.zzc.get();
        if (zzcdcVar != null && zze != null) {
            zzcdcVar.zzt(zze, this);
        }
        zzcat.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
