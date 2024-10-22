package defpackage;

/* loaded from: classes.dex */
public final class jg0 implements zf0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f2760b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public jg0() {
        this.f2760b = 250000;
        this.c = 750000;
        this.d = 4;
        this.e = 250000;
        this.f = 50000000;
        this.g = 2;
    }

    public static int a(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    public jg0(jg0 jg0Var) {
        this.f2760b = jg0Var.f2760b;
        this.c = jg0Var.c;
        this.d = jg0Var.d;
        this.e = jg0Var.e;
        this.f = jg0Var.f;
        this.g = jg0Var.g;
    }

    public jg0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2760b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }
}
