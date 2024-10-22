package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class zzfyv extends zzfyu {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzfyv(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int zza(zzfyy zzfyyVar) {
        return this.zzb.decrementAndGet(zzfyyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final void zzb(zzfyy zzfyyVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        do {
            atomicReferenceFieldUpdater = this.zza;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(zzfyyVar, null, set2)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(zzfyyVar) != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzfyyVar) == null);
    }
}
