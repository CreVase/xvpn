package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.databinding.ObservableInt;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;

/* loaded from: classes.dex */
public final class v6 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4781a;

    public /* synthetic */ v6(int i) {
        this.f4781a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4781a) {
            case 0:
                return new ActivityResult(parcel);
            case 1:
                return new IntentSenderRequest((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 2:
                return new ObservableInt(parcel.readInt());
            case 3:
                return new ParcelImpl(parcel);
            case 4:
                return new WrappedParcelable(parcel);
            case 5:
                return new DrmInitData(parcel);
            case 6:
                return new Metadata(parcel);
            case 7:
                String readString = parcel.readString();
                readString.getClass();
                return new AppInfoTable(parcel.readInt(), readString);
            case 8:
                return new EventMessage(parcel);
            case 9:
                return new PictureFrame(parcel);
            case 10:
                return new VorbisComment(parcel);
            case 11:
                return new IcyHeaders(parcel);
            case 12:
                return new IcyInfo(parcel);
            case 13:
                return new ApicFrame(parcel);
            case 14:
                return new BinaryFrame(parcel);
            case 15:
                return new ChapterFrame(parcel);
            case 16:
                return new ChapterTocFrame(parcel);
            case 17:
                return new CommentFrame(parcel);
            case 18:
                return new GeobFrame(parcel);
            case 19:
                return new InternalFrame(parcel);
            case 20:
                return new MlltFrame(parcel);
            case 21:
                return new PrivFrame(parcel);
            case 22:
                String readString2 = parcel.readString();
                readString2.getClass();
                String readString3 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new TextInformationFrame(readString2, readString3, hb1.m(createStringArray));
            case 23:
                return new UrlLinkFrame(parcel);
            case 24:
                return new MdtaMetadataEntry(parcel);
            case 25:
                return new MotionPhotoMetadata(parcel);
            case 26:
                return new SmtaMetadataEntry(parcel);
            case 27:
                return new PrivateCommand(parcel);
            case 28:
                return new SpliceInsertCommand(parcel);
            default:
                return new SpliceNullCommand();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4781a) {
            case 0:
                return new ActivityResult[i];
            case 1:
                return new IntentSenderRequest[i];
            case 2:
                return new ObservableInt[i];
            case 3:
                return new ParcelImpl[i];
            case 4:
                return new WrappedParcelable[i];
            case 5:
                return new DrmInitData[i];
            case 6:
                return new Metadata[i];
            case 7:
                return new AppInfoTable[i];
            case 8:
                return new EventMessage[i];
            case 9:
                return new PictureFrame[i];
            case 10:
                return new VorbisComment[i];
            case 11:
                return new IcyHeaders[i];
            case 12:
                return new IcyInfo[i];
            case 13:
                return new ApicFrame[i];
            case 14:
                return new BinaryFrame[i];
            case 15:
                return new ChapterFrame[i];
            case 16:
                return new ChapterTocFrame[i];
            case 17:
                return new CommentFrame[i];
            case 18:
                return new GeobFrame[i];
            case 19:
                return new InternalFrame[i];
            case 20:
                return new MlltFrame[i];
            case 21:
                return new PrivFrame[i];
            case 22:
                return new TextInformationFrame[i];
            case 23:
                return new UrlLinkFrame[i];
            case 24:
                return new MdtaMetadataEntry[i];
            case 25:
                return new MotionPhotoMetadata[i];
            case 26:
                return new SmtaMetadataEntry[i];
            case 27:
                return new PrivateCommand[i];
            case 28:
                return new SpliceInsertCommand[i];
            default:
                return new SpliceNullCommand[i];
        }
    }
}
