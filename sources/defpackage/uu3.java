package defpackage;

import android.animation.ValueAnimator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class uu3 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f4743a = new LinkedHashMap();

    public static void a(tt3 tt3Var, boolean z) {
        ValueAnimator valueAnimator;
        String l = p71.l(tt3Var.f4577a, tt3Var.m);
        LinkedHashMap linkedHashMap = f4743a;
        fb fbVar = (fb) linkedHashMap.get(l);
        if (fbVar != null && (valueAnimator = fbVar.f2067a) != null) {
            valueAnimator.cancel();
        }
        fb fbVar2 = new fb();
        fbVar2.c = z;
        ValueAnimator ofInt = ValueAnimator.ofInt(-7122516, -7048255, -7363881, -9524771);
        ofInt.setDuration(600L);
        ofInt.setInterpolator(new tu3(fbVar2));
        ofInt.setEvaluator(cg.f627a);
        fbVar2.f2067a = ofInt;
        ofInt.addListener(new o4(l, 10));
        ofInt.start();
        linkedHashMap.put(l, fbVar2);
    }
}
