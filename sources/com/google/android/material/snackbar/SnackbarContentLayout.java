package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.he2;
import defpackage.k80;
import defpackage.ll3;
import defpackage.pb;
import defpackage.vk3;
import defpackage.xe2;
import defpackage.zf3;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements k80 {

    /* renamed from: a, reason: collision with root package name */
    public TextView f1558a;

    /* renamed from: b, reason: collision with root package name */
    public Button f1559b;
    public final TimeInterpolator c;
    public int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = zf3.d0(context, he2.motionEasingEmphasizedInterpolator, pb.f3812b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1558a.getPaddingTop() == i2 && this.f1558a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f1558a;
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.g(textView)) {
            vk3.k(textView, vk3.f(textView), i2, vk3.e(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f1559b;
    }

    public TextView getMessageView() {
        return this.f1558a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1558a = (TextView) findViewById(xe2.snackbar_text);
        this.f1559b = (Button) findViewById(xe2.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:            if (a(1, r0, r0 - r2) != false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:            if (r1 == false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:            super.onMeasure(r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:            if (a(0, r0, r0) != false) goto L26;     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = defpackage.re2.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = defpackage.re2.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f1558a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.d
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.f1559b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.d
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L55
            goto L56
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            if (r1 == 0) goto L5b
            super.onMeasure(r8, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.d = i;
    }
}
