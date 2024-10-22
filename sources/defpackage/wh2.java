package defpackage;

/* loaded from: classes.dex */
public final class wh2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5010a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f5011b = 0;
    public int c = 0;
    public int d = 1;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l;
    public long m;
    public int n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.g) {
            return this.f5011b - this.c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5010a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f5011b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
    }
}
