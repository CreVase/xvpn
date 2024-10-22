package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import defpackage.u73;

/* loaded from: classes2.dex */
public final class a extends u73 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f1566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChipTextInputComboView chipTextInputComboView) {
        super(0);
        this.f1566a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1566a;
        if (isEmpty) {
            chipTextInputComboView.f1562a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a2 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f1562a;
        if (TextUtils.isEmpty(a2)) {
            a2 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a2);
    }
}
