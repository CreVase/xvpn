package defpackage;

/* loaded from: classes.dex */
public final class rl2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4173a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f4174b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f4173a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f4174b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f4173a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f4174b = i2;
        }
    }
}
