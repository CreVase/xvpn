package com.google.android.gms.internal.oss_licenses;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzf {
    public static String zza(Context context, zze zzeVar, int i) {
        long zzb = zzeVar.zzb();
        int zza = zzeVar.zza();
        String zze = zzeVar.zze();
        if (zze.isEmpty()) {
            return zzd(context, "third_party_licenses", zzb, zza, i);
        }
        try {
            String zzc = zzc(new BufferedInputStream(new FileInputStream(zze)), zzb, zza);
            if (zzc != null) {
                if (!zzc.isEmpty()) {
                    return zzc;
                }
            }
        } catch (FileNotFoundException unused) {
        }
        throw new RuntimeException(zze.concat(" does not contain res/raw/third_party_licenses"));
    }

    public static ArrayList zzb(Context context, int i) {
        boolean z;
        String[] split = zzd(context.getApplicationContext(), "third_party_license_metadata", 0L, -1, i).split("\n");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            int indexOf = str.indexOf(32);
            String[] split2 = str.substring(0, indexOf).split(":");
            if (split2.length == 2 && indexOf > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(zze.zzc(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1]), ""));
            } else {
                throw new IllegalStateException("Invalid license meta-data line:\n".concat(str));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static String zzc(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, UserVerificationMethods.USER_VERIFY_ALL));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    private static String zzd(Context context, String str, long j, int i, int i2) {
        Resources resources = context.getApplicationContext().getResources();
        return zzc(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(i2))), j, i);
    }
}
