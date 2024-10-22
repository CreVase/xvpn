package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfvl extends zzfvm {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    public zzfvl(int i) {
        this.zza = new Object[i];
    }

    private final void zzf(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzfvm.zze(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzfvl zza(Object obj) {
        obj.getClass();
        zzf(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public /* bridge */ /* synthetic */ zzfvm zzb(Object obj) {
        throw null;
    }

    public final zzfvm zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size() + this.zzb);
            if (collection instanceof zzfvn) {
                this.zzb = ((zzfvn) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }

    public final void zzd(Object[] objArr, int i) {
        zzfxa.zzb(objArr, 2);
        zzf(this.zzb + 2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
