package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class zzaqc implements Runnable {
    private zzaqc() {
    }

    public /* synthetic */ zzaqc(zzaqb zzaqbVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaqd.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzaqd.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaqd.zzb;
        } catch (Throwable th) {
            zzaqd.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
