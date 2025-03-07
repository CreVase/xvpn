package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class zzfkx {
    private final zzfmj zza;
    private final String zzb;
    private final zzfkj zzc;
    private final String zzd = "Ad overlay";

    public zzfkx(View view, zzfkj zzfkjVar, String str) {
        this.zza = new zzfmj(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfkjVar;
    }

    public final zzfkj zza() {
        return this.zzc;
    }

    public final zzfmj zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
