package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzfvv implements Map, Serializable {
    private transient zzfvx zza;
    private transient zzfvx zzb;
    private transient zzfvn zzc;

    public static zzfvv zzc(Map map) {
        int i;
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        zzfvu zzfvuVar = new zzfvu(i);
        zzfvuVar.zzb(entrySet);
        return zzfvuVar.zzc();
    }

    public static zzfvv zzd() {
        return zzfxh.zza;
    }

    public static zzfvv zze(Object obj, Object obj2) {
        zzfup.zzb("dialog_not_shown_reason", obj2);
        return zzfxh.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzfwn.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfxo.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfup.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzfvn zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfvn values() {
        zzfvn zzfvnVar = this.zzc;
        if (zzfvnVar == null) {
            zzfvn zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfvnVar;
    }

    public abstract zzfvx zzf();

    public abstract zzfvx zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfvx entrySet() {
        zzfvx zzfvxVar = this.zza;
        if (zzfvxVar == null) {
            zzfvx zzf = zzf();
            this.zza = zzf;
            return zzf;
        }
        return zzfvxVar;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfvx keySet() {
        zzfvx zzfvxVar = this.zzb;
        if (zzfvxVar == null) {
            zzfvx zzg = zzg();
            this.zzb = zzg;
            return zzg;
        }
        return zzfvxVar;
    }
}
