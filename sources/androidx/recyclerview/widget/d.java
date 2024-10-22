package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public h f276a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f277b;
    public boolean c;
    public boolean d;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f277b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        return this.f276a.f();
    }

    public final boolean b() {
        if ((this.f276a.j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return this.f276a.o();
    }

    public d(int i, int i2) {
        super(i, i2);
        this.f277b = new Rect();
        this.c = true;
        this.d = false;
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f277b = new Rect();
        this.c = true;
        this.d = false;
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f277b = new Rect();
        this.c = true;
        this.d = false;
    }

    public d(d dVar) {
        super((ViewGroup.LayoutParams) dVar);
        this.f277b = new Rect();
        this.c = true;
        this.d = false;
    }
}
