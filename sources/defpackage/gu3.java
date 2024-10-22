package defpackage;

import android.content.Context;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public final class gu3 extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2327a;

    public gu3(Context context) {
        super(context, null, 0);
        this.f2327a = true;
    }

    public final boolean getAttachToParent() {
        return this.f2327a;
    }

    public final void setAttachToParent(boolean z) {
        this.f2327a = z;
    }
}
