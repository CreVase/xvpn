package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zzcbu extends zzcbw implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference zza;

    public zzcbu(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.zza = new WeakReference(onGlobalLayoutListener);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.zza.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zza(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzb(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
