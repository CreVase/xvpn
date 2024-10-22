package com.security.xvpn.z35kb.widget;

import a.du;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import defpackage.ew3;
import defpackage.ey1;
import defpackage.g53;
import defpackage.gk2;
import defpackage.hx2;
import defpackage.iq2;
import defpackage.ll3;
import defpackage.vk3;
import defpackage.w53;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class TabSaveFocusLayout extends LinearLayout implements View.OnFocusChangeListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public w53 f1638a;

    /* renamed from: b, reason: collision with root package name */
    public int f1639b;
    public boolean c;

    public TabSaveFocusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1639b = 0;
        this.c = true;
    }

    public final void a(View view, boolean z) {
        iq2 iq2Var;
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getClass() != View.class) {
                if (z) {
                    childAt.setEnabled(true);
                    if (this.c) {
                        childAt.setFocusable(true);
                    }
                } else if (view != childAt) {
                    childAt.setEnabled(false);
                    if (this.c) {
                        childAt.setFocusable(false);
                    }
                }
                childAt.setSelected(false);
            }
        }
        view.setSelected(true);
        if (z) {
            if (this.c) {
                view.requestFocus();
            }
            if (this.f1638a != null) {
                this.f1639b = indexOfChild(view);
                if (this.c) {
                    this.f1638a.getClass();
                }
                w53 w53Var = this.f1638a;
                int i3 = this.f1639b;
                ServerChooseActivity serverChooseActivity = (ServerChooseActivity) w53Var;
                serverChooseActivity.getClass();
                int i4 = i3 / 2;
                if (!serverChooseActivity.d && serverChooseActivity.r != i4) {
                    ew3.b0(new g53(serverChooseActivity, 8));
                    if (i4 != 1) {
                        if (i4 == 2) {
                            du.d(311, null);
                            du.d(313, null);
                        }
                    } else {
                        du.d(309, null);
                    }
                    p supportFragmentManager = serverChooseActivity.getSupportFragmentManager();
                    androidx.fragment.app.a k = hx2.k(supportFragmentManager, supportFragmentManager);
                    iq2[] iq2VarArr = serverChooseActivity.q;
                    if (iq2VarArr[i4] == null) {
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    i = 4;
                                }
                            } else {
                                i = 1;
                            }
                        }
                        ey1 ey1Var = serverChooseActivity.n;
                        ey1 ey1Var2 = serverChooseActivity.p;
                        ey1 ey1Var3 = serverChooseActivity.o;
                        iq2 iq2Var2 = new iq2();
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_type", i);
                        iq2Var2.setArguments(bundle);
                        iq2Var2.h = ey1Var;
                        iq2Var2.i = ey1Var2;
                        iq2Var2.j = ey1Var3;
                        iq2VarArr[i4] = iq2Var2;
                        Rect rect = serverChooseActivity.s;
                        iq2Var2.l = rect;
                        if (iq2Var2.getView() != null && rect != null) {
                            ((NavigationBarContentConstraintLayout) iq2Var2.getView()).fitSystemWindows(rect);
                        }
                        k.d(R.id.flServerListContainer, iq2Var2, serverChooseActivity.l[i4], 1);
                    }
                    int i5 = serverChooseActivity.r;
                    if (i5 != -1 && (iq2Var = iq2VarArr[i5]) != null) {
                        k.k(iq2Var);
                    }
                    iq2 iq2Var3 = iq2VarArr[i4];
                    if (iq2Var3 != null) {
                        k.l(iq2Var3);
                        Rect rect2 = serverChooseActivity.s;
                        iq2Var3.l = rect2;
                        if (iq2Var3.getView() != null && rect2 != null) {
                            ((NavigationBarContentConstraintLayout) iq2Var3.getView()).fitSystemWindows(rect2);
                        }
                        ew3.c0(new gk2(i4, 4, serverChooseActivity));
                    }
                    k.h();
                    serverChooseActivity.r = i4;
                }
            }
        }
    }

    public int getSelectPosition() {
        return this.f1639b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a(view, true);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        a(view, z);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1639b > getChildCount()) {
            this.f1639b = getChildCount() - 1;
        }
        if (getChildAt(this.f1639b).getVisibility() != 0) {
            this.f1639b = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getClass() != View.class) {
                    if (i5 == this.f1639b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    childAt.setEnabled(z2);
                    if (i5 == this.f1639b) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    childAt.setFocusable(z3);
                    if (i5 == this.f1639b) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    childAt.setSelected(z4);
                }
            }
        }
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getClass() != View.class) {
                WeakHashMap weakHashMap = ll3.f3151a;
                childAt2.setId(vk3.a());
                childAt2.setOnFocusChangeListener(this);
                childAt2.setOnClickListener(this);
                if (this.f1639b == i6) {
                    childAt2.setSelected(true);
                }
            }
        }
    }

    public void setChangeFocus(boolean z) {
        this.c = z;
    }

    public void setOnFocusChangeListener(w53 w53Var) {
        this.f1638a = w53Var;
    }
}
