package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class n70 {

    /* renamed from: a, reason: collision with root package name */
    public int f3406a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3407b = 0;
    public float c = 1.0f;
    public float d = Float.NaN;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vf2.PropertySet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == vf2.PropertySet_android_alpha) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == vf2.PropertySet_android_visibility) {
                int i2 = obtainStyledAttributes.getInt(index, this.f3406a);
                this.f3406a = i2;
                this.f3406a = p70.d[i2];
            } else if (index == vf2.PropertySet_visibilityMode) {
                this.f3407b = obtainStyledAttributes.getInt(index, this.f3407b);
            } else if (index == vf2.PropertySet_motionProgress) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
