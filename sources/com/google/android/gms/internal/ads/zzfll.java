package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfll extends zzflh {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfll(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzc() {
        long convert;
        super.zzc();
        if (this.zzb == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzflk(this), Math.max(4000 - convert, 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzg(zzfkg zzfkgVar, zzfke zzfkeVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfkeVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzh(zzfkgVar, zzfkeVar, jSONObject);
        } else {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzk() {
        WebView webView = new WebView(zzfky.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzflj(this));
        zzj(this.zza);
        zzfla.zzi(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
