package defpackage;

import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class jq3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2811a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f2812b;
    public static final Field c;
    public static final boolean d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2811a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2812b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }
}
