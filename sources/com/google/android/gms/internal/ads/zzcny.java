package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcny implements zzcnl {
    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjC)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzI(Boolean.parseBoolean(str));
            }
        }
    }
}
