package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public final class nc extends CheckedTextView implements m93 {

    /* renamed from: a, reason: collision with root package name */
    public final oc f3433a;

    /* renamed from: b, reason: collision with root package name */
    public final kc f3434b;
    public final re c;
    public pd d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nc(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            int r0 = defpackage.ie2.checkedTextViewStyle
            defpackage.i93.a(r3)
            r2.<init>(r3, r4, r0)
            android.content.Context r3 = r2.getContext()
            defpackage.h83.a(r3, r2)
            re r3 = new re
            r3.<init>(r2)
            r2.c = r3
            r3.f(r4, r0)
            r3.b()
            kc r3 = new kc
            r3.<init>(r2)
            r2.f3434b = r3
            r3.e(r4, r0)
            oc r3 = new oc
            r1 = 0
            r3.<init>(r2, r1)
            r2.f3433a = r3
            r3.c(r4, r0)
            pd r3 = r2.getEmojiTextViewHelper()
            r3.b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private pd getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new pd(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        re reVar = this.c;
        if (reVar != null) {
            reVar.b();
        }
        kc kcVar = this.f3434b;
        if (kcVar != null) {
            kcVar.a();
        }
        oc ocVar = this.f3433a;
        if (ocVar != null) {
            ocVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t9.J0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f3434b;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f3434b;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        oc ocVar = this.f3433a;
        if (ocVar != null) {
            return ocVar.f3640b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        oc ocVar = this.f3433a;
        if (ocVar != null) {
            return ocVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t9.W(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f3434b;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f3434b;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        oc ocVar = this.f3433a;
        if (ocVar != null) {
            if (ocVar.f) {
                ocVar.f = false;
            } else {
                ocVar.f = true;
                ocVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        re reVar = this.c;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        re reVar = this.c;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t9.M0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f3434b;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f3434b;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        oc ocVar = this.f3433a;
        if (ocVar != null) {
            ocVar.f3640b = colorStateList;
            ocVar.d = true;
            ocVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        oc ocVar = this.f3433a;
        if (ocVar != null) {
            ocVar.c = mode;
            ocVar.e = true;
            ocVar.b();
        }
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        re reVar = this.c;
        reVar.l(colorStateList);
        reVar.b();
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        re reVar = this.c;
        reVar.m(mode);
        reVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        re reVar = this.c;
        if (reVar != null) {
            reVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ew3.P0(getContext(), i));
    }
}
