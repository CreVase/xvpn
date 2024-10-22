package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgqz implements zzgre {
    private final zzgrn zza;

    @Override // com.google.android.gms.internal.ads.zzgre
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgrf.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
