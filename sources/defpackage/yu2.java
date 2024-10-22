package defpackage;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class yu2 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5392b;
    public int c = -1;
    public int d = -1;

    public yu2(int i, boolean z) {
        this.f5391a = z;
        this.f5392b = i;
    }

    public final int a() {
        int j = v73.j(this.f5392b);
        if (this.f5391a) {
            float alpha = Color.alpha(1084268704) / 255.0f;
            float f = 1.0f - alpha;
            return Color.rgb((int) ((Color.red(j) * f) + (Color.red(1084268704) * alpha)), (int) ((Color.green(j) * f) + (Color.green(1084268704) * alpha)), (int) ((Color.blue(j) * f) + (Color.blue(1084268704) * alpha)));
        }
        return j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
