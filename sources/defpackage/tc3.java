package defpackage;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class tc3 extends zu2 {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final sc3 u = new sc3(30.0f, 1, 1);
    public static final kz1 v = new kz1(32, 15);
    public final XmlPullParserFactory m;

    public tc3() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static wc3 h(wc3 wc3Var) {
        if (wc3Var == null) {
            return new wc3();
        }
        return wc3Var;
    }

    public static boolean i(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment j(String str) {
        String m0 = zf3.m0(str);
        m0.getClass();
        char c = 65535;
        switch (m0.hashCode()) {
            case -1364013995:
                if (m0.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (m0.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (m0.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (m0.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (m0.equals("start")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static kz1 k(XmlPullParser xmlPullParser, kz1 kz1Var) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return kz1Var;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            sn1.f();
            return kz1Var;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new kz1(parseInt, parseInt2);
            }
            throw new x23("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            sn1.f();
            return kz1Var;
        }
    }

    public static void l(String str, wc3 wc3Var) {
        Matcher matcher;
        int i = wi3.f5017a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            sn1.f();
        } else {
            throw new x23(hx2.r(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    wc3Var.j = 3;
                    break;
                case 1:
                    wc3Var.j = 2;
                    break;
                case 2:
                    wc3Var.j = 1;
                    break;
                default:
                    throw new x23(hx2.q("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            wc3Var.k = Float.parseFloat(group2);
            return;
        }
        throw new x23(hx2.q("Invalid expression for fontSize: '", str, "'."));
    }

    public static sc3 m(XmlPullParser xmlPullParser) {
        int i;
        float f;
        int i2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i3 = wi3.f5017a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new x23("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        sc3 sc3Var = u;
        int i4 = sc3Var.f4318b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        } else {
            i2 = sc3Var.c;
        }
        return new sc3(i * f, i4, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0226, code lost:            if (defpackage.cp3.E(r20, "metadata") != false) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0228, code lost:            r20.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0231, code lost:            if (defpackage.cp3.E(r20, "image") == false) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0233, code lost:            r5 = defpackage.cp3.w(r20, com.google.ads.mediation.facebook.FacebookMediationAdapter.KEY_ID);     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0237, code lost:            if (r5 == null) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0239, code lost:            r25.put(r5, r20.nextText());     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0249, code lost:            if (defpackage.cp3.C(r20, "metadata") == false) goto L124;     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, defpackage.kz1 r22, defpackage.kz1 r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc3.n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, kz1, kz1, java.util.HashMap, java.util.HashMap):void");
    }

    public static uc3 o(XmlPullParser xmlPullParser, uc3 uc3Var, HashMap hashMap, sc3 sc3Var) {
        long j;
        long j2;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        wc3 p2 = p(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            c = 65535;
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5 && attributeValue.startsWith("#")) {
                                    str = attributeValue.substring(1);
                                }
                            } else {
                                String trim = attributeValue.trim();
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                } else {
                                    int i2 = wi3.f5017a;
                                    split = trim.split("\\s+", -1);
                                }
                                if (split.length > 0) {
                                    strArr = split;
                                }
                            }
                        } else {
                            j3 = q(attributeValue, sc3Var);
                        }
                    } else {
                        j4 = q(attributeValue, sc3Var);
                    }
                } else {
                    j5 = q(attributeValue, sc3Var);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (uc3Var != null) {
            long j6 = uc3Var.d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j4 == j) {
            if (j5 != j) {
                j2 = j3 + j5;
            } else if (uc3Var != null) {
                long j7 = uc3Var.e;
                if (j7 != j) {
                    j2 = j7;
                }
            }
            return new uc3(xmlPullParser.getName(), null, j3, j2, p2, strArr, str2, str, uc3Var);
        }
        j2 = j4;
        return new uc3(xmlPullParser.getName(), null, j3, j2, p2, strArr, str2, str, uc3Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x038e, code lost:            if (r11 == 0) goto L251;     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0390, code lost:            if (r11 == 1) goto L250;     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0392, code lost:            if (r11 == 2) goto L249;     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0395, code lost:            if (r11 == 3) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0397, code lost:            if (r11 == 4) goto L251;     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0399, code lost:            if (r11 == 5) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x039d, code lost:            r0 = h(r0);        r0.m = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03a5, code lost:            r0 = h(r0);        r0.m = 4;     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ad, code lost:            r0 = h(r0);        r0.m = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b5, code lost:            r0 = h(r0);        r0.m = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0419, code lost:            if (r11 == 0) goto L284;     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x041b, code lost:            if (r11 == 1) goto L283;     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x041d, code lost:            if (r11 == 2) goto L282;     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0420, code lost:            if (r11 == 3) goto L281;     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0423, code lost:            r0 = h(r0);        r0.f = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x042a, code lost:            r0 = h(r0);        r0.f = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0431, code lost:            r0 = h(r0);        r0.g = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0438, code lost:            r0 = h(r0);        r0.g = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f0, code lost:            if (r5.equals("auto") != false) goto L135;     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wc3 p(org.xmlpull.v1.XmlPullParser r16, defpackage.wc3 r17) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc3.p(org.xmlpull.v1.XmlPullParser, wc3):wc3");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:            if (r13.equals("ms") == false) goto L42;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00db. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long q(java.lang.String r13, defpackage.sc3 r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc3.q(java.lang.String, sc3):long");
    }

    public static kz1 r(XmlPullParser xmlPullParser) {
        String w = cp3.w(xmlPullParser, "extent");
        if (w == null) {
            return null;
        }
        Matcher matcher = s.matcher(w);
        if (!matcher.matches()) {
            "Ignoring non-pixel tts extent: ".concat(w);
            sn1.f();
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new kz1(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            "Ignoring malformed tts extent: ".concat(w);
            sn1.f();
            return null;
        }
    }

    @Override // defpackage.zu2
    public final v23 e(byte[] bArr, int i, boolean z) {
        kz1 kz1Var;
        sc3 sc3Var;
        try {
            XmlPullParser newPullParser = this.m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new vc3("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            kz1 kz1Var2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            sc3 sc3Var2 = u;
            kz1 kz1Var3 = v;
            xc3 xc3Var = null;
            kz1 kz1Var4 = kz1Var3;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                uc3 uc3Var = (uc3) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            sc3Var2 = m(newPullParser);
                            kz1Var4 = k(newPullParser, kz1Var3);
                            kz1Var2 = r(newPullParser);
                        }
                        kz1 kz1Var5 = kz1Var4;
                        kz1 kz1Var6 = kz1Var2;
                        sc3 sc3Var3 = sc3Var2;
                        if (!i(name)) {
                            sn1.e("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            kz1Var = kz1Var5;
                            sc3Var = sc3Var3;
                        } else if ("head".equals(name)) {
                            kz1Var = kz1Var5;
                            sc3Var = sc3Var3;
                            n(newPullParser, hashMap, kz1Var5, kz1Var6, hashMap2, hashMap3);
                        } else {
                            kz1Var = kz1Var5;
                            sc3Var = sc3Var3;
                            try {
                                uc3 o2 = o(newPullParser, uc3Var, hashMap2, sc3Var);
                                arrayDeque.push(o2);
                                if (uc3Var != null) {
                                    if (uc3Var.m == null) {
                                        uc3Var.m = new ArrayList();
                                    }
                                    uc3Var.m.add(o2);
                                }
                            } catch (x23 e) {
                                sn1.g("Suppressing parser error", e);
                                i2++;
                            }
                        }
                        kz1Var4 = kz1Var;
                        sc3Var2 = sc3Var;
                        kz1Var2 = kz1Var6;
                    } else if (eventType == 4) {
                        uc3Var.getClass();
                        uc3 a2 = uc3.a(newPullParser.getText());
                        if (uc3Var.m == null) {
                            uc3Var.m = new ArrayList();
                        }
                        uc3Var.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            uc3 uc3Var2 = (uc3) arrayDeque.peek();
                            uc3Var2.getClass();
                            xc3Var = new xc3(uc3Var2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (xc3Var != null) {
                return xc3Var;
            }
            throw new x23("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new x23("Unable to decode source", e3);
        }
    }
}
