package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class kc1 extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z5 f2931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc1(InputConnection inputConnection, z5 z5Var) {
        super(inputConnection, false);
        this.f2931a = z5Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ja1 ja1Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            ja1Var = new ja1(new mc1(inputContentInfo), 10);
        }
        if (this.f2931a.a(ja1Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
