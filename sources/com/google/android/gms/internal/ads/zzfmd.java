package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzfmd extends zzfme {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfmd(zzflw zzflwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzflwVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
