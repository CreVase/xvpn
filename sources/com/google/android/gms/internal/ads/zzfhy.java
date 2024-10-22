package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfhy {
    private final Executor zza;
    private final zzcay zzb;

    public zzfhy(Executor executor, zzcay zzcayVar) {
        this.zza = executor;
        this.zzb = zzcayVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhx
            @Override // java.lang.Runnable
            public final void run() {
                zzfhy.this.zza(str);
            }
        });
    }
}
