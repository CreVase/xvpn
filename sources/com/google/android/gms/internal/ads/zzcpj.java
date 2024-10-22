package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcpj implements zzbjj {
    final /* synthetic */ zzcpm zza;

    public zzcpj(zzcpm zzcpmVar) {
        this.zza = zzcpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (!zzcpm.zzg(this.zza, map)) {
            return;
        }
        executor = this.zza.zzc;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpi
            @Override // java.lang.Runnable
            public final void run() {
                zzcpr zzcprVar;
                zzcprVar = zzcpj.this.zza.zzd;
                zzcprVar.zzg();
            }
        });
    }
}
