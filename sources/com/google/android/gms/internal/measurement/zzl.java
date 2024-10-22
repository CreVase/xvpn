package com.google.android.gms.internal.measurement;

import defpackage.hx2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzl {
    private Map<String, Callable<? extends zzal>> zza = new HashMap();

    public final zzaq zza(String str) {
        if (this.zza.containsKey(str)) {
            try {
                return this.zza.get(str).call();
            } catch (Exception unused) {
                throw new IllegalStateException(hx2.p("Failed to create API implementation: ", str));
            }
        }
        return zzaq.zzc;
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.zza.put(str, callable);
    }
}
