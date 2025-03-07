package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzflg implements zzfld {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfld
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfln.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return zzfln.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final void zzb(View view, JSONObject jSONObject, zzflc zzflcVar, boolean z, boolean z2) {
        int i;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (z) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i3));
                int size2 = arrayList3.size();
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    if (i4 < size2) {
                        zzflcVar.zza((View) arrayList3.get(i4), this, jSONObject, z2);
                        i4++;
                    }
                }
                i3 = i;
            }
            return;
        }
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            zzflcVar.zza(viewGroup.getChildAt(i5), this, jSONObject, z2);
        }
    }
}
