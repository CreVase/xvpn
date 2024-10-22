package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaqd {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        Vector zzb2 = zzb(bArr, 255);
        if (zzb2 != null && !zzb2.isEmpty()) {
            zzapv zza2 = zzapw.zza();
            int size = zzb2.size();
            for (int i = 0; i < size; i++) {
                zza2.zza(zzgsr.zzv(zzg((byte[]) zzb2.get(i), str, false), 0, UserVerificationMethods.USER_VERIFY_HANDPRINT));
            }
            byte[] zze2 = zze(bArr);
            zzgsr zzgsrVar = zzgsr.zzb;
            zza2.zzb(zzgsr.zzv(zze2, 0, zze2.length));
            zzg = ((zzapw) zza2.zzal()).zzax();
        } else {
            zzg = zzg(zzf(v.DEFAULT_BUFFER_SIZE).zzax(), str, true);
        }
        return zzapz.zza(zzg, true);
    }

    public static Vector zzb(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzaqc(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:            r1.reset();        r1.update(r6);        r6 = com.google.android.gms.internal.ads.zzaqd.zzd.digest();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaqd.zze
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzaqd.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzaqd.zzd     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzaqd.zzd     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqd.zze(byte[]):byte[]");
    }

    public static zzapj zzf(int i) {
        zzaom zza2 = zzapj.zza();
        zza2.zzD(4096L);
        return (zzapj) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i;
        byte[] array;
        int length = bArr.length;
        if (true != z) {
            i = 255;
        } else {
            i = 239;
        }
        if (length > i) {
            bArr = zzf(v.DEFAULT_BUFFER_SIZE).zzax();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_HANDPRINT).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        zzaqe[] zzaqeVarArr = new zzard().zzcG;
        int length3 = zzaqeVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzaqeVarArr[i3].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzapx(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
