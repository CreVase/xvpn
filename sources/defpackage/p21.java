package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class p21 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f3771b;

    public /* synthetic */ p21(Rect rect, int i) {
        this.f3770a = i;
        this.f3771b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i = this.f3770a;
        Rect rect = this.f3771b;
        switch (i) {
            case 0:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
