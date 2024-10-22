package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzceg implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcef zza(zzcdc zzcdcVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcef zzcefVar = (zzcef) it.next();
            if (zzcefVar.zza == zzcdcVar) {
                return zzcefVar;
            }
        }
        return null;
    }

    public final void zzb(zzcef zzcefVar) {
        this.zza.add(zzcefVar);
    }

    public final void zzc(zzcef zzcefVar) {
        this.zza.remove(zzcefVar);
    }

    public final boolean zzd(zzcdc zzcdcVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcef zzcefVar = (zzcef) it.next();
            if (zzcefVar.zza == zzcdcVar) {
                arrayList.add(zzcefVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcef) it2.next()).zzb.zzf();
        }
        return true;
    }
}
