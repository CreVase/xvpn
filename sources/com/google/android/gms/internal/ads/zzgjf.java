package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class zzgjf {
    private static final ThreadLocal zza = new zzgje();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    public static byte[] zzb(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzc() {
        try {
            try {
                try {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", ProviderInstaller.PROVIDER_NAME);
                        } catch (ClassNotFoundException e) {
                            e = e;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (InvocationTargetException e5) {
                            e = e5;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        }
                    } catch (GeneralSecurityException unused) {
                        return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]));
                    }
                } catch (GeneralSecurityException unused2) {
                    return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                }
            } catch (GeneralSecurityException unused3) {
                return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
            }
        } catch (GeneralSecurityException unused4) {
            return new SecureRandom();
        }
    }
}
