package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class j1 extends m1 {
    private static final long SMALL_ADDRESS_MASK = -1;

    public j1(Unsafe unsafe) {
        super(unsafe);
    }

    private static int smallAddress(long j) {
        return (int) (j & SMALL_ADDRESS_MASK);
    }

    @Override // com.google.protobuf.m1
    public void copyMemory(long j, byte[] bArr, long j2, long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.m1
    public boolean getBoolean(Object obj, long j) {
        boolean booleanLittleEndian;
        boolean booleanBigEndian;
        if (n1.IS_BIG_ENDIAN) {
            booleanBigEndian = n1.getBooleanBigEndian(obj, j);
            return booleanBigEndian;
        }
        booleanLittleEndian = n1.getBooleanLittleEndian(obj, j);
        return booleanLittleEndian;
    }

    @Override // com.google.protobuf.m1
    public byte getByte(Object obj, long j) {
        byte byteLittleEndian;
        byte byteBigEndian;
        if (n1.IS_BIG_ENDIAN) {
            byteBigEndian = n1.getByteBigEndian(obj, j);
            return byteBigEndian;
        }
        byteLittleEndian = n1.getByteLittleEndian(obj, j);
        return byteLittleEndian;
    }

    @Override // com.google.protobuf.m1
    public double getDouble(Object obj, long j) {
        return Double.longBitsToDouble(getLong(obj, j));
    }

    @Override // com.google.protobuf.m1
    public float getFloat(Object obj, long j) {
        return Float.intBitsToFloat(getInt(obj, j));
    }

    @Override // com.google.protobuf.m1
    public int getInt(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.m1
    public long getLong(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.m1
    public Object getStaticObject(java.lang.reflect.Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // com.google.protobuf.m1
    public void putBoolean(Object obj, long j, boolean z) {
        if (n1.IS_BIG_ENDIAN) {
            n1.putBooleanBigEndian(obj, j, z);
        } else {
            n1.putBooleanLittleEndian(obj, j, z);
        }
    }

    @Override // com.google.protobuf.m1
    public void putByte(Object obj, long j, byte b2) {
        if (n1.IS_BIG_ENDIAN) {
            n1.putByteBigEndian(obj, j, b2);
        } else {
            n1.putByteLittleEndian(obj, j, b2);
        }
    }

    @Override // com.google.protobuf.m1
    public void putDouble(Object obj, long j, double d) {
        putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.protobuf.m1
    public void putFloat(Object obj, long j, float f) {
        putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.protobuf.m1
    public void putInt(long j, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.m1
    public void putLong(long j, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.m1
    public boolean supportsUnsafeByteBufferOperations() {
        return false;
    }

    @Override // com.google.protobuf.m1
    public void copyMemory(byte[] bArr, long j, long j2, long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.m1
    public byte getByte(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.m1
    public void putByte(long j, byte b2) {
        throw new UnsupportedOperationException();
    }
}
