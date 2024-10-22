package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;

/* loaded from: classes.dex */
public final class dz2 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1866a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1866a) {
            case 0:
                return new SpliceScheduleCommand(parcel);
            case 1:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 2:
                return new VorbisComment(parcel);
            case 3:
                return new DownloadRequest(parcel);
            case 4:
                return new StreamKey(parcel);
            case 5:
                return new Requirements(parcel.readInt());
            default:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new RemoteMessage(bundle);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1866a) {
            case 0:
                return new SpliceScheduleCommand[i];
            case 1:
                return new TimeSignalCommand[i];
            case 2:
                return new VorbisComment[i];
            case 3:
                return new DownloadRequest[i];
            case 4:
                return new StreamKey[i];
            case 5:
                return new Requirements[i];
            default:
                return new RemoteMessage[i];
        }
    }
}
