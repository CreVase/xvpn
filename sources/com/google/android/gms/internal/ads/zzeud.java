package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeud implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    public zzeud(zzgad zzgadVar, Context context) {
        this.zza = zzgadVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeud.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(3:3|(1:6)|7)|8|(3:65|66|(19:68|69|11|12|13|(13:15|16|(1:18)(2:48|(3:51|(3:54|(2:57|58)(1:56)|52)|59))|19|20|(2:22|(7:24|25|(5:27|28|29|(1:33)|44)(1:46)|(1:35)(1:42)|(1:37)(1:41)|38|39))|47|25|(0)(0)|(0)(0)|(0)(0)|38|39)|61|16|(0)(0)|19|20|(0)|47|25|(0)(0)|(0)(0)|(0)(0)|38|39))|10|11|12|13|(0)|61|16|(0)(0)|19|20|(0)|47|25|(0)(0)|(0)(0)|(0)(0)|38|39) */
    /* JADX WARN: Incorrect condition in loop: B:5:0x004b */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b8, blocks: (B:13:0x0095, B:15:0x00a1), top: B:12:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeub zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeud.zzc():com.google.android.gms.internal.ads.zzeub");
    }
}
