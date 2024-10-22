package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* loaded from: classes.dex */
public final class yj2 implements ak2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5349a;

    public /* synthetic */ yj2(int i) {
        this.f5349a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f5349a) {
            case 0:
                try {
                    return lb.e(context, theme, context.getResources(), attributeSet, xmlResourceParser);
                } catch (Exception e) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    ob obVar = new ob(context);
                    obVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return obVar;
                } catch (Exception e2) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                    return null;
                }
            case 2:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) yj2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    y20.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e3) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    tj3 tj3Var = new tj3();
                    tj3Var.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return tj3Var;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
    }
}
