package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzemn implements zzczw {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zza.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzezw.zza(this.zza, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemm
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}
