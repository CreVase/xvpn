package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzete implements zzetv {
    private final String zza;

    public zzete(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza)) {
            return;
        }
        bundle.putString("query_info", this.zza);
    }
}
