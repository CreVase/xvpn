package com.facebook.ads.redexgen.X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0508Kw implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7S A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{16, 14, 23, 14, 27, 18, 12, 21, 19, 34, 1, 30, 26, 23, 34, -4, 15, 27, 19, 29, 27, 42, 10, 47, 38, 27, -75, -77, -62, -92, -81, -70, -61, -77, 40, 39, -4, 33, 30, 28, 36, 44, 46, 38, 44, 11, 30, 26, 29, 50};
    }

    public C0508Kw(int i, LinkedBlockingQueue linkedBlockingQueue, C7S c7s) {
        this.A00 = i;
        this.A02 = linkedBlockingQueue;
        this.A01 = c7s;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 122)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c : (List) objArr[0]) {
                    String str = (String) c.getClass().getMethod(A00(7, 12, 111), new Class[0]).invoke(c, new Object[0]);
                    int intValue = ((Integer) c.getClass().getMethod(A00(19, 7, 119), new Class[0]).invoke(c, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 15), new Class[0]).invoke(c, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t) {
            this.A01.A07().A9M(A00(0, 7, 106), C01997x.A1G, new C02007y(t));
        }
        return null;
    }
}
