package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class zzfux implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfvb zze;

    public /* synthetic */ zzfux(zzfvb zzfvbVar, zzfuw zzfuwVar) {
        int i;
        this.zze = zzfvbVar;
        i = zzfvbVar.zzf;
        this.zzb = i;
        this.zzc = zzfvbVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i == this.zzb) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        zzb();
        if (this.zzd >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzfsw.zzj(z, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfvb zzfvbVar = this.zze;
        int i = this.zzd;
        Object[] objArr = zzfvbVar.zzb;
        objArr.getClass();
        zzfvbVar.remove(objArr[i]);
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
