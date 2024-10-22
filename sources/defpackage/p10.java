package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class p10 implements tg2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3764a;

    /* renamed from: b, reason: collision with root package name */
    public int f3765b;
    public int c;
    public Object d;

    public p10(o10 o10Var) {
        this.c = 0;
        Charset charset = yd1.f5317a;
        this.d = o10Var;
        o10Var.d = this;
    }

    @Override // defpackage.tg2
    public final void a(List list, mn2 mn2Var, yu0 yu0Var) {
        int u;
        int i = this.f3764a;
        if ((i & 7) != 2) {
            int i2 = ie1.f2577a;
            throw new ge1();
        }
        do {
            list.add(j(mn2Var, yu0Var));
            if (!((o10) this.d).c() && this.c == 0) {
                u = ((o10) this.d).u();
            } else {
                return;
            }
        } while (u == i);
        this.c = u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:            r8.put(r2, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:            return;     */
    @Override // defpackage.tg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.xp1 r8, defpackage.eb3 r9, defpackage.yu0 r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m(r0)
            java.lang.Object r1 = r7.d
            o10 r1 = (defpackage.o10) r1
            int r1 = r1.v()
            java.lang.Object r2 = r7.d
            o10 r2 = (defpackage.o10) r2
            int r1 = r2.e(r1)
            java.lang.Object r2 = r9.f1908b
            java.lang.Object r3 = r9.d
        L18:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L71
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L66
            java.lang.Object r5 = r7.d     // Catch: java.lang.Throwable -> L71
            o10 r5 = (defpackage.o10) r5     // Catch: java.lang.Throwable -> L71
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L2c
            goto L66
        L2c:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L4f
            if (r4 == r0) goto L40
            boolean r4 = r7.n()     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            if (r4 == 0) goto L3a
            goto L18
        L3a:
            ie1 r4 = new ie1     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            r4.<init>(r6)     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            throw r4     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
        L40:
            java.lang.Object r4 = r9.c     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            lr3 r4 = (defpackage.lr3) r4     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            java.lang.Object r5 = r9.d     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            java.lang.Class r5 = r5.getClass()     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            java.lang.Object r3 = r7.h(r4, r5, r10)     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            goto L18
        L4f:
            java.lang.Object r4 = r9.f1907a     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            lr3 r4 = (defpackage.lr3) r4     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            r5 = 0
            java.lang.Object r2 = r7.h(r4, r5, r5)     // Catch: defpackage.ge1 -> L59 java.lang.Throwable -> L71
            goto L18
        L59:
            boolean r4 = r7.n()     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L60
            goto L18
        L60:
            ie1 r8 = new ie1     // Catch: java.lang.Throwable -> L71
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L71
            throw r8     // Catch: java.lang.Throwable -> L71
        L66:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r8 = r7.d
            o10 r8 = (defpackage.o10) r8
            r8.d(r1)
            return
        L71:
            r8 = move-exception
            java.lang.Object r9 = r7.d
            o10 r9 = (defpackage.o10) r9
            r9.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p10.b(xp1, eb3, yu0):void");
    }

    @Override // defpackage.tg2
    public final Object c(mn2 mn2Var, yu0 yu0Var) {
        m(3);
        return i(mn2Var, yu0Var);
    }

    @Override // defpackage.tg2
    public final Object d(mn2 mn2Var, yu0 yu0Var) {
        m(2);
        return j(mn2Var, yu0Var);
    }

    @Override // defpackage.tg2
    public final void e(List list, mn2 mn2Var, yu0 yu0Var) {
        int u;
        int i = this.f3764a;
        if ((i & 7) != 3) {
            int i2 = ie1.f2577a;
            throw new ge1();
        }
        do {
            list.add(i(mn2Var, yu0Var));
            if (!((o10) this.d).c() && this.c == 0) {
                u = ((o10) this.d).u();
            } else {
                return;
            }
        } while (u == i);
        this.c = u;
    }

    public final void f(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.c * 2;
                Object obj = this.d;
                if (((int[]) obj) == null) {
                    int[] iArr = new int[4];
                    this.d = iArr;
                    Arrays.fill(iArr, -1);
                } else if (i3 >= ((int[]) obj).length) {
                    int[] iArr2 = (int[]) obj;
                    int[] iArr3 = new int[i3 * 2];
                    this.d = iArr3;
                    System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                }
                Object obj2 = this.d;
                ((int[]) obj2)[i3] = i;
                ((int[]) obj2)[i3 + 1] = i2;
                this.c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void g(RecyclerView recyclerView, boolean z) {
        boolean z2 = false;
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c cVar = recyclerView.n;
        if (recyclerView.m != null && cVar != null && cVar.i) {
            if (z) {
                if (!recyclerView.e.g()) {
                    cVar.i(recyclerView.m.c(), this);
                }
            } else {
                if (!recyclerView.u || recyclerView.C || recyclerView.e.g()) {
                    z2 = true;
                }
                if (!z2) {
                    cVar.h(this.f3764a, this.f3765b, recyclerView.s0, this);
                }
            }
            int i = this.c;
            if (i > cVar.j) {
                cVar.j = i;
                cVar.k = z;
                recyclerView.c.n();
            }
        }
    }

    @Override // defpackage.tg2
    public final int getFieldNumber() {
        int i = this.c;
        if (i != 0) {
            this.f3764a = i;
            this.c = 0;
        } else {
            this.f3764a = ((o10) this.d).u();
        }
        int i2 = this.f3764a;
        if (i2 != 0 && i2 != this.f3765b) {
            return i2 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.tg2
    public final int getTag() {
        return this.f3764a;
    }

    public final Object h(lr3 lr3Var, Class cls, yu0 yu0Var) {
        switch (lr3Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(readInt64());
            case 3:
                return Long.valueOf(readUInt64());
            case 4:
                return Integer.valueOf(readInt32());
            case 5:
                return Long.valueOf(readFixed64());
            case 6:
                return Integer.valueOf(readFixed32());
            case 7:
                return Boolean.valueOf(readBool());
            case 8:
                return readStringRequireUtf8();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m(2);
                return j(ka2.c.a(cls), yu0Var);
            case 11:
                return readBytes();
            case 12:
                return Integer.valueOf(readUInt32());
            case 13:
                return Integer.valueOf(readEnum());
            case 14:
                return Integer.valueOf(readSFixed32());
            case 15:
                return Long.valueOf(readSFixed64());
            case 16:
                return Integer.valueOf(readSInt32());
            case 17:
                return Long.valueOf(readSInt64());
        }
    }

    public final Object i(mn2 mn2Var, yu0 yu0Var) {
        int i = this.f3765b;
        this.f3765b = ((this.f3764a >>> 3) << 3) | 4;
        try {
            Object newInstance = mn2Var.newInstance();
            mn2Var.a(newInstance, this, yu0Var);
            mn2Var.makeImmutable(newInstance);
            if (this.f3764a == this.f3765b) {
                return newInstance;
            }
            throw ie1.e();
        } finally {
            this.f3765b = i;
        }
    }

    public final Object j(mn2 mn2Var, yu0 yu0Var) {
        int v = ((o10) this.d).v();
        o10 o10Var = (o10) this.d;
        if (o10Var.f3576a < o10Var.f3577b) {
            int e = o10Var.e(v);
            Object newInstance = mn2Var.newInstance();
            ((o10) this.d).f3576a++;
            mn2Var.a(newInstance, this, yu0Var);
            mn2Var.makeImmutable(newInstance);
            ((o10) this.d).a(0);
            r5.f3576a--;
            ((o10) this.d).d(e);
            return newInstance;
        }
        throw new ie1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void k(List list, boolean z) {
        String readString;
        int u;
        int u2;
        if ((this.f3764a & 7) == 2) {
            if ((list instanceof jj1) && !z) {
                jj1 jj1Var = (jj1) list;
                do {
                    jj1Var.d(readBytes());
                    if (((o10) this.d).c()) {
                        return;
                    } else {
                        u2 = ((o10) this.d).u();
                    }
                } while (u2 == this.f3764a);
                this.c = u2;
                return;
            }
            do {
                if (z) {
                    readString = readStringRequireUtf8();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (((o10) this.d).c()) {
                    return;
                } else {
                    u = ((o10) this.d).u();
                }
            } while (u == this.f3764a);
            this.c = u;
            return;
        }
        throw ie1.b();
    }

    public final void l(int i) {
        if (((o10) this.d).b() == i) {
        } else {
            throw ie1.f();
        }
    }

    public final void m(int i) {
        if ((this.f3764a & 7) == i) {
        } else {
            throw ie1.b();
        }
    }

    public final boolean n() {
        int i;
        if (!((o10) this.d).c() && (i = this.f3764a) != this.f3765b) {
            return ((o10) this.d).x(i);
        }
        return false;
    }

    public final void o(int i) {
        if ((i & 3) == 0) {
        } else {
            throw ie1.e();
        }
    }

    public final void p(int i) {
        if ((i & 7) == 0) {
        } else {
            throw ie1.e();
        }
    }

    @Override // defpackage.tg2
    public final boolean readBool() {
        m(0);
        return ((o10) this.d).f();
    }

    @Override // defpackage.tg2
    public final void readBoolList(List list) {
        int u;
        if (list instanceof pq) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).f();
                throw null;
            }
            ((o10) this.d).f();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Boolean.valueOf(((o10) this.d).f()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Boolean.valueOf(((o10) this.d).f()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final vs readBytes() {
        m(2);
        return ((o10) this.d).g();
    }

    @Override // defpackage.tg2
    public final void readBytesList(List list) {
        int u;
        if ((this.f3764a & 7) != 2) {
            throw ie1.b();
        }
        do {
            list.add(readBytes());
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final double readDouble() {
        m(1);
        return ((o10) this.d).h();
    }

    @Override // defpackage.tg2
    public final void readDoubleList(List list) {
        int u;
        if (list instanceof dm0) {
            int i = this.f3764a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw ie1.b();
                }
                p(((o10) this.d).v());
                ((o10) this.d).b();
                ((o10) this.d).h();
                throw null;
            }
            ((o10) this.d).h();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v = ((o10) this.d).v();
                p(v);
                int b2 = ((o10) this.d).b() + v;
                do {
                    list.add(Double.valueOf(((o10) this.d).h()));
                } while (((o10) this.d).b() < b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Double.valueOf(((o10) this.d).h()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final int readEnum() {
        m(0);
        return ((o10) this.d).i();
    }

    @Override // defpackage.tg2
    public final void readEnumList(List list) {
        int u;
        if (list instanceof fd1) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).i();
                throw null;
            }
            ((o10) this.d).i();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Integer.valueOf(((o10) this.d).i()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Integer.valueOf(((o10) this.d).i()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final int readFixed32() {
        m(5);
        return ((o10) this.d).j();
    }

    @Override // defpackage.tg2
    public final void readFixed32List(List list) {
        int u;
        if (list instanceof fd1) {
            int i = this.f3764a & 7;
            if (i != 2) {
                if (i != 5) {
                    throw ie1.b();
                }
                ((o10) this.d).j();
                throw null;
            }
            o(((o10) this.d).v());
            ((o10) this.d).b();
            ((o10) this.d).j();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw ie1.b();
            }
            do {
                list.add(Integer.valueOf(((o10) this.d).j()));
                if (((o10) this.d).c()) {
                    return;
                } else {
                    u = ((o10) this.d).u();
                }
            } while (u == this.f3764a);
            this.c = u;
            return;
        }
        int v = ((o10) this.d).v();
        o(v);
        int b2 = ((o10) this.d).b() + v;
        do {
            list.add(Integer.valueOf(((o10) this.d).j()));
        } while (((o10) this.d).b() < b2);
    }

    @Override // defpackage.tg2
    public final long readFixed64() {
        m(1);
        return ((o10) this.d).k();
    }

    @Override // defpackage.tg2
    public final void readFixed64List(List list) {
        int u;
        if (list instanceof eo1) {
            int i = this.f3764a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw ie1.b();
                }
                p(((o10) this.d).v());
                ((o10) this.d).b();
                ((o10) this.d).k();
                throw null;
            }
            ((o10) this.d).k();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v = ((o10) this.d).v();
                p(v);
                int b2 = ((o10) this.d).b() + v;
                do {
                    list.add(Long.valueOf(((o10) this.d).k()));
                } while (((o10) this.d).b() < b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(((o10) this.d).k()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final float readFloat() {
        m(5);
        return ((o10) this.d).l();
    }

    @Override // defpackage.tg2
    public final void readFloatList(List list) {
        int u;
        if (list instanceof zy0) {
            int i = this.f3764a & 7;
            if (i != 2) {
                if (i != 5) {
                    throw ie1.b();
                }
                ((o10) this.d).l();
                throw null;
            }
            o(((o10) this.d).v());
            ((o10) this.d).b();
            ((o10) this.d).l();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw ie1.b();
            }
            do {
                list.add(Float.valueOf(((o10) this.d).l()));
                if (((o10) this.d).c()) {
                    return;
                } else {
                    u = ((o10) this.d).u();
                }
            } while (u == this.f3764a);
            this.c = u;
            return;
        }
        int v = ((o10) this.d).v();
        o(v);
        int b2 = ((o10) this.d).b() + v;
        do {
            list.add(Float.valueOf(((o10) this.d).l()));
        } while (((o10) this.d).b() < b2);
    }

    @Override // defpackage.tg2
    public final int readInt32() {
        m(0);
        return ((o10) this.d).m();
    }

    @Override // defpackage.tg2
    public final void readInt32List(List list) {
        int u;
        if (list instanceof fd1) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).m();
                throw null;
            }
            ((o10) this.d).m();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Integer.valueOf(((o10) this.d).m()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Integer.valueOf(((o10) this.d).m()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final long readInt64() {
        m(0);
        return ((o10) this.d).n();
    }

    @Override // defpackage.tg2
    public final void readInt64List(List list) {
        int u;
        if (list instanceof eo1) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).n();
                throw null;
            }
            ((o10) this.d).n();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Long.valueOf(((o10) this.d).n()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(((o10) this.d).n()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final int readSFixed32() {
        m(5);
        return ((o10) this.d).o();
    }

    @Override // defpackage.tg2
    public final void readSFixed32List(List list) {
        int u;
        if (list instanceof fd1) {
            int i = this.f3764a & 7;
            if (i != 2) {
                if (i != 5) {
                    throw ie1.b();
                }
                ((o10) this.d).o();
                throw null;
            }
            o(((o10) this.d).v());
            ((o10) this.d).b();
            ((o10) this.d).o();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw ie1.b();
            }
            do {
                list.add(Integer.valueOf(((o10) this.d).o()));
                if (((o10) this.d).c()) {
                    return;
                } else {
                    u = ((o10) this.d).u();
                }
            } while (u == this.f3764a);
            this.c = u;
            return;
        }
        int v = ((o10) this.d).v();
        o(v);
        int b2 = ((o10) this.d).b() + v;
        do {
            list.add(Integer.valueOf(((o10) this.d).o()));
        } while (((o10) this.d).b() < b2);
    }

    @Override // defpackage.tg2
    public final long readSFixed64() {
        m(1);
        return ((o10) this.d).p();
    }

    @Override // defpackage.tg2
    public final void readSFixed64List(List list) {
        int u;
        if (list instanceof eo1) {
            int i = this.f3764a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw ie1.b();
                }
                p(((o10) this.d).v());
                ((o10) this.d).b();
                ((o10) this.d).p();
                throw null;
            }
            ((o10) this.d).p();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v = ((o10) this.d).v();
                p(v);
                int b2 = ((o10) this.d).b() + v;
                do {
                    list.add(Long.valueOf(((o10) this.d).p()));
                } while (((o10) this.d).b() < b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(((o10) this.d).p()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final int readSInt32() {
        m(0);
        return ((o10) this.d).q();
    }

    @Override // defpackage.tg2
    public final void readSInt32List(List list) {
        int u;
        if (list instanceof fd1) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).q();
                throw null;
            }
            ((o10) this.d).q();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Integer.valueOf(((o10) this.d).q()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Integer.valueOf(((o10) this.d).q()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final long readSInt64() {
        m(0);
        return ((o10) this.d).r();
    }

    @Override // defpackage.tg2
    public final void readSInt64List(List list) {
        int u;
        if (list instanceof eo1) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).r();
                throw null;
            }
            ((o10) this.d).r();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Long.valueOf(((o10) this.d).r()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(((o10) this.d).r()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final String readString() {
        m(2);
        return ((o10) this.d).s();
    }

    @Override // defpackage.tg2
    public final void readStringList(List list) {
        k(list, false);
    }

    @Override // defpackage.tg2
    public final void readStringListRequireUtf8(List list) {
        k(list, true);
    }

    @Override // defpackage.tg2
    public final String readStringRequireUtf8() {
        m(2);
        return ((o10) this.d).t();
    }

    @Override // defpackage.tg2
    public final int readUInt32() {
        m(0);
        return ((o10) this.d).v();
    }

    @Override // defpackage.tg2
    public final void readUInt32List(List list) {
        int u;
        if (list instanceof fd1) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).v();
                throw null;
            }
            ((o10) this.d).v();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Integer.valueOf(((o10) this.d).v()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Integer.valueOf(((o10) this.d).v()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    @Override // defpackage.tg2
    public final long readUInt64() {
        m(0);
        return ((o10) this.d).w();
    }

    @Override // defpackage.tg2
    public final void readUInt64List(List list) {
        int u;
        if (list instanceof eo1) {
            int i = this.f3764a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw ie1.b();
                }
                ((o10) this.d).v();
                ((o10) this.d).b();
                ((o10) this.d).w();
                throw null;
            }
            ((o10) this.d).w();
            throw null;
        }
        int i2 = this.f3764a & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = ((o10) this.d).b() + ((o10) this.d).v();
                do {
                    list.add(Long.valueOf(((o10) this.d).w()));
                } while (((o10) this.d).b() < b2);
                l(b2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(((o10) this.d).w()));
            if (((o10) this.d).c()) {
                return;
            } else {
                u = ((o10) this.d).u();
            }
        } while (u == this.f3764a);
        this.c = u;
    }

    public p10(int i, int i2, int i3, SparseArray sparseArray) {
        this.f3764a = i;
        this.f3765b = i2;
        this.c = i3;
        this.d = sparseArray;
    }
}
