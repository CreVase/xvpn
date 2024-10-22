package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* loaded from: classes.dex */
final class zzbtn extends zzbtj {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbtn(zzbts zzbtsVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
