package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class zk1 implements jv1, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f5496a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f5497b;
    public ju1 c;
    public ExpandedMenuView d;
    public final int e;
    public iv1 f;
    public yk1 g;

    public zk1(Context context, int i) {
        this.e = i;
        this.f5496a = context;
        this.f5497b = LayoutInflater.from(context);
    }

    @Override // defpackage.jv1
    public final void a(ju1 ju1Var, boolean z) {
        iv1 iv1Var = this.f;
        if (iv1Var != null) {
            iv1Var.a(ju1Var, z);
        }
    }

    @Override // defpackage.jv1
    public final boolean c(q23 q23Var) {
        if (!q23Var.hasVisibleItems()) {
            return false;
        }
        ku1 ku1Var = new ku1(q23Var);
        Context context = q23Var.f2830a;
        q9 q9Var = new q9(context);
        zk1 zk1Var = new zk1(((j9) q9Var.f3970b).f2722a, kf2.abc_list_menu_item_layout);
        ku1Var.c = zk1Var;
        zk1Var.f = ku1Var;
        q23Var.b(zk1Var, context);
        zk1 zk1Var2 = ku1Var.c;
        if (zk1Var2.g == null) {
            zk1Var2.g = new yk1(zk1Var2);
        }
        yk1 yk1Var = zk1Var2.g;
        Object obj = q9Var.f3970b;
        j9 j9Var = (j9) obj;
        j9Var.h = yk1Var;
        j9Var.i = ku1Var;
        View view = q23Var.o;
        if (view != null) {
            j9Var.e = view;
        } else {
            j9Var.c = q23Var.n;
            ((j9) obj).d = q23Var.m;
        }
        ((j9) obj).f = ku1Var;
        s9 l = q9Var.l();
        ku1Var.f3015b = l;
        l.setOnDismissListener(ku1Var);
        WindowManager.LayoutParams attributes = ku1Var.f3015b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ku1Var.f3015b.show();
        iv1 iv1Var = this.f;
        if (iv1Var != null) {
            iv1Var.n(q23Var);
            return true;
        }
        return true;
    }

    @Override // defpackage.jv1
    public final boolean d() {
        return false;
    }

    @Override // defpackage.jv1
    public final boolean e(su1 su1Var) {
        return false;
    }

    @Override // defpackage.jv1
    public final void f(iv1 iv1Var) {
        this.f = iv1Var;
    }

    @Override // defpackage.jv1
    public final boolean g(su1 su1Var) {
        return false;
    }

    @Override // defpackage.jv1
    public final void h() {
        yk1 yk1Var = this.g;
        if (yk1Var != null) {
            yk1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.jv1
    public final void j(Context context, ju1 ju1Var) {
        if (this.f5496a != null) {
            this.f5496a = context;
            if (this.f5497b == null) {
                this.f5497b = LayoutInflater.from(context);
            }
        }
        this.c = ju1Var;
        yk1 yk1Var = this.g;
        if (yk1Var != null) {
            yk1Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.g.getItem(i), this, 0);
    }
}
