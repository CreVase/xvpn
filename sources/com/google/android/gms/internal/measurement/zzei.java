package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzei extends zzdf.zza {
    private final /* synthetic */ zzcs zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzdf zzdfVar, zzcs zzcsVar, int i) {
        super(zzdfVar);
        this.zze = zzdfVar;
        this.zzc = zzcsVar;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.zze.zzj;
        ((zzcu) Preconditions.checkNotNull(zzcuVar)).getTestFlag(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
