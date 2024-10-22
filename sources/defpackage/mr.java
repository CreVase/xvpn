package defpackage;

/* loaded from: classes.dex */
public abstract class mr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3341a;

    /* renamed from: b, reason: collision with root package name */
    public int f3342b;

    public mr() {
        this.f3341a = 0;
    }

    public static String f(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public final void e(int i) {
        this.f3342b = i | this.f3342b;
    }

    public final boolean g(int i) {
        if ((this.f3342b & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return g(Integer.MIN_VALUE);
    }

    public String toString() {
        switch (this.f3341a) {
            case 1:
                return f(this.f3342b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mr(int i, int i2) {
        this.f3341a = i2;
        this.f3342b = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr(int i) {
        this(i, 2);
        this.f3341a = 2;
    }
}
