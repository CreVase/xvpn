package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zzczz implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdaa zzdaaVar = (zzdaa) this.zza.get();
        if (zzdaaVar != null) {
            zzdaaVar.zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzczx
                @Override // com.google.android.gms.internal.ads.zzdcy
                public final void zza(Object obj) {
                    ((zzdab) obj).zza();
                }
            });
        }
    }
}
