package defpackage;

import android.text.method.MovementMethod;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class p9 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f3798a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f3799b;
    public MovementMethod c;
    public CharSequence d;
    public v31 f;
    public v31 g;
    public CharSequence h;
    public v31 j;
    public x31 k;
    public View l;
    public x31 n;
    public v31 o;
    public int e = 1000020;
    public int i = 1000021;
    public final ArrayList m = new ArrayList();
    public boolean p = true;

    public static void a(p9 p9Var, String str, v31 v31Var, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = 1000021;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            v31Var = null;
        }
        p9Var.h = str;
        p9Var.i = i2;
        p9Var.j = v31Var;
    }

    public static void b(p9 p9Var, CharSequence charSequence, v31 v31Var, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = 1000020;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            v31Var = null;
        }
        p9Var.d = charSequence;
        p9Var.e = i2;
        p9Var.f = v31Var;
    }
}
