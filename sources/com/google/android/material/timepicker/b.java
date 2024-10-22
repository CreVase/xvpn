package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1567a;

    public b(ClockFaceView clockFaceView) {
        this.f1567a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1567a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.t.d) - clockFaceView.B;
        if (height != clockFaceView.r) {
            clockFaceView.r = height;
            clockFaceView.y();
            int i = clockFaceView.r;
            ClockHandView clockHandView = clockFaceView.t;
            clockHandView.l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
