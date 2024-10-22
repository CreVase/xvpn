package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class jk2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2780a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2781b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(fk2 fk2Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap weakHashMap = f2781b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(fk2Var);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(fk2Var, sparseArray);
            }
            sparseArray.append(i, new ek2(colorStateList, fk2Var.f2103a.getConfiguration(), theme));
        }
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface c(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, defpackage.tf3 r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk2.c(android.content.Context, int, android.util.TypedValue, int, tf3, boolean, boolean):android.graphics.Typeface");
    }
}
