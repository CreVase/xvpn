package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfkb {
    private boolean zza;

    public final void zza(Context context) {
        zzfls.zzb(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzflb.zzb().zzd(context);
            zzfkt.zza().zzd(context);
            zzflm.zzb(context);
            zzfln.zzd(context);
            zzflq.zza(context);
            zzfky.zzb().zzc(context);
            zzfks.zza().zzd(context);
        }
    }

    public final boolean zzb() {
        return this.zza;
    }
}
