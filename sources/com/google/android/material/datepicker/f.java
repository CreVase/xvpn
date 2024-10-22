package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.bx2;
import defpackage.f9;
import defpackage.g52;
import defpackage.ie0;
import defpackage.if2;
import defpackage.jf2;
import defpackage.k42;
import defpackage.ll3;
import defpackage.o40;
import defpackage.p71;
import defpackage.re2;
import defpackage.vq1;
import defpackage.wq1;
import defpackage.xe2;
import defpackage.xq1;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class f<S> extends g52 {
    public static final /* synthetic */ int m = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1546b;
    public CalendarConstraints c;
    public Month d;
    public int e;
    public o40 f;
    public RecyclerView g;
    public RecyclerView h;
    public View i;
    public View j;
    public View k;
    public View l;

    public final void m(Month month) {
        boolean z;
        Month month2 = ((l) this.h.getAdapter()).d.f1533a;
        Calendar calendar = month2.f1537a;
        if (calendar instanceof GregorianCalendar) {
            int i = month.c;
            int i2 = month2.c;
            int i3 = month.f1538b;
            int i4 = month2.f1538b;
            int i5 = (i3 - i4) + ((i - i2) * 12);
            Month month3 = this.d;
            if (calendar instanceof GregorianCalendar) {
                int i6 = i5 - ((month3.f1538b - i4) + ((month3.c - i2) * 12));
                boolean z2 = false;
                if (Math.abs(i6) > 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i6 > 0) {
                    z2 = true;
                }
                this.d = month;
                if (z && z2) {
                    this.h.f0(i5 - 3);
                    this.h.post(new vq1(this, i5));
                    return;
                } else if (z) {
                    this.h.f0(i5 + 3);
                    this.h.post(new vq1(this, i5));
                    return;
                } else {
                    this.h.post(new vq1(this, i5));
                    return;
                }
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f1546b = bundle.getInt("THEME_RES_ID_KEY");
        p71.u(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        p71.u(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.d = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ie0 ie0Var;
        k42 k42Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f1546b);
        this.f = new o40(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.c.f1533a;
        int i3 = 1;
        int i4 = 0;
        if (g.z(contextThemeWrapper)) {
            i = jf2.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = jf2.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(re2.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(re2.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(re2.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(re2.mtrl_calendar_days_of_week_height);
        int i5 = i.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(re2.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(re2.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(re2.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(xe2.mtrl_calendar_days_of_week);
        ll3.p(gridView, new wq1(this, i4));
        int i6 = this.c.e;
        if (i6 > 0) {
            ie0Var = new ie0(i6);
        } else {
            ie0Var = new ie0();
        }
        gridView.setAdapter((ListAdapter) ie0Var);
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.h = (RecyclerView) inflate.findViewById(xe2.mtrl_calendar_months);
        getContext();
        this.h.setLayoutManager(new xq1(this, i2, i2));
        this.h.setTag("MONTHS_VIEW_GROUP_TAG");
        l lVar = new l(contextThemeWrapper, this.c, new d(this));
        this.h.setAdapter(lVar);
        int integer = contextThemeWrapper.getResources().getInteger(if2.mtrl_calendar_year_selector_span);
        int i7 = xe2.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(i7);
        this.g = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.g.setLayoutManager(new GridLayoutManager(integer));
            this.g.setAdapter(new m(this));
            this.g.i(new yq1(this));
        }
        int i8 = xe2.month_navigation_fragment_toggle;
        if (inflate.findViewById(i8) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i8);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            int i9 = 2;
            ll3.p(materialButton, new wq1(this, i9));
            View findViewById = inflate.findViewById(xe2.month_navigation_previous);
            this.i = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(xe2.month_navigation_next);
            this.j = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.k = inflate.findViewById(i7);
            this.l = inflate.findViewById(xe2.mtrl_calendar_day_selector_frame);
            s(1);
            materialButton.setText(this.d.d());
            this.h.j(new e(this, lVar, materialButton));
            materialButton.setOnClickListener(new f9(this, i9));
            this.j.setOnClickListener(new c(this, lVar, i3));
            this.i.setOnClickListener(new c(this, lVar, i4));
        }
        if (!g.z(contextThemeWrapper) && (recyclerView2 = (k42Var = new k42()).f2882a) != (recyclerView = this.h)) {
            bx2 bx2Var = k42Var.f2883b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.u0;
                if (arrayList != null) {
                    arrayList.remove(bx2Var);
                }
                k42Var.f2882a.setOnFlingListener(null);
            }
            k42Var.f2882a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    k42Var.f2882a.j(bx2Var);
                    k42Var.f2882a.setOnFlingListener(k42Var);
                    new Scroller(k42Var.f2882a.getContext(), new DecelerateInterpolator());
                    k42Var.f();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        RecyclerView recyclerView4 = this.h;
        Month month2 = this.d;
        Month month3 = lVar.d.f1533a;
        if (month3.f1537a instanceof GregorianCalendar) {
            recyclerView4.f0((month2.f1538b - month3.f1538b) + ((month2.c - month3.c) * 12));
            ll3.p(this.h, new wq1(this, i3));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1546b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.d);
    }

    public final void s(int i) {
        this.e = i;
        if (i == 2) {
            this.g.getLayoutManager().n0(this.d.c - ((m) this.g.getAdapter()).d.c.f1533a.c);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            m(this.d);
        }
    }
}
