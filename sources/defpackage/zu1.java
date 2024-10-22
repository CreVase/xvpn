package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class zu1 implements gt2, jv1, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f5549a;

    public static int l(gu1 gu1Var, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = gu1Var.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = gu1Var.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = gu1Var.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean t(ju1 ju1Var) {
        int size = ju1Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = ju1Var.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jv1
    public final boolean e(su1 su1Var) {
        return false;
    }

    @Override // defpackage.jv1
    public final boolean g(su1 su1Var) {
        return false;
    }

    @Override // defpackage.jv1
    public final void j(Context context, ju1 ju1Var) {
    }

    public abstract void k(ju1 ju1Var);

    public abstract void m(View view);

    public abstract void n(boolean z);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        gu1 gu1Var;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            gu1Var = (gu1) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            gu1Var = (gu1) listAdapter;
        }
        ju1 ju1Var = gu1Var.f2325a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof fv)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        ju1Var.q(menuItem, this, i2);
    }

    public abstract void p(int i);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z);

    public abstract void s(int i);
}
