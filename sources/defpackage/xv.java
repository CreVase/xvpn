package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public final class xv extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f5230a;

    public xv() {
        super(PointF.class, "boundsOrigin");
        this.f5230a = new Rect();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f5230a);
        return new PointF(r0.left, r0.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.f5230a;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
