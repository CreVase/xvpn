package com.google.android.gms.internal.play_billing;

import defpackage.p71;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzv {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzv(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        StringBuilder q = p71.q("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        q.append(valueOf3);
        q.append("=");
        q.append(valueOf4);
        return new IllegalArgumentException(q.toString());
    }
}
