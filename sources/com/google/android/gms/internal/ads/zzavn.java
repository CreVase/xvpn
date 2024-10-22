package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzavn implements Runnable {
    final /* synthetic */ zzavo zza;

    public zzavn(zzavo zzavoVar) {
        this.zza = zzavoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzavo zzavoVar = this.zza;
            z = zzavoVar.zzd;
            if (z) {
                z2 = zzavoVar.zze;
                if (z2) {
                    zzavoVar.zzd = false;
                    zzcat.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzavp) it.next()).zza(false);
                        } catch (Exception e) {
                            zzcat.zzh("", e);
                        }
                    }
                }
            }
            zzcat.zze("App is still foreground");
        }
    }
}
