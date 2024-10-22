package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbet {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    public static zzber zza() {
        return (zzber) zzb.get();
    }

    public static zzbes zzb() {
        return (zzbes) zzc.get();
    }

    public static void zzc(zzber zzberVar) {
        zzb.set(zzberVar);
    }
}
