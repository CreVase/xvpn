package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzavr implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzavv zzb;

    public zzavr(zzavv zzavvVar, View view) {
        this.zzb = zzavvVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
