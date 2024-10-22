package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class zzche extends zzcgi {
    public zzche(zzcgb zzcgbVar, zzaxv zzaxvVar, boolean z, zzedz zzedzVar) {
        super(zzcgbVar, zzaxvVar, z, new zzbrx(zzcgbVar, zzcgbVar.zzE(), new zzbbs(zzcgbVar.getContext())), null, zzedzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzN(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcgb)) {
            zzcat.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcgb zzcgbVar = (zzcgb) webView;
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            zzbxuVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcgbVar.zzN() != null) {
            zzcgbVar.zzN().zzE();
        }
        if (zzcgbVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzO);
        } else if (zzcgbVar.zzaA()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzN);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzM);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzw(zzcgbVar.getContext(), zzcgbVar.zzn().zza, str2);
    }
}
