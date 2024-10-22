package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzeqg implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzeqg(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepw(((zzeue) this.zza).zzb(), ((Long) zzbdr.zza.zze()).longValue(), (Clock) this.zzb.zzb());
    }
}
