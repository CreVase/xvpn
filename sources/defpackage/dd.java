package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class dd implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f1760a;

    /* renamed from: b, reason: collision with root package name */
    public t93 f1761b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ jd f;

    public dd(jd jdVar, Window.Callback callback) {
        this.f = jdVar;
        if (callback != null) {
            this.f1760a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1760a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean c(KeyEvent keyEvent) {
        return this.f1760a.dispatchKeyEvent(keyEvent);
    }

    public final boolean d(KeyEvent keyEvent) {
        return this.f1760a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.d) {
            return this.f1760a.dispatchKeyEvent(keyEvent);
        }
        if (!this.f.C(keyEvent) && !c(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:            if (r6 != false) goto L20;     */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e A[ORIG_RETURN, RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.d(r6)
            r1 = 1
            if (r0 != 0) goto L4f
            int r0 = r6.getKeyCode()
            jd r2 = r5.f
            r2.K()
            k4 r3 = r2.o
            r4 = 0
            if (r3 == 0) goto L1c
            boolean r0 = r3.i(r0, r6)
            if (r0 == 0) goto L1c
            goto L48
        L1c:
            id r0 = r2.M
            if (r0 == 0) goto L31
            int r3 = r6.getKeyCode()
            boolean r0 = r2.O(r0, r3, r6)
            if (r0 == 0) goto L31
            id r6 = r2.M
            if (r6 == 0) goto L48
            r6.l = r1
            goto L48
        L31:
            id r0 = r2.M
            if (r0 != 0) goto L4a
            id r0 = r2.I(r4)
            r2.P(r0, r6)
            int r3 = r6.getKeyCode()
            boolean r6 = r2.O(r0, r3, r6)
            r0.k = r4
            if (r6 == 0) goto L4a
        L48:
            r6 = 1
            goto L4b
        L4a:
            r6 = 0
        L4b:
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            r1 = 0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1760a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1760a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1760a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1760a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1760a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f1760a.onAttachedToWindow();
    }

    public final boolean k(int i, Menu menu) {
        return this.f1760a.onCreatePanelMenu(i, menu);
    }

    public final View l(int i) {
        return this.f1760a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f1760a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1760a.onMenuItemSelected(i, menuItem);
    }

    public final boolean o(int i, Menu menu) {
        return this.f1760a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.f1760a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof ju1)) {
            return false;
        }
        return k(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        t93 t93Var = this.f1761b;
        if (t93Var != null) {
            if (i == 0) {
                view = new View(t93Var.f4471a.f4800a.a());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return l(i);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        o(i, menu);
        jd jdVar = this.f;
        if (i == 108) {
            jdVar.K();
            k4 k4Var = jdVar.o;
            if (k4Var != null) {
                k4Var.c(true);
            }
        } else {
            jdVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.f1760a.onPanelClosed(i, menu);
            return;
        }
        p(i, menu);
        jd jdVar = this.f;
        if (i == 108) {
            jdVar.K();
            k4 k4Var = jdVar.o;
            if (k4Var != null) {
                k4Var.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            id I = jdVar.I(i);
            if (I.m) {
                jdVar.A(I, false);
                return;
            }
            return;
        }
        jdVar.getClass();
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ju1 ju1Var;
        if (menu instanceof ju1) {
            ju1Var = (ju1) menu;
        } else {
            ju1Var = null;
        }
        if (i == 0 && ju1Var == null) {
            return false;
        }
        if (ju1Var != null) {
            ju1Var.x = true;
        }
        t93 t93Var = this.f1761b;
        if (t93Var != null && i == 0) {
            v93 v93Var = t93Var.f4471a;
            if (!v93Var.d) {
                v93Var.f4800a.l = true;
                v93Var.d = true;
            }
        }
        boolean r = r(i, view, menu);
        if (ju1Var != null) {
            ju1Var.x = false;
        }
        return r;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ju1 ju1Var = this.f.I(0).h;
        if (ju1Var != null) {
            s(list, ju1Var, i);
        } else {
            s(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        jd jdVar = this.f;
        jdVar.getClass();
        if (i != 0) {
            return x(callback, i);
        }
        eb3 eb3Var = new eb3(jdVar.k, callback);
        h5 s = jdVar.s(eb3Var);
        if (s != null) {
            return eb3Var.x(s);
        }
        return null;
    }

    public final void p(int i, Menu menu) {
        this.f1760a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z) {
        sp3.a(this.f1760a, z);
    }

    public final boolean r(int i, View view, Menu menu) {
        return this.f1760a.onPreparePanel(i, view, menu);
    }

    public final void s(List list, Menu menu, int i) {
        rp3.a(this.f1760a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested() {
        return this.f1760a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return qp3.a(this.f1760a, searchEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1760a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z) {
        this.f1760a.onWindowFocusChanged(z);
    }

    public final ActionMode x(ActionMode.Callback callback, int i) {
        return qp3.b(this.f1760a, callback, i);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        jd jdVar = this.f;
        jdVar.getClass();
        eb3 eb3Var = new eb3(jdVar.k, callback);
        h5 s = jdVar.s(eb3Var);
        if (s != null) {
            return eb3Var.x(s);
        }
        return null;
    }
}
