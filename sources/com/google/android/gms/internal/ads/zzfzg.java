package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfzg extends zzfys {
    private zzfzf zza;

    public zzfzg(zzfvn zzfvnVar, boolean z, Executor executor, Callable callable) {
        super(zzfvnVar, z, false);
        this.zza = new zzfze(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfys
    public final void zzf(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final void zzq() {
        zzfzf zzfzfVar = this.zza;
        if (zzfzfVar != null) {
            zzfzfVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfys
    public final void zzu() {
        zzfzf zzfzfVar = this.zza;
        if (zzfzfVar != null) {
            zzfzfVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfys
    public final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
