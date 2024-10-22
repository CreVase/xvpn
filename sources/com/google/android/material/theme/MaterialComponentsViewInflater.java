package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import defpackage.df;
import defpackage.dr1;
import defpackage.hr1;
import defpackage.jc;
import defpackage.mc;
import defpackage.qq1;
import defpackage.wd;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends df {
    @Override // defpackage.df
    public final jc a(Context context, AttributeSet attributeSet) {
        return new qq1(context, attributeSet);
    }

    @Override // defpackage.df
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.df
    public final mc c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // defpackage.df
    public final wd d(Context context, AttributeSet attributeSet) {
        return new dr1(context, attributeSet);
    }

    @Override // defpackage.df
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new hr1(context, attributeSet);
    }
}
