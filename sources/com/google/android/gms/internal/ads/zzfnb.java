package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes.dex */
public final class zzfnb {
    private final Context zza;
    private final Looper zzb;

    public zzfnb(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfnp zza = zzfnr.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfnm zza2 = zzfnn.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfnc(this.zza, this.zzb, (zzfnr) zza.zzal()).zza();
    }
}
