package com.google.android.material.datepicker;

import com.facebook.ads.AdError;
import com.google.android.material.datepicker.CalendarConstraints;
import defpackage.mi3;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class b {
    public static final long f;
    public static final long g;

    /* renamed from: a, reason: collision with root package name */
    public final long f1539a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1540b;
    public Long c;
    public final int d;
    public final CalendarConstraints.DateValidator e;

    static {
        Month a2 = Month.a(1900, 0);
        Calendar d = mi3.d(null);
        d.setTimeInMillis(a2.f);
        f = mi3.b(d).getTimeInMillis();
        Month a3 = Month.a(AdError.BROKEN_MEDIA_ERROR_CODE, 11);
        Calendar d2 = mi3.d(null);
        d2.setTimeInMillis(a3.f);
        g = mi3.b(d2).getTimeInMillis();
    }

    public b(CalendarConstraints calendarConstraints) {
        this.f1539a = f;
        this.f1540b = g;
        this.e = new DateValidatorPointForward(Long.MIN_VALUE);
        this.f1539a = calendarConstraints.f1533a.f;
        this.f1540b = calendarConstraints.f1534b.f;
        this.c = Long.valueOf(calendarConstraints.d.f);
        this.d = calendarConstraints.e;
        this.e = calendarConstraints.c;
    }
}
