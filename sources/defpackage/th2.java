package defpackage;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class th2 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f4504a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f4505b = 0;
    public final Set c = Collections.newSetFromMap(new IdentityHashMap());

    public final sh2 a(int i) {
        SparseArray sparseArray = this.f4504a;
        sh2 sh2Var = (sh2) sparseArray.get(i);
        if (sh2Var == null) {
            sh2 sh2Var2 = new sh2();
            sparseArray.put(i, sh2Var2);
            return sh2Var2;
        }
        return sh2Var;
    }
}
