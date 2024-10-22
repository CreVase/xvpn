package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeb extends zzdf.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzcs zzd;
    private final /* synthetic */ zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzdf zzdfVar, Bundle bundle, zzcs zzcsVar) {
        super(zzdfVar);
        this.zze = zzdfVar;
        this.zzc = bundle;
        this.zzd = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.zze.zzj;
        ((zzcu) Preconditions.checkNotNull(zzcuVar)).performAction(this.zzc, this.zzd, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
