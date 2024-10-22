package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.wj3;
import defpackage.xj3;
import defpackage.yj3;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(wj3 wj3Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        yj3 yj3Var = remoteActionCompat.f190a;
        boolean z = true;
        if (wj3Var.e(1)) {
            yj3Var = wj3Var.h();
        }
        remoteActionCompat.f190a = (IconCompat) yj3Var;
        CharSequence charSequence = remoteActionCompat.f191b;
        if (wj3Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((xj3) wj3Var).e);
        }
        remoteActionCompat.f191b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (wj3Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((xj3) wj3Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) wj3Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (wj3Var.e(5)) {
            if (((xj3) wj3Var).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (wj3Var.e(6)) {
            if (((xj3) wj3Var).e.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, wj3 wj3Var) {
        wj3Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f190a;
        wj3Var.i(1);
        wj3Var.j(iconCompat);
        CharSequence charSequence = remoteActionCompat.f191b;
        wj3Var.i(2);
        Parcel parcel = ((xj3) wj3Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        wj3Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        wj3Var.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        wj3Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        wj3Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
