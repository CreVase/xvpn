package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhx {
    private final Context zza;
    private final zzhv zzb;

    public zzhx(Context context, Handler handler, zzhw zzhwVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzhv(this, handler, zzhwVar);
    }
}
