package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjo implements zzbjj {
    private final Context zza;

    public zzbjo(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        char c;
        if (!com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zza)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("_ac")) {
                    c = 0;
                }
                c = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    zzcat.zzg("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    com.google.android.gms.ads.internal.zzt.zzn().zzk(this.zza, str2);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzn().zzn(this.zza, str2);
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzm(this.zza, str2);
    }
}
