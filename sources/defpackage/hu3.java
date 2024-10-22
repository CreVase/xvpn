package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class hu3 extends View {

    /* renamed from: a, reason: collision with root package name */
    public x31 f2489a;

    public hu3(Context context) {
        super(context, null, 0);
    }

    public final x31 getOnDraw() {
        return this.f2489a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x31 x31Var = this.f2489a;
        if (x31Var != null) {
            x31Var.invoke(canvas);
        }
    }

    public final void setOnDraw(x31 x31Var) {
        this.f2489a = x31Var;
    }
}
