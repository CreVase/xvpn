package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzcyd extends zzdcz {
    private boolean zzb;

    public zzcyd(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcyc
                @Override // com.google.android.gms.internal.ads.zzdcy
                public final void zza(Object obj) {
                    ((zzcyf) obj).zzq();
                }
            });
            this.zzb = true;
        }
    }
}
