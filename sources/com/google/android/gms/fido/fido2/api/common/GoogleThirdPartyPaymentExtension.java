package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleThirdPartyPaymentExtensionCreator")
/* loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new zzac();

    @SafeParcelable.Field(getter = "getThirdPartyPayment", id = 1)
    private final boolean zza;

    @SafeParcelable.Constructor
    public GoogleThirdPartyPaymentExtension(@SafeParcelable.Param(id = 1) boolean z) {
        this.zza = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GoogleThirdPartyPaymentExtension) || this.zza != ((GoogleThirdPartyPaymentExtension) obj).getThirdPartyPayment()) {
            return false;
        }
        return true;
    }

    public boolean getThirdPartyPayment() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getThirdPartyPayment());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
