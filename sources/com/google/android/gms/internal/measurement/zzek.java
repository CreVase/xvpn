package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* loaded from: classes.dex */
final class zzek extends zzdf.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzdf zzdfVar, Bundle bundle) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.zzd.zzj;
        ((zzcu) Preconditions.checkNotNull(zzcuVar)).setDefaultEventParameters(this.zzc);
    }
}
