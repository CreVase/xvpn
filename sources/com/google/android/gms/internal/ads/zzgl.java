package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgl {
    private Uri zza;
    private Map zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzgl zza(int i) {
        this.zzd = 6;
        return this;
    }

    public final zzgl zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgl zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzgl zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgn zze() {
        if (this.zza != null) {
            return new zzgn(this.zza, this.zzb, this.zzc, this.zzd);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
