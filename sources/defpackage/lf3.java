package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class lf3 extends ja1 {
    public static final Class c;
    public static final Constructor d;
    public static final Method e;
    public static final Method f;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        d = constructor;
        c = cls;
        e = method2;
        f = method;
    }

    public lf3() {
        super(7);
    }

    public static boolean K(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.ja1
    public final Typeface y(Context context, h01 h01Var, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (i01 i01Var : h01Var.f2350a) {
            int i2 = i01Var.f;
            File T = tf3.T(context);
            if (T != null) {
                try {
                    if (tf3.A(T, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(T);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !K(obj, mappedByteBuffer, i01Var.e, i01Var.f2511b, i01Var.c)) {
                            return null;
                        }
                    }
                } finally {
                    T.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // defpackage.ja1
    public final Typeface z(Context context, l01[] l01VarArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        uu2 uu2Var = new uu2();
        for (l01 l01Var : l01VarArr) {
            Uri uri = l01Var.f3043a;
            ByteBuffer byteBuffer = (ByteBuffer) uu2Var.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = tf3.e0(context, uri);
                uu2Var.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !K(obj, byteBuffer, l01Var.f3044b, l01Var.c, l01Var.d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) c, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }
}
