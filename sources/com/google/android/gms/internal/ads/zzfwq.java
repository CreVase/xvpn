package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class zzfwq extends zzfwu {
    final /* synthetic */ Comparator zza;

    public zzfwq(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
