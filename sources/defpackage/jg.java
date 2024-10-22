package defpackage;

/* loaded from: classes.dex */
public final class jg extends go {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.go
    public final void c() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((kg) obj).clear();
                return;
            default:
                ((ng) obj).clear();
                return;
        }
    }

    @Override // defpackage.go
    public final Object d(int i, int i2) {
        int i3 = this.d;
        Object obj = this.e;
        switch (i3) {
            case 0:
                return ((kg) obj).f4742b[(i << 1) + i2];
            default:
                return ((ng) obj).f3454b[i];
        }
    }

    @Override // defpackage.go
    public final kg e() {
        switch (this.d) {
            case 0:
                return (kg) this.e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // defpackage.go
    public final int f() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((kg) obj).c;
            default:
                return ((ng) obj).c;
        }
    }

    @Override // defpackage.go
    public final int g(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return ((kg) obj2).f(obj);
            default:
                return ((ng) obj2).indexOf(obj);
        }
    }

    @Override // defpackage.go
    public final int h(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return ((kg) obj2).h(obj);
            default:
                return ((ng) obj2).indexOf(obj);
        }
    }

    @Override // defpackage.go
    public final void i(Object obj, Object obj2) {
        int i = this.d;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((kg) obj3).put(obj, obj2);
                return;
            default:
                ((ng) obj3).add(obj);
                return;
        }
    }

    @Override // defpackage.go
    public final void j(int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((kg) obj).j(i);
                return;
            default:
                ((ng) obj).g(i);
                return;
        }
    }

    @Override // defpackage.go
    public final Object k(int i, Object obj) {
        switch (this.d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((kg) this.e).f4742b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
