package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class dk3 implements bk3, DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f1798a;

    /* renamed from: b, reason: collision with root package name */
    public z5 f1799b;

    public dk3(DisplayManager displayManager) {
        this.f1798a = displayManager;
    }

    @Override // defpackage.bk3
    public final void a(z5 z5Var) {
        this.f1799b = z5Var;
        Handler k = wi3.k(null);
        DisplayManager displayManager = this.f1798a;
        displayManager.registerDisplayListener(this, k);
        z5Var.d(displayManager.getDisplay(0));
    }

    @Override // defpackage.bk3
    public final void b() {
        this.f1798a.unregisterDisplayListener(this);
        this.f1799b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        z5 z5Var = this.f1799b;
        if (z5Var != null && i == 0) {
            z5Var.d(this.f1798a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
