package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class kx2 implements zh {

    /* renamed from: b, reason: collision with root package name */
    public int f3031b;
    public float c = 1.0f;
    public float d = 1.0f;
    public xh e;
    public xh f;
    public xh g;
    public xh h;
    public boolean i;
    public jx2 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public kx2() {
        xh xhVar = xh.e;
        this.e = xhVar;
        this.f = xhVar;
        this.g = xhVar;
        this.h = xhVar;
        ByteBuffer byteBuffer = zh.f5478a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.f3031b = -1;
    }

    @Override // defpackage.zh
    public final boolean a() {
        if (this.f.f5157a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f5157a != this.e.f5157a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zh
    public final ByteBuffer b() {
        jx2 jx2Var = this.j;
        if (jx2Var != null) {
            int i = jx2Var.m;
            int i2 = jx2Var.f2850b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i2, jx2Var.m);
                int i4 = min * i2;
                shortBuffer.put(jx2Var.l, 0, i4);
                int i5 = jx2Var.m - min;
                jx2Var.m = i5;
                short[] sArr = jx2Var.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.o += i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = zh.f5478a;
        return byteBuffer;
    }

    @Override // defpackage.zh
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        jx2 jx2Var = this.j;
        jx2Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = jx2Var.f2850b;
        int i2 = remaining2 / i;
        short[] c = jx2Var.c(jx2Var.j, jx2Var.k, i2);
        jx2Var.j = c;
        asShortBuffer.get(c, jx2Var.k * i, ((i2 * i) * 2) / 2);
        jx2Var.k += i2;
        jx2Var.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // defpackage.zh
    public final xh d(xh xhVar) {
        if (xhVar.c == 2) {
            int i = this.f3031b;
            if (i == -1) {
                i = xhVar.f5157a;
            }
            this.e = xhVar;
            xh xhVar2 = new xh(i, xhVar.f5158b, 2);
            this.f = xhVar2;
            this.i = true;
            return xhVar2;
        }
        throw new yh(xhVar);
    }

    @Override // defpackage.zh
    public final void e() {
        jx2 jx2Var = this.j;
        if (jx2Var != null) {
            int i = jx2Var.k;
            float f = jx2Var.c;
            float f2 = jx2Var.d;
            int i2 = jx2Var.m + ((int) ((((i / (f / f2)) + jx2Var.o) / (jx2Var.e * f2)) + 0.5f));
            short[] sArr = jx2Var.j;
            int i3 = jx2Var.h * 2;
            jx2Var.j = jx2Var.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = jx2Var.f2850b;
                if (i4 >= i3 * i5) {
                    break;
                }
                jx2Var.j[(i5 * i) + i4] = 0;
                i4++;
            }
            jx2Var.k = i3 + jx2Var.k;
            jx2Var.f();
            if (jx2Var.m > i2) {
                jx2Var.m = i2;
            }
            jx2Var.k = 0;
            jx2Var.r = 0;
            jx2Var.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.zh
    public final boolean f() {
        jx2 jx2Var;
        if (this.p && ((jx2Var = this.j) == null || jx2Var.m * jx2Var.f2850b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zh
    public final void flush() {
        if (a()) {
            xh xhVar = this.e;
            this.g = xhVar;
            xh xhVar2 = this.f;
            this.h = xhVar2;
            if (this.i) {
                this.j = new jx2(xhVar.f5157a, xhVar.f5158b, this.c, this.d, xhVar2.f5157a);
            } else {
                jx2 jx2Var = this.j;
                if (jx2Var != null) {
                    jx2Var.k = 0;
                    jx2Var.m = 0;
                    jx2Var.o = 0;
                    jx2Var.p = 0;
                    jx2Var.q = 0;
                    jx2Var.r = 0;
                    jx2Var.s = 0;
                    jx2Var.t = 0;
                    jx2Var.u = 0;
                    jx2Var.v = 0;
                }
            }
        }
        this.m = zh.f5478a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.zh
    public final void g() {
        this.c = 1.0f;
        this.d = 1.0f;
        xh xhVar = xh.e;
        this.e = xhVar;
        this.f = xhVar;
        this.g = xhVar;
        this.h = xhVar;
        ByteBuffer byteBuffer = zh.f5478a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.f3031b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
