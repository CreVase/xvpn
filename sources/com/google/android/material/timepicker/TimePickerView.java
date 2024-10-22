package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.jf2;
import defpackage.s83;
import defpackage.xe2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final Chip q;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e eVar = new e(this);
        LayoutInflater.from(context).inflate(jf2.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(xe2.material_clock_period_toggle);
        materialButtonToggleGroup.c.add(new d(this));
        Chip chip = (Chip) findViewById(xe2.material_minute_tv);
        Chip chip2 = (Chip) findViewById(xe2.material_hour_tv);
        this.q = chip2;
        s83 s83Var = new s83(new GestureDetector(getContext(), new f(this)));
        chip.setOnTouchListener(s83Var);
        chip2.setOnTouchListener(s83Var);
        int i = xe2.selection_type;
        chip.setTag(i, 12);
        chip2.setTag(i, 10);
        chip.setOnClickListener(eVar);
        chip2.setOnClickListener(eVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.q.sendAccessibilityEvent(8);
        }
    }
}
