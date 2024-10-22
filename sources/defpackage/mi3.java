package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class mi3 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3305a = new AtomicReference();

    public static DateFormat a(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        timeZone = TimeZone.getTimeZone("UTC");
        instanceForSkeleton.setTimeZone(timeZone);
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }

    public static Calendar b(Calendar calendar) {
        Calendar d = d(calendar);
        Calendar d2 = d(null);
        d2.set(d.get(1), d.get(2), d.get(5));
        return d2;
    }

    public static Calendar c() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
