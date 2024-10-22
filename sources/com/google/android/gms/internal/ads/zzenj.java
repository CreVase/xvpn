package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzenj implements zzetv {
    private final boolean zza;

    public zzenj(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (true != this.zza) {
            str = "0";
        } else {
            str = "1";
        }
        bundle.putString("adid_p", str);
    }
}
