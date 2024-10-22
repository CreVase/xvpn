package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbkc implements zzbjj {
    private final zzdvm zza;

    public zzbkc(zzdvm zzdvmVar) {
        Preconditions.checkNotNull(zzdvmVar, "The Inspector Manager must not be null");
        this.zza = zzdvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j);
        }
    }
}
