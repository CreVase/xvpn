package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class yd1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5317a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5318b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5318b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw ie1.f();
        } catch (ie1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static m51 b(Object obj, Object obj2) {
        m51 m51Var = (m51) ((i1) obj);
        g51 g51Var = (g51) m51Var.d(l51.NEW_BUILDER);
        g51Var.c();
        g51.d(g51Var.f2207b, m51Var);
        i1 i1Var = (i1) obj2;
        if (g51Var.f2206a.getClass().isInstance(i1Var)) {
            g51Var.c();
            g51.d(g51Var.f2207b, (m51) i1Var);
            return g51Var.b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
