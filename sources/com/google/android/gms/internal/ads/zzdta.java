package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdta {
    private final Clock zza;

    public zzdta(Clock clock) {
        this.zza = clock;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        String str3;
        if (!((Boolean) zzbee.zza.zze()).booleanValue()) {
            return;
        }
        long currentTimeMillis = this.zza.currentTimeMillis();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(currentTimeMillis);
            jsonWriter.name("source").value(str);
            jsonWriter.name("event").value(str2);
            jsonWriter.name("components").beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next().toString());
            }
            jsonWriter.endArray();
            jsonWriter.name("params").beginArray();
            for (Object obj : objArr) {
                if (obj != null) {
                    str3 = obj.toString();
                } else {
                    str3 = null;
                }
                jsonWriter.value(str3);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzcat.zzh("unable to log", e);
        }
        zzcat.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
    }
}
