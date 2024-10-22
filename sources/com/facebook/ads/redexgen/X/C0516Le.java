package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0516Le {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC0515Ld enumC0515Ld) {
        byte[] decode = Base64.decode(enumC0515Ld.A00(C0506Ku.A02), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap A02(EnumC0515Ld enumC0515Ld) {
        byte[] decode = Base64.decode(enumC0515Ld.A00(C0506Ku.A02), 0);
        return A00(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static Drawable A03(YA ya, EnumC0515Ld enumC0515Ld) {
        return new BitmapDrawable(ya.getResources(), A01(enumC0515Ld));
    }
}
