package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u21 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4615b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public u21(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f4614a = i;
        this.f4615b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f4614a; i++) {
            View view = (View) this.f4615b.get(i);
            String str = (String) this.c.get(i);
            WeakHashMap weakHashMap = ll3.f3151a;
            al3.v(view, str);
            al3.v((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
