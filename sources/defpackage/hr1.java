package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class hr1 extends AppCompatTextView {
    public hr1(Context context, AttributeSet attributeSet) {
        super(ir1.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (cp3.K(context2, he2.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = bg2.MaterialTextView;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int m = m(context2, obtainStyledAttributes, bg2.MaterialTextView_android_lineHeight, bg2.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (!(m != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(bg2.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    public final void l(int i, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, bg2.MaterialTextAppearance);
        int m = m(getContext(), obtainStyledAttributes, bg2.MaterialTextAppearance_android_lineHeight, bg2.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m >= 0) {
            setLineHeight(m);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (cp3.K(context, he2.textAppearanceLineHeightEnabled, true)) {
            l(i, context.getTheme());
        }
    }
}
