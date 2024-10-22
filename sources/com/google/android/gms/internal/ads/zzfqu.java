package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfqu extends zzfrm {
    final /* synthetic */ zzfra zza;
    final /* synthetic */ zzfrd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfqy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqu(zzfqy zzfqyVar, TaskCompletionSource taskCompletionSource, zzfra zzfraVar, zzfrd zzfrdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfqyVar;
        this.zza = zzfraVar;
        this.zzb = zzfrdVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfri] */
    @Override // com.google.android.gms.internal.ads.zzfrm
    public final void zza() {
        zzfrl zzfrlVar;
        String str;
        String str2;
        String str3;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfqy zzfqyVar = this.zzd;
            str2 = zzfqyVar.zzd;
            zzfra zzfraVar = this.zza;
            str3 = zzfqyVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfraVar.zze());
            bundle.putString("adFieldEnifd", zzfraVar.zzf());
            bundle.putInt("layoutGravity", zzfraVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfraVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfraVar.zzd());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (zzfraVar.zzg() != null) {
                bundle.putString("appId", zzfraVar.zzg());
            }
            zze.zzf(str2, bundle, new zzfqx(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfqy zzfqyVar2 = this.zzd;
            zzfrlVar = zzfqy.zzb;
            str = zzfqyVar2.zzd;
            zzfrlVar.zzb(e, "show overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
