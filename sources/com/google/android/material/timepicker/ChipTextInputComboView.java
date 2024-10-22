package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.jf2;
import defpackage.ll3;
import defpackage.vk3;
import defpackage.xe2;
import defpackage.ym;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f1562a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f1563b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LocaleList locales;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(jf2.material_time_chip, (ViewGroup) this, false);
        this.f1562a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(jf2.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f1563b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            editText.setImeHintLocales(locales);
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(xe2.material_label);
        WeakHashMap weakHashMap = ll3.f3151a;
        editText.setId(vk3.a());
        vk3.h(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1562a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f1563b.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        int i;
        int i2;
        Chip chip = this.f1562a;
        chip.setChecked(z);
        int i3 = 4;
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        EditText editText = this.f1563b;
        editText.setVisibility(i);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new ym(i3, editText, z2));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1562a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f1562a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f1562a.toggle();
    }
}
