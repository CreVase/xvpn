package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzchz {
    private final zzcaz zza;
    private final Context zzb;
    private final WeakReference zzc;

    public /* synthetic */ zzchz(zzchx zzchxVar, zzchy zzchyVar) {
        zzcaz zzcazVar;
        Context context;
        WeakReference weakReference;
        zzcazVar = zzchxVar.zza;
        this.zza = zzcazVar;
        context = zzchxVar.zzb;
        this.zzb = context;
        weakReference = zzchxVar.zzc;
        this.zzc = weakReference;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzaro zzb() {
        return new zzaro(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    public final zzbev zzc() {
        return new zzbev(this.zzb);
    }

    public final zzcaz zzd() {
        return this.zza;
    }

    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    public final WeakReference zzf() {
        return this.zzc;
    }
}
