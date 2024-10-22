package defpackage;

/* loaded from: classes.dex */
public final class qi3 extends pe0 {
    public final /* synthetic */ int q;

    public static int b0(byte[] bArr, int i, long j, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return ui3.d(i, zh3.g(bArr, j), zh3.g(bArr, j + 1));
                }
                throw new AssertionError();
            }
            return ui3.c(i, zh3.g(bArr, j));
        }
        qi3 qi3Var = ui3.f4677a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Y(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi3.Y(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Z(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi3.Z(java.lang.CharSequence, byte[], int, int):int");
    }

    public final int a0(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4 = i;
        switch (this.q) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) >= 0) {
                    long j2 = i4;
                    int i5 = (int) (i2 - j2);
                    if (i5 < 16) {
                        i3 = 0;
                    } else {
                        long j3 = j2;
                        i3 = 0;
                        while (true) {
                            if (i3 < i5) {
                                long j4 = j3 + 1;
                                if (zh3.g(bArr, j3) >= 0) {
                                    i3++;
                                    j3 = j4;
                                }
                            } else {
                                i3 = i5;
                            }
                        }
                    }
                    int i6 = i5 - i3;
                    long j5 = j2 + i3;
                    while (true) {
                        byte b2 = 0;
                        while (true) {
                            if (i6 > 0) {
                                long j6 = j5 + 1;
                                b2 = zh3.g(bArr, j5);
                                if (b2 >= 0) {
                                    i6--;
                                    j5 = j6;
                                } else {
                                    j5 = j6;
                                }
                            }
                        }
                        if (i6 == 0) {
                            return 0;
                        }
                        int i7 = i6 - 1;
                        if (b2 < -32) {
                            if (i7 == 0) {
                                return b2;
                            }
                            i6 = i7 - 1;
                            if (b2 >= -62) {
                                j = j5 + 1;
                                if (zh3.g(bArr, j5) > -65) {
                                }
                                j5 = j;
                            }
                        } else if (b2 < -16) {
                            if (i7 < 2) {
                                return b0(bArr, b2, j5, i7);
                            }
                            i6 = i7 - 2;
                            long j7 = j5 + 1;
                            byte g = zh3.g(bArr, j5);
                            if (g <= -65 && ((b2 != -32 || g >= -96) && (b2 != -19 || g < -96))) {
                                j5 = j7 + 1;
                                if (zh3.g(bArr, j7) > -65) {
                                }
                            }
                        } else {
                            if (i7 < 3) {
                                return b0(bArr, b2, j5, i7);
                            }
                            i6 = i7 - 3;
                            long j8 = j5 + 1;
                            byte g2 = zh3.g(bArr, j5);
                            if (g2 <= -65 && (((g2 + 112) + (b2 << 28)) >> 30) == 0) {
                                long j9 = j8 + 1;
                                if (zh3.g(bArr, j8) <= -65) {
                                    j = j9 + 1;
                                    if (zh3.g(bArr, j9) > -65) {
                                    }
                                    j5 = j;
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i8 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 < 0) {
                    if (b3 < -32) {
                        if (i8 >= i2) {
                            return b3;
                        }
                        if (b3 >= -62) {
                            i4 = i8 + 1;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b3 < -16) {
                        if (i8 >= i2 - 1) {
                            return ui3.a(bArr, i8, i2);
                        }
                        int i9 = i8 + 1;
                        byte b4 = bArr[i8];
                        if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                            i4 = i9 + 1;
                            if (bArr[i9] > -65) {
                            }
                        }
                    } else {
                        if (i8 >= i2 - 2) {
                            return ui3.a(bArr, i8, i2);
                        }
                        int i10 = i8 + 1;
                        byte b5 = bArr[i8];
                        if (b5 <= -65 && (((b5 + 112) + (b3 << 28)) >> 30) == 0) {
                            int i11 = i10 + 1;
                            if (bArr[i10] <= -65) {
                                i8 = i11 + 1;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i4 = i8;
            }
        }
        return 0;
    }
}
