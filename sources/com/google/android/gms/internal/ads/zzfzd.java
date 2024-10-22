package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class zzfzd extends zzfys {
    private List zza;

    public zzfzd(zzfvn zzfvnVar, boolean z) {
        super(zzfvnVar, z, true);
        List zza;
        if (zzfvnVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfwg.zza(zzfvnVar.size());
        }
        for (int i = 0; i < zzfvnVar.size(); i++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfys
    public final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfzc(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfys
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfys
    public final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
