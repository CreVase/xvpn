package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcol implements zzcyg {
    private final zzfej zza;

    public zzcol(zzfej zzfejVar) {
        this.zza = zzfejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbn(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfds e) {
            zzcat.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbp(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfds e) {
            zzcat.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbq(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfds e) {
            zzcat.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
