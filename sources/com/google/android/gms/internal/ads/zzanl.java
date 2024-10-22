package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
final class zzanl implements zzanb {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzanl(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
