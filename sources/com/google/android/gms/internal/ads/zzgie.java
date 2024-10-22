package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgie {
    private static final zzgie zza = new zzgie();
    private static final zzgid zzb = new zzgid(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgie zza() {
        return zza;
    }

    public final zzgme zzb() {
        zzgme zzgmeVar = (zzgme) this.zzc.get();
        if (zzgmeVar == null) {
            return zzb;
        }
        return zzgmeVar;
    }
}
