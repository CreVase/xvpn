package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class co2 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f678b;

    public /* synthetic */ co2(View view, int i) {
        this.f677a = i;
        this.f678b = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.f677a;
        View view2 = this.f678b;
        switch (i2) {
            case 0:
                ((SearchView) view2).p(i);
                return;
            default:
                qq1 qq1Var = (qq1) view2;
                View view3 = null;
                if (i < 0) {
                    hl1 hl1Var = qq1Var.e;
                    if (!hl1Var.b()) {
                        item = null;
                    } else {
                        item = hl1Var.c.getSelectedItem();
                    }
                } else {
                    item = qq1Var.getAdapter().getItem(i);
                }
                qq1.a(qq1Var, item);
                AdapterView.OnItemClickListener onItemClickListener = qq1Var.getOnItemClickListener();
                hl1 hl1Var2 = qq1Var.e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (hl1Var2.b()) {
                            view3 = hl1Var2.c.getSelectedView();
                        }
                        view = view3;
                        if (!hl1Var2.b()) {
                            i = -1;
                        } else {
                            i = hl1Var2.c.getSelectedItemPosition();
                        }
                        if (!hl1Var2.b()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = hl1Var2.c.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(hl1Var2.c, view, i, j);
                }
                hl1Var2.dismiss();
                return;
        }
    }
}
