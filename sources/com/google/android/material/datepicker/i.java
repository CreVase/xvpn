package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import defpackage.mi3;
import defpackage.o40;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class i extends BaseAdapter {
    public static final int d = mi3.d(null).getMaximum(4);
    public static final int e = (mi3.d(null).getMaximum(7) + mi3.d(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f1550a;

    /* renamed from: b, reason: collision with root package name */
    public o40 f1551b;
    public final CalendarConstraints c;

    public i(Month month, CalendarConstraints calendarConstraints) {
        this.f1550a = month;
        this.c = calendarConstraints;
        throw null;
    }

    public final int a() {
        int i = this.c.e;
        Month month = this.f1550a;
        Calendar calendar = month.f1537a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + month.d;
        }
        return i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i >= a()) {
            int a2 = a();
            Month month = this.f1550a;
            if (i <= (a2 + month.e) - 1) {
                int a3 = (i - a()) + 1;
                Calendar b2 = mi3.b(month.f1537a);
                b2.set(5, a3);
                return Long.valueOf(b2.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f1550a.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            o40 r1 = r4.f1551b
            if (r1 != 0) goto Lf
            o40 r1 = new o40
            r1.<init>(r0)
            r4.f1551b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L26
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = defpackage.jf2.mtrl_calendar_day
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5c
            com.google.android.material.datepicker.Month r7 = r4.f1550a
            int r2 = r7.e
            if (r6 < r2) goto L35
            goto L5c
        L35:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L64
        L5c:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L64:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6b
            goto L70
        L6b:
            r5.longValue()
            if (r0 != 0) goto L71
        L70:
            return r0
        L71:
            r0.getContext()
            java.util.Calendar r5 = defpackage.mi3.c()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
