package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzgbu {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgbt zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzgbt zzgbtVar = (zzgbt) it.next();
            if (zzgbtVar.zza()) {
                return zzgbtVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
