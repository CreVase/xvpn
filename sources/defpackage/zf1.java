package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class zf1 implements fj3 {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f5471a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f5471a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        ((gj3) obj2).b(f5471a.format((Date) obj));
    }
}
