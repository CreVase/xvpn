package com.google.android.gms.oss.licenses;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes2.dex */
final class zzk extends TaskApiCall {
    final /* synthetic */ List zza;

    public zzk(zzl zzlVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzm) anyClient).zzs(this.zza));
    }
}
