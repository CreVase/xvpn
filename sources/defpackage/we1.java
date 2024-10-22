package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class we1 extends kh3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4991b;

    public we1(Object obj) {
        this.f4991b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4990a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4990a) {
            this.f4990a = true;
            return this.f4991b;
        }
        throw new NoSuchElementException();
    }
}
