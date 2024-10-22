package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class go1 implements Iterable, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2292b;
    public final long c;

    public go1(long j, long j2) {
        this.f2291a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f2292b = j2;
        this.c = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ho1(this.f2291a, this.f2292b, this.c);
    }
}
