package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import defpackage.hx2;

/* loaded from: classes2.dex */
class MaterialCheckBox$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MaterialCheckBox$SavedState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f1532a;

    public MaterialCheckBox$SavedState(Parcel parcel) {
        super(parcel);
        this.f1532a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f1532a;
        if (i != 1) {
            if (i != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return hx2.s(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f1532a));
    }
}
