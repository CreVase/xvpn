package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class es2 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1984a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1985b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g = new Path();
    public final Paint h;

    public es2() {
        Paint paint = new Paint();
        this.h = paint;
        this.f1984a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1985b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }

    public final void a(int i2) {
        this.d = h20.d(i2, 68);
        this.e = h20.d(i2, 20);
        this.f = h20.d(i2, 0);
        this.f1984a.setColor(this.d);
    }
}
