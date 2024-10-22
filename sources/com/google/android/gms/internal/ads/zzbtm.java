package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbtm {
    private static zzbzk zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;
    private final String zze;

    public zzbtm(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdx zzdxVar, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
        this.zze = str;
    }

    public static zzbzk zza(Context context) {
        zzbzk zzbzkVar;
        synchronized (zzbtm.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzbou());
            }
            zzbzkVar = zza;
        }
        return zzbzkVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzl zza2;
        zzbzk zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        if (zzdxVar == null) {
            zza2 = new com.google.android.gms.ads.internal.client.zzm().zza();
        } else {
            zza2 = com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdxVar);
        }
        try {
            zza3.zze(wrap, new zzbzo(this.zze, this.zzc.name(), null, zza2), new zzbtl(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
