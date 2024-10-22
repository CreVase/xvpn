package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yk1 extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f5352a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk1 f5353b;

    public yk1(zk1 zk1Var) {
        this.f5353b = zk1Var;
        a();
    }

    public final void a() {
        ju1 ju1Var = this.f5353b.c;
        su1 su1Var = ju1Var.v;
        if (su1Var != null) {
            ju1Var.i();
            ArrayList arrayList = ju1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((su1) arrayList.get(i)) == su1Var) {
                    this.f5352a = i;
                    return;
                }
            }
        }
        this.f5352a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final su1 getItem(int i) {
        zk1 zk1Var = this.f5353b;
        ju1 ju1Var = zk1Var.c;
        ju1Var.i();
        ArrayList arrayList = ju1Var.j;
        zk1Var.getClass();
        int i2 = i + 0;
        int i3 = this.f5352a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (su1) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        zk1 zk1Var = this.f5353b;
        ju1 ju1Var = zk1Var.c;
        ju1Var.i();
        int size = ju1Var.j.size();
        zk1Var.getClass();
        int i = size + 0;
        if (this.f5352a < 0) {
            return i;
        }
        return i - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            zk1 zk1Var = this.f5353b;
            view = zk1Var.f5497b.inflate(zk1Var.e, viewGroup, false);
        }
        ((lv1) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
