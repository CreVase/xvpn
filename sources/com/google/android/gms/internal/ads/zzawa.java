package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzawa {
    private final int zza;
    private final zzavx zzb = new zzawc();

    public zzawa(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzavz zzavzVar = new zzavz();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzavy(this));
        for (String str : split) {
            String[] zzb = zzawb.zzb(str, false);
            if (zzb.length != 0) {
                zzawf.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzavzVar.zzb.write(this.zzb.zzb(((zzawe) it.next()).zzb));
            } catch (IOException e) {
                zzcat.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzavzVar.toString();
    }
}
