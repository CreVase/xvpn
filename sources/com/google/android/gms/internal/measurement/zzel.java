package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzel extends zzdf.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdf zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzdf zzdfVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzdfVar);
        this.zzi = zzdfVar;
        this.zzc = l;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z;
        this.zzh = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() throws RemoteException {
        long longValue;
        zzcu zzcuVar;
        Long l = this.zzc;
        if (l == null) {
            longValue = this.zza;
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        zzcuVar = this.zzi.zzj;
        ((zzcu) Preconditions.checkNotNull(zzcuVar)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, j);
    }
}
