package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzgcg {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzgcg.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzgbi());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzgcg() {
    }

    public static synchronized zzgoz zza(zzgpe zzgpeVar) throws GeneralSecurityException {
        zzgoz zza2;
        synchronized (zzgcg.class) {
            zzgbf zzb2 = ((zzgbi) zzc.get()).zzb(zzgpeVar.zzg());
            if (((Boolean) zze.get(zzgpeVar.zzg())).booleanValue()) {
                zza2 = zzb2.zza(zzgpeVar.zzf());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgpeVar.zzg())));
            }
        }
        return zza2;
    }

    public static Class zzb(Class cls) {
        try {
            return zzgif.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzc(zzgoz zzgozVar, Class cls) throws GeneralSecurityException {
        return zzd(zzgozVar.zzg(), zzgozVar.zzf(), cls);
    }

    public static Object zzd(String str, zzgsr zzgsrVar, Class cls) throws GeneralSecurityException {
        return ((zzgbi) zzc.get()).zza(str, cls).zzb(zzgsrVar);
    }

    public static synchronized Map zze() {
        Map unmodifiableMap;
        synchronized (zzgcg.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzf(zzghv zzghvVar, boolean z) throws GeneralSecurityException {
        synchronized (zzgcg.class) {
            AtomicReference atomicReference = zzc;
            zzgbi zzgbiVar = new zzgbi((zzgbi) atomicReference.get());
            zzgbiVar.zzc(zzghvVar);
            Map zzc2 = zzghvVar.zza().zzc();
            String zzd2 = zzghvVar.zzd();
            zzh(zzd2, zzc2, true);
            if (!((zzgbi) atomicReference.get()).zzd(zzd2)) {
                zzd.put(zzd2, new zzgcf(zzghvVar));
                for (Map.Entry entry : zzghvVar.zza().zzc().entrySet()) {
                    zzg.put((String) entry.getKey(), (zzgbw) entry.getValue());
                }
            }
            zze.put(zzd2, Boolean.TRUE);
            zzc.set(zzgbiVar);
        }
    }

    public static synchronized void zzg(zzgce zzgceVar) throws GeneralSecurityException {
        synchronized (zzgcg.class) {
            zzgif.zza().zzf(zzgceVar);
        }
    }

    private static synchronized void zzh(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzgcg.class) {
            ConcurrentMap concurrentMap = zze;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((zzgbi) zzc.get()).zzd(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!zzg.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (zzg.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                    }
                }
            }
        }
    }
}
