package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class zzdxy extends zzbvb {
    final /* synthetic */ zzdxz zza;

    public zzdxy(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
