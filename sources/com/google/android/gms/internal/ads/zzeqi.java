package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzeqi implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzeqi(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvx zzm;
        zzepy zza = zzeqa.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdR)).booleanValue()) {
            zzm = zzfvx.zzn(new zzese(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdS)).intValue(), scheduledExecutorService));
        } else {
            zzm = zzfvx.zzm();
        }
        zzhbk.zzb(zzm);
        return zzm;
    }
}
