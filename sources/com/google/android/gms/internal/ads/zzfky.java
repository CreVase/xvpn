package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzfky {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfky zza = new zzfky();
    private Context zzb;

    private zzfky() {
    }

    public static zzfky zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.zzb = context2;
    }
}
