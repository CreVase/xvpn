package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeqq implements zzetv {
    public final Bundle zza;

    public zzeqq(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.zza);
    }
}
