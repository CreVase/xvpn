package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class zzc {
    private static zzc zza;

    public static zzc zza(Context context) {
        zzc zzcVar;
        synchronized (zzc.class) {
            if (zza == null) {
                zzal zzalVar = new zzal(null);
                zzalVar.zzb((Application) context.getApplicationContext());
                zza = zzalVar.zza();
            }
            zzcVar = zza;
        }
        return zzcVar;
    }

    public abstract zzl zzb();

    public abstract zzbq zzc();
}
