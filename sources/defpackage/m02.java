package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class m02 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3213a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f3214b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public m02(int i, String str, PendingIntent pendingIntent) {
        IconCompat b2 = i != 0 ? IconCompat.b(null, "", i) : null;
        Bundle bundle = new Bundle();
        this.d = true;
        this.f3214b = b2;
        if (b2 != null && b2.f() == 2) {
            this.e = b2.d();
        }
        this.f = u02.b(str);
        this.g = pendingIntent;
        this.f3213a = bundle;
        this.c = true;
        this.d = true;
    }
}
