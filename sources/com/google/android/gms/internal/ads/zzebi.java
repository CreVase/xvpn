package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzebi {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzebi zza(Reader reader) throws zzfcw {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j = -1;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzebi zzebiVar = new zzebi();
                zzebiVar.zza = i;
                if (str != null) {
                    zzebiVar.zzc = str;
                }
                zzebiVar.zzd = j;
                zzebiVar.zzb = hashMap;
                return zzebiVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
                throw new zzfcw("Unable to parse Response", e);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
