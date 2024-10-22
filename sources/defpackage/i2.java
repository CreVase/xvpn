package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class i2 extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f2520a;

    /* renamed from: b, reason: collision with root package name */
    public final g3 f2521b;
    public final int c;

    public i2(int i, g3 g3Var, int i2) {
        this.f2520a = i;
        this.f2521b = g3Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2520a);
        this.f2521b.f2195a.performAction(this.c, bundle);
    }
}
