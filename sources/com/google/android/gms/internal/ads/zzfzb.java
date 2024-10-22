package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfzb extends zzfzd {
    public zzfzb(zzfvn zzfvnVar, boolean z) {
        super(zzfvnVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        Object obj;
        ArrayList zza = zzfwg.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfzc zzfzcVar = (zzfzc) it.next();
            if (zzfzcVar != null) {
                obj = zzfzcVar.zza;
            } else {
                obj = null;
            }
            zza.add(obj);
        }
        return Collections.unmodifiableList(zza);
    }
}
