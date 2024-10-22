package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class en2 extends jn0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f1966b;
    public final int c;

    public en2(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f1966b = i;
        this.c = i2;
    }

    @Override // defpackage.jn0, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // defpackage.jn0, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1966b;
    }
}
