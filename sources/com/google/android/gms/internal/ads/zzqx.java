package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzqx {
    public final int zza;
    public final zztw zzb;
    private final CopyOnWriteArrayList zzc;

    private zzqx(CopyOnWriteArrayList copyOnWriteArrayList, int i, zztw zztwVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztwVar;
    }

    public final zzqx zza(int i, zztw zztwVar) {
        return new zzqx(this.zzc, 0, zztwVar);
    }

    public final void zzb(Handler handler, zzqy zzqyVar) {
        this.zzc.add(new zzqw(handler, zzqyVar));
    }

    public final void zzc(zzqy zzqyVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzqw zzqwVar = (zzqw) it.next();
            if (zzqwVar.zzb == zzqyVar) {
                this.zzc.remove(zzqwVar);
            }
        }
    }

    public zzqx() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
