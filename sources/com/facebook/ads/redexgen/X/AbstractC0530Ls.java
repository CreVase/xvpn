package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ls, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0530Ls extends LinearLayout {
    public static int A00 = (int) (C0506Ku.A02 * 56.0f);

    public abstract void A04();

    public abstract void A05();

    public abstract void A06(C1M c1m, boolean z);

    public abstract boolean A07();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC0529Lr getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(T3 t3);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(C1X c1x, String str, int i, C00371d c00371d);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC0515Ld enumC0515Ld);

    public abstract void setProgressImmediate(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(InterfaceC0529Lr interfaceC0529Lr);

    public AbstractC0530Ls(Context context) {
        super(context);
    }
}
