package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pu0 implements w23 {

    /* renamed from: a, reason: collision with root package name */
    public final s71 f3917a = new s71(21);

    /* renamed from: b, reason: collision with root package name */
    public final a33 f3918b = new a33();
    public final ArrayDeque c = new ArrayDeque();
    public int d;
    public boolean e;

    public pu0() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new nu0(this, 0));
        }
        this.d = 0;
    }

    @Override // defpackage.w23
    public final void a(long j) {
    }

    @Override // defpackage.re0
    public final Object b() {
        cp3.m(!this.e);
        if (this.d == 2) {
            ArrayDeque arrayDeque = this.c;
            if (!arrayDeque.isEmpty()) {
                b33 b33Var = (b33) arrayDeque.removeFirst();
                a33 a33Var = this.f3918b;
                if (a33Var.g(4)) {
                    b33Var.e(4);
                } else {
                    long j = a33Var.f;
                    s71 s71Var = this.f3917a;
                    ByteBuffer byteBuffer = a33Var.d;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    s71Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    b33Var.j(a33Var.f, new ou0(j, cp3.v(hc0.J, parcelableArrayList)), 0L);
                }
                a33Var.i();
                this.d = 0;
                return b33Var;
            }
        }
        return null;
    }

    @Override // defpackage.re0
    public final Object c() {
        cp3.m(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.f3918b;
    }

    @Override // defpackage.re0
    public final void d(a33 a33Var) {
        boolean z;
        boolean z2 = true;
        cp3.m(!this.e);
        if (this.d == 1) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        if (this.f3918b != a33Var) {
            z2 = false;
        }
        cp3.e(z2);
        this.d = 2;
    }

    @Override // defpackage.re0
    public final void flush() {
        cp3.m(!this.e);
        this.f3918b.i();
        this.d = 0;
    }

    @Override // defpackage.re0
    public final void release() {
        this.e = true;
    }
}
