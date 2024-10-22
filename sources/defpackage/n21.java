package defpackage;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n21 {

    /* renamed from: b, reason: collision with root package name */
    public int f3389b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3388a = new ArrayList();
    public boolean h = true;
    public boolean p = false;

    public final void b(m21 m21Var) {
        this.f3388a.add(m21Var);
        m21Var.d = this.f3389b;
        m21Var.e = this.c;
        m21Var.f = this.d;
        m21Var.g = this.e;
    }

    public final void c(String str) {
        if (this.h) {
            this.g = true;
            this.i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract void d(int i, Fragment fragment, String str, int i2);

    public final void e(int i, sn snVar, String str) {
        if (i != 0) {
            d(i, snVar, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
