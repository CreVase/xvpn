package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class my0 {

    /* renamed from: a, reason: collision with root package name */
    public long f3372a;

    /* renamed from: b, reason: collision with root package name */
    public long f3373b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final boolean[] g = new boolean[15];
    public int h;

    public final boolean a() {
        if (this.d > 15 && this.h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j) {
        long j2 = this.d;
        if (j2 == 0) {
            this.f3372a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f3372a;
            this.f3373b = j3;
            this.f = j3;
            this.e = 1L;
        } else {
            long j4 = j - this.c;
            int i = (int) (j2 % 15);
            long abs = Math.abs(j4 - this.f3373b);
            boolean[] zArr = this.g;
            if (abs <= 1000000) {
                this.e++;
                this.f += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.h++;
            }
        }
        this.d++;
        this.c = j;
    }

    public final void c() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }
}
