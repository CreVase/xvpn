package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.hx2;
import defpackage.p71;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzalm {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static X509Certificate[][] zza(String str) throws zzalj, SecurityException, IOException {
        ?? r6;
        ByteOrder byteOrder;
        long j;
        ?? r1 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzaln.zzc(randomAccessFile);
            try {
                if (zzc != null) {
                    ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                    long longValue = ((Long) zzc.second).longValue();
                    long j2 = (-20) + longValue;
                    if (j2 >= 0) {
                        randomAccessFile.seek(j2);
                        if (randomAccessFile.readInt() == 1347094023) {
                            throw new zzalj("ZIP64 APK not supported");
                        }
                    }
                    long zza = zzaln.zza(byteBuffer);
                    if (zza < longValue) {
                        if (zzaln.zzb(byteBuffer) + zza == longValue) {
                            if (zza >= 32) {
                                try {
                                    r6 = ByteBuffer.allocate(24);
                                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    r6.order(byteOrder);
                                    j = longValue;
                                    randomAccessFile.seek(zza - r6.capacity());
                                    randomAccessFile.readFully(r6.array(), r6.arrayOffset(), r6.capacity());
                                } catch (Throwable th) {
                                    th = th;
                                    r6 = randomAccessFile;
                                }
                                try {
                                    if (r6.getLong(8) == 2334950737559900225L && r6.getLong(16) == 3617552046287187010L) {
                                        long j3 = r6.getLong(0);
                                        if (j3 >= r6.capacity() && j3 <= 2147483639) {
                                            int i = (int) (8 + j3);
                                            long j4 = zza - i;
                                            if (j4 >= 0) {
                                                try {
                                                    ByteBuffer allocate = ByteBuffer.allocate(i);
                                                    allocate.order(byteOrder);
                                                    r6 = randomAccessFile;
                                                    r6.seek(j4);
                                                    r6.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                                                    long j5 = zza;
                                                    long j6 = allocate.getLong(0);
                                                    if (j6 == j3) {
                                                        Pair create = Pair.create(allocate, Long.valueOf(j4));
                                                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                                        long longValue2 = ((Long) create.second).longValue();
                                                        if (byteBuffer2.order() == byteOrder) {
                                                            int capacity = byteBuffer2.capacity() - 24;
                                                            if (capacity >= 8) {
                                                                int capacity2 = byteBuffer2.capacity();
                                                                if (capacity <= byteBuffer2.capacity()) {
                                                                    int limit = byteBuffer2.limit();
                                                                    int position = byteBuffer2.position();
                                                                    try {
                                                                        byteBuffer2.position(0);
                                                                        byteBuffer2.limit(capacity);
                                                                        byteBuffer2.position(8);
                                                                        ByteBuffer slice = byteBuffer2.slice();
                                                                        slice.order(byteBuffer2.order());
                                                                        byteBuffer2.position(0);
                                                                        byteBuffer2.limit(limit);
                                                                        byteBuffer2.position(position);
                                                                        int i2 = 0;
                                                                        while (slice.hasRemaining()) {
                                                                            i2++;
                                                                            if (slice.remaining() >= 8) {
                                                                                long j7 = slice.getLong();
                                                                                if (j7 >= 4 && j7 <= 2147483647L) {
                                                                                    int i3 = (int) j7;
                                                                                    int position2 = slice.position() + i3;
                                                                                    if (i3 <= slice.remaining()) {
                                                                                        if (slice.getInt() == 1896449818) {
                                                                                            X509Certificate[][] zzl = zzl(r6.getChannel(), new zzali(zze(slice, i3 - 4), longValue2, j5, j, byteBuffer, null));
                                                                                            r6.close();
                                                                                            try {
                                                                                                r6.close();
                                                                                            } catch (IOException unused) {
                                                                                            }
                                                                                            return zzl;
                                                                                        }
                                                                                        long j8 = j;
                                                                                        long j9 = j5;
                                                                                        slice.position(position2);
                                                                                        j5 = j9;
                                                                                        j = j8;
                                                                                    } else {
                                                                                        throw new zzalj("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                                                                                    }
                                                                                } else {
                                                                                    throw new zzalj("APK Signing Block entry #" + i2 + " size out of range: " + j7);
                                                                                }
                                                                            } else {
                                                                                throw new zzalj("Insufficient data to read size of APK Signing Block entry #" + i2);
                                                                            }
                                                                        }
                                                                        throw new zzalj("No APK Signature Scheme v2 block in APK Signing Block");
                                                                    } catch (Throwable th2) {
                                                                        byteBuffer2.position(0);
                                                                        byteBuffer2.limit(limit);
                                                                        byteBuffer2.position(position);
                                                                        throw th2;
                                                                    }
                                                                }
                                                                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                            }
                                                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                                        }
                                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                                    }
                                                    throw new zzalj("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r6 = randomAccessFile;
                                                    r1 = r6;
                                                    try {
                                                        r1.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            throw new zzalj("APK Signing Block offset out of range: " + j4);
                                        }
                                        throw new zzalj("APK Signing Block size out of range: " + j3);
                                    }
                                    throw new zzalj("No APK Signing Block before ZIP Central Directory");
                                } catch (Throwable th4) {
                                    th = th4;
                                    r1 = r6;
                                    r1.close();
                                    throw th;
                                }
                            }
                            throw new zzalj("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                        }
                        throw new zzalj("ZIP Central Directory is not immediately followed by End of Central Directory");
                    }
                    throw new zzalj("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                }
                throw new zzalj("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            r1 = randomAccessFile;
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException(hx2.m("Unknown content digest algorthm: ", i));
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(hx2.m("Unknown content digest algorthm: ", i));
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 >= position && i2 <= limit) {
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i);
                }
                throw new IOException(hx2.n("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(hx2.m("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzalg zzalgVar = new zzalg(fileChannel, 0L, j);
            zzalg zzalgVar2 = new zzalg(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzaln.zzd(duplicate, j);
            zzale zzaleVar = new zzale(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            Iterator it = map.keySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((Integer) it.next()).intValue();
                i++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzalf[]{zzalgVar, zzalgVar2, zzaleVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                        throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(hx2.n("Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:            r11 = zzc(r10);        r12 = zzc(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:            if (r11 == 1) goto L141;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:            if (r12 == 1) goto L138;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzalf[] zzalfVarArr) throws DigestException {
        long j;
        int i;
        int length;
        String str;
        int i2 = 0;
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzalfVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i4 = 0;
            while (true) {
                length = iArr.length;
                if (i4 >= length) {
                    break;
                }
                int i5 = (int) j3;
                byte[] bArr2 = new byte[(zzb(iArr[i4]) * i5) + 5];
                bArr2[0] = 90;
                zzg(i5, bArr2, 1);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i6 = 0;
            while (true) {
                str = " digest not supported";
                if (i6 >= iArr.length) {
                    break;
                }
                String zzd = zzd(iArr[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(zzd);
                    i6++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < i) {
                zzalf zzalfVar = zzalfVarArr[i7];
                int i9 = i8;
                String str2 = str;
                long zza = zzalfVar.zza();
                long j4 = j;
                long j5 = j2;
                while (zza > j2) {
                    int min = (int) Math.min(zza, j4);
                    zzg(min, bArr3, 1);
                    for (int i10 = 0; i10 < length; i10++) {
                        messageDigestArr[i10].update(bArr3);
                    }
                    try {
                        zzalfVar.zzb(messageDigestArr, j5, min);
                        int i11 = 0;
                        while (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            byte[] bArr4 = bArr[i11];
                            int zzb = zzb(i12);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i11];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i9 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i11++;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        long j6 = min;
                        j5 += j6;
                        zza -= j6;
                        i9++;
                        j2 = 0;
                        j4 = 1048576;
                    } catch (IOException e2) {
                        throw new DigestException(hx2.n("Failed to digest chunk #", i9, " of section #", i2), e2);
                    }
                }
                i8 = i9;
                i2++;
                i7++;
                j2 = 0;
                j = 1048576;
                i = 3;
                str = str2;
            }
            String str3 = str;
            byte[][] bArr6 = new byte[iArr.length];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                byte[] bArr7 = bArr[i13];
                String zzd2 = zzd(i14);
                try {
                    bArr6[i13] = MessageDigest.getInstance(zzd2).digest(bArr7);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzd2.concat(str3), e3);
                }
            }
            return bArr6;
        }
        throw new DigestException("Too many chunks: " + j3);
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzali zzaliVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzaliVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(p71.k("Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        j = zzaliVar.zzb;
                        j2 = zzaliVar.zzc;
                        j3 = zzaliVar.zzd;
                        byteBuffer2 = zzaliVar.zze;
                        zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
