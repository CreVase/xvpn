package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzacc {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = zzfk.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzby zzbyVar) {
        for (int i = 0; i < zzbyVar.zza(); i++) {
            zzbx zzb = zzbyVar.zzb(i);
            if (zzb instanceof zzafa) {
                zzafa zzafaVar = (zzafa) zzb;
                if ("iTunSMPB".equals(zzafaVar.zzb) && zzc(zzafaVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzafj) {
                zzafj zzafjVar = (zzafj) zzb;
                if ("com.apple.iTunes".equals(zzafjVar.zza) && "iTunSMPB".equals(zzafjVar.zzb) && zzc(zzafjVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
