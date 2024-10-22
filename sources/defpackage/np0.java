package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class np0 {
    public static /* synthetic */ ShortcutInfo.Builder a(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    public static /* bridge */ /* synthetic */ ShortcutManager e(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void g() {
    }
}
