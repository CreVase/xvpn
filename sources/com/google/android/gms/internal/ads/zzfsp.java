package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfsp {
    private final String zza;
    private final zzfsn zzb;
    private zzfsn zzc;

    public /* synthetic */ zzfsp(String str, zzfso zzfsoVar) {
        zzfsn zzfsnVar = new zzfsn(null);
        this.zzb = zzfsnVar;
        this.zzc = zzfsnVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfsn zzfsnVar = this.zzb.zzb;
        String str = "";
        while (zzfsnVar != null) {
            Object obj = zzfsnVar.zza;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb.append(obj);
            }
            zzfsnVar = zzfsnVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfsp zza(Object obj) {
        zzfsn zzfsnVar = new zzfsn(null);
        this.zzc.zzb = zzfsnVar;
        this.zzc = zzfsnVar;
        zzfsnVar.zza = obj;
        return this;
    }
}
