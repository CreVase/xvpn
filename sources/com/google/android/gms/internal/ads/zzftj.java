package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzftj {
    private final zzfsh zza;
    private final zzfti zzb;

    private zzftj(zzfti zzftiVar) {
        zzfsg zzfsgVar = zzfsg.zza;
        this.zzb = zzftiVar;
        this.zza = zzfsgVar;
    }

    public static zzftj zzb(int i) {
        return new zzftj(new zzftf(4000));
    }

    public static zzftj zzc(zzfsh zzfshVar) {
        return new zzftj(new zzftd(zzfshVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzftg(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
