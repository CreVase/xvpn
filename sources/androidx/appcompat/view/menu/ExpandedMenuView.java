package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.go2;
import defpackage.iu1;
import defpackage.ju1;
import defpackage.mv1;
import defpackage.su1;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements iu1, mv1, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f142b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public ju1 f143a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        go2 go2Var = new go2(context, context.obtainStyledAttributes(attributeSet, f142b, R.attr.listViewStyle, 0));
        if (go2Var.l(0)) {
            setBackgroundDrawable(go2Var.e(0));
        }
        if (go2Var.l(1)) {
            setDivider(go2Var.e(1));
        }
        go2Var.o();
    }

    @Override // defpackage.iu1
    public final boolean a(su1 su1Var) {
        return this.f143a.q(su1Var, null, 0);
    }

    @Override // defpackage.mv1
    public final void b(ju1 ju1Var) {
        this.f143a = ju1Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((su1) getAdapter().getItem(i));
    }
}
