package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wj3;
import defpackage.xj3;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(wj3 wj3Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f194a = wj3Var.f(iconCompat.f194a, 1);
        byte[] bArr = iconCompat.c;
        if (wj3Var.e(2)) {
            Parcel parcel = ((xj3) wj3Var).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = wj3Var.g(iconCompat.d, 3);
        iconCompat.e = wj3Var.f(iconCompat.e, 4);
        iconCompat.f = wj3Var.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) wj3Var.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (wj3Var.e(7)) {
            str = ((xj3) wj3Var).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (wj3Var.e(8)) {
            str2 = ((xj3) wj3Var).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f194a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.f195b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f195b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.f195b = bArr3;
                    iconCompat.f194a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.f195b = str3;
                if (iconCompat.f194a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f195b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, wj3 wj3Var) {
        wj3Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f194a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f195b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f195b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.f195b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.f195b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.f195b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f194a;
        if (-1 != i) {
            wj3Var.i(1);
            ((xj3) wj3Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            wj3Var.i(2);
            int length = bArr.length;
            Parcel parcel = ((xj3) wj3Var).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            wj3Var.i(3);
            ((xj3) wj3Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            wj3Var.i(4);
            ((xj3) wj3Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            wj3Var.i(5);
            ((xj3) wj3Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            wj3Var.i(6);
            ((xj3) wj3Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            wj3Var.i(7);
            ((xj3) wj3Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            wj3Var.i(8);
            ((xj3) wj3Var).e.writeString(str2);
        }
    }
}
