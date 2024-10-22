package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcnr implements zzcnl {
    private final zzdvm zza;

    public zzcnr(zzdvm zzdvmVar) {
        this.zza = zzdvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                this.zza.zzl(zzdvi.NONE);
                return;
            } else {
                this.zza.zzl(zzdvi.FLICK);
                return;
            }
        }
        this.zza.zzl(zzdvi.SHAKE);
    }
}
