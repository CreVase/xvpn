package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdl extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdf zzdfVar, Activity activity, String str, String str2) {
        super(zzdfVar);
        this.zzf = zzdfVar;
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.zzf.zzj;
        ((zzcu) Preconditions.checkNotNull(zzcuVar)).setCurrentScreen(ObjectWrapper.wrap(this.zzc), this.zzd, this.zze, this.zza);
    }
}
