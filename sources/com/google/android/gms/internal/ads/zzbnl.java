package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzbnl extends zzcbs {
    private final com.google.android.gms.ads.internal.util.zzbd zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbnl(com.google.android.gms.ads.internal.util.zzbd zzbdVar) {
        this.zzb = zzbdVar;
    }

    public final zzbng zza() {
        boolean z;
        zzbng zzbngVar = new zzbng(this);
        synchronized (this.zza) {
            zzi(new zzbnh(this, zzbngVar), new zzbni(this, zzbngVar));
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.zzd++;
        }
        return zzbngVar;
    }

    public final void zzb() {
        boolean z;
        synchronized (this.zza) {
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    public final void zzc() {
        boolean z;
        synchronized (this.zza) {
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new zzbnk(this), new zzcbo());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final void zzd() {
        boolean z;
        synchronized (this.zza) {
            if (this.zzd > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
