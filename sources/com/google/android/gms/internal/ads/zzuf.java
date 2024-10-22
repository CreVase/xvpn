package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzuf {
    public final int zza;
    public final zztw zzb;
    private final CopyOnWriteArrayList zzc;

    private zzuf(CopyOnWriteArrayList copyOnWriteArrayList, int i, zztw zztwVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztwVar;
    }

    public final zzuf zza(int i, zztw zztwVar) {
        return new zzuf(this.zzc, 0, zztwVar);
    }

    public final void zzb(Handler handler, zzug zzugVar) {
        this.zzc.add(new zzue(handler, zzugVar));
    }

    public final void zzc(final zzts zztsVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzueVar = (zzue) it.next();
            final zzug zzugVar = zzueVar.zzb;
            zzfk.zzI(zzueVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztz
                @Override // java.lang.Runnable
                public final void run() {
                    zzugVar.zzac(0, zzuf.this.zzb, zztsVar);
                }
            });
        }
    }

    public final void zzd(final zztn zztnVar, final zzts zztsVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzueVar = (zzue) it.next();
            final zzug zzugVar = zzueVar.zzb;
            zzfk.zzI(zzueVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzud
                @Override // java.lang.Runnable
                public final void run() {
                    zzugVar.zzad(0, zzuf.this.zzb, zztnVar, zztsVar);
                }
            });
        }
    }

    public final void zze(final zztn zztnVar, final zzts zztsVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzueVar = (zzue) it.next();
            final zzug zzugVar = zzueVar.zzb;
            zzfk.zzI(zzueVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzub
                @Override // java.lang.Runnable
                public final void run() {
                    zzugVar.zzae(0, zzuf.this.zzb, zztnVar, zztsVar);
                }
            });
        }
    }

    public final void zzf(final zztn zztnVar, final zzts zztsVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzueVar = (zzue) it.next();
            final zzug zzugVar = zzueVar.zzb;
            zzfk.zzI(zzueVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuc
                @Override // java.lang.Runnable
                public final void run() {
                    zzugVar.zzaf(0, zzuf.this.zzb, zztnVar, zztsVar, iOException, z);
                }
            });
        }
    }

    public final void zzg(final zztn zztnVar, final zzts zztsVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzueVar = (zzue) it.next();
            final zzug zzugVar = zzueVar.zzb;
            zzfk.zzI(zzueVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzua
                @Override // java.lang.Runnable
                public final void run() {
                    zzugVar.zzag(0, zzuf.this.zzb, zztnVar, zztsVar);
                }
            });
        }
    }

    public final void zzh(zzug zzugVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzueVar = (zzue) it.next();
            if (zzueVar.zzb == zzugVar) {
                this.zzc.remove(zzueVar);
            }
        }
    }

    public zzuf() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
