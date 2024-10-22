package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class te extends v51 {
    public final /* synthetic */ AppCompatTextView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, 6);
        this.d = appCompatTextView;
    }

    @Override // defpackage.v51, defpackage.se
    public final void g(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // defpackage.v51, defpackage.se
    public final void h(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
