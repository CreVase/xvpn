package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a70 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public a70(String str, int i, Object obj, boolean z) {
        this.f32a = false;
        this.f33b = i;
        this.f32a = z;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), vf2.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == vf2.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == vf2.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == vf2.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == vf2.CustomAttribute_customColorValue) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == vf2.CustomAttribute_customColorDrawableValue) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == vf2.CustomAttribute_customPixelDimension) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == vf2.CustomAttribute_customDimension) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == vf2.CustomAttribute_customFloatValue) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == vf2.CustomAttribute_customIntegerValue) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == vf2.CustomAttribute_customStringValue) {
                    obj = obtainStyledAttributes.getString(index);
                    i = 5;
                } else if (index == vf2.CustomAttribute_customReference) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                    i = 8;
                }
                i = 7;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a70(str, i, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (hx2.x(this.f33b)) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                return;
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a70(a70 a70Var, Object obj) {
        this.f32a = false;
        a70Var.getClass();
        this.f33b = a70Var.f33b;
        b(obj);
    }
}
