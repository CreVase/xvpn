package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rf3 {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f4146a;

    /* renamed from: b, reason: collision with root package name */
    public final wq2 f4147b;
    public volatile int c = 0;

    public rf3(wq2 wq2Var, int i) {
        this.f4147b = wq2Var;
        this.f4146a = i;
    }

    public final int a(int i) {
        mw1 c = c();
        int a2 = c.a(16);
        if (a2 != 0) {
            Object obj = c.d;
            int i2 = a2 + c.f5118a;
            return ((ByteBuffer) obj).getInt((i * 4) + ((ByteBuffer) obj).getInt(i2) + i2 + 4);
        }
        return 0;
    }

    public final int b() {
        mw1 c = c();
        int a2 = c.a(16);
        if (a2 != 0) {
            int i = a2 + c.f5118a;
            return ((ByteBuffer) c.d).getInt(((ByteBuffer) c.d).getInt(i) + i);
        }
        return 0;
    }

    public final mw1 c() {
        ThreadLocal threadLocal = d;
        mw1 mw1Var = (mw1) threadLocal.get();
        if (mw1Var == null) {
            mw1Var = new mw1();
            threadLocal.set(mw1Var);
        }
        nw1 nw1Var = (nw1) this.f4147b.f5056a;
        int a2 = nw1Var.a(6);
        if (a2 != 0) {
            int i = a2 + nw1Var.f5118a;
            int i2 = (this.f4146a * 4) + ((ByteBuffer) nw1Var.d).getInt(i) + i + 4;
            mw1Var.b(((ByteBuffer) nw1Var.d).getInt(i2) + i2, (ByteBuffer) nw1Var.d);
        }
        return mw1Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        mw1 c = c();
        int a2 = c.a(4);
        if (a2 != 0) {
            i = ((ByteBuffer) c.d).getInt(a2 + c.f5118a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
