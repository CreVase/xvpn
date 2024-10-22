package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public class zzank extends zzamg {
    private final Object zza;
    private final zzaml zzb;

    public zzank(int i, String str, zzaml zzamlVar, zzamk zzamkVar) {
        super(i, str, zzamkVar);
        this.zza = new Object();
        this.zzb = zzamlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamg
    public final zzamm zzh(zzamc zzamcVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzamcVar.zzb;
            Map map = zzamcVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzamcVar.zzb);
        }
        return zzamm.zzb(str, zzand.zzb(zzamcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzamg
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzaml zzamlVar;
        synchronized (this.zza) {
            zzamlVar = this.zzb;
        }
        zzamlVar.zza(str);
    }
}
