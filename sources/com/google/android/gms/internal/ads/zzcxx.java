package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzcxx extends zzdcz implements zzcxp {
    public zzcxx(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcxw
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzcyb) obj).zzp(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzb() {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcxv
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzcyb) obj).zzp(zzfeo.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzc(final zzdhe zzdheVar) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzcxu
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzcyb) obj).zzp(zzfeo.zzd(12, zzdhe.this.getMessage(), null));
            }
        });
    }
}
