package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class n02 {
    public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
        return bigPictureStyle.bigPicture(bitmap);
    }

    public static Notification.BigPictureStyle b(Notification.Builder builder) {
        return new Notification.BigPictureStyle(builder);
    }

    public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        return bigPictureStyle.setBigContentTitle(charSequence);
    }

    public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
        bigPictureStyle.bigLargeIcon(bitmap);
    }
}
