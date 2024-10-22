package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzavm {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzavl zza(boolean z) {
        int i;
        synchronized (this.zzb) {
            zzavl zzavlVar = null;
            if (this.zzc.isEmpty()) {
                zzcat.zze("Queue empty");
                return null;
            }
            int i2 = 0;
            if (this.zzc.size() >= 2) {
                int i3 = Integer.MIN_VALUE;
                int i4 = 0;
                for (zzavl zzavlVar2 : this.zzc) {
                    int zzb = zzavlVar2.zzb();
                    if (zzb > i3) {
                        i2 = i4;
                    }
                    if (zzb > i3) {
                        i = zzb;
                    } else {
                        i = i3;
                    }
                    if (zzb > i3) {
                        zzavlVar = zzavlVar2;
                    }
                    i4++;
                    i3 = i;
                }
                this.zzc.remove(i2);
                return zzavlVar;
            }
            zzavl zzavlVar3 = (zzavl) this.zzc.get(0);
            if (z) {
                this.zzc.remove(0);
            } else {
                zzavlVar3.zzi();
            }
            return zzavlVar3;
        }
    }

    public final void zzb(zzavl zzavlVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                zzcat.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzavlVar.zzj(i);
            zzavlVar.zzn();
            this.zzc.add(zzavlVar);
        }
    }

    public final boolean zzc(zzavl zzavlVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzavl zzavlVar2 = (zzavl) it.next();
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                    if (!zzavlVar.equals(zzavlVar2) && zzavlVar2.zzd().equals(zzavlVar.zzd())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO() && !zzavlVar.equals(zzavlVar2) && zzavlVar2.zzf().equals(zzavlVar.zzf())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzavl zzavlVar) {
        synchronized (this.zzb) {
            if (this.zzc.contains(zzavlVar)) {
                return true;
            }
            return false;
        }
    }
}
