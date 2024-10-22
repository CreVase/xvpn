package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzdeg extends zzdcz implements zzdei {
    public zzdeg(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzt(new zzdcy(str2) { // from class: com.google.android.gms.internal.ads.zzdea
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdei) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzb(final String str, final String str2) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzded
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdei) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzc(final String str) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdec
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdei) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzd(final String str) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdee
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdei) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze() {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdef
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdei) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf() {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdeb
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzdei) obj).zzf();
            }
        });
    }
}
