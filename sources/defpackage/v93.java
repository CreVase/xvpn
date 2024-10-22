package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v93 extends k4 {

    /* renamed from: a, reason: collision with root package name */
    public final w93 f4800a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f4801b;
    public final t93 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final qw3 h = new qw3(this, 2);

    public v93(Toolbar toolbar, CharSequence charSequence, dd ddVar) {
        t93 t93Var = new t93(this);
        toolbar.getClass();
        w93 w93Var = new w93(toolbar, false);
        this.f4800a = w93Var;
        ddVar.getClass();
        this.f4801b = ddVar;
        w93Var.k = ddVar;
        toolbar.setOnMenuItemClickListener(t93Var);
        if (!w93Var.g) {
            w93Var.h = charSequence;
            if ((w93Var.f4967b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (w93Var.g) {
                    ll3.q(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.c = new t93(this);
    }

    @Override // defpackage.k4
    public final boolean a() {
        boolean z;
        ActionMenuView actionMenuView = this.f4800a.f4966a.f170a;
        if (actionMenuView == null) {
            return false;
        }
        b5 b5Var = actionMenuView.t;
        if (b5Var != null && b5Var.i()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // defpackage.k4
    public final boolean b() {
        boolean z;
        su1 su1Var;
        h hVar = this.f4800a.f4966a.M;
        if (hVar != null && hVar.f180b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (hVar == null) {
            su1Var = null;
        } else {
            su1Var = hVar.f180b;
        }
        if (su1Var != null) {
            su1Var.collapseActionView();
        }
        return true;
    }

    @Override // defpackage.k4
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        p71.C(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.k4
    public final int d() {
        return this.f4800a.f4967b;
    }

    @Override // defpackage.k4
    public final Context e() {
        return this.f4800a.a();
    }

    @Override // defpackage.k4
    public final boolean f() {
        w93 w93Var = this.f4800a;
        Toolbar toolbar = w93Var.f4966a;
        qw3 qw3Var = this.h;
        toolbar.removeCallbacks(qw3Var);
        Toolbar toolbar2 = w93Var.f4966a;
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.m(toolbar2, qw3Var);
        return true;
    }

    @Override // defpackage.k4
    public final void g() {
    }

    @Override // defpackage.k4
    public final void h() {
        this.f4800a.f4966a.removeCallbacks(this.h);
    }

    @Override // defpackage.k4
    public final boolean i(int i, KeyEvent keyEvent) {
        int i2;
        Menu t = t();
        if (t == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        t.setQwertyMode(z);
        return t.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.k4
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // defpackage.k4
    public final boolean k() {
        boolean z;
        ActionMenuView actionMenuView = this.f4800a.f4966a.f170a;
        if (actionMenuView == null) {
            return false;
        }
        b5 b5Var = actionMenuView.t;
        if (b5Var != null && b5Var.l()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // defpackage.k4
    public final void l(boolean z) {
    }

    @Override // defpackage.k4
    public final void m(boolean z) {
        w93 w93Var = this.f4800a;
        w93Var.b((w93Var.f4967b & (-5)) | 4);
    }

    @Override // defpackage.k4
    public final void n() {
        w93 w93Var = this.f4800a;
        w93Var.b((w93Var.f4967b & (-3)) | 2);
    }

    @Override // defpackage.k4
    public final void o() {
        w93 w93Var = this.f4800a;
        w93Var.e = null;
        w93Var.c();
    }

    @Override // defpackage.k4
    public final void p(boolean z) {
    }

    @Override // defpackage.k4
    public final void q(String str) {
        w93 w93Var = this.f4800a;
        w93Var.g = true;
        w93Var.h = str;
        if ((w93Var.f4967b & 8) != 0) {
            Toolbar toolbar = w93Var.f4966a;
            toolbar.setTitle(str);
            if (w93Var.g) {
                ll3.q(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.k4
    public final void r(CharSequence charSequence) {
        w93 w93Var = this.f4800a;
        if (!w93Var.g) {
            w93Var.h = charSequence;
            if ((w93Var.f4967b & 8) != 0) {
                Toolbar toolbar = w93Var.f4966a;
                toolbar.setTitle(charSequence);
                if (w93Var.g) {
                    ll3.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final Menu t() {
        boolean z = this.e;
        w93 w93Var = this.f4800a;
        if (!z) {
            u93 u93Var = new u93(this);
            v51 v51Var = new v51(this, 2);
            Toolbar toolbar = w93Var.f4966a;
            toolbar.N = u93Var;
            toolbar.O = v51Var;
            ActionMenuView actionMenuView = toolbar.f170a;
            if (actionMenuView != null) {
                actionMenuView.u = u93Var;
                actionMenuView.v = v51Var;
            }
            this.e = true;
        }
        return w93Var.f4966a.getMenu();
    }
}
