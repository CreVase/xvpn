package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcod implements zzcnl {
    private final zzfcq zza;

    public zzcod(zzfcq zzfcqVar) {
        this.zza = zzfcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(str));
            } catch (Exception e) {
                throw new IllegalStateException("Invalid render_in_browser state", e);
            }
        }
    }
}
