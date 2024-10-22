package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
final class zzfyx extends zzfyu {
    public /* synthetic */ zzfyx(zzfyw zzfywVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int zza(zzfyy zzfyyVar) {
        int i;
        int i2;
        synchronized (zzfyyVar) {
            i = zzfyyVar.remaining;
            i2 = i - 1;
            zzfyyVar.remaining = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final void zzb(zzfyy zzfyyVar, Set set, Set set2) {
        Set set3;
        synchronized (zzfyyVar) {
            set3 = zzfyyVar.seenExceptions;
            if (set3 == null) {
                zzfyyVar.seenExceptions = set2;
            }
        }
    }

    private zzfyx() {
        super(null);
    }
}
