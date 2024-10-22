package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public final class kb implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2921a;

    /* renamed from: b, reason: collision with root package name */
    public int f2922b;
    public int c;

    public kb(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f2922b = numberOfFrames;
        int[] iArr = this.f2921a;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f2921a = new int[numberOfFrames];
        }
        int[] iArr2 = this.f2921a;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.c = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        int i = (int) ((f * this.c) + 0.5f);
        int i2 = this.f2922b;
        int[] iArr = this.f2921a;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        if (i3 < i2) {
            f2 = i / this.c;
        } else {
            f2 = 0.0f;
        }
        return (i3 / i2) + f2;
    }
}
