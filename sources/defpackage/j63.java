package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j63 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2711a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f2712b;

    public j63(Context context) {
        this.f2712b = context;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2711a.iterator();
    }
}
