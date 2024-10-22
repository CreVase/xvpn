package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.af2;
import defpackage.ll3;
import defpackage.qk3;
import defpackage.xe2;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class k extends androidx.recyclerview.widget.h {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public k(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(xe2.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = ll3.f3151a;
        new qk3(af2.tag_accessibility_heading, 3).c(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(xe2.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
