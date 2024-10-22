package defpackage;

import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class xl0 {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f5177a;

    public xl0(DisplayCutout displayCutout) {
        this.f5177a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xl0.class == obj.getClass()) {
            return w12.a(this.f5177a, ((xl0) obj).f5177a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f5177a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5177a + "}";
    }
}
