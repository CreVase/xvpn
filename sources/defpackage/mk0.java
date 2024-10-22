package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class mk0 extends j11 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3310a;

    public mk0(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f3310a = arrayList;
    }
}
