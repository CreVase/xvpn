package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzap {
    private final String zza;
    private final zzao zzb;
    private zzao zzc;

    public /* synthetic */ zzap(String str, zzam zzamVar) {
        zzao zzaoVar = new zzao(null);
        this.zzb = zzaoVar;
        this.zzc = zzaoVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzao zzaoVar = this.zzb.zzc;
        String str = "";
        while (zzaoVar != null) {
            Object obj = zzaoVar.zzb;
            boolean z = zzaoVar instanceof zzan;
            sb.append(str);
            String str2 = zzaoVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb.append(obj);
            }
            zzaoVar = zzaoVar.zzc;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzap zza(String str, int i) {
        String valueOf = String.valueOf(i);
        zzan zzanVar = new zzan(null);
        this.zzc.zzc = zzanVar;
        this.zzc = zzanVar;
        zzanVar.zzb = valueOf;
        zzanVar.zza = "errorCode";
        return this;
    }

    public final zzap zzb(String str, Object obj) {
        zzao zzaoVar = new zzao(null);
        this.zzc.zzc = zzaoVar;
        this.zzc = zzaoVar;
        zzaoVar.zzb = obj;
        zzaoVar.zza = str;
        return this;
    }
}
