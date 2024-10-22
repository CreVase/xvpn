package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class qk3 extends sk3 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(int i, int i2) {
        super(i, Boolean.class, 0, 28);
        this.e = i2;
    }

    public final Boolean d(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(el3.d(view));
            default:
                return Boolean.valueOf(el3.c(view));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk3(int i, int i2, int i3, int i4) {
        super(i, CharSequence.class, i2, i3);
        this.e = i4;
    }
}
