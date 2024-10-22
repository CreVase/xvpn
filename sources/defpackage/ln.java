package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class ln implements zh {

    /* renamed from: b, reason: collision with root package name */
    public xh f3158b;
    public xh c;
    public xh d;
    public xh e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public ln() {
        ByteBuffer byteBuffer = zh.f5478a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        xh xhVar = xh.e;
        this.d = xhVar;
        this.e = xhVar;
        this.f3158b = xhVar;
        this.c = xhVar;
    }

    @Override // defpackage.zh
    public boolean a() {
        if (this.e != xh.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zh
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = zh.f5478a;
        return byteBuffer;
    }

    @Override // defpackage.zh
    public final xh d(xh xhVar) {
        this.d = xhVar;
        this.e = h(xhVar);
        if (a()) {
            return this.e;
        }
        return xh.e;
    }

    @Override // defpackage.zh
    public final void e() {
        this.h = true;
        j();
    }

    @Override // defpackage.zh
    public boolean f() {
        if (this.h && this.g == zh.f5478a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zh
    public final void flush() {
        this.g = zh.f5478a;
        this.h = false;
        this.f3158b = this.d;
        this.c = this.e;
        i();
    }

    @Override // defpackage.zh
    public final void g() {
        flush();
        this.f = zh.f5478a;
        xh xhVar = xh.e;
        this.d = xhVar;
        this.e = xhVar;
        this.f3158b = xhVar;
        this.c = xhVar;
        k();
    }

    public abstract xh h(xh xhVar);

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }
}
