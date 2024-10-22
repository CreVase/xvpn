package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ft2 {

    /* renamed from: a, reason: collision with root package name */
    public Context f2151a;

    /* renamed from: b, reason: collision with root package name */
    public String f2152b;
    public Intent[] c;
    public CharSequence d;
    public IconCompat e;
    public HashSet f;
    public rn1 g;
    public boolean h;
    public PersistableBundle i;

    public final void a(Intent intent) {
        Bitmap bitmap;
        Object obj;
        Resources resources;
        Intent[] intentArr = this.c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.d.toString());
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            Context context = this.f2151a;
            if (iconCompat.f194a == 2 && (obj = iconCompat.f195b) != null) {
                String str = (String) obj;
                if (str.contains(":")) {
                    String str2 = str.split(":", -1)[1];
                    String str3 = str2.split("/", -1)[0];
                    String str4 = str2.split("/", -1)[1];
                    String str5 = str.split(":", -1)[0];
                    if ("0_resource_name_obfuscated".equals(str4)) {
                        Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    } else {
                        String e = iconCompat.e();
                        if ("android".equals(e)) {
                            resources = Resources.getSystem();
                        } else {
                            PackageManager packageManager = context.getPackageManager();
                            try {
                                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(e, 8192);
                                if (applicationInfo != null) {
                                    resources = packageManager.getResourcesForApplication(applicationInfo);
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", e), e2);
                            }
                            resources = null;
                        }
                        int identifier = resources.getIdentifier(str4, str3, str5);
                        if (iconCompat.e != identifier) {
                            Log.i("IconCompat", "Id has changed for " + e + " " + str);
                            iconCompat.e = identifier;
                        }
                    }
                }
            }
            int i = iconCompat.f194a;
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        bitmap = IconCompat.a((Bitmap) iconCompat.f195b, true);
                    } else {
                        throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                    }
                } else {
                    try {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.e(), 0), iconCompat.e));
                        return;
                    } catch (PackageManager.NameNotFoundException e3) {
                        throw new IllegalArgumentException("Can't find package " + iconCompat.f195b, e3);
                    }
                }
            } else {
                bitmap = (Bitmap) iconCompat.f195b;
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
    }

    public final ShortcutInfo b() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        np0.g();
        shortLabel = np0.a(this.f2151a, this.f2152b).setShortLabel(this.d);
        intents = shortLabel.setIntents(this.c);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.h(this.f2151a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        HashSet hashSet = this.f;
        if (hashSet != null) {
            intents.setCategories(hashSet);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.i;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            rn1 rn1Var = this.g;
            if (rn1Var != null) {
                intents.setLocusId(rn1Var.f4185b);
            }
            intents.setLongLived(this.h);
        } else {
            if (this.i == null) {
                this.i = new PersistableBundle();
            }
            rn1 rn1Var2 = this.g;
            if (rn1Var2 != null) {
                this.i.putString("extraLocusId", rn1Var2.f4184a);
            }
            this.i.putBoolean("extraLongLived", this.h);
            intents.setExtras(this.i);
        }
        if (i >= 33) {
            dt2.a(intents);
        }
        build = intents.build();
        return build;
    }
}
