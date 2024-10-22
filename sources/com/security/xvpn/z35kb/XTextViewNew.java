package com.security.xvpn.z35kb;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class XTextViewNew extends AppCompatTextView {
    public XTextViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        return super.getText();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L11
            java.lang.CharSequence r0 = r4.getText()
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
        L11:
            if (r6 == 0) goto L63
            int[] r0 = defpackage.sf2.XTextViewNew
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            r0 = 1
            java.lang.String r0 = r6.getString(r0)
            r1 = 0
            boolean r1 = r6.getBoolean(r1, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L55
            java.util.HashMap r2 = defpackage.k01.f2866a
            r0.getClass()
            java.lang.String r2 = "ShareTech"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L37
            goto L4f
        L37:
            java.util.HashMap r0 = defpackage.k01.f2866a
            java.lang.String r2 = "fonts/ShareTech-Regular.ttf"
            java.lang.Object r3 = r0.get(r2)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 != 0) goto L50
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Exception -> L4f
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r5, r2)     // Catch: java.lang.Exception -> L4f
            r0.put(r2, r3)
            goto L50
        L4f:
            r3 = 0
        L50:
            if (r3 == 0) goto L55
            r4.setTypeface(r3)
        L55:
            if (r1 == 0) goto L60
            int r5 = r4.getPaintFlags()
            r5 = r5 | 16
            r4.setPaintFlags(r5)
        L60:
            r6.recycle()
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.XTextViewNew.l(android.content.Context, android.util.AttributeSet):void");
    }

    public void setHtmlText(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            setText(fromHtml);
        } else {
            setText(Html.fromHtml(str));
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

    public XTextViewNew(Context context) {
        super(context, null);
        l(context, null);
    }
}
