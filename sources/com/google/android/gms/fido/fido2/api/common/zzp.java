package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.List;

@SafeParcelable.Class(creator = "CableAuthenticationExtensionCreator")
/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    @SafeParcelable.Field(getter = "getCableAuthentication", id = 1)
    private final List zza;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 1) List list) {
        this.zza = (List) Preconditions.checkNotNull(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp zzpVar = (zzp) obj;
        if (!this.zza.containsAll(zzpVar.zza) || !zzpVar.zza.containsAll(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new HashSet(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
