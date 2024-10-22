package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gu1 extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final ju1 f2325a;

    /* renamed from: b, reason: collision with root package name */
    public int f2326b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public gu1(ju1 ju1Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.f2325a = ju1Var;
        this.f = i;
        a();
    }

    public final void a() {
        ju1 ju1Var = this.f2325a;
        su1 su1Var = ju1Var.v;
        if (su1Var != null) {
            ju1Var.i();
            ArrayList arrayList = ju1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((su1) arrayList.get(i)) == su1Var) {
                    this.f2326b = i;
                    return;
                }
            }
        }
        this.f2326b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final su1 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        ju1 ju1Var = this.f2325a;
        if (z) {
            ju1Var.i();
            l = ju1Var.j;
        } else {
            l = ju1Var.l();
        }
        int i2 = this.f2326b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (su1) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        ju1 ju1Var = this.f2325a;
        if (z) {
            ju1Var.i();
            l = ju1Var.j;
        } else {
            l = ju1Var.l();
        }
        if (this.f2326b < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i3 = getItem(i).f4415b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).f4415b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2325a.m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        lv1 lv1Var = (lv1) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        lv1Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
