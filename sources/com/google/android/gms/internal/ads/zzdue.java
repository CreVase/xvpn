package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzdue implements zzdto {
    private final long zza;
    private final zzdtt zzb;
    private final zzfci zzc;

    public zzdue(long j, Context context, zzdtt zzdttVar, zzchw zzchwVar, String str) {
        this.zza = j;
        this.zzb = zzdttVar;
        zzfck zzv = zzchwVar.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzduc(this));
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdud(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }
}
