package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import defpackage.vc0;
import defpackage.yc0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzhbr extends yc0 {
    private final WeakReference zza;

    public zzhbr(zzbdj zzbdjVar) {
        this.zza = new WeakReference(zzbdjVar);
    }

    @Override // defpackage.yc0
    public final void onCustomTabsServiceConnected(ComponentName componentName, vc0 vc0Var) {
        zzbdj zzbdjVar = (zzbdj) this.zza.get();
        if (zzbdjVar != null) {
            zzbdjVar.zzc(vc0Var);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdj zzbdjVar = (zzbdj) this.zza.get();
        if (zzbdjVar != null) {
            zzbdjVar.zzd();
        }
    }
}
