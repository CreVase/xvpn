package defpackage;

import android.view.View;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m90 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3256a;

    public /* synthetic */ m90(int i) {
        this.f3256a = i;
    }

    public final int a(View view, View view2) {
        switch (this.f3256a) {
            case 0:
                WeakHashMap weakHashMap = ll3.f3151a;
                float m = al3.m(view);
                float m2 = al3.m(view2);
                if (m > m2) {
                    return -1;
                }
                if (m < m2) {
                    return 1;
                }
                return 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3256a) {
            case 0:
                return a((View) obj, (View) obj2);
            case 1:
                return a((View) obj, (View) obj2);
            case 2:
                return fl.t(Long.valueOf(((j53) ((z91) obj)).B), Long.valueOf(((j53) ((z91) obj2)).B));
            case 3:
                return fl.t(((pb2) obj2).c, ((pb2) obj).c);
            default:
                return fl.t(Integer.valueOf(((lz1) obj).f3210b), Integer.valueOf(((lz1) obj2).f3210b));
        }
    }
}
