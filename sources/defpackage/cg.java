package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public final class cg implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final cg f627a = new cg();

    public static Integer a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float f4 = hx2.f(f3, f2, f, f2);
        float f5 = hx2.f(pow4, pow, f, pow);
        float f6 = hx2.f(pow5, pow2, f, pow2);
        float f7 = hx2.f(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(f5, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(f6, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(f7, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(f4 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return a(f, (Integer) obj, (Integer) obj2);
    }
}
