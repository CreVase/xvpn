package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzako {
    public final int zza;
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzako(int i, String str, List list, byte[] bArr) {
        List unmodifiableList;
        this.zza = i;
        this.zzb = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzc = unmodifiableList;
        this.zzd = bArr;
    }
}
