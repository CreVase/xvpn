package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class sd extends MultiAutoCompleteTextView implements m93 {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final kc f4319a;

    /* renamed from: b, reason: collision with root package name */
    public final re f4320b;
    public final x50 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sd(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = defpackage.ie2.autoCompleteTextViewStyle
            defpackage.i93.a(r5)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.h83.a(r5, r4)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.sd.d
            go2 r5 = defpackage.go2.m(r5, r6, r1, r0)
            r1 = 0
            boolean r2 = r5.l(r1)
            if (r2 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r5.e(r1)
            r4.setDropDownBackgroundDrawable(r1)
        L27:
            r5.o()
            kc r5 = new kc
            r5.<init>(r4)
            r4.f4319a = r5
            r5.e(r6, r0)
            re r5 = new re
            r5.<init>(r4)
            r4.f4320b = r5
            r5.f(r6, r0)
            r5.b()
            x50 r5 = new x50
            r5.<init>(r4)
            r4.c = r5
            r5.u(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.s(r6)
            if (r5 != r6) goto L6c
            goto L7b
        L6c:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f4319a;
        if (kcVar != null) {
            kcVar.a();
        }
        re reVar = this.f4320b;
        if (reVar != null) {
            reVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f4319a;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f4319a;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4320b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4320b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t9.W(this, editorInfo, onCreateInputConnection);
        return this.c.v(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f4319a;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f4319a;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f4320b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f4320b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ew3.P0(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((c02) ((gq0) this.c.c).c).n(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.s(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f4319a;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f4319a;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        re reVar = this.f4320b;
        reVar.l(colorStateList);
        reVar.b();
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        re reVar = this.f4320b;
        reVar.m(mode);
        reVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        re reVar = this.f4320b;
        if (reVar != null) {
            reVar.g(context, i);
        }
    }
}
