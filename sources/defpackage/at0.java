package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class at0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f331a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332b;
    public final long c;
    public final byte[] d;

    public at0(int i, byte[] bArr, int i2) {
        this(-1L, bArr, i, i2);
    }

    public static at0 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(et0.N);
        return new at0(2, bytes, bytes.length);
    }

    public static at0 b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[et0.E[4] * 1]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new at0(4, wrap.array(), 1);
    }

    public static at0 c(ct0 ct0Var, ByteOrder byteOrder) {
        ct0[] ct0VarArr = {ct0Var};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[et0.E[5] * 1]);
        wrap.order(byteOrder);
        ct0 ct0Var2 = ct0VarArr[0];
        wrap.putInt((int) ct0Var2.f1669a);
        wrap.putInt((int) ct0Var2.f1670b);
        return new at0(5, wrap.array(), 1);
    }

    public static at0 d(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[et0.E[3] * 1]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new at0(3, wrap.array(), 1);
    }

    public final double e(ByteOrder byteOrder) {
        Object h = h(byteOrder);
        if (h != null) {
            if (h instanceof String) {
                return Double.parseDouble((String) h);
            }
            if (h instanceof long[]) {
                if (((long[]) h).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h instanceof int[]) {
                if (((int[]) h).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h instanceof double[]) {
                double[] dArr = (double[]) h;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h instanceof ct0[]) {
                ct0[] ct0VarArr = (ct0[]) h;
                if (ct0VarArr.length == 1) {
                    ct0 ct0Var = ct0VarArr[0];
                    return ct0Var.f1669a / ct0Var.f1670b;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int f(ByteOrder byteOrder) {
        Object h = h(byteOrder);
        if (h != null) {
            if (h instanceof String) {
                return Integer.parseInt((String) h);
            }
            if (h instanceof long[]) {
                long[] jArr = (long[]) h;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h instanceof int[]) {
                int[] iArr = (int[]) h;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String g(ByteOrder byteOrder) {
        Object h = h(byteOrder);
        if (h == null) {
            return null;
        }
        if (h instanceof String) {
            return (String) h;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (h instanceof long[]) {
            long[] jArr = (long[]) h;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (h instanceof int[]) {
            int[] iArr = (int[]) h;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (h instanceof double[]) {
            double[] dArr = (double[]) h;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(h instanceof ct0[])) {
            return null;
        }
        ct0[] ct0VarArr = (ct0[]) h;
        while (i < ct0VarArr.length) {
            sb.append(ct0VarArr[i].f1669a);
            sb.append('/');
            sb.append(ct0VarArr[i].f1670b);
            i++;
            if (i != ct0VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:90|(3:92|(2:93|(1:102)(2:95|(2:98|99)(1:97)))|(1:101))|103|(2:105|(6:114|115|116|117|118|119)(3:107|(2:109|110)(2:112|113)|111))|123|116|117|118|119) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x012a, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x012b, code lost:            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);     */
    /* JADX WARN: Type inference failed for: r15v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v21, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v22, types: [ct0[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [ct0[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable h(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at0.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(et0.D[this.f331a]);
        sb.append(", data length:");
        return hx2.r(sb, this.d.length, ")");
    }

    public at0(long j, byte[] bArr, int i, int i2) {
        this.f331a = i;
        this.f332b = i2;
        this.c = j;
        this.d = bArr;
    }
}
