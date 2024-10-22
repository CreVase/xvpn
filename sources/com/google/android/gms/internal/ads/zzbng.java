package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbng extends zzcbs {
    private final Object zza = new Object();
    private final zzbnl zzb;
    private boolean zzc;

    public zzbng(zzbnl zzbnlVar) {
        this.zzb = zzbnlVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbnd(this), new zzcbo());
            zzi(new zzbne(this), new zzbnf(this));
        }
    }
}
