package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhd extends zzhb {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhd(int i, String str, IOException iOException, Map map, zzgn zzgnVar, byte[] bArr) {
        super(hx2.m("Response code: ", i), iOException, zzgnVar, 2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
