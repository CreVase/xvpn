package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzdae extends zzdcz implements zzdag {
    public zzdae(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbr(final zzbvg zzbvgVar) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdad
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdag) obj).zzbr(zzbvg.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbs(final zzfde zzfdeVar) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdac
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdag) obj).zzbs(zzfde.this);
            }
        });
    }
}
