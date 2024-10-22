package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class gt {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicLong f2319a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    public static String f2320b;

    public gt(ka1 ka1Var) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a2 = a(time % 1000);
        byte[] a3 = a(f2319a.incrementAndGet());
        byte[] a4 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a2[0], a2[1], a3[0], a3[1], a4[0], a4[1]};
        String W0 = m20.W0(ka1Var.b().f4362a);
        String t0 = m20.t0(bArr);
        Locale locale = Locale.US;
        f2320b = String.format(locale, "%s%s%s%s", t0.substring(0, 12), t0.substring(12, 16), t0.subSequence(16, 20), W0.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f2320b;
    }
}
