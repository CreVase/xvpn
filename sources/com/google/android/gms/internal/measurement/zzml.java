package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzml extends zzmi {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            return r10 + r0;     */
    @Override // com.google.android.gms.internal.measurement.zzmi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zza(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final int zza(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i4 >= i3 - 1) {
                        return zzmh.zza(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i2 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (i4 >= i3 - 2) {
                    return zzmh.zza(bArr, i4, i3);
                }
                int i6 = i4 + 1;
                byte b4 = bArr[i4];
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i7 = i6 + 1;
                        if (bArr[i6] <= -65) {
                            i4 = i7 + 1;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i2 = i4;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final String zza(byte[] bArr, int i, int i2) throws zzji {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!(b2 >= 0)) {
                    break;
                }
                i++;
                zzmj.zza(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (b3 >= 0) {
                    int i7 = i5 + 1;
                    zzmj.zza(b3, cArr, i5);
                    while (i6 < i3) {
                        byte b4 = bArr[i6];
                        if (!(b4 >= 0)) {
                            break;
                        }
                        i6++;
                        zzmj.zza(b4, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (b3 < -32) {
                    if (i6 < i3) {
                        zzmj.zza(b3, bArr[i6], cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw zzji.zzd();
                    }
                } else if (b3 < -16) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        zzmj.zza(b3, bArr[i6], bArr[i8], cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        throw zzji.zzd();
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    byte b5 = bArr[i6];
                    int i10 = i9 + 1;
                    zzmj.zza(b3, b5, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw zzji.zzd();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
