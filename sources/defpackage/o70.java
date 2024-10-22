package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class o70 {
    public static final SparseIntArray n;

    /* renamed from: a, reason: collision with root package name */
    public float f3613a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f3614b = 0.0f;
    public float c = 0.0f;
    public float d = 1.0f;
    public float e = 1.0f;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public int h = -1;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 0.0f;
    public boolean l = false;
    public float m = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        sparseIntArray.append(vf2.Transform_android_rotation, 1);
        sparseIntArray.append(vf2.Transform_android_rotationX, 2);
        sparseIntArray.append(vf2.Transform_android_rotationY, 3);
        sparseIntArray.append(vf2.Transform_android_scaleX, 4);
        sparseIntArray.append(vf2.Transform_android_scaleY, 5);
        sparseIntArray.append(vf2.Transform_android_transformPivotX, 6);
        sparseIntArray.append(vf2.Transform_android_transformPivotY, 7);
        sparseIntArray.append(vf2.Transform_android_translationX, 8);
        sparseIntArray.append(vf2.Transform_android_translationY, 9);
        sparseIntArray.append(vf2.Transform_android_translationZ, 10);
        sparseIntArray.append(vf2.Transform_android_elevation, 11);
        sparseIntArray.append(vf2.Transform_transformPivotTarget, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vf2.Transform);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (n.get(index)) {
                case 1:
                    this.f3613a = obtainStyledAttributes.getFloat(index, this.f3613a);
                    break;
                case 2:
                    this.f3614b = obtainStyledAttributes.getFloat(index, this.f3614b);
                    break;
                case 3:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 11:
                    this.l = true;
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 12:
                    this.h = p70.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
