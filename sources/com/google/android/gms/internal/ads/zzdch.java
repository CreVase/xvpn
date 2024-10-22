package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdch implements zzdag {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbf)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbr(zzbvg zzbvgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final synchronized void zzbs(zzfde zzfdeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbg)).booleanValue()) {
            try {
                this.zza = zzfdeVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
