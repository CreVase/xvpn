package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class oi3 {
    public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws he1 {
        if (byteBuffer.hasArray()) {
            return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        if (byteBuffer.isDirect()) {
            return decodeUtf8Direct(byteBuffer, i, i2);
        }
        return decodeUtf8Default(byteBuffer, i, i2);
    }

    public abstract String decodeUtf8(byte[] bArr, int i, int i2) throws he1;

    public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws he1 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = byteBuffer.get(i);
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
                byte b3 = byteBuffer.get(i);
                isOneByte = ni3.isOneByte(b3);
                if (!isOneByte) {
                    isTwoBytes = ni3.isTwoBytes(b3);
                    if (!isTwoBytes) {
                        isThreeBytes = ni3.isThreeBytes(b3);
                        if (isThreeBytes) {
                            if (i6 < i3 - 1) {
                                int i7 = i6 + 1;
                                ni3.handleThreeBytes(b3, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                                i = i7 + 1;
                                i5++;
                            } else {
                                throw he1.invalidUtf8();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i6 + 1;
                            byte b4 = byteBuffer.get(i6);
                            int i9 = i8 + 1;
                            ni3.handleFourBytes(b3, b4, byteBuffer.get(i8), byteBuffer.get(i9), cArr, i5);
                            i = i9 + 1;
                            i5 = i5 + 1 + 1;
                        } else {
                            throw he1.invalidUtf8();
                        }
                    } else if (i6 < i3) {
                        ni3.handleTwoBytes(b3, byteBuffer.get(i6), cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw he1.invalidUtf8();
                    }
                } else {
                    int i10 = i5 + 1;
                    ni3.handleOneByte(b3, cArr, i5);
                    while (i6 < i3) {
                        byte b5 = byteBuffer.get(i6);
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
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws he1;

    public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

    public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
        } else if (byteBuffer.isDirect()) {
            encodeUtf8Direct(charSequence, byteBuffer);
        } else {
            encodeUtf8Default(charSequence, byteBuffer);
        }
    }

    public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i == length) {
            return;
        }
        position += i;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((charAt2 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i4 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i5 = i4 + 1;
                                    byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i6 = i5 + 1;
                                    byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i6, (byte) ((codePoint & 63) | 128));
                                    position = i6;
                                    i = i3;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i4;
                                    i = i3;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i = i3;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new ri3(i, length);
                }
                int i7 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position = i7 + 1;
                byteBuffer.put(i7, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i++;
            position++;
        }
    }

    public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return partialIsValidUtf8(0, bArr, i, i2) == 0;
    }

    public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
        }
        if (byteBuffer.isDirect()) {
            return partialIsValidUtf8Direct(i, byteBuffer, i2, i3);
        }
        return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
    }

    public abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:            if (r8.get(r9) > (-65)) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:            if (r8.get(r9) > (-65)) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:            if (r8.get(r7) > (-65)) goto L53;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
        /*
            r6 = this;
            if (r7 == 0) goto L92
            if (r9 < r10) goto L5
            return r7
        L5:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1e
            r7 = -62
            if (r0 < r7) goto L1d
            int r7 = r9 + 1
            byte r9 = r8.get(r9)
            if (r9 <= r3) goto L1a
            goto L1d
        L1a:
            r9 = r7
            goto L92
        L1d:
            return r2
        L1e:
            r4 = -16
            if (r0 >= r4) goto L4f
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L38
            int r7 = r9 + 1
            byte r9 = r8.get(r9)
            if (r7 < r10) goto L35
            int r7 = defpackage.ti3.access$000(r0, r9)
            return r7
        L35:
            r5 = r9
            r9 = r7
            r7 = r5
        L38:
            if (r7 > r3) goto L4e
            r4 = -96
            if (r0 != r1) goto L40
            if (r7 < r4) goto L4e
        L40:
            r1 = -19
            if (r0 != r1) goto L46
            if (r7 >= r4) goto L4e
        L46:
            int r7 = r9 + 1
            byte r9 = r8.get(r9)
            if (r9 <= r3) goto L1a
        L4e:
            return r2
        L4f:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L64
            int r7 = r9 + 1
            byte r1 = r8.get(r9)
            if (r7 < r10) goto L62
            int r7 = defpackage.ti3.access$000(r0, r1)
            return r7
        L62:
            r9 = 0
            goto L6a
        L64:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r9
            r9 = r7
            r7 = r5
        L6a:
            if (r9 != 0) goto L7c
            int r9 = r7 + 1
            byte r7 = r8.get(r7)
            if (r9 < r10) goto L79
            int r7 = defpackage.ti3.access$100(r0, r1, r7)
            return r7
        L79:
            r5 = r9
            r9 = r7
            r7 = r5
        L7c:
            if (r1 > r3) goto L91
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L91
            if (r9 > r3) goto L91
            int r9 = r7 + 1
            byte r7 = r8.get(r7)
            if (r7 <= r3) goto L92
        L91:
            return r2
        L92:
            int r7 = partialIsValidUtf8(r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi3.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
    }

    public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

    public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
        return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
    }

    private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
        int estimateConsecutiveAscii;
        int incompleteStateFor;
        int incompleteStateFor2;
        estimateConsecutiveAscii = ti3.estimateConsecutiveAscii(byteBuffer, i, i2);
        int i3 = estimateConsecutiveAscii + i;
        while (i3 < i2) {
            int i4 = i3 + 1;
            byte b2 = byteBuffer.get(i3);
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 >= i2) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                    i4++;
                } else {
                    if (b2 >= -16) {
                        if (i4 >= i2 - 2) {
                            incompleteStateFor2 = ti3.incompleteStateFor(byteBuffer, b2, i4, i2 - i4);
                            return incompleteStateFor2;
                        }
                        int i5 = i4 + 1;
                        byte b3 = byteBuffer.get(i4);
                        if (b3 <= -65) {
                            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0) {
                                int i6 = i5 + 1;
                                if (byteBuffer.get(i5) <= -65) {
                                    i3 = i6 + 1;
                                    if (byteBuffer.get(i6) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i2 - 1) {
                        incompleteStateFor = ti3.incompleteStateFor(byteBuffer, b2, i4, i2 - i4);
                        return incompleteStateFor;
                    }
                    int i7 = i4 + 1;
                    byte b4 = byteBuffer.get(i4);
                    if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i7) > -65))) {
                        return -1;
                    }
                    i3 = i7 + 1;
                }
            }
            i3 = i4;
        }
        return 0;
    }
}
