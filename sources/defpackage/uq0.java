package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class uq0 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f4714a;
    public tq0 c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4715b = false;
    public boolean d = true;

    public uq0(EditText editText) {
        this.f4714a = editText;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            aq0.a().g(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:            if (r1 == false) goto L13;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f4714a
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L54
            boolean r1 = r4.d
            r2 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r4.f4715b
            r3 = 0
            if (r1 != 0) goto L1c
            aq0 r1 = defpackage.aq0.k
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L1c
        L1b:
            r3 = 1
        L1c:
            if (r3 == 0) goto L1f
            goto L54
        L1f:
            if (r7 > r8) goto L54
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L54
            aq0 r7 = defpackage.aq0.a()
            int r7 = r7.b()
            if (r7 == 0) goto L40
            if (r7 == r2) goto L35
            r5 = 3
            if (r7 == r5) goto L40
            goto L54
        L35:
            android.text.Spannable r5 = (android.text.Spannable) r5
            aq0 r7 = defpackage.aq0.a()
            int r8 = r8 + r6
            r7.f(r6, r8, r5)
            goto L54
        L40:
            aq0 r5 = defpackage.aq0.a()
            tq0 r6 = r4.c
            if (r6 != 0) goto L4f
            tq0 r6 = new tq0
            r6.<init>(r0)
            r4.c = r6
        L4f:
            tq0 r6 = r4.c
            r5.h(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq0.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
