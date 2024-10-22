package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzgvz implements Iterator {
    private final ArrayDeque zza;
    private zzgsm zzb;

    public /* synthetic */ zzgvz(zzgsr zzgsrVar, zzgvy zzgvyVar) {
        zzgsr zzgsrVar2;
        if (zzgsrVar instanceof zzgwb) {
            zzgwb zzgwbVar = (zzgwb) zzgsrVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgwbVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgwbVar);
            zzgsrVar2 = zzgwbVar.zzd;
            this.zzb = zzb(zzgsrVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgsm) zzgsrVar;
    }

    private final zzgsm zzb(zzgsr zzgsrVar) {
        while (zzgsrVar instanceof zzgwb) {
            zzgwb zzgwbVar = (zzgwb) zzgsrVar;
            this.zza.push(zzgwbVar);
            zzgsrVar = zzgwbVar.zzd;
        }
        return (zzgsm) zzgsrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgsm next() {
        zzgsm zzgsmVar;
        zzgsr zzgsrVar;
        zzgsm zzgsmVar2 = this.zzb;
        if (zzgsmVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgsmVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgsrVar = ((zzgwb) this.zza.pop()).zze;
            zzgsmVar = zzb(zzgsrVar);
        } while (zzgsmVar.zzd() == 0);
        this.zzb = zzgsmVar;
        return zzgsmVar2;
    }
}
