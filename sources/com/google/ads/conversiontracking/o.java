package com.google.ads.conversiontracking;

import android.content.Intent;
import android.net.Uri;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public class o {
    static {
        Uri.parse("http://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter(FacebookMediationAdapter.KEY_ID, str).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent c(String str) {
        Uri parse = Uri.parse("bazaar://search?q=pname:" + str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.setFlags(524288);
        return intent;
    }

    public static Intent a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
