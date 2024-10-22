package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes.dex */
public final /* synthetic */ class zzge {
    public static <V> V zza(zzgd<V> zzgdVar) {
        try {
            return zzgdVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzgdVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
