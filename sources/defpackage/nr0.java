package defpackage;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class nr0 extends u73 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr0 f3523a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(pr0 pr0Var) {
        super(0);
        this.f3523a = pr0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f3523a.b().a();
    }

    @Override // defpackage.u73, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f3523a.b().b();
    }
}
