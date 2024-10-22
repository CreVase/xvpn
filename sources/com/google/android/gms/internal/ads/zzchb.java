package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
public final class zzchb {
    private final zzchc zza;
    private final zzcha zzb;

    public zzchb(zzchc zzchcVar, zzcha zzchaVar) {
        this.zzb = zzchaVar;
        this.zza = zzchcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzchj, com.google.android.gms.internal.ads.zzchc] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzaro zzI = r0.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzark zzc = zzI.zzc();
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchc zzchcVar = this.zza;
        return zzc.zzf(zzchcVar.getContext(), str, (View) zzchcVar, zzchcVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzchj, com.google.android.gms.internal.ads.zzchc] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzaro zzI = r0.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzark zzc = zzI.zzc();
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchc zzchcVar = this.zza;
        return zzc.zzh(zzchcVar.getContext(), (View) zzchcVar, zzchcVar.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzcat.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgz
                @Override // java.lang.Runnable
                public final void run() {
                    zzchb.this.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        Uri parse = Uri.parse(str);
        zzcgi zzaJ = ((zzcgu) this.zzb.zza).zzaJ();
        if (zzaJ == null) {
            zzcat.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
