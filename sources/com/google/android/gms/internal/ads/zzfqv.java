package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfqv extends zzfrm {
    final /* synthetic */ zzfqp zza;
    final /* synthetic */ zzfrd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfqy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqv(zzfqy zzfqyVar, TaskCompletionSource taskCompletionSource, zzfqp zzfqpVar, zzfrd zzfrdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfqyVar;
        this.zza = zzfqpVar;
        this.zzb = zzfrdVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfri] */
    @Override // com.google.android.gms.internal.ads.zzfrm
    public final void zza() {
        zzfrl zzfrlVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfqp zzfqpVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfqpVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfqpVar.zza());
            zze.zze(bundle, new zzfqx(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfqy zzfqyVar = this.zzd;
            zzfrlVar = zzfqy.zzb;
            str = zzfqyVar.zzd;
            zzfrlVar.zzb(e, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
