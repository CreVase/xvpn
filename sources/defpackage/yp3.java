package defpackage;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class yp3 implements zp3 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f5374a;

    public yp3(View view) {
        this.f5374a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof yp3) && ((yp3) obj).f5374a.equals(this.f5374a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5374a.hashCode();
    }
}
