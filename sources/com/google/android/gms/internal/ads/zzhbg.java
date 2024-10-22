package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhbg extends zzhay {
    private static final zzhbp zza = zzhbd.zza(Collections.emptyMap());

    public /* synthetic */ zzhbg(Map map, zzhbe zzhbeVar) {
        super(map);
    }

    public static zzhbf zzc(int i) {
        return new zzhbf(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzhaz.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhbp) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
