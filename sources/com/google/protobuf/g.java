package com.google.protobuf;

import defpackage.d73;
import defpackage.e02;
import defpackage.fs;
import defpackage.hx2;
import defpackage.is;
import defpackage.ks;
import defpackage.ml2;
import defpackage.ns;
import defpackage.p71;
import defpackage.ps;
import defpackage.rs;
import defpackage.ss;
import defpackage.ts;
import defpackage.ws;
import defpackage.ya;
import defpackage.ys;
import defpackage.zs;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class g implements Iterable, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final g EMPTY = new ws(r0.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<g> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final rs byteArrayCopier;
    private int hash = 0;

    static {
        rs nsVar;
        is isVar = null;
        if (ya.isOnAndroidDevice()) {
            nsVar = new zs(isVar);
        } else {
            nsVar = new ns(isVar);
        }
        byteArrayCopier = nsVar;
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new ks();
    }

    private static g balancedConcat(Iterator<g> it, int i) {
        if (i >= 1) {
            if (i == 1) {
                return it.next();
            }
            int i2 = i >>> 1;
            return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hx2.m("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(hx2.n("Index > length: ", i, ", ", i2));
        }
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(hx2.n("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(hx2.n("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(p71.k("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    public static g copyFrom(byte[] bArr, int i, int i2) {
        checkRange(i, i + i2, bArr.length);
        return new ws(byteArrayCopier.copyFrom(bArr, i, i2));
    }

    public static g copyFromUtf8(String str) {
        return new ws(str.getBytes(r0.UTF_8));
    }

    public static final g empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i) {
        int hexDigit = hexDigit(str.charAt(i));
        if (hexDigit != -1) {
            return hexDigit;
        }
        StringBuilder u = hx2.u("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        u.append(str.charAt(i));
        u.append(" at index ");
        u.append(i);
        throw new NumberFormatException(u.toString());
    }

    public static g fromHex(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (extractHexDigit(str, i2 + 1) | (extractHexDigit(str, i2) << 4));
            }
            return new ws(bArr);
        }
        StringBuilder u = hx2.u("Invalid hexString ", str, " of length ");
        u.append(str.length());
        u.append(" must be even.");
        throw new NumberFormatException(u.toString());
    }

    private static int hexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c < 'A' || c > 'F') {
            c2 = 'a';
            if (c < 'a' || c > 'f') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static ts newCodedBuilder(int i) {
        return new ts(i, null);
    }

    public static ys newOutput(int i) {
        return new ys(i);
    }

    private static g readChunk(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static g readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, MAX_READ_FROM_CHUNK_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b2) {
        return b2 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return d73.escapeBytes(this);
        }
        return d73.escapeBytes(substring(0, 47)) + "...";
    }

    public static Comparator<g> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static g wrap(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        }
        return new e02(byteBuffer);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final g concat(g gVar) {
        if (Integer.MAX_VALUE - size() >= gVar.size()) {
            return ml2.concatenate(this, gVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + gVar.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(g gVar) {
        if (size() >= gVar.size() && substring(size() - gVar.size()).equals(gVar)) {
            return true;
        }
        return false;
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidUtf8();

    public abstract m newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(g gVar) {
        if (size() < gVar.size() || !substring(0, gVar.size()).equals(gVar)) {
            return false;
        }
        return true;
    }

    public final g substring(int i) {
        return substring(i, size());
    }

    public abstract g substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return r0.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(r0.UTF_8);
    }

    public abstract void writeTo(fs fsVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    public abstract void writeToReverse(fs fsVar) throws IOException;

    public static ys newOutput() {
        return new ys(128);
    }

    public static g readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    @Override // java.lang.Iterable
    public ss iterator() {
        return new is(this);
    }

    public static g copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static g readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            g readChunk = readChunk(inputStream, i);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i = Math.min(i * 2, i2);
        }
    }

    public static g copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new ws(bArr);
    }

    public static g wrap(byte[] bArr) {
        return new ws(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static g wrap(byte[] bArr, int i, int i2) {
        return new ps(bArr, i, i2);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static g copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static g copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new ws(str.getBytes(str2));
    }

    public static g copyFrom(String str, Charset charset) {
        return new ws(str.getBytes(charset));
    }

    public static g copyFrom(Iterable<g> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<g> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
