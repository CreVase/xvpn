package defpackage;

/* loaded from: classes.dex */
public final class ku0 {

    /* renamed from: a, reason: collision with root package name */
    public final ua3 f3012a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3013b;
    public final int c;

    public ku0(int i, ua3 ua3Var, int[] iArr) {
        if (iArr.length == 0) {
            sn1.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f3012a = ua3Var;
        this.f3013b = iArr;
        this.c = i;
    }
}
