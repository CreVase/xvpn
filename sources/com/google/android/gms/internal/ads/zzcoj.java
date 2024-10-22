package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcoj implements zzcnl {
    private final zzdvm zza;

    public zzcoj(zzdvm zzdvmVar) {
        this.zza = zzdvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzn(str.equals("true"));
    }
}
