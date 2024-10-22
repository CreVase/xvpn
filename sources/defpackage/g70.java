package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g70 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2211a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2212b;
    public final float c;
    public final float d;
    public final int e;

    public g70(Context context, XmlResourceParser xmlResourceParser) {
        this.f2211a = Float.NaN;
        this.f2212b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), vf2.Variant);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == vf2.Variant_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new p70().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == vf2.Variant_region_heightLessThan) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == vf2.Variant_region_heightMoreThan) {
                this.f2212b = obtainStyledAttributes.getDimension(index, this.f2212b);
            } else if (index == vf2.Variant_region_widthLessThan) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            } else if (index == vf2.Variant_region_widthMoreThan) {
                this.f2211a = obtainStyledAttributes.getDimension(index, this.f2211a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
