package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzfvz extends zzftt {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfsx zzb;

    public zzfvz(Iterator it, zzfsx zzfsxVar) {
        this.zza = it;
        this.zzb = zzfsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfsx zzfsxVar = this.zzb;
            Object next = it.next();
            if (zzfsxVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
