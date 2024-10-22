package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.c;

/* loaded from: classes.dex */
public abstract class v32 {

    /* renamed from: a, reason: collision with root package name */
    public final c f4775a;

    /* renamed from: b, reason: collision with root package name */
    public int f4776b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public v32(c cVar) {
        this.f4775a = cVar;
    }

    public static u32 a(c cVar, int i) {
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                return new u32(cVar, i2);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new u32(cVar, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j(View view);

    public abstract int k(View view);

    public abstract void l(int i);
}
