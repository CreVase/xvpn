package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class zzgt extends zzfvi {
    private final Map zza;

    public zzgt(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final Set entrySet() {
        return zzfxo.zzb(this.zza.entrySet(), new zzfsx() { // from class: com.google.android.gms.internal.ads.zzgr
            @Override // com.google.android.gms.internal.ads.zzfsx
            public final boolean zza(Object obj) {
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && super.zze(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final Set keySet() {
        return zzfxo.zzb(this.zza.keySet(), new zzfsx() { // from class: com.google.android.gms.internal.ads.zzgs
            @Override // com.google.android.gms.internal.ads.zzfsx
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi, com.google.android.gms.internal.ads.zzfvj
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final Map zzb() {
        return this.zza;
    }
}
