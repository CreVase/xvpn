package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class zzeo {
    private final zzdy zza;
    private final zzei zzb;
    private final zzem zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzeo(Looper looper, zzdy zzdyVar, zzem zzemVar) {
        this(new CopyOnWriteArraySet(), looper, zzdyVar, zzemVar, true);
    }

    public static /* synthetic */ boolean zzg(zzeo zzeoVar, Message message) {
        Iterator it = zzeoVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzen) it.next()).zzb(zzeoVar.zzc);
            if (zzeoVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        boolean z;
        if (!this.zzi) {
            return;
        }
        if (Thread.currentThread() == this.zzb.zza().getThread()) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
    }

    public final zzeo zza(Looper looper, zzem zzemVar) {
        return new zzeo(this.zzd, looper, this.zza, zzemVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzen(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(0)) {
            zzei zzeiVar = this.zzb;
            zzeiVar.zzk(zzeiVar.zzb(0));
        }
        boolean z = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (!z) {
            while (!this.zze.isEmpty()) {
                ((Runnable) this.zze.peekFirst()).run();
                this.zze.removeFirst();
            }
        }
    }

    public final void zzd(final int i, final zzel zzelVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzek
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzel zzelVar2 = zzelVar;
                    ((zzen) it.next()).zza(i, zzelVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzen) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzen zzenVar = (zzen) it.next();
            if (zzenVar.zza.equals(obj)) {
                zzenVar.zzc(this.zzc);
                this.zzd.remove(zzenVar);
            }
        }
    }

    private zzeo(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdy zzdyVar, zzem zzemVar, boolean z) {
        this.zza = zzdyVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzemVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdyVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzej
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzeo.zzg(zzeo.this, message);
                return true;
            }
        });
        this.zzi = z;
    }
}
