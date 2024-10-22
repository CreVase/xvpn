package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbzs implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbl zzb;

    public zzbzs(zzbzt zzbztVar, Context context, zzcbl zzcblVar) {
        this.zza = context;
        this.zzb = zzcblVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            zzcat.zzh("Exception while getting advertising Id info", e);
        }
    }
}
