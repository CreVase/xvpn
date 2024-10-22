package com.google.protobuf;

import defpackage.uh3;
import defpackage.ya;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class n1 {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = ya.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final m1 MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    static {
        boolean z;
        long arrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (arrayBaseOffset & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        IS_BIG_ENDIAN = z;
    }

    private n1() {
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field bufferAddressField() {
        java.lang.reflect.Field field;
        if (ya.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        java.lang.reflect.Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void copyMemory(byte[] bArr, long j, long j2, long j3) {
        MEMORY_ACCESSOR.copyMemory(bArr, j, j2, j3);
    }

    public static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!ya.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
        m1 m1Var;
        if (field != null && (m1Var = MEMORY_ACCESSOR) != null) {
            return m1Var.objectFieldOffset(field);
        }
        return -1L;
    }

    private static int firstDifferingByteIndexNativeEndian(long j, long j2) {
        int numberOfTrailingZeros;
        if (IS_BIG_ENDIAN) {
            numberOfTrailingZeros = Long.numberOfLeadingZeros(j ^ j2);
        } else {
            numberOfTrailingZeros = Long.numberOfTrailingZeros(j ^ j2);
        }
        return numberOfTrailingZeros >> 3;
    }

    public static boolean getBoolean(Object obj, long j) {
        return MEMORY_ACCESSOR.getBoolean(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j) {
        if (getByteBigEndian(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j) {
        if (getByteLittleEndian(obj, j) != 0) {
            return true;
        }
        return false;
    }

    public static byte getByte(Object obj, long j) {
        return MEMORY_ACCESSOR.getByte(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j) {
        return (byte) ((getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j) {
        return (byte) ((getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static double getDouble(Object obj, long j) {
        return MEMORY_ACCESSOR.getDouble(obj, j);
    }

    public static float getFloat(Object obj, long j) {
        return MEMORY_ACCESSOR.getFloat(obj, j);
    }

    public static int getInt(Object obj, long j) {
        return MEMORY_ACCESSOR.getInt(obj, j);
    }

    public static long getLong(Object obj, long j) {
        return MEMORY_ACCESSOR.getLong(obj, j);
    }

    private static m1 getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (ya.isOnAndroidDevice()) {
            if (IS_ANDROID_64) {
                return new k1(unsafe);
            }
            if (!IS_ANDROID_32) {
                return null;
            }
            return new j1(unsafe);
        }
        return new l1(unsafe);
    }

    public static Object getObject(Object obj, long j) {
        return MEMORY_ACCESSOR.getObject(obj, j);
    }

    public static Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new uh3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    public static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static int mismatch(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i >= 0 && i2 >= 0 && i3 >= 0 && i + i3 <= bArr.length && i2 + i3 <= bArr2.length) {
            int i4 = 0;
            if (HAS_UNSAFE_ARRAY_OPERATIONS) {
                for (int i5 = (BYTE_ARRAY_ALIGNMENT + i) & 7; i4 < i3 && (i5 & 7) != 0; i5++) {
                    if (bArr[i + i4] != bArr2[i2 + i4]) {
                        return i4;
                    }
                    i4++;
                }
                int i6 = ((i3 - i4) & (-8)) + i4;
                while (i4 < i6) {
                    long j = BYTE_ARRAY_BASE_OFFSET;
                    long j2 = i4;
                    long j3 = getLong((Object) bArr, i + j + j2);
                    long j4 = getLong((Object) bArr2, j + i2 + j2);
                    if (j3 != j4) {
                        return i4 + firstDifferingByteIndexNativeEndian(j3, j4);
                    }
                    i4 += 8;
                }
            }
            while (i4 < i3) {
                if (bArr[i + i4] != bArr2[i2 + i4]) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    public static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    public static void putBoolean(Object obj, long j, boolean z) {
        MEMORY_ACCESSOR.putBoolean(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j, boolean z) {
        putByteBigEndian(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j, boolean z) {
        putByteLittleEndian(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static void putByte(Object obj, long j, byte b2) {
        MEMORY_ACCESSOR.putByte(obj, j, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        putInt(obj, j2, ((255 & b2) << i) | (getInt(obj, j2) & (~(255 << i))));
    }

    public static void putDouble(Object obj, long j, double d) {
        MEMORY_ACCESSOR.putDouble(obj, j, d);
    }

    public static void putFloat(Object obj, long j, float f) {
        MEMORY_ACCESSOR.putFloat(obj, j, f);
    }

    public static void putInt(Object obj, long j, int i) {
        MEMORY_ACCESSOR.putInt(obj, j, i);
    }

    public static void putLong(Object obj, long j, long j2) {
        MEMORY_ACCESSOR.putLong(obj, j, j2);
    }

    public static void putObject(Object obj, long j, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        m1 m1Var = MEMORY_ACCESSOR;
        if (m1Var == null) {
            return false;
        }
        return m1Var.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        m1 m1Var = MEMORY_ACCESSOR;
        if (m1Var == null) {
            return false;
        }
        return m1Var.supportsUnsafeByteBufferOperations();
    }

    public static void copyMemory(long j, byte[] bArr, long j2, long j3) {
        MEMORY_ACCESSOR.copyMemory(j, bArr, j2, j3);
    }

    public static boolean getBoolean(boolean[] zArr, long j) {
        return MEMORY_ACCESSOR.getBoolean(zArr, (j * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET);
    }

    public static byte getByte(byte[] bArr, long j) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j);
    }

    public static double getDouble(double[] dArr, long j) {
        return MEMORY_ACCESSOR.getDouble(dArr, (j * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET);
    }

    public static float getFloat(float[] fArr, long j) {
        return MEMORY_ACCESSOR.getFloat(fArr, (j * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET);
    }

    public static int getInt(int[] iArr, long j) {
        return MEMORY_ACCESSOR.getInt(iArr, (j * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET);
    }

    public static long getLong(long[] jArr, long j) {
        return MEMORY_ACCESSOR.getLong(jArr, (j * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET);
    }

    public static Object getObject(Object[] objArr, long j) {
        return MEMORY_ACCESSOR.getObject(objArr, (j * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET);
    }

    public static void putBoolean(boolean[] zArr, long j, boolean z) {
        MEMORY_ACCESSOR.putBoolean(zArr, (j * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET, z);
    }

    public static void putByte(byte[] bArr, long j, byte b2) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j, b2);
    }

    public static void putDouble(double[] dArr, long j, double d) {
        MEMORY_ACCESSOR.putDouble(dArr, (j * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET, d);
    }

    public static void putFloat(float[] fArr, long j, float f) {
        MEMORY_ACCESSOR.putFloat(fArr, (j * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET, f);
    }

    public static void putInt(int[] iArr, long j, int i) {
        MEMORY_ACCESSOR.putInt(iArr, (j * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET, i);
    }

    public static void putLong(long[] jArr, long j, long j2) {
        MEMORY_ACCESSOR.putLong(jArr, (j * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET, j2);
    }

    public static void putObject(Object[] objArr, long j, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, (j * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET, obj);
    }

    public static void copyMemory(byte[] bArr, long j, byte[] bArr2, long j2, long j3) {
        System.arraycopy(bArr, (int) j, bArr2, (int) j2, (int) j3);
    }

    public static byte getByte(long j) {
        return MEMORY_ACCESSOR.getByte(j);
    }

    public static int getInt(long j) {
        return MEMORY_ACCESSOR.getInt(j);
    }

    public static long getLong(long j) {
        return MEMORY_ACCESSOR.getLong(j);
    }

    public static void putByte(long j, byte b2) {
        MEMORY_ACCESSOR.putByte(j, b2);
    }

    public static void putInt(long j, int i) {
        MEMORY_ACCESSOR.putInt(j, i);
    }

    public static void putLong(long j, long j2) {
        MEMORY_ACCESSOR.putLong(j, j2);
    }
}
