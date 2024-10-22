package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzbw extends WebView {
    private final Handler zza;
    private final zzcc zzb;
    private boolean zzc;

    public zzbw(zzby zzbyVar, Handler handler, zzcc zzccVar) {
        super(zzbyVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzccVar;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzbw zzbwVar, String str) {
        if (str != null && str.startsWith("consent://")) {
            return true;
        }
        return false;
    }

    public final void zzc(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbt
            @Override // java.lang.Runnable
            public final void run() {
                zzcu.zza(zzbw.this, str3);
            }
        });
    }
}
