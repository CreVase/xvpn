package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzxw {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzxx zzxxVar) {
        zzc(zzxxVar);
        this.zza.add(new zzxv(handler, zzxxVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzxv zzxvVar = (zzxv) it.next();
            z = zzxvVar.zzc;
            if (!z) {
                handler = zzxvVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzxx zzxxVar;
                        zzxxVar = zzxv.this.zzb;
                        zzxxVar.zzV(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzxx zzxxVar) {
        zzxx zzxxVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzxv zzxvVar = (zzxv) it.next();
            zzxxVar2 = zzxvVar.zzb;
            if (zzxxVar2 == zzxxVar) {
                zzxvVar.zzc();
                this.zza.remove(zzxvVar);
            }
        }
    }
}
