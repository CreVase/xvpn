package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbyd {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbyy zzd;

    private zzbyd() {
    }

    public /* synthetic */ zzbyd(zzbyc zzbycVar) {
    }

    public final zzbyd zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbyd zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbyd zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbyd zzd(zzbyy zzbyyVar) {
        this.zzd = zzbyyVar;
        return this;
    }

    public final zzbyz zze() {
        zzhbk.zzc(this.zza, Context.class);
        zzhbk.zzc(this.zzb, Clock.class);
        zzhbk.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhbk.zzc(this.zzd, zzbyy.class);
        return new zzbyf(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
