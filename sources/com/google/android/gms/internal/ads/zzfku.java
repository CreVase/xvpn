package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzfku {
    private static final zzfku zza = new zzfku();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfku() {
    }

    public static zzfku zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfkg zzfkgVar) {
        this.zzb.add(zzfkgVar);
    }

    public final void zze(zzfkg zzfkgVar) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfkgVar);
        this.zzc.remove(zzfkgVar);
        if (zzg && !zzg()) {
            zzflb.zzb().zzg();
        }
    }

    public final void zzf(zzfkg zzfkgVar) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfkgVar);
        if (!zzg) {
            zzflb.zzb().zzf();
        }
    }

    public final boolean zzg() {
        if (this.zzc.size() > 0) {
            return true;
        }
        return false;
    }
}
