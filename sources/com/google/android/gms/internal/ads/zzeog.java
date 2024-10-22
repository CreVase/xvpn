package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class zzeog implements zzetw {
    private final Set zza;

    public zzeog(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzfzt.zzh(new zzetv() { // from class: com.google.android.gms.internal.ads.zzeof
            @Override // com.google.android.gms.internal.ads.zzetv
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
