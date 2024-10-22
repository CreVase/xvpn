package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzfrs extends zzfrm {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfrv zzb;

    public zzfrs(zzfrv zzfrvVar, IBinder iBinder) {
        this.zzb = zzfrvVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final void zza() {
        List list;
        List list2;
        this.zzb.zza.zzn = zzfrh.zzb(this.zza);
        zzfrw.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
