package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzalx {
    private final Executor zza;

    public zzalx(Handler handler) {
        this.zza = new zzalv(this, handler);
    }

    public final void zza(zzamg zzamgVar, zzamp zzampVar) {
        zzamgVar.zzm("post-error");
        ((zzalv) this.zza).zza.post(new zzalw(zzamgVar, zzamm.zza(zzampVar), null));
    }

    public final void zzb(zzamg zzamgVar, zzamm zzammVar, Runnable runnable) {
        zzamgVar.zzq();
        zzamgVar.zzm("post-response");
        ((zzalv) this.zza).zza.post(new zzalw(zzamgVar, zzammVar, runnable));
    }
}
