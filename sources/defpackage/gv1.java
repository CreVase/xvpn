package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class gv1 extends go0 {
    public final int m;
    public final int n;
    public ru1 o;
    public su1 p;

    public gv1(Context context, boolean z) {
        super(context, z);
        if (1 == fv1.a(context.getResources().getConfiguration())) {
            this.m = 21;
            this.n = 22;
        } else {
            this.m = 22;
            this.n = 21;
        }
    }

    @Override // defpackage.go0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        gu1 gu1Var;
        int i;
        su1 su1Var;
        int pointToPosition;
        int i2;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                gu1Var = (gu1) headerViewListAdapter.getWrappedAdapter();
            } else {
                gu1Var = (gu1) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gu1Var.getCount()) {
                su1Var = gu1Var.getItem(i2);
            } else {
                su1Var = null;
            }
            su1 su1Var2 = this.p;
            if (su1Var2 != su1Var) {
                ju1 ju1Var = gu1Var.f2325a;
                if (su1Var2 != null) {
                    this.o.d(ju1Var, su1Var2);
                }
                this.p = su1Var;
                if (su1Var != null) {
                    this.o.k(ju1Var, su1Var);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        gu1 gu1Var;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.n) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                gu1Var = (gu1) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                gu1Var = (gu1) adapter;
            }
            gu1Var.f2325a.c(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(ru1 ru1Var) {
        this.o = ru1Var;
    }

    @Override // defpackage.go0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
