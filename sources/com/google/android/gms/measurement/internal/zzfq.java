package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.hx2;
import defpackage.p71;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzfq {
    private static final AtomicReference<String[]> zza = new AtomicReference<>();
    private static final AtomicReference<String[]> zzb = new AtomicReference<>();
    private static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzfp zzd;

    public zzfq(zzfp zzfpVar) {
        this.zzd = zzfpVar;
    }

    private final String zza(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder n = p71.n("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zza((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (n.length() != 1) {
                    n.append(", ");
                }
                n.append(valueOf);
            }
        }
        n.append("]");
        return n.toString();
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zza(str, zzik.zzb, zzik.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return hx2.q("experiment_id(", str, ")");
        }
        return zza(str, zzij.zzb, zzij.zza, zzc);
    }

    public final String zza(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder n = p71.n("Bundle[{");
        for (String str : bundle.keySet()) {
            if (n.length() != 8) {
                n.append(", ");
            }
            n.append(zzb(str));
            n.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zza(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            n.append(valueOf);
        }
        n.append("}]");
        return n.toString();
    }

    public final String zza(zzbg zzbgVar) {
        String str = null;
        if (zzbgVar == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbgVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbgVar.zza));
        sb.append(",params=");
        zzbb zzbbVar = zzbgVar.zzb;
        if (zzbbVar != null) {
            if (!this.zzd.zza()) {
                str = zzbbVar.toString();
            } else {
                str = zza(zzbbVar.zzb());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zzii.zzc, zzii.zza, zza);
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || (str != null && str.equals(obj))) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }
}
