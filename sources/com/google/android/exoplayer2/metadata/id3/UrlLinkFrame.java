package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.p71;
import defpackage.v6;
import defpackage.wi3;

/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new v6(23);

    /* renamed from: b, reason: collision with root package name */
    public final String f1492b;
    public final String c;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f1492b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (this.f1487a.equals(urlLinkFrame.f1487a) && wi3.a(this.f1492b, urlLinkFrame.f1492b) && wi3.a(this.c, urlLinkFrame.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h = p71.h(this.f1487a, 527, 31);
        int i2 = 0;
        String str = this.f1492b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (h + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1487a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1487a);
        parcel.writeString(this.f1492b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UrlLinkFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.wi3.f5017a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f1492b = r0
            java.lang.String r3 = r3.readString()
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }
}
