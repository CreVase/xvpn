package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;

/* loaded from: assets/audience_network.dex */
public class DI implements Parcelable.Creator<EventMessage> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final EventMessage createFromParcel(Parcel parcel) {
        return new EventMessage(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final EventMessage[] newArray(int i) {
        return new EventMessage[i];
    }
}
