package com.google.android.gms.oss.licenses;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzj extends TaskApiCall {
    final /* synthetic */ com.google.android.gms.internal.oss_licenses.zze zza;

    public zzj(zzl zzlVar, com.google.android.gms.internal.oss_licenses.zze zzeVar) {
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzm) anyClient).zzp(this.zza));
    }
}
