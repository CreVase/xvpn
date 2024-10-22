package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* loaded from: classes.dex */
final class zzbto extends zzbtj {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbto(zzbts zzbtsVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
