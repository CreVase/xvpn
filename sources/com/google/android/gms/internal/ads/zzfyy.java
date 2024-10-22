package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class zzfyy extends zzfyh.zzi {
    private static final zzfyu zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfyy.class.getName());
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfyu zzfyxVar;
        Throwable th;
        zzfyw zzfywVar = null;
        try {
            zzfyxVar = new zzfyv(AtomicReferenceFieldUpdater.newUpdater(zzfyy.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfyy.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzfyxVar = new zzfyx(zzfywVar);
            th = e;
        }
        zzbb = zzfyxVar;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzfyy(int i) {
        this.remaining = i;
    }

    public final int zzA() {
        return zzbb.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzbb.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            set2.getClass();
            return set2;
        }
        return set;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zze(Set set);
}
