package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class kl3 {
    public static final ArrayList d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2969a = null;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f2970b = null;
    public WeakReference c = null;

    public static void b(View view) {
        int size;
        ArrayList arrayList = (ArrayList) view.getTag(af2.tag_unhandled_key_listeners);
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            p71.C(arrayList.get(size));
            throw null;
        }
    }

    public final View a(View view) {
        View a2;
        WeakHashMap weakHashMap = this.f2969a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a2 = a(viewGroup.getChildAt(childCount));
                    }
                } while (a2 == null);
                return a2;
            }
            b(view);
            return null;
        }
        return null;
    }
}
