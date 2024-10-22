package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class tz extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f4600a;

    public tz(Chip chip) {
        this.f4600a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        wz wzVar = this.f4600a.e;
        if (wzVar != null) {
            wzVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
