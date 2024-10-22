package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new v6(1);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f136a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f137b;
    public final int c;
    public final int d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f136a = intentSender;
        this.f137b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f136a, i);
        parcel.writeParcelable(this.f137b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
