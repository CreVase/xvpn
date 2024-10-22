package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class zzfkz implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfla zzc;

    public zzfkz(zzfla zzflaVar, WebView webView, String str) {
        this.zzc = zzflaVar;
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfla.zzi(this.zza, this.zzb);
    }
}
