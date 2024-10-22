package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzdfh {
    private final List zza;
    private final zzfjx zzb;
    private boolean zzc;

    public zzdfh(zzfcr zzfcrVar, zzfjx zzfjxVar) {
        this.zza = zzfcrVar.zzr;
        this.zzb = zzfjxVar;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
