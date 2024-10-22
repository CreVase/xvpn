package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ft1;
import defpackage.v6;
import defpackage.wi3;
import defpackage.x01;
import defpackage.y01;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public static final y01 g;
    public static final y01 h;

    /* renamed from: a, reason: collision with root package name */
    public final String f1471a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1472b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        x01 x01Var = new x01();
        x01Var.k = "application/id3";
        g = x01Var.a();
        x01 x01Var2 = new x01();
        x01Var2.k = "application/x-scte35";
        h = x01Var2.a();
        CREATOR = new v6(8);
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f1471a = str;
        this.f1472b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final y01 c() {
        String str = this.f1471a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return h;
            case 1:
            case 2:
                return g;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.c == eventMessage.c && this.d == eventMessage.d && wi3.a(this.f1471a, eventMessage.f1471a) && wi3.a(this.f1472b, eventMessage.f1472b) && Arrays.equals(this.e, eventMessage.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f == 0) {
            int i2 = 0;
            String str = this.f1471a;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String str2 = this.f1472b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i4 = (i3 + i2) * 31;
            long j = this.c;
            int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i5 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1471a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.f1472b;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void w(ft1 ft1Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1471a);
        parcel.writeString(this.f1472b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] x() {
        if (c() != null) {
            return this.e;
        }
        return null;
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1471a = readString;
        this.f1472b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.createByteArray();
    }
}
