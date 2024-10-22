package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbci;

@TargetApi(30)
/* loaded from: classes.dex */
public final class zzz extends zzy {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzn(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzim)).booleanValue()) {
            return 0;
        }
        return super.zzn(context);
    }
}
