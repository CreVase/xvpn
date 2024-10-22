package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fh2;
import defpackage.jf2;
import defpackage.mf2;
import defpackage.mi3;
import defpackage.o40;
import defpackage.yt3;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class m extends fh2 {
    public final f d;

    public m(f fVar) {
        this.d = fVar;
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.d.c.f;
    }

    @Override // defpackage.fh2
    public final void n(androidx.recyclerview.widget.h hVar, int i) {
        String format;
        f fVar = this.d;
        int i2 = fVar.c.f1533a.c + i;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((yt3) hVar).u;
        textView.setText(format2);
        Context context = textView.getContext();
        if (mi3.c().get(1) == i2) {
            format = String.format(context.getString(mf2.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(mf2.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        o40 o40Var = fVar.f;
        if (mi3.c().get(1) == i2) {
            Object obj = o40Var.f;
        } else {
            Object obj2 = o40Var.d;
        }
        throw null;
    }

    @Override // defpackage.fh2
    public final androidx.recyclerview.widget.h s(RecyclerView recyclerView, int i) {
        return new yt3((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(jf2.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
