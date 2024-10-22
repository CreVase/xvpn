package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
public final class zzdst extends zzdsw {
    private final zzfij zzg;

    public zzdst(Executor executor, zzcay zzcayVar, zzfij zzfijVar, zzfil zzfilVar, Context context) {
        super(executor, zzcayVar, zzfilVar, context);
        this.zzg = zzfijVar;
        zzfijVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
