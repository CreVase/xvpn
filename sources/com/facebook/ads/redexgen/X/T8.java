package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class T8 extends AsyncTask<String, Void, Bitmap[]> implements C7P {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public NK A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<NI> A06;
    public final WeakReference<YA> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final Bitmap[] A03(String... strArr) {
        if (K0.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmap = null;
            Bitmap bitmap2 = null;
            YA ya = this.A07.get();
            if (ya == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmap = new C6Q(ya).A0N(str, this.A00, this.A01);
                if (bitmap != null && !this.A03) {
                    bitmap2 = C0514Lc.A01(ya, bitmap, this.A04, this.A05);
                }
            } catch (Throwable th) {
                ya.A07().A9M(A00(0, 7, 16), C01997x.A1V, new C02007y(th));
            }
            return new Bitmap[]{bitmap, bitmap2};
        } catch (Throwable th2) {
            K0.A00(th2, this);
            return null;
        }
    }

    static {
        A01();
    }

    public T8(ViewGroup viewGroup, int i, int i2, YA ya) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(ya);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i;
        this.A05 = i2;
    }

    public T8(ViewGroup viewGroup, YA ya) {
        this(viewGroup, 12, 16, ya);
    }

    public T8(ImageView imageView, YA ya) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(ya);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public T8(NI ni, YA ya) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(ya);
        this.A06 = new WeakReference<>(ni);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) {
        NI ni;
        if (K0.A02(this)) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.A08;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            WeakReference<NI> weakReference2 = this.A06;
            if (weakReference2 != null && (ni = weakReference2.get()) != null) {
                ni.setImage(result[0], result[1]);
            }
            WeakReference<ViewGroup> weakReference3 = this.A09;
            if (weakReference3 != null && weakReference3.get() != null && result[1] != null) {
                LV.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            NK nk = this.A02;
            if (nk != null) {
                nk.ABX(result[0] != null);
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    public final T8 A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final T8 A05(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        return this;
    }

    public final T8 A06(NK nk) {
        this.A02 = nk;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            NK nk = this.A02;
            if (nk != null) {
                nk.ABX(false);
                return;
            }
            return;
        }
        executeOnExecutor(ExecutorC0512La.A06, str);
    }

    @Override // com.facebook.ads.redexgen.X.C7P
    public final YA A5p() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (K0.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th) {
            K0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th) {
            K0.A00(th, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
