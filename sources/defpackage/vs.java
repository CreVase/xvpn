package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class vs implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final xs f4885b = new xs(yd1.f5318b);
    public static final os c;

    /* renamed from: a, reason: collision with root package name */
    public int f4886a = 0;

    static {
        os osVar;
        if (za.a()) {
            osVar = new os(1, 0);
        } else {
            osVar = new os(0, 0);
        }
        c = osVar;
    }

    public static int c(int i, int i2, int i3) {
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

    public static xs e(int i, byte[] bArr, int i2) {
        byte[] bArr2;
        int i3 = i + i2;
        c(i, i3, bArr.length);
        switch (c.f3720a) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i, i3);
                break;
            default:
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                bArr2 = bArr3;
                break;
        }
        return new xs(bArr2);
    }

    public abstract byte b(int i);

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i = this.f4886a;
        if (i == 0) {
            int size = size();
            xs xsVar = (xs) this;
            int j = xsVar.j() + 0;
            int i2 = size;
            for (int i3 = j; i3 < j + size; i3++) {
                i2 = (i2 * 31) + xsVar.d[i3];
            }
            if (i2 == 0) {
                i = 1;
            } else {
                i = i2;
            }
            this.f4886a = i;
        }
        return i;
    }

    public abstract byte g(int i);

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public final String i() {
        Charset charset = yd1.f5317a;
        if (size() == 0) {
            return "";
        }
        xs xsVar = (xs) this;
        return new String(xsVar.d, xsVar.j(), xsVar.size(), charset);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new js(this);
    }

    public abstract int size();
}
