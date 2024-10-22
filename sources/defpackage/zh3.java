package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class zh3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f5482a = Logger.getLogger(zh3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f5483b;
    public static final Class c;
    public static final yh3 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh3.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f5483b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (za.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Class cls) {
        if (!za.a()) {
            return false;
        }
        try {
            Class cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    public static boolean f(Object obj, long j) {
        return d.c(obj, j);
    }

    public static byte g(byte[] bArr, long j) {
        return d.d(bArr, g + j);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((l(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j) {
        return (byte) ((l(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static double j(Object obj, long j) {
        return d.e(obj, j);
    }

    public static float k(Object obj, long j) {
        return d.f(obj, j);
    }

    public static int l(Object obj, long j) {
        return d.g(obj, j);
    }

    public static long m(Object obj, long j) {
        return d.h(obj, j);
    }

    public static Object n(Object obj, long j) {
        return d.i(obj, j);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new vh3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(byte[] bArr, long j, byte b2) {
        d.l(bArr, g + j, b2);
    }

    public static void q(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int l = l(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        s(obj, j2, ((255 & b2) << i) | (l & (~(255 << i))));
    }

    public static void r(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        s(obj, j2, ((255 & b2) << i) | (l(obj, j2) & (~(255 << i))));
    }

    public static void s(Object obj, long j, int i) {
        d.o(obj, j, i);
    }

    public static void t(Object obj, long j, long j2) {
        d.p(obj, j, j2);
    }

    public static void u(Object obj, long j, Object obj2) {
        d.q(obj, j, obj2);
    }
}
