package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzauc {
    protected static final String zza = "zzauc";
    private final zzasp zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzauc(zzasp zzaspVar, String str, String str2, Class... clsArr) {
        this.zzb = zzaspVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaspVar.zzk().submit(new zzaub(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzauc zzaucVar) {
        CountDownLatch countDownLatch;
        Class<?> loadClass;
        try {
            try {
                zzasp zzaspVar = zzaucVar.zzb;
                loadClass = zzaspVar.zzi().loadClass(zzaucVar.zzc(zzaspVar.zzu(), zzaucVar.zzc));
            } catch (NullPointerException unused) {
                countDownLatch = zzaucVar.zzg;
            } catch (Throwable th) {
                zzaucVar.zzg.countDown();
                throw th;
            }
        } catch (zzart | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (loadClass == null) {
            countDownLatch = zzaucVar.zzg;
        } else {
            zzaucVar.zze = loadClass.getMethod(zzaucVar.zzc(zzaucVar.zzb.zzu(), zzaucVar.zzd), zzaucVar.zzf);
            if (zzaucVar.zze == null) {
                countDownLatch = zzaucVar.zzg;
            }
            countDownLatch = zzaucVar.zzg;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzart, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (!this.zzg.await(2L, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zze;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
