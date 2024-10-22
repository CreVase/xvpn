package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SW extends NB {
    public static byte[] A01;
    public final /* synthetic */ C0597Oh A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 24, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, 24, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, 27, 12, 3, 55, 4, 9, 17, 13, 26, 55, 11, 7, 6, 28, 13, 6, 28, 55, 31, 1, 12, 28, 0};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int i4 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            i4 = Integer.MAX_VALUE;
            i3 = viewGroup.getWidth() != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            if (viewGroup.getHeight() != 0) {
                i4 = viewGroup.getHeight();
            }
        }
        int A012 = A01(dynamicWebViewWidth, i3, i);
        int A013 = A01(dynamicWebViewHeight, i4, i2);
        if ((z2 || z) && Math.abs((A012 / A013) - f) > 1.0E-7d) {
            boolean z3 = false;
            if (z2) {
                A013 = (int) (A012 / f);
                z3 = true;
            }
            if (!z3 && z) {
                A012 = (int) (A013 * f);
            }
        }
        setMeasuredDimension(A012, A013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SW(C0597Oh c0597Oh, YA ya) {
        super(ya);
        this.A00 = c0597Oh;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i, int i2, int i3) {
        int specMode = View.MeasureSpec.getMode(i3);
        int result = View.MeasureSpec.getSize(i3);
        switch (specMode) {
            case Integer.MIN_VALUE:
                return Math.min(Math.min(i, result), i2);
            case 0:
                return Math.min(i, i2);
            case 1073741824:
                return result;
            default:
                return i;
        }
    }

    @Override // com.facebook.ads.redexgen.X.NB
    public final WebChromeClient A0D() {
        return new C0592Oc(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.NB
    public final WebViewClient A0E() {
        return new C0593Od(this.A00);
    }

    private int getDynamicWebViewHeight() {
        AbstractC0924aS abstractC0924aS;
        abstractC0924aS = this.A00.A09;
        return abstractC0924aS.A0U().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        AbstractC0924aS abstractC0924aS;
        abstractC0924aS = this.A00.A09;
        return abstractC0924aS.A0U().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        OW ow;
        OW ow2;
        ow = this.A00.A02;
        if (ow != null) {
            ow2 = this.A00.A02;
            ow2.ADB(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
