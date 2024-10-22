package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qq0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4038a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final ow1 f4039b;
    public ow1 c;
    public ow1 d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public qq0(ow1 ow1Var, boolean z, int[] iArr) {
        this.f4039b = ow1Var;
        this.c = ow1Var;
        this.g = z;
        this.h = iArr;
    }

    public final void a() {
        this.f4038a = 1;
        this.c = this.f4039b;
        this.f = 0;
    }

    public final boolean b() {
        boolean z;
        boolean z2;
        int[] iArr;
        mw1 c = this.c.f3741b.c();
        int a2 = c.a(6);
        if (a2 != 0 && ((ByteBuffer) c.d).get(a2 + c.f5118a) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.e == 65039) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        if (!this.g || ((iArr = this.h) != null && Arrays.binarySearch(iArr, this.c.f3741b.a(0)) >= 0)) {
            return false;
        }
        return true;
    }
}
