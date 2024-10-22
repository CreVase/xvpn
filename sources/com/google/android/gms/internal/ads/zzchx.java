package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzchx {
    private zzcaz zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzchx zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzchx zzd(zzcaz zzcazVar) {
        this.zza = zzcazVar;
        return this;
    }
}
