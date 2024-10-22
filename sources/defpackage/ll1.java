package defpackage;

import android.widget.ListView;

/* loaded from: classes.dex */
public abstract class ll1 {
    public static boolean a(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    public static void b(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
