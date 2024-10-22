package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbkb implements zzbjj {
    private final Context zza;

    public zzbkb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey("title")) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
            }
            try {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzS(this.zza, intent);
            } catch (RuntimeException e) {
                zzcat.zzk("Failed to open Share Sheet", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
