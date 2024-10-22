package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzert implements zzetw {
    private final zzgad zza;
    private final zzfdn zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzert(zzgad zzgadVar, zzfdn zzfdnVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgadVar;
        this.zzb = zzfdnVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzeru zzc(final zzert zzertVar) {
        final ArrayList arrayList = zzertVar.zzb.zzg;
        if (arrayList == null) {
            return new zzeru() { // from class: com.google.android.gms.internal.ads.zzerq
                @Override // com.google.android.gms.internal.ads.zzetv
                public final void zzj(Object obj) {
                }
            };
        }
        if (arrayList.isEmpty()) {
            return new zzeru() { // from class: com.google.android.gms.internal.ads.zzerr
                @Override // com.google.android.gms.internal.ads.zzetv
                public final void zzj(Object obj) {
                    ((Bundle) obj).putInt("native_version", 0);
                }
            };
        }
        return new zzeru() { // from class: com.google.android.gms.internal.ads.zzers
            @Override // com.google.android.gms.internal.ads.zzetv
            public final void zzj(Object obj) {
                zzert.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzert.zzc(zzert.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:            if (r9 == 3) goto L64;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzert.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
