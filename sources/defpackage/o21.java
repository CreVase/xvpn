package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o21 {

    /* renamed from: a, reason: collision with root package name */
    public static final t21 f3586a = new t21();

    /* renamed from: b, reason: collision with root package name */
    public static final v21 f3587b;

    static {
        v21 v21Var;
        try {
            v21Var = (v21) z21.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            v21Var = null;
        }
        f3587b = v21Var;
    }

    public static final void a(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
