package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public abstract class qf3 {
    public static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
