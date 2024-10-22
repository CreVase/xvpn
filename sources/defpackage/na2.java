package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class na2 implements v12 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final mw0 g;
    public static final mw0 h;
    public static final xf1 i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f3424a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3425b;
    public final Map c;
    public final u12 d;
    public final pa2 e = new pa2(this);

    static {
        uy0 a2 = mw0.a("key");
        q9 k = q9.k();
        k.f3969a = 1;
        g = hx2.g(k, a2);
        uy0 a3 = mw0.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q9 k2 = q9.k();
        k2.f3969a = 2;
        h = hx2.g(k2, a3);
        i = new xf1(1);
    }

    public na2(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, u12 u12Var) {
        this.f3424a = byteArrayOutputStream;
        this.f3425b = map;
        this.c = map2;
        this.d = u12Var;
    }

    public static int k(mw0 mw0Var) {
        ia2 ia2Var = (ia2) ((Annotation) mw0Var.f3365b.get(ia2.class));
        if (ia2Var != null) {
            return ((eh) ia2Var).f1932a;
        }
        throw new mr0("Field has no @Protobuf config");
    }

    @Override // defpackage.v12
    public final v12 a(mw0 mw0Var, Object obj) {
        b(mw0Var, obj, true);
        return this;
    }

    public final na2 b(mw0 mw0Var, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            l((k(mw0Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.f3424a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                b(mw0Var, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, mw0Var, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            c(mw0Var, ((Double) obj).doubleValue(), z);
            return this;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                l((k(mw0Var) << 3) | 5);
                this.f3424a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            i(mw0Var, ((Number) obj).longValue(), z);
            return this;
        }
        if (obj instanceof Boolean) {
            h(mw0Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            l((k(mw0Var) << 3) | 2);
            l(bArr.length);
            this.f3424a.write(bArr);
            return this;
        }
        u12 u12Var = (u12) this.f3425b.get(obj.getClass());
        if (u12Var != null) {
            j(u12Var, mw0Var, obj, z);
            return this;
        }
        fj3 fj3Var = (fj3) this.c.get(obj.getClass());
        if (fj3Var != null) {
            pa2 pa2Var = this.e;
            pa2Var.f3809a = false;
            pa2Var.c = mw0Var;
            pa2Var.f3810b = z;
            fj3Var.a(obj, pa2Var);
            return this;
        }
        if (obj instanceof fa2) {
            h(mw0Var, ((fa2) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            h(mw0Var, ((Enum) obj).ordinal(), true);
            return this;
        }
        j(this.d, mw0Var, obj, z);
        return this;
    }

    public final void c(mw0 mw0Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((k(mw0Var) << 3) | 1);
        this.f3424a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // defpackage.v12
    public final v12 d(mw0 mw0Var, boolean z) {
        h(mw0Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.v12
    public final v12 e(mw0 mw0Var, int i2) {
        h(mw0Var, i2, true);
        return this;
    }

    @Override // defpackage.v12
    public final v12 f(mw0 mw0Var, double d) {
        c(mw0Var, d, true);
        return this;
    }

    @Override // defpackage.v12
    public final v12 g(mw0 mw0Var, long j) {
        i(mw0Var, j, true);
        return this;
    }

    public final void h(mw0 mw0Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        ia2 ia2Var = (ia2) ((Annotation) mw0Var.f3365b.get(ia2.class));
        if (ia2Var != null) {
            eh ehVar = (eh) ia2Var;
            int ordinal = ehVar.f1933b.ordinal();
            int i3 = ehVar.f1932a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        l((i3 << 3) | 5);
                        this.f3424a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
                        return;
                    }
                    return;
                }
                l(i3 << 3);
                l((i2 << 1) ^ (i2 >> 31));
                return;
            }
            l(i3 << 3);
            l(i2);
            return;
        }
        throw new mr0("Field has no @Protobuf config");
    }

    public final void i(mw0 mw0Var, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        ia2 ia2Var = (ia2) ((Annotation) mw0Var.f3365b.get(ia2.class));
        if (ia2Var != null) {
            eh ehVar = (eh) ia2Var;
            int ordinal = ehVar.f1933b.ordinal();
            int i2 = ehVar.f1932a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        l((i2 << 3) | 1);
                        this.f3424a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                        return;
                    }
                    return;
                }
                l(i2 << 3);
                m((j >> 63) ^ (j << 1));
                return;
            }
            l(i2 << 3);
            m(j);
            return;
        }
        throw new mr0("Field has no @Protobuf config");
    }

    public final void j(u12 u12Var, mw0 mw0Var, Object obj, boolean z) {
        nj1 nj1Var = new nj1();
        try {
            OutputStream outputStream = this.f3424a;
            this.f3424a = nj1Var;
            try {
                u12Var.a(obj, this);
                this.f3424a = outputStream;
                long j = nj1Var.f3470a;
                nj1Var.close();
                if (z && j == 0) {
                    return;
                }
                l((k(mw0Var) << 3) | 2);
                m(j);
                u12Var.a(obj, this);
            } catch (Throwable th) {
                this.f3424a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                nj1Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) {
        while ((i2 & (-128)) != 0) {
            this.f3424a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f3424a.write(i2 & 127);
    }

    public final void m(long j) {
        while (((-128) & j) != 0) {
            this.f3424a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f3424a.write(((int) j) & 127);
    }
}
