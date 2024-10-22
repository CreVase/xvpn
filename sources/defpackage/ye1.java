package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ye1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final ye1 f5322a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ye1[] f5323b;

    static {
        ye1 ye1Var = new ye1();
        f5322a = ye1Var;
        f5323b = new ye1[]{ye1Var};
    }

    public static ye1 valueOf(String str) {
        return (ye1) Enum.valueOf(ye1.class, str);
    }

    public static ye1[] values() {
        return (ye1[]) f5323b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        cp3.n("no calls to next() since the last call to remove()", false);
    }
}
