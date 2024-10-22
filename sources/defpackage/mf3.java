package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mf3 extends kf3 {
    public final Class h;
    public final Constructor i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;

    public mf3() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = P(cls);
            method3 = Q(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = R(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.h = cls;
        this.i = constructor;
        this.j = method2;
        this.k = method3;
        this.l = method4;
        this.m = method;
        this.n = method5;
    }

    public static Method P(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method Q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // defpackage.ja1
    public final Typeface B(Context context, Resources resources, int i, String str, int i2) {
        boolean z;
        Object obj;
        if (this.j != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.B(context, resources, i, str, i2);
        }
        try {
            obj = this.i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!M(context, obj, str, 0, -1, -1, null)) {
            try {
                this.m.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (!O(obj)) {
            return null;
        }
        return N(obj);
    }

    public final boolean M(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.l.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method R(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.kf3, defpackage.ja1
    public final Typeface y(Context context, h01 h01Var, Resources resources, int i) {
        boolean z;
        Object obj;
        if (this.j != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.y(context, h01Var, resources, i);
        }
        try {
            obj = this.i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (i01 i01Var : h01Var.f2350a) {
            if (!M(context, obj, i01Var.f2510a, i01Var.e, i01Var.f2511b, i01Var.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(i01Var.d))) {
                try {
                    this.m.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!O(obj)) {
            return null;
        }
        return N(obj);
    }

    @Override // defpackage.kf3, defpackage.ja1
    public final Typeface z(Context context, l01[] l01VarArr, int i) {
        boolean z;
        Object obj;
        Typeface N;
        boolean z2;
        if (l01VarArr.length < 1) {
            return null;
        }
        if (this.j != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            l01 D = D(i, l01VarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(D.f3043a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(D.c).setItalic(D.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            HashMap hashMap = new HashMap();
            for (l01 l01Var : l01VarArr) {
                if (l01Var.e == 0) {
                    Uri uri = l01Var.f3043a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, tf3.e0(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.i.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = l01VarArr.length;
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                Method method = this.m;
                if (i2 < length) {
                    l01 l01Var2 = l01VarArr[i2];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(l01Var2.f3043a);
                    if (byteBuffer != null) {
                        try {
                            z2 = ((Boolean) this.k.invoke(obj, byteBuffer, Integer.valueOf(l01Var2.f3044b), null, Integer.valueOf(l01Var2.c), Integer.valueOf(l01Var2.d ? 1 : 0))).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z2 = false;
                        }
                        if (!z2) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        }
                        z3 = true;
                    }
                    i2++;
                } else {
                    if (!z3) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                            return null;
                        }
                    }
                    if (!O(obj) || (N = N(obj)) == null) {
                        return null;
                    }
                    return Typeface.create(N, i);
                }
            }
        }
    }
}
