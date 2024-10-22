package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes2.dex */
public class XButton extends AppCompatButton {
    public XButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            setText(getText().toString());
        }
    }

    public void setTranslateAbleText(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (TextUtils.equals(charSequence.toString(), trim)) {
            setText(charSequence);
        } else {
            setText(trim);
        }
    }
}
