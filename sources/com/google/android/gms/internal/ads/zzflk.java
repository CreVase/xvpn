package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class zzflk implements Runnable {
    final /* synthetic */ zzfll zza;
    private final WebView zzb;

    public zzflk(zzfll zzfllVar) {
        WebView webView;
        this.zza = zzfllVar;
        webView = zzfllVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
