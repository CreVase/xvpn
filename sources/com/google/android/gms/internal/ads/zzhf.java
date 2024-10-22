package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzhf extends zzgi {
    public static final zzfsx zza = new zzfsx() { // from class: com.google.android.gms.internal.ads.zzgz
        @Override // com.google.android.gms.internal.ads.zzfsx
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str != null) {
                String zza2 = zzfsc.zza(str);
                if (!TextUtils.isEmpty(zza2)) {
                    if ((!zza2.contains("text") || zza2.contains("text/vtt")) && !zza2.contains("html") && !zza2.contains("xml")) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzgi
    Map zze();
}
