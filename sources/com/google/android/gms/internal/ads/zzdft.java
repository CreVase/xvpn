package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdft extends zzdcz {
    private boolean zzb;

    public zzdft(Set set) {
        super(set);
    }

    public final void zza() {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdfq
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdfp
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzt(zzdfr.zza);
            this.zzb = true;
        }
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdfs
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzt(zzdfr.zza);
        this.zzb = true;
    }
}
