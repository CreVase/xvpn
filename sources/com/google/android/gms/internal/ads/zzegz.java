package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
final class zzegz implements zzdhf {
    private final zzfcr zza;
    private final zzbqv zzb;
    private final AdFormat zzc;
    private zzcyd zzd = null;

    public zzegz(zzfcr zzfcrVar, zzbqv zzbqvVar, AdFormat adFormat) {
        this.zza = zzfcrVar;
        this.zzb = zzbqvVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdhf
    public final void zza(boolean z, Context context, zzcxy zzcxyVar) throws zzdhe {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 6) {
                        zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdhe("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            } else {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbu)).booleanValue() && this.zza.zzaa == 2) {
                    this.zzd.zza();
                    return;
                }
                return;
            }
            throw new zzdhe("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdhe(th);
        }
    }

    public final void zzb(zzcyd zzcydVar) {
        this.zzd = zzcydVar;
    }
}
