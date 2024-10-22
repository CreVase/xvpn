package com.security.xvpn.z35kb.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;

/* loaded from: classes2.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new FullDragDrawerLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FullDragDrawerLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new FullDragDrawerLayout.SavedState(parcel, null);
    }
}
