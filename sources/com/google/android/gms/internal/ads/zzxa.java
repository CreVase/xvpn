package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* loaded from: classes.dex */
final class zzxa implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzxi zza;

    public zzxa(zzxb zzxbVar, zzxi zzxiVar) {
        this.zza = zzxiVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        zzxi.zzh(this.zza);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        zzxi.zzh(this.zza);
    }
}
