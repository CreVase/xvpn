package defpackage;

/* loaded from: classes.dex */
public final class a63 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f30a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31b;
    public final String c;
    public final String d;

    public a63(int i, int i2, String str, String str2) {
        this.f30a = i;
        this.f31b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a63 a63Var = (a63) obj;
        int i = this.f30a - a63Var.f30a;
        if (i == 0) {
            return this.f31b - a63Var.f31b;
        }
        return i;
    }
}
