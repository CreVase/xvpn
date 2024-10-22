package com.google.protobuf;

import defpackage.he1;
import defpackage.ni3;
import defpackage.oi3;
import defpackage.ri3;
import defpackage.ti3;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o1 extends oi3 {
    public static boolean isAvailable() {
        if (n1.hasUnsafeArrayOperations() && n1.hasUnsafeByteBufferOperations()) {
            return true;
        }
        return false;
    }

    private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
        int i2 = 0;
        if (i < 16) {
            return 0;
        }
        int i3 = 8 - (((int) j) & 7);
        while (i2 < i3) {
            long j2 = 1 + j;
            if (n1.getByte(bArr, j) < 0) {
                return i2;
            }
            i2++;
            j = j2;
        }
        while (true) {
            int i4 = i2 + 8;
            if (i4 > i || (n1.getLong((Object) bArr, n1.BYTE_ARRAY_BASE_OFFSET + j) & (-9187201950435737472L)) != 0) {
                break;
            }
            j += 8;
            i2 = i4;
        }
        while (i2 < i) {
            long j3 = j + 1;
            if (n1.getByte(bArr, j) < 0) {
                return i2;
            }
            i2++;
            j = j3;
        }
        return i;
    }

    private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
        int incompleteStateFor;
        int incompleteStateFor2;
        int incompleteStateFor3;
        if (i2 == 0) {
            incompleteStateFor = ti3.incompleteStateFor(i);
            return incompleteStateFor;
        }
        if (i2 == 1) {
            incompleteStateFor2 = ti3.incompleteStateFor(i, n1.getByte(bArr, j));
            return incompleteStateFor2;
        }
        if (i2 == 2) {
            incompleteStateFor3 = ti3.incompleteStateFor(i, n1.getByte(bArr, j), n1.getByte(bArr, j + 1));
            return incompleteStateFor3;
        }
        throw new AssertionError();
    }

    @Override // defpackage.oi3
    public String decodeUtf8(byte[] bArr, int i, int i2) throws he1 {
        Charset charset = r0.UTF_8;
        String str = new String(bArr, i, i2, charset);
        if (!str.contains("�")) {
            return str;
        }
        if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            return str;
        }
        throw he1.invalidUtf8();
    }

    @Override // defpackage.oi3
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws he1 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            long addressOffset = n1.addressOffset(byteBuffer) + i;
            long j = i2 + addressOffset;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (addressOffset < j) {
                byte b2 = n1.getByte(addressOffset);
                isOneByte3 = ni3.isOneByte(b2);
                if (!isOneByte3) {
                    break;
                }
                addressOffset++;
                ni3.handleOneByte(b2, cArr, i3);
                i3++;
            }
            while (true) {
                int i4 = i3;
                while (addressOffset < j) {
                    long j2 = addressOffset + 1;
                    byte b3 = n1.getByte(addressOffset);
                    isOneByte = ni3.isOneByte(b3);
                    if (!isOneByte) {
                        isTwoBytes = ni3.isTwoBytes(b3);
                        if (!isTwoBytes) {
                            isThreeBytes = ni3.isThreeBytes(b3);
                            if (isThreeBytes) {
                                if (j2 < j - 1) {
                                    long j3 = j2 + 1;
                                    ni3.handleThreeBytes(b3, n1.getByte(j2), n1.getByte(j3), cArr, i4);
                                    i4++;
                                    addressOffset = j3 + 1;
                                } else {
                                    throw he1.invalidUtf8();
                                }
                            } else if (j2 < j - 2) {
                                long j4 = j2 + 1;
                                byte b4 = n1.getByte(j2);
                                long j5 = j4 + 1;
                                byte b5 = n1.getByte(j4);
                                addressOffset = j5 + 1;
                                ni3.handleFourBytes(b3, b4, b5, n1.getByte(j5), cArr, i4);
                                i3 = i4 + 1 + 1;
                            } else {
                                throw he1.invalidUtf8();
                            }
                        } else if (j2 < j) {
                            addressOffset = j2 + 1;
                            ni3.handleTwoBytes(b3, n1.getByte(j2), cArr, i4);
                            i4++;
                        } else {
                            throw he1.invalidUtf8();
                        }
                    } else {
                        int i5 = i4 + 1;
                        ni3.handleOneByte(b3, cArr, i4);
                        while (j2 < j) {
                            byte b6 = n1.getByte(j2);
                            isOneByte2 = ni3.isOneByte(b6);
                            if (!isOneByte2) {
                                break;
                            }
                            j2++;
                            ni3.handleOneByte(b6, cArr, i5);
                            i5++;
                        }
                        i4 = i5;
                        addressOffset = j2;
                    }
                }
                return new String(cArr, 0, i4);
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // defpackage.oi3
    public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length <= i2 && bArr.length - i2 >= i) {
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                n1.putByte(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < c && j4 < j5) {
                    long j6 = j4 + j;
                    n1.putByte(bArr, j4, (byte) charAt2);
                    j3 = j;
                    j2 = j6;
                } else {
                    if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j7 = j4 + j;
                        n1.putByte(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        n1.putByte(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        j2 = j7 + j;
                        j3 = j;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                        long j8 = j4 + j;
                        n1.putByte(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j9 = j8 + j;
                        n1.putByte(bArr, j8, (byte) (((charAt2 >>> 6) & 63) | 128));
                        n1.putByte(bArr, j9, (byte) ((charAt2 & '?') | 128));
                        j2 = j9 + 1;
                        j3 = 1;
                    } else {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j10 = j4 + 1;
                                    n1.putByte(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j11 = j10 + 1;
                                    n1.putByte(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j11 + 1;
                                    n1.putByte(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j12 + 1;
                                    n1.putByte(bArr, j12, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new ri3(i4 - 1, length);
                        }
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new ri3(i4, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                    }
                    i4++;
                    c = 128;
                    long j13 = j3;
                    j4 = j2;
                    j = j13;
                }
                i4++;
                c = 128;
                long j132 = j3;
                j4 = j2;
                j = j132;
            }
            return (int) j4;
        }
        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
    }

    @Override // defpackage.oi3
    public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c;
        long j;
        int i;
        char charAt;
        long addressOffset = n1.addressOffset(byteBuffer);
        long position = byteBuffer.position() + addressOffset;
        long limit = byteBuffer.limit() + addressOffset;
        int length = charSequence.length();
        if (length <= limit - position) {
            int i2 = 0;
            while (true) {
                c = 128;
                if (i2 >= length || (charAt = charSequence.charAt(i2)) >= 128) {
                    break;
                }
                n1.putByte(position, (byte) charAt);
                i2++;
                position++;
            }
            if (i2 == length) {
                return;
            }
            while (i2 < length) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 < c && position < limit) {
                    n1.putByte(position, (byte) charAt2);
                    position++;
                    j = addressOffset;
                } else if (charAt2 < 2048 && position <= limit - 2) {
                    j = addressOffset;
                    long j2 = position + 1;
                    n1.putByte(position, (byte) ((charAt2 >>> 6) | 960));
                    n1.putByte(j2, (byte) ((charAt2 & '?') | 128));
                    position = j2 + 1;
                } else {
                    j = addressOffset;
                    if ((charAt2 < 55296 || 57343 < charAt2) && position <= limit - 3) {
                        long j3 = position + 1;
                        n1.putByte(position, (byte) ((charAt2 >>> '\f') | 480));
                        long j4 = j3 + 1;
                        n1.putByte(j3, (byte) (((charAt2 >>> 6) & 63) | 128));
                        n1.putByte(j4, (byte) ((charAt2 & '?') | 128));
                        position = j4 + 1;
                    } else {
                        if (position <= limit - 4) {
                            int i3 = i2 + 1;
                            if (i3 != length) {
                                char charAt3 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j5 = position + 1;
                                    n1.putByte(position, (byte) ((codePoint >>> 18) | 240));
                                    long j6 = j5 + 1;
                                    n1.putByte(j5, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j7 = j6 + 1;
                                    n1.putByte(j6, (byte) (((codePoint >>> 6) & 63) | 128));
                                    long j8 = j7 + 1;
                                    n1.putByte(j7, (byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                    position = j8;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new ri3(i2 - 1, length);
                        }
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i)))) {
                            throw new ri3(i2, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                    }
                }
                i2++;
                addressOffset = j;
                c = 128;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:            if (com.google.protobuf.n1.getByte(r13, r2) > (-65)) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:            if (com.google.protobuf.n1.getByte(r13, r2) > (-65)) goto L59;     */
    @Override // defpackage.oi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o1.partialIsValidUtf8(int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:            if (com.google.protobuf.n1.getByte(r2) > (-65)) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:            if (com.google.protobuf.n1.getByte(r2) > (-65)) goto L59;     */
    @Override // defpackage.oi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o1.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
    }

    private static int unsafeEstimateConsecutiveAscii(long j, int i) {
        if (i < 16) {
            return 0;
        }
        int i2 = (int) ((-j) & 7);
        int i3 = i2;
        while (i3 > 0) {
            long j2 = 1 + j;
            if (n1.getByte(j) < 0) {
                return i2 - i3;
            }
            i3--;
            j = j2;
        }
        int i4 = i - i2;
        while (i4 >= 8 && (n1.getLong(j) & (-9187201950435737472L)) == 0) {
            j += 8;
            i4 -= 8;
        }
        return i - i4;
    }

    private static int unsafeIncompleteStateFor(long j, int i, int i2) {
        int incompleteStateFor;
        int incompleteStateFor2;
        int incompleteStateFor3;
        if (i2 == 0) {
            incompleteStateFor = ti3.incompleteStateFor(i);
            return incompleteStateFor;
        }
        if (i2 == 1) {
            incompleteStateFor2 = ti3.incompleteStateFor(i, n1.getByte(j));
            return incompleteStateFor2;
        }
        if (i2 == 2) {
            incompleteStateFor3 = ti3.incompleteStateFor(i, n1.getByte(j), n1.getByte(j + 1));
            return incompleteStateFor3;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:            return -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:            return -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int partialIsValidUtf8(byte[] r8, long r9, int r11) {
        /*
            int r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11)
            int r11 = r11 - r0
            long r0 = (long) r0
            long r9 = r9 + r0
        L7:
            r0 = 0
            r1 = 0
        L9:
            r2 = 1
            if (r11 <= 0) goto L1a
            long r4 = r9 + r2
            byte r1 = com.google.protobuf.n1.getByte(r8, r9)
            if (r1 < 0) goto L19
            int r11 = r11 + (-1)
            r9 = r4
            goto L9
        L19:
            r9 = r4
        L1a:
            if (r11 != 0) goto L1d
            return r0
        L1d:
            int r11 = r11 + (-1)
            r0 = -32
            r4 = -65
            r5 = -1
            if (r1 >= r0) goto L3a
            if (r11 != 0) goto L29
            return r1
        L29:
            int r11 = r11 + (-1)
            r0 = -62
            if (r1 < r0) goto L39
            long r2 = r2 + r9
            byte r9 = com.google.protobuf.n1.getByte(r8, r9)
            if (r9 <= r4) goto L37
            goto L39
        L37:
            r9 = r2
            goto L7
        L39:
            return r5
        L3a:
            r6 = -16
            if (r1 >= r6) goto L64
            r6 = 2
            if (r11 >= r6) goto L46
            int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
            return r8
        L46:
            int r11 = r11 + (-2)
            long r6 = r9 + r2
            byte r9 = com.google.protobuf.n1.getByte(r8, r9)
            if (r9 > r4) goto L63
            r10 = -96
            if (r1 != r0) goto L56
            if (r9 < r10) goto L63
        L56:
            r0 = -19
            if (r1 != r0) goto L5c
            if (r9 >= r10) goto L63
        L5c:
            long r2 = r2 + r6
            byte r9 = com.google.protobuf.n1.getByte(r8, r6)
            if (r9 <= r4) goto L37
        L63:
            return r5
        L64:
            r0 = 3
            if (r11 >= r0) goto L6c
            int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
            return r8
        L6c:
            int r11 = r11 + (-3)
            long r6 = r9 + r2
            byte r9 = com.google.protobuf.n1.getByte(r8, r9)
            if (r9 > r4) goto L8e
            int r10 = r1 << 28
            int r9 = r9 + 112
            int r9 = r9 + r10
            int r9 = r9 >> 30
            if (r9 != 0) goto L8e
            long r9 = r6 + r2
            byte r0 = com.google.protobuf.n1.getByte(r8, r6)
            if (r0 > r4) goto L8e
            long r2 = r2 + r9
            byte r9 = com.google.protobuf.n1.getByte(r8, r9)
            if (r9 <= r4) goto L37
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o1.partialIsValidUtf8(byte[], long, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:            return -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:            return -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int partialIsValidUtf8(long r8, int r10) {
        /*
            int r0 = unsafeEstimateConsecutiveAscii(r8, r10)
            long r1 = (long) r0
            long r8 = r8 + r1
            int r10 = r10 - r0
        L7:
            r0 = 0
            r1 = 0
        L9:
            r2 = 1
            if (r10 <= 0) goto L1a
            long r4 = r8 + r2
            byte r1 = com.google.protobuf.n1.getByte(r8)
            if (r1 < 0) goto L19
            int r10 = r10 + (-1)
            r8 = r4
            goto L9
        L19:
            r8 = r4
        L1a:
            if (r10 != 0) goto L1d
            return r0
        L1d:
            int r10 = r10 + (-1)
            r0 = -32
            r4 = -65
            r5 = -1
            if (r1 >= r0) goto L3a
            if (r10 != 0) goto L29
            return r1
        L29:
            int r10 = r10 + (-1)
            r0 = -62
            if (r1 < r0) goto L39
            long r2 = r2 + r8
            byte r8 = com.google.protobuf.n1.getByte(r8)
            if (r8 <= r4) goto L37
            goto L39
        L37:
            r8 = r2
            goto L7
        L39:
            return r5
        L3a:
            r6 = -16
            if (r1 >= r6) goto L64
            r6 = 2
            if (r10 >= r6) goto L46
            int r8 = unsafeIncompleteStateFor(r8, r1, r10)
            return r8
        L46:
            int r10 = r10 + (-2)
            long r6 = r8 + r2
            byte r8 = com.google.protobuf.n1.getByte(r8)
            if (r8 > r4) goto L63
            r9 = -96
            if (r1 != r0) goto L56
            if (r8 < r9) goto L63
        L56:
            r0 = -19
            if (r1 != r0) goto L5c
            if (r8 >= r9) goto L63
        L5c:
            long r2 = r2 + r6
            byte r8 = com.google.protobuf.n1.getByte(r6)
            if (r8 <= r4) goto L37
        L63:
            return r5
        L64:
            r0 = 3
            if (r10 >= r0) goto L6c
            int r8 = unsafeIncompleteStateFor(r8, r1, r10)
            return r8
        L6c:
            int r10 = r10 + (-3)
            long r6 = r8 + r2
            byte r8 = com.google.protobuf.n1.getByte(r8)
            if (r8 > r4) goto L8e
            int r9 = r1 << 28
            int r8 = r8 + 112
            int r8 = r8 + r9
            int r8 = r8 >> 30
            if (r8 != 0) goto L8e
            long r8 = r6 + r2
            byte r0 = com.google.protobuf.n1.getByte(r6)
            if (r0 > r4) goto L8e
            long r2 = r2 + r8
            byte r8 = com.google.protobuf.n1.getByte(r8)
            if (r8 <= r4) goto L37
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o1.partialIsValidUtf8(long, int):int");
    }
}
