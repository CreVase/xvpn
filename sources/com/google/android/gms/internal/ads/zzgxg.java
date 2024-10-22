package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgxg extends zzgxf {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:            if (r13[r14] <= (-65)) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:            if (r13[r14] <= (-65)) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:            if (r13[r14] <= (-65)) goto L11;     */
    @Override // com.google.android.gms.internal.ads.zzgxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxg.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzb(byte[] bArr, int i, int i2) throws zzgul {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!zzgxe.zzd(b2)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b2;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b3 = bArr[i];
                if (zzgxe.zzd(b3)) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b4 = bArr[i];
                            if (zzgxe.zzd(b4)) {
                                i++;
                                i6 = i4 + 1;
                                cArr[i4] = (char) b4;
                            }
                        }
                    }
                } else if (zzgxe.zzf(b3)) {
                    if (i5 < i3) {
                        zzgxe.zzc(b3, bArr[i5], cArr, i4);
                        i4++;
                        i = i5 + 1;
                    } else {
                        throw zzgul.zzd();
                    }
                } else if (zzgxe.zze(b3)) {
                    if (i5 < i3 - 1) {
                        int i7 = i5 + 1;
                        zzgxe.zzb(b3, bArr[i5], bArr[i7], cArr, i4);
                        i4++;
                        i = i7 + 1;
                    } else {
                        throw zzgul.zzd();
                    }
                } else if (i5 < i3 - 2) {
                    int i8 = i5 + 1;
                    byte b5 = bArr[i5];
                    int i9 = i8 + 1;
                    zzgxe.zza(b3, b5, bArr[i8], bArr[i9], cArr, i4);
                    i4 += 2;
                    i = i9 + 1;
                } else {
                    throw zzgul.zzd();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
