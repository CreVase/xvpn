package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import defpackage.hx2;

/* loaded from: classes.dex */
final class zzgah extends zzfyh.zzi implements Runnable {
    private final Runnable zza;

    public zzgah(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zzd(e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String zza() {
        return hx2.q("task=[", this.zza.toString(), "]");
    }
}
