package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

/* loaded from: classes.dex */
final class zzes extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdf.zzd zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzdf.zzd zzdVar, Activity activity) {
        super(zzdf.this);
        this.zzd = zzdVar;
        this.zzc = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = zzdf.this.zzj;
        ((zzcu) Preconditions.checkNotNull(zzcuVar)).onActivityPaused(ObjectWrapper.wrap(this.zzc), this.zzb);
    }
}
