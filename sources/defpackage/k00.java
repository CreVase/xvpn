package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class k00 {

    /* renamed from: a, reason: collision with root package name */
    public List f2864a = cr0.f1659a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2865b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public static void a(k00 k00Var, String str, mp2 mp2Var) {
        cr0 cr0Var = cr0.f1659a;
        if (k00Var.c.add(str)) {
            k00Var.f2865b.add(str);
            k00Var.d.add(mp2Var);
            k00Var.e.add(cr0Var);
            k00Var.f.add(false);
            return;
        }
        throw new IllegalArgumentException(hx2.q("Element with name '", str, "' is already registered").toString());
    }
}
