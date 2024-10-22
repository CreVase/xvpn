package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzczf extends zzdcz implements zzbhz {
    private final Bundle zzb;

    public zzczf(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
