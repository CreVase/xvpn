package com.security.xvpn.z35kb.util;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.security.xvpn.z35kb.R;
import defpackage.uv;
import defpackage.wh2;

/* loaded from: classes2.dex */
public class CenterScrollLayoutManager extends LinearLayoutManager {
    public final uv E;
    public View F;
    public boolean G;
    public int H;

    public CenterScrollLayoutManager(Context context) {
        super(1, false);
        this.G = true;
        this.E = new uv(context, 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final void b0(wh2 wh2Var) {
        super.b0(wh2Var);
        if (this.G) {
            this.H = 0;
            this.G = false;
        }
        try {
            View u = u(this.H);
            if (u != null) {
                u.setId(R.id.recyclerViewFocusItem);
            }
        } catch (Exception unused) {
            View u2 = u(1);
            if (u2 != null) {
                u2.setId(R.id.recyclerViewFocusItem);
            }
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean c0(RecyclerView recyclerView, wh2 wh2Var, View view, View view2) {
        if (!super.c0(recyclerView, wh2Var, view, view2)) {
            int F = c.F(view);
            uv uvVar = this.E;
            uvVar.f3477a = F;
            y0(uvVar);
            if (recyclerView.indexOfChild(view2) != -1) {
                this.H = recyclerView.indexOfChild(view2);
                View view3 = this.F;
                if (view3 != null) {
                    view3.setId(-1);
                }
                this.F = view2;
                if (view2 != null) {
                    view2.setId(R.id.recyclerViewFocusItem);
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void g1() {
        a1(0, 0);
        View view = this.F;
        if (view != null) {
            view.setId(-1);
        }
        View u = u(0);
        this.F = u;
        if (u != null) {
            u.setId(R.id.recyclerViewFocusItem);
        }
        this.G = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final void x0(RecyclerView recyclerView, int i) {
        uv uvVar = this.E;
        uvVar.f3477a = i;
        y0(uvVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.c
    public final boolean z0() {
        return false;
    }
}
