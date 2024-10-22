package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class mv {
    public static final xz0 c = new xz0(5);

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f3358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3359b;

    public mv(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        boolean z2;
        int i5;
        if (z) {
            i5 = i3;
            z2 = true;
        } else {
            z2 = false;
            i5 = -16777216;
        }
        this.f3358a = new hc0(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, Integer.MIN_VALUE, 0.0f);
        this.f3359b = i4;
    }
}
