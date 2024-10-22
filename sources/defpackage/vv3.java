package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public abstract class vv3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4905a = new Object();

    public static void a(String str, String str2) {
        synchronized (f4905a) {
            SharedPreferences.Editor edit = tf3.d().getSharedPreferences(str, 0).edit();
            edit.putString("kmgKvdb", str2);
            edit.commit();
        }
    }
}
