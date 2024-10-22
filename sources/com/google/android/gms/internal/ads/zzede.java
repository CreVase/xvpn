package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzede extends zzeea {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzl zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzeea
    public final zzeea zza(Activity activity) {
        if (activity != null) {
            this.zza = activity;
            return this;
        }
        throw new NullPointerException("Null activity");
    }

    @Override // com.google.android.gms.internal.ads.zzeea
    public final zzeea zzb(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeea
    public final zzeea zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeea
    public final zzeea zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeea
    public final zzeeb zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzedg(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
