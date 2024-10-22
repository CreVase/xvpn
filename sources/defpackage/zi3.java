package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zi3 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f5486b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static zi3 d;

    /* renamed from: a, reason: collision with root package name */
    public final c02 f5487a;

    public zi3(c02 c02Var) {
        this.f5487a = c02Var;
    }

    public static zi3 a() {
        if (c02.c == null) {
            c02.c = new c02(25);
        }
        c02 c02Var = c02.c;
        if (d == null) {
            d = new zi3(c02Var);
        }
        return d;
    }

    public final boolean b(bm bmVar) {
        if (TextUtils.isEmpty(bmVar.c)) {
            return true;
        }
        long j = bmVar.f + bmVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f5487a.getClass();
        if (j < timeUnit.toSeconds(System.currentTimeMillis()) + f5486b) {
            return true;
        }
        return false;
    }
}
