package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public abstract class zzfkc {
    public static zzfkc zza(zzfkd zzfkdVar, zzfke zzfkeVar) {
        if (zzfka.zzb()) {
            return new zzfkg(zzfkdVar, zzfkeVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzfkj zzfkjVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
