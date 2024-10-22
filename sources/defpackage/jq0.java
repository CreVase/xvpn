package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class jq0 extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2809a;

    /* renamed from: b, reason: collision with root package name */
    public final mp0 f2810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z;
        mp0 mp0Var = new mp0(8);
        this.f2809a = editText;
        this.f2810b = mp0Var;
        if (aq0.k != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aq0 a2 = aq0.a();
            if ((a2.b() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                a2.e.L(editorInfo);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f2809a.getEditableText();
        this.f2810b.getClass();
        if (!mp0.m(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f2809a.getEditableText();
        this.f2810b.getClass();
        if (mp0.m(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
