package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzboq {
    private static zzboq zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzboq zza() {
        if (zza == null) {
            zza = new zzboq();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbop
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbci.zza(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzah)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzao)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzchv) zzcax.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcav() { // from class: com.google.android.gms.internal.ads.zzboo
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzcav
                        public final Object zza(Object obj) {
                            return zzchu.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbon(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzcaw | NullPointerException e) {
                    zzcat.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
