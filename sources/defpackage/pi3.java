package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class pi3 extends oi3 {
    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
        int incompleteStateFor;
        int incompleteStateFor2;
        while (i < i2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i3 >= i2) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i3 >= i2 - 1) {
                        incompleteStateFor = ti3.incompleteStateFor(bArr, i3, i2);
                        return incompleteStateFor;
                    }
                    int i4 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 2) {
                    incompleteStateFor2 = ti3.incompleteStateFor(bArr, i3, i2);
                    return incompleteStateFor2;
                }
                int i5 = i3 + 1;
                byte b4 = bArr[i3];
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    @Override // defpackage.oi3
    public String decodeUtf8(byte[] bArr, int i, int i2) throws he1 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                isOneByte3 = ni3.isOneByte(b2);
                if (!isOneByte3) {
                    break;
                }
                i++;
                ni3.handleOneByte(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                isOneByte = ni3.isOneByte(b3);
                if (!isOneByte) {
                    isTwoBytes = ni3.isTwoBytes(b3);
                    if (!isTwoBytes) {
                        isThreeBytes = ni3.isThreeBytes(b3);
                        if (isThreeBytes) {
                            if (i6 < i3 - 1) {
                                int i7 = i6 + 1;
                                ni3.handleThreeBytes(b3, bArr[i6], bArr[i7], cArr, i5);
                                i = i7 + 1;
                                i5++;
                            } else {
                                throw he1.invalidUtf8();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i6 + 1;
                            byte b4 = bArr[i6];
                            int i9 = i8 + 1;
                            ni3.handleFourBytes(b3, b4, bArr[i8], bArr[i9], cArr, i5);
                            i = i9 + 1;
                            i5 = i5 + 1 + 1;
                        } else {
                            throw he1.invalidUtf8();
                        }
                    } else if (i6 < i3) {
                        ni3.handleTwoBytes(b3, bArr[i6], cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw he1.invalidUtf8();
                    }
                } else {
                    int i10 = i5 + 1;
                    ni3.handleOneByte(b3, cArr, i5);
                    while (i6 < i3) {
                        byte b5 = bArr[i6];
                        isOneByte2 = ni3.isOneByte(b5);
                        if (!isOneByte2) {
                            break;
                        }
                        i6++;
                        ni3.handleOneByte(b5, cArr, i10);
                        i10++;
                    }
                    i = i6;
                    i5 = i10;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // defpackage.oi3
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws he1 {
        return decodeUtf8Default(byteBuffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            return r10 + r0;     */
    @Override // defpackage.oi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi3.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // defpackage.oi3
    public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        encodeUtf8Default(charSequence, byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:            if (r8[r9] > (-65)) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:            if (r8[r9] > (-65)) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:            if (r8[r7] > (-65)) goto L53;     */
    @Override // defpackage.oi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
        /*
            r6 = this;
            if (r7 == 0) goto L86
            if (r9 < r10) goto L5
            return r7
        L5:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r7 = -62
            if (r0 < r7) goto L1b
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r9 <= r3) goto L18
            goto L1b
        L18:
            r9 = r7
            goto L86
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L34
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r7 < r10) goto L31
            int r7 = defpackage.ti3.access$000(r0, r9)
            return r7
        L31:
            r5 = r9
            r9 = r7
            r7 = r5
        L34:
            if (r7 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r7 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r7 >= r4) goto L48
        L42:
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r9 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r7 = r9 + 1
            r1 = r8[r9]
            if (r7 < r10) goto L5a
            int r7 = defpackage.ti3.access$000(r0, r1)
            return r7
        L5a:
            r9 = 0
            goto L62
        L5c:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r9
            r9 = r7
            r7 = r5
        L62:
            if (r9 != 0) goto L72
            int r9 = r7 + 1
            r7 = r8[r7]
            if (r9 < r10) goto L6f
            int r7 = defpackage.ti3.access$100(r0, r1, r7)
            return r7
        L6f:
            r5 = r9
            r9 = r7
            r7 = r5
        L72:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L85
            if (r9 > r3) goto L85
            int r9 = r7 + 1
            r7 = r8[r7]
            if (r7 <= r3) goto L86
        L85:
            return r2
        L86:
            int r7 = partialIsValidUtf8(r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi3.partialIsValidUtf8(int, byte[], int, int):int");
    }

    @Override // defpackage.oi3
    public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
    }

    private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i, i2);
    }
}
