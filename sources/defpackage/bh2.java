package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class bh2 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch2 f466a;

    public bh2(ch2 ch2Var) {
        this.f466a = ch2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        ch2 ch2Var = this.f466a;
        if (ch2Var.f635b == null) {
            return;
        }
        int i = ch2Var.c;
        ch2Var.getClass();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
