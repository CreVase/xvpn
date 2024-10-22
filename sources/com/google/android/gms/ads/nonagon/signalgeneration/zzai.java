package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcwq;
import com.google.android.gms.internal.ads.zzfhl;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbp;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzai implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzai(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfhr) this.zza.zzb()).zzb(zzfhl.GENERATE_SIGNALS, ((zzcwq) this.zzc).zzb().zzc()).zzf(((zzal) this.zzb).zzb()).zzi(((Integer) zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS).zza();
    }
}
