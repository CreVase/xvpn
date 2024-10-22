package defpackage;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class e73 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1896b;

    public /* synthetic */ e73(TextInputLayout textInputLayout, int i) {
        this.f1895a = i;
        this.f1896b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1895a;
        TextInputLayout textInputLayout = this.f1896b;
        switch (i) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.c.g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                textInputLayout.d.requestLayout();
                return;
        }
    }
}
