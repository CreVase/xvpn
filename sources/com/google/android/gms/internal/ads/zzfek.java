package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class zzfek {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgad zzc;

    public zzfek(Callable callable, zzgad zzgadVar) {
        this.zzb = callable;
        this.zzc = zzgadVar;
    }

    public final synchronized ml1 zza() {
        zzc(1);
        return (ml1) this.zza.poll();
    }

    public final synchronized void zzb(ml1 ml1Var) {
        this.zza.addFirst(ml1Var);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
