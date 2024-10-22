package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    public zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcaz zzcazVar;
        Context context;
        zzs zzsVar = this.zza;
        zzcazVar = zzsVar.zza;
        String str = zzcazVar.zza;
        context = zzsVar.zzd;
        return new zzaro(zzarn.zzt(str, context, false));
    }
}
