package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fh2;
import defpackage.jf2;
import defpackage.mi3;
import defpackage.re2;
import defpackage.xe2;
import defpackage.zq1;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class l extends fh2 {
    public final CalendarConstraints d;
    public final zq1 e;
    public final int f;

    public l(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, d dVar) {
        int i;
        Calendar calendar = calendarConstraints.f1533a.f1537a;
        Month month = calendarConstraints.d;
        if (calendar.compareTo(month.f1537a) <= 0) {
            if (month.f1537a.compareTo(calendarConstraints.f1534b.f1537a) <= 0) {
                int i2 = i.d;
                int i3 = f.m;
                Resources resources = contextThemeWrapper.getResources();
                int i4 = re2.mtrl_calendar_day_height;
                int dimensionPixelSize = resources.getDimensionPixelSize(i4) * i2;
                if (g.z(contextThemeWrapper)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(i4);
                } else {
                    i = 0;
                }
                this.f = dimensionPixelSize + i;
                this.d = calendarConstraints;
                this.e = dVar;
                A(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.d.g;
    }

    @Override // defpackage.fh2
    public final long d(int i) {
        Calendar b2 = mi3.b(this.d.f1533a.f1537a);
        b2.add(2, i);
        return new Month(b2).f1537a.getTimeInMillis();
    }

    @Override // defpackage.fh2
    public final void n(androidx.recyclerview.widget.h hVar, int i) {
        k kVar = (k) hVar;
        CalendarConstraints calendarConstraints = this.d;
        Calendar b2 = mi3.b(calendarConstraints.f1533a.f1537a);
        b2.add(2, i);
        Month month = new Month(b2);
        kVar.u.setText(month.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) kVar.v.findViewById(xe2.month_grid);
        if (materialCalendarGridView.getAdapter() != null && month.equals(materialCalendarGridView.getAdapter().f1550a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().getClass();
            throw null;
        }
        new i(month, calendarConstraints);
        throw null;
    }

    @Override // defpackage.fh2
    public final androidx.recyclerview.widget.h s(RecyclerView recyclerView, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(jf2.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (g.z(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new androidx.recyclerview.widget.d(-1, this.f));
            return new k(linearLayout, true);
        }
        return new k(linearLayout, false);
    }
}
