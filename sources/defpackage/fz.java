package defpackage;

import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.livechat.a;

/* loaded from: classes2.dex */
public final class fz extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2177a;

    public fz(a aVar) {
        this.f2177a = aVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        a aVar = this.f2177a;
        if (aVar.N) {
            return true;
        }
        ky kyVar = aVar.I;
        ChatActivity.c0(kyVar.f3033a, aVar, aVar.f1605a);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        a aVar = this.f2177a;
        if (aVar.N) {
            return;
        }
        ky kyVar = aVar.I;
        ChatActivity.c0(kyVar.f3033a, aVar, aVar.f1605a);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        a aVar = this.f2177a;
        if (aVar.N) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        if (aVar.l0) {
            aVar.p0.onClick(aVar);
            aVar.l0 = false;
            return true;
        }
        if (aVar.m0) {
            aVar.p0.onClick(aVar);
            aVar.m0 = false;
            return true;
        }
        int b2 = aVar.b(motionEvent.getX(), motionEvent.getY());
        SpannableString spannableString = aVar.i;
        if (spannableString == null || b2 == -1) {
            return false;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableString.getSpans(b2, b2, ClickableSpan.class);
        if (clickableSpanArr.length > 0) {
            clickableSpanArr[0].onClick(aVar);
            return true;
        }
        return super.onSingleTapConfirmed(motionEvent);
    }
}
