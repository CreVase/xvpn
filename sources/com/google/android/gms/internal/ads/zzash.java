package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzash {
    private List zza = Collections.emptyList();

    public final List zza() {
        List list = this.zza;
        this.zza = Collections.emptyList();
        return list;
    }

    public final void zzb(List list) {
        this.zza = new ArrayList(list);
    }
}
