package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes2.dex */
public final class fs2 {

    /* renamed from: a, reason: collision with root package name */
    public final tf3 f2143a;

    /* renamed from: b, reason: collision with root package name */
    public final tf3 f2144b;
    public final tf3 c;
    public final tf3 d;
    public final p90 e;
    public final p90 f;
    public final p90 g;
    public final p90 h;
    public final mp0 i;
    public final mp0 j;
    public final mp0 k;
    public final mp0 l;

    public fs2(jk jkVar) {
        this.f2143a = (tf3) jkVar.f2774a;
        this.f2144b = (tf3) jkVar.f2775b;
        this.c = (tf3) jkVar.c;
        this.d = (tf3) jkVar.d;
        this.e = (p90) jkVar.e;
        this.f = (p90) jkVar.f;
        this.g = (p90) jkVar.g;
        this.h = (p90) jkVar.h;
        this.i = (mp0) jkVar.i;
        this.j = (mp0) jkVar.j;
        this.k = (mp0) jkVar.k;
        this.l = (mp0) jkVar.l;
    }

    public static jk a(Context context, int i, int i2, s sVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(bg2.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(bg2.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(bg2.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(bg2.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(bg2.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(bg2.ShapeAppearance_cornerFamilyBottomLeft, i3);
            p90 c = c(obtainStyledAttributes, bg2.ShapeAppearance_cornerSize, sVar);
            p90 c2 = c(obtainStyledAttributes, bg2.ShapeAppearance_cornerSizeTopLeft, c);
            p90 c3 = c(obtainStyledAttributes, bg2.ShapeAppearance_cornerSizeTopRight, c);
            p90 c4 = c(obtainStyledAttributes, bg2.ShapeAppearance_cornerSizeBottomRight, c);
            p90 c5 = c(obtainStyledAttributes, bg2.ShapeAppearance_cornerSizeBottomLeft, c);
            jk jkVar = new jk(1);
            tf3 m = zf3.m(i4);
            jkVar.f2774a = m;
            jk.c(m);
            jkVar.e = c2;
            tf3 m2 = zf3.m(i5);
            jkVar.f2775b = m2;
            jk.c(m2);
            jkVar.f = c3;
            tf3 m3 = zf3.m(i6);
            jkVar.c = m3;
            jk.c(m3);
            jkVar.g = c4;
            tf3 m4 = zf3.m(i7);
            jkVar.d = m4;
            jk.c(m4);
            jkVar.h = c5;
            return jkVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static jk b(Context context, AttributeSet attributeSet, int i, int i2) {
        s sVar = new s(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(bg2.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(bg2.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, sVar);
    }

    public static p90 c(TypedArray typedArray, int i, p90 p90Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return p90Var;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new s(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new ri2(peekValue.getFraction(1.0f, 1.0f));
        }
        return p90Var;
    }

    public final boolean d(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.l.getClass().equals(mp0.class) && this.j.getClass().equals(mp0.class) && this.i.getClass().equals(mp0.class) && this.k.getClass().equals(mp0.class)) {
            z = true;
        } else {
            z = false;
        }
        float a2 = this.e.a(rectF);
        if (this.f.a(rectF) == a2 && this.h.a(rectF) == a2 && this.g.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.f2144b instanceof ql2) && (this.f2143a instanceof ql2) && (this.c instanceof ql2) && (this.d instanceof ql2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    public fs2() {
        this.f2143a = new ql2();
        this.f2144b = new ql2();
        this.c = new ql2();
        this.d = new ql2();
        this.e = new s(0.0f);
        this.f = new s(0.0f);
        this.g = new s(0.0f);
        this.h = new s(0.0f);
        this.i = zf3.n();
        this.j = zf3.n();
        this.k = zf3.n();
        this.l = zf3.n();
    }
}
