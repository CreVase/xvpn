package defpackage;

/* loaded from: classes.dex */
public final class js extends ms {

    /* renamed from: a, reason: collision with root package name */
    public int f2818a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f2819b;
    public final /* synthetic */ vs c;

    public js(vs vsVar) {
        this.c = vsVar;
        this.f2819b = vsVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2818a < this.f2819b) {
            return true;
        }
        return false;
    }
}
