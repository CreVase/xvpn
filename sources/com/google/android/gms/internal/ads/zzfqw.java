package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfqw extends zzfrm {
    final /* synthetic */ zzfrf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfrd zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfqy zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqw(zzfqy zzfqyVar, TaskCompletionSource taskCompletionSource, zzfrf zzfrfVar, int i, zzfrd zzfrdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfqyVar;
        this.zza = zzfrfVar;
        this.zzb = i;
        this.zzc = zzfrdVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfri] */
    @Override // com.google.android.gms.internal.ads.zzfrm
    public final void zza() {
        zzfrl zzfrlVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            zzfrf zzfrfVar = this.zza;
            str2 = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfrfVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfrfVar.zza());
            zze.zzg(bundle, new zzfqx(this.zze, this.zzc));
        } catch (RemoteException e) {
            int i2 = this.zzb;
            zzfrlVar = zzfqy.zzb;
            str = this.zze.zzd;
            zzfrlVar.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), str);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
