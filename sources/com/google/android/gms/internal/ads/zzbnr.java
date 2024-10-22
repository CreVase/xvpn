package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzbnr {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzboa zzc;
    private zzboa zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    public final zzboa zza(Context context, zzcaz zzcazVar, zzfjh zzfjhVar) {
        zzboa zzboaVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzboa(zzc(context), zzcazVar, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zza), zzfjhVar);
            }
            zzboaVar = this.zzc;
        }
        return zzboaVar;
    }

    public final zzboa zzb(Context context, zzcaz zzcazVar, zzfjh zzfjhVar) {
        zzboa zzboaVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzboa(zzc(context), zzcazVar, (String) zzbel.zzb.zze(), zzfjhVar);
            }
            zzboaVar = this.zzd;
        }
        return zzboaVar;
    }
}
