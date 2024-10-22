package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcgs implements zzbjj {
    final /* synthetic */ zzcgu zza;

    public zzcgs(zzcgu zzcguVar) {
        this.zza = zzcguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcgu zzcguVar = this.zza;
                        i = zzcguVar.zzG;
                        if (i != parseInt) {
                            zzcguVar.zzG = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzcat.zzk("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
