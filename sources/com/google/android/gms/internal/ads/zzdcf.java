package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdcf extends zzdcz implements zzbib {
    public zzdcf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final synchronized void zzb(final String str, final String str2) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdce
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
