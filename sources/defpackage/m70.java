package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m70 {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f3250a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3251b = 0;
    public int c = -1;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public float f = Float.NaN;
    public int g = -1;
    public String h = null;
    public int i = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(vf2.Motion_motionPathRotate, 1);
        sparseIntArray.append(vf2.Motion_pathMotionArc, 2);
        sparseIntArray.append(vf2.Motion_transitionEasing, 3);
        sparseIntArray.append(vf2.Motion_drawPath, 4);
        sparseIntArray.append(vf2.Motion_animateRelativeTo, 5);
        sparseIntArray.append(vf2.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(vf2.Motion_motionStagger, 7);
        sparseIntArray.append(vf2.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(vf2.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(vf2.Motion_quantizeMotionInterpolator, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vf2.Motion);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (j.get(index)) {
                case 1:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = t9.g[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3250a = p70.f(obtainStyledAttributes, index, this.f3250a);
                    break;
                case 6:
                    this.f3251b = obtainStyledAttributes.getInteger(index, this.f3251b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 9:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
