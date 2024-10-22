package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class j implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1553b;

    public j(l lVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1553b = lVar;
        this.f1552a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        MaterialCalendarGridView materialCalendarGridView = this.f1552a;
        boolean z2 = true;
        if (i >= materialCalendarGridView.getAdapter().a() && i <= (r4.a() + r4.f1550a.e) - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (materialCalendarGridView.getAdapter().getItem(i).longValue() < ((DateValidatorPointForward) ((d) this.f1553b.e).f1543a.c.c).f1535a) {
                z2 = false;
            }
            if (z2) {
                throw null;
            }
        }
    }
}
