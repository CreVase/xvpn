package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.ml1;

/* loaded from: classes.dex */
abstract class zzfyf extends zzfzj implements Runnable {
    ml1 zza;
    Class zzb;
    Object zzc;

    public zzfyf(ml1 ml1Var, Class cls, Object obj) {
        ml1Var.getClass();
        this.zza = ml1Var;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            ml1 r0 = r9.zza
            java.lang.Class r1 = r9.zzb
            java.lang.Object r2 = r9.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La4
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L22
            goto La4
        L22:
            r3 = 0
            r9.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgav     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzgav r4 = (com.google.android.gms.internal.ads.zzgav) r4     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            java.lang.Throwable r4 = r4.zzl()     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfzt.zzp(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L77
        L39:
            r4 = move-exception
            goto L3c
        L3b:
            r4 = move-exception
        L3c:
            r5 = r3
            goto L77
        L3e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L75
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Future type "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L75:
            r4 = r5
            goto L3c
        L77:
            if (r4 != 0) goto L7d
            r9.zzc(r5)
            return
        L7d:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La1
            java.lang.Object r0 = r9.zze(r2, r4)     // Catch: java.lang.Throwable -> L8f
            r9.zzb = r3
            r9.zzc = r3
            r9.zzf(r0)
            return
        L8f:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgak.zza(r0)     // Catch: java.lang.Throwable -> L9b
            r9.zzd(r0)     // Catch: java.lang.Throwable -> L9b
            r9.zzb = r3
            r9.zzc = r3
            return
        L9b:
            r0 = move-exception
            r9.zzb = r3
            r9.zzc = r3
            throw r0
        La1:
            r9.zzs(r0)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyf.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String zza() {
        String str;
        ml1 ml1Var = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (ml1Var != null) {
            str = hx2.q("inputFuture=[", ml1Var.toString(), "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
        }
        if (zza != null) {
            return str.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th) throws Exception;

    public abstract void zzf(Object obj);
}
