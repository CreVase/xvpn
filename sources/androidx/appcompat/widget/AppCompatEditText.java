package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.a32;
import defpackage.c02;
import defpackage.d80;
import defpackage.e80;
import defpackage.f80;
import defpackage.gq0;
import defpackage.h80;
import defpackage.h83;
import defpackage.i93;
import defpackage.ie2;
import defpackage.je;
import defpackage.kc;
import defpackage.ll3;
import defpackage.m93;
import defpackage.od;
import defpackage.re;
import defpackage.t73;
import defpackage.t9;
import defpackage.x50;
import defpackage.yd;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements a32, m93 {

    /* renamed from: a, reason: collision with root package name */
    public final kc f155a;

    /* renamed from: b, reason: collision with root package name */
    public final re f156b;
    public final x50 c;
    public final t73 d;
    public final x50 e;
    public od f;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ie2.editTextStyle);
    }

    private od getSuperCaller() {
        if (this.f == null) {
            this.f = new od(this);
        }
        return this.f;
    }

    @Override // defpackage.a32
    public final h80 a(h80 h80Var) {
        return this.d.a(this, h80Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f155a;
        if (kcVar != null) {
            kcVar.a();
        }
        re reVar = this.f156b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t9.J0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f155a;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f155a;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f156b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f156b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x50 x50Var;
        if (Build.VERSION.SDK_INT < 28 && (x50Var = this.c) != null) {
            TextClassifier textClassifier = (TextClassifier) x50Var.c;
            if (textClassifier == null) {
                return je.a((TextView) x50Var.f5117b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:            if (r1 != null) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:            r6 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:            if (r1 != null) goto L23;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            re r1 = r7.f156b
            r1.getClass()
            defpackage.re.h(r7, r0, r8)
            defpackage.t9.W(r7, r8, r0)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = defpackage.ll3.g(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            defpackage.np0.l(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            z5 r2 = new z5
            r6 = 1
            r2.<init>(r7, r6)
            if (r1 < r5) goto L4d
            kc1 r1 = new kc1
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = defpackage.fl.f
            if (r1 < r5) goto L59
            java.lang.String[] r1 = defpackage.np0.m(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            lc1 r1 = new lc1
            r1.<init>(r0, r2)
            goto L4b
        L77:
            x50 r1 = r7.e
            android.view.inputmethod.InputConnection r8 = r1.v(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && ll3.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = yd.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        e80 f80Var;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && ll3.g(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i2 >= 31) {
                    f80Var = new d80(primaryClip, 1);
                } else {
                    f80Var = new f80(primaryClip, 1);
                }
                if (i != 16908322) {
                    i3 = 1;
                }
                f80Var.c(i3);
                ll3.l(this, f80Var.build());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f155a;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f155a;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f156b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f156b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t9.M0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((c02) ((gq0) this.e.c).c).n(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.s(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f155a;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f155a;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        re reVar = this.f156b;
        reVar.l(colorStateList);
        reVar.b();
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        re reVar = this.f156b;
        reVar.m(mode);
        reVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        re reVar = this.f156b;
        if (reVar != null) {
            reVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x50 x50Var;
        if (Build.VERSION.SDK_INT >= 28 || (x50Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            x50Var.c = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i93.a(context);
        h83.a(getContext(), this);
        kc kcVar = new kc(this);
        this.f155a = kcVar;
        kcVar.e(attributeSet, i);
        re reVar = new re(this);
        this.f156b = reVar;
        reVar.f(attributeSet, i);
        reVar.b();
        this.c = new x50((TextView) this);
        this.d = new t73();
        x50 x50Var = new x50((EditText) this);
        this.e = x50Var;
        x50Var.u(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener s = x50Var.s(keyListener);
            if (s == keyListener) {
                return;
            }
            super.setKeyListener(s);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
