package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class r02 {
    public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.bigText(charSequence);
    }

    public static Notification.BigTextStyle b(Notification.Builder builder) {
        return new Notification.BigTextStyle(builder);
    }

    public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setBigContentTitle(charSequence);
    }

    public static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setSummaryText(charSequence);
    }
}
