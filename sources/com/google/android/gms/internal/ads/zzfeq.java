package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes.dex */
public final class zzfeq implements zzhbc {
    private final zzfep zza;

    public zzfeq(zzfep zzfepVar) {
        this.zza = zzfepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzhbk.zzb(defaultClock);
        return defaultClock;
    }
}
