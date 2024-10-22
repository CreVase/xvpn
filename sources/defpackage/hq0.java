package defpackage;

import android.text.Editable;

/* loaded from: classes.dex */
public final class hq0 extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2465a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile hq0 f2466b;
    public static Class c;

    public hq0() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, hq0.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new qx2(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
