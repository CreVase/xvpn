package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class pc1 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f3821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3822b;
    public final int c;
    public final int d;

    public pc1(Dialog dialog, Rect rect) {
        this.f3821a = dialog;
        this.f3822b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f3822b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.d;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f3821a.onTouchEvent(obtain);
    }
}
