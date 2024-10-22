package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzavt implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzavl zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzavv zze;

    public zzavt(zzavv zzavvVar, final zzavl zzavlVar, final WebView webView, final boolean z) {
        this.zze = zzavvVar;
        this.zzb = zzavlVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzavs
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzavt.this.zze.zzd(zzavlVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
