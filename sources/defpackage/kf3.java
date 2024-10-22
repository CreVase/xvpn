package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class kf3 extends ja1 {
    public static Class c = null;
    public static Constructor d = null;
    public static Method e = null;
    public static Method f = null;
    public static boolean g = false;

    public kf3() {
        super(7);
    }

    public static boolean K(Object obj, String str, int i, boolean z) {
        L();
        try {
            return ((Boolean) e.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void L() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (g) {
            return;
        }
        g = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
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

    @Override // defpackage.ja1
    public Typeface y(Context context, h01 h01Var, Resources resources, int i) {
        L();
        try {
            Object newInstance = d.newInstance(new Object[0]);
            for (i01 i01Var : h01Var.f2350a) {
                File T = tf3.T(context);
                if (T == null) {
                    return null;
                }
                try {
                    if (!tf3.A(T, resources, i01Var.f)) {
                        return null;
                    }
                    if (!K(newInstance, T.getPath(), i01Var.f2511b, i01Var.c)) {
                        return null;
                    }
                    T.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    T.delete();
                }
            }
            L();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.ja1
    public Typeface z(Context context, l01[] l01VarArr, int i) {
        File file;
        String readlink;
        if (l01VarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(D(i, l01VarArr).f3043a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface A = A(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return A;
                }
                Typeface A2 = A(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return A2;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
