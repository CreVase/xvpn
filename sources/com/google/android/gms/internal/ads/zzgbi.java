package com.google.android.gms.internal.ads;

import defpackage.p71;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgbi {
    private static final Logger zza = Logger.getLogger(zzgbi.class.getName());
    private final ConcurrentMap zzb;

    public zzgbi() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzgbh zze(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgbh) this.zzb.get(str);
    }

    private final synchronized void zzf(zzgbh zzgbhVar, boolean z) throws GeneralSecurityException {
        String zzc = zzgbhVar.zza().zzc();
        zzgbh zzgbhVar2 = (zzgbh) this.zzb.get(zzc);
        if (zzgbhVar2 != null && !zzgbhVar2.zza.getClass().equals(zzgbhVar.zza.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzc));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzc, zzgbhVar2.zza.getClass().getName(), zzgbhVar.zza.getClass().getName()));
        }
        this.zzb.putIfAbsent(zzc, zzgbhVar);
    }

    public final zzgbf zza(String str, Class cls) throws GeneralSecurityException {
        zzgbh zze = zze(str);
        if (zze.zza.zzl().contains(cls)) {
            try {
                return new zzgbg(zze.zza, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }
        String name = cls.getName();
        zzghv zzghvVar = zze.zza;
        String valueOf = String.valueOf(zzghvVar.getClass());
        Set<Class> zzl = zzghvVar.zzl();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zzl) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder q = p71.q("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        q.append(sb2);
        throw new GeneralSecurityException(q.toString());
    }

    public final zzgbf zzb(String str) throws GeneralSecurityException {
        return zze(str).zza();
    }

    public final synchronized void zzc(zzghv zzghvVar) throws GeneralSecurityException {
        if (zzghf.zza(zzghvVar.zzf())) {
            zzf(new zzgbh(zzghvVar), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzghvVar.getClass()) + " as it is not FIPS compatible.");
        }
    }

    public final boolean zzd(String str) {
        return this.zzb.containsKey(str);
    }

    public zzgbi(zzgbi zzgbiVar) {
        this.zzb = new ConcurrentHashMap(zzgbiVar.zzb);
    }
}
