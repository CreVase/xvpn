package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class zw implements Iterable, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final char f5561a;

    /* renamed from: b, reason: collision with root package name */
    public final char f5562b;
    public final int c = 1;

    public zw(char c, char c2) {
        this.f5561a = c;
        this.f5562b = (char) m20.q0(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ax(this.f5561a, this.f5562b, this.c);
    }
}
