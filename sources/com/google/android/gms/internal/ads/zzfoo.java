package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzfoo {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfop zzc;
    private final zzfmq zzd;
    private final zzfml zze;
    private zzfod zzf;
    private final Object zzg = new Object();

    public zzfoo(Context context, zzfop zzfopVar, zzfmq zzfmqVar, zzfml zzfmlVar) {
        this.zzb = context;
        this.zzc = zzfopVar;
        this.zzd = zzfmqVar;
        this.zze = zzfmlVar;
    }

    private final synchronized Class zzd(zzfoe zzfoeVar) throws zzfon {
        String zzk = zzfoeVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfoeVar.zzc())) {
                try {
                    File zzb = zzfoeVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzfoeVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new zzfon(2008, e);
                }
            }
            throw new zzfon(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new zzfon(2026, e2);
        }
    }

    public final zzfmt zza() {
        zzfod zzfodVar;
        synchronized (this.zzg) {
            zzfodVar = this.zzf;
        }
        return zzfodVar;
    }

    public final zzfoe zzb() {
        synchronized (this.zzg) {
            zzfod zzfodVar = this.zzf;
            if (zzfodVar != null) {
                return zzfodVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzfoe zzfoeVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfod zzfodVar = new zzfod(zzd(zzfoeVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfoeVar.zze(), null, new Bundle(), 2), zzfoeVar, this.zzc, this.zzd);
                if (zzfodVar.zzh()) {
                    int zze = zzfodVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfod zzfodVar2 = this.zzf;
                            if (zzfodVar2 != null) {
                                try {
                                    zzfodVar2.zzg();
                                } catch (zzfon e) {
                                    this.zzd.zzc(e.zza(), -1L, e);
                                }
                            }
                            this.zzf = zzfodVar;
                        }
                        this.zzd.zzd(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfon(4001, "ci: " + zze);
                }
                throw new zzfon(4000, "init failed");
            } catch (Exception e2) {
                throw new zzfon(2004, e2);
            }
        } catch (zzfon e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
