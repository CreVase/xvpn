package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class K5 extends FrameLayout {
    public static String[] A00 = {"8uiZfgsmrD5w7H2sVgAC3n2gJlRDmu8", "AcResxUzczeVQ6", "S", "DeJxumnd3y1WcfHk", "FMZxMK7lmQCPA", "J", "wc3PTdtI7w7wp63NJxsDpEHsC40vb1e2", "jaoFPfR2hwKJJkyxUt0jn5KhPySOFpSP"};
    public static final AtomicBoolean A01 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC0486Jy> A02 = new AtomicReference<>();

    private final void A00() {
        super.onAttachedToWindow();
    }

    private final void A01() {
        super.onDetachedFromWindow();
    }

    private final void A02() {
        super.onFinishInflate();
    }

    private final void A03(int i) {
        super.onWindowVisibilityChanged(i);
    }

    private final void A04(int i, int i2) {
        super.onMeasure(i, i2);
    }

    private final void A05(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    private final void A06(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void A07(Throwable th) {
        KF.A00().A9E(3305, th);
        InterfaceC0486Jy contextRepairHelper = A02.get();
        if (contextRepairHelper != null) {
            contextRepairHelper.AEc(th, this);
        }
    }

    private final void A08(boolean z) {
        super.onWindowFocusChanged(z);
    }

    private final void A09(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private final void A0A(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    public static void A0B(boolean z, InterfaceC0486Jy interfaceC0486Jy) {
        A01.set(z);
        A02.set(interfaceC0486Jy);
    }

    private final boolean A0C() {
        return super.performClick();
    }

    private final boolean A0D(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    private final boolean A0E(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    private final boolean A0F(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    private final boolean A0G(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            A00();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onAttachedToWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            A01();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onDetachedFromWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            A06(canvas);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onDraw(canvas);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            A02();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onFinishInflate();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            A0A(z, i, rect);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onFocusChanged(z, i, rect);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            return A0D(i, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onKeyDown(i, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            return A0E(i, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onKeyUp(i, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            A09(z, i, i2, i3, i4);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            A04(i, i2);
        } catch (Throwable th) {
            AtomicBoolean atomicBoolean = A01;
            String[] strArr = A00;
            if (strArr[2].length() != strArr[5].length()) {
                Throwable t = new RuntimeException();
                throw t;
            }
            String[] strArr2 = A00;
            strArr2[2] = "Z";
            strArr2[5] = "w";
            if (atomicBoolean.get()) {
                A07(th);
                String[] strArr3 = A00;
                if (strArr3[2].length() != strArr3[5].length()) {
                    String[] strArr4 = A00;
                    strArr4[2] = "i";
                    strArr4[5] = "g";
                    super.onMeasure(i, i2);
                    return;
                }
                String[] strArr5 = A00;
                strArr5[7] = "vkL4fX6PzwoldXVPCJAguywdSt35bgjD";
                strArr5[6] = "pKAP23q7ywaPjJvUhcEhiH7V9bs9jrQJ";
                super.onMeasure(i, i2);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            A05(i, i2, i3, i4);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onSizeChanged(i, i2, i3, i4);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return A0F(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onTouchEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        try {
            return A0G(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onTrackballEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        try {
            A08(z);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onWindowFocusChanged(z);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        try {
            A03(i);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onWindowVisibilityChanged(i);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        try {
            return A0C();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.performClick();
            }
            throw th;
        }
    }
}
