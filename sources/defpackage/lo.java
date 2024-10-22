package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class lo extends sn {
    public final ArrayList d;

    public lo() {
        super(0);
        this.d = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (getView() != null && (getView() instanceof ViewGroup)) {
            boolean z2 = !z;
            z((ViewGroup) getView());
            ArrayList arrayList = this.d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                view.setEnabled(z2);
                view.setFocusable(z2);
            }
            if (z2) {
                arrayList.clear();
            }
        }
    }

    public final void z(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.isFocusable()) {
                this.d.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                z((ViewGroup) childAt);
            }
        }
    }
}
