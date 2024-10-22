package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ah1 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f86a;

    /* renamed from: b, reason: collision with root package name */
    public int f87b;

    public ah1() {
        char[] cArr;
        Object i;
        synchronized (sw.f4422a) {
            gg ggVar = sw.f4423b;
            cArr = null;
            if (ggVar.isEmpty()) {
                i = null;
            } else {
                i = ggVar.i();
            }
            char[] cArr2 = (char[]) i;
            if (cArr2 != null) {
                sw.c -= cArr2.length;
                cArr = cArr2;
            }
        }
        this.f86a = cArr == null ? new char[128] : cArr;
    }

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f86a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f86a = Arrays.copyOf(cArr, i3);
        }
    }

    public final void b() {
        sw swVar = sw.f4422a;
        char[] cArr = this.f86a;
        synchronized (swVar) {
            int i = sw.c;
            if (cArr.length + i < sw.d) {
                sw.c = i + cArr.length;
                sw.f4423b.c(cArr);
            }
        }
    }

    public final void c(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.f87b, length);
        str.getChars(0, str.length(), this.f86a, this.f87b);
        this.f87b += length;
    }

    public final String toString() {
        return new String(this.f86a, 0, this.f87b);
    }
}
