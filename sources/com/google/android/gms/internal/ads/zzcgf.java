package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzcgf implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxu zza;
    final /* synthetic */ zzcgi zzb;

    public zzcgf(zzcgi zzcgiVar, zzbxu zzbxuVar) {
        this.zzb = zzcgiVar;
        this.zza = zzbxuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
