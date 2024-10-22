package com.google.android.gms.internal.ads;

import defpackage.ml1;
import defpackage.t51;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcnu implements zzcnl {
    private final zzees zza;

    public zzcnu(zzees zzeesVar) {
        this.zza = zzeesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjC)).booleanValue()) {
            return;
        }
        zzfzt.zzf(zzfzk.zzu(this.zza.zza(true)), Throwable.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzcnt
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                return zzfzt.zzh(new t51(zzfvs.zzl()));
            }
        }, zzcbg.zza);
    }
}
