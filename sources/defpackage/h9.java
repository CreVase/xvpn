package defpackage;

import android.view.View;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class h9 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2387b;

    public h9(View view, View view2) {
        this.f2386a = view;
        this.f2387b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        m9.b(absListView, this.f2386a, this.f2387b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
