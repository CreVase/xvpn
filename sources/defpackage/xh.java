package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xh {
    public static final xh e = new xh(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f5157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5158b;
    public final int c;
    public final int d;

    public xh(int i, int i2, int i3) {
        int i4;
        this.f5157a = i;
        this.f5158b = i2;
        this.c = i3;
        if (wi3.A(i3)) {
            i4 = wi3.s(i3, i2);
        } else {
            i4 = -1;
        }
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj;
        if (this.f5157a == xhVar.f5157a && this.f5158b == xhVar.f5158b && this.c == xhVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5157a), Integer.valueOf(this.f5158b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f5157a + ", channelCount=" + this.f5158b + ", encoding=" + this.c + ']';
    }
}
