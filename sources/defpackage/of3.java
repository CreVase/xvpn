package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class of3 extends ja1 {
    public of3() {
        super(7);
    }

    public static Font K(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int L = L(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int L2 = L(fontStyle, font2.getStyle());
            if (L2 < L) {
                font = font2;
                L = L2;
            }
        }
        return font;
    }

    public static int L(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // defpackage.ja1
    public final Typeface A(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.ja1
    public final Typeface B(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.ja1
    public final l01 D(int i, l01[] l01VarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.ja1
    public final Typeface y(Context context, h01 h01Var, Resources resources, int i) {
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (i01 i01Var : h01Var.f2350a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, i01Var.f).setWeight(i01Var.f2511b);
                    if (i01Var.c) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font build = weight.setSlant(i2).setTtcIndex(i01Var.e).setFontVariationSettings(i01Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(K(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.ja1
    public final Typeface z(Context context, l01[] l01VarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (l01 l01Var : l01VarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(l01Var.f3043a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(l01Var.c);
                        if (l01Var.d) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font build = weight.setSlant(i2).setTtcIndex(l01Var.f3044b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(K(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }
}
