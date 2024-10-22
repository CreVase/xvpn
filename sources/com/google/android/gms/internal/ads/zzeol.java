package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzeol {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeok zzb;

    public final zzeok zza() {
        return this.zzb;
    }

    public final void zzb(zzeok zzeokVar) {
        this.zzb = zzeokVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
