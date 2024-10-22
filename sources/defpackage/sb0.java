package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class sb0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ia0 f4304a;

    static {
        ag1 ag1Var = new ag1();
        qj.f4003a.a(ag1Var);
        ag1Var.d = true;
        f4304a = new ia0(ag1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.il a(android.util.JsonReader r4) {
        /*
            em r0 = new em
            r0.<init>()
            r4.beginObject()
        L8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L95
            java.lang.String r1 = r4.nextName()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = -1
            switch(r2) {
                case -1019779949: goto L4a;
                case -887523944: goto L3f;
                case 3571: goto L34;
                case 3143036: goto L29;
                case 2125650548: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L54
        L1e:
            java.lang.String r2 = "importance"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L27
            goto L54
        L27:
            r3 = 4
            goto L54
        L29:
            java.lang.String r2 = "file"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L32
            goto L54
        L32:
            r3 = 3
            goto L54
        L34:
            java.lang.String r2 = "pc"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3d
            goto L54
        L3d:
            r3 = 2
            goto L54
        L3f:
            java.lang.String r2 = "symbol"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L48
            goto L54
        L48:
            r3 = 1
            goto L54
        L4a:
            java.lang.String r2 = "offset"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L53
            goto L54
        L53:
            r3 = 0
        L54:
            switch(r3) {
                case 0: goto L89;
                case 1: goto L78;
                case 2: goto L6d;
                case 3: goto L66;
                case 4: goto L5b;
                default: goto L57;
            }
        L57:
            r4.skipValue()
            goto L8
        L5b:
            int r1 = r4.nextInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e = r1
            goto L8
        L66:
            java.lang.String r1 = r4.nextString()
            r0.c = r1
            goto L8
        L6d:
            long r1 = r4.nextLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f1958a = r1
            goto L8
        L78:
            java.lang.String r1 = r4.nextString()
            if (r1 == 0) goto L81
            r0.f1959b = r1
            goto L8
        L81:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "Null symbol"
            r4.<init>(r0)
            throw r4
        L89:
            long r1 = r4.nextLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.d = r1
            goto L8
        L95:
            r4.endObject()
            il r4 = r0.c()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb0.a(android.util.JsonReader):il");
    }

    public static tk b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = str.concat(" value");
        }
        if (str.isEmpty()) {
            return new tk(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.rk c(android.util.JsonReader r4) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb0.c(android.util.JsonReader):rk");
    }

    public static gb1 d(JsonReader jsonReader, rb0 rb0Var) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(rb0Var.b(jsonReader));
        }
        jsonReader.endArray();
        return new gb1(arrayList);
    }

    public static al e(JsonReader jsonReader) {
        char c;
        char c2;
        String str;
        char c3;
        char c4;
        char c5;
        em emVar = new em();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 3;
            char c7 = 4;
            int i = 1;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            c = 65535;
            if (c != 0) {
                String str2 = "";
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                jsonReader.skipValue();
                            } else {
                                emVar.f1958a = Long.valueOf(jsonReader.nextLong());
                            }
                        } else {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                emVar.f1959b = nextString;
                            } else {
                                throw new NullPointerException("Null type");
                            }
                        }
                    } else {
                        jsonReader.beginObject();
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (!nextName2.equals("content")) {
                                jsonReader.skipValue();
                            } else {
                                str3 = jsonReader.nextString();
                                if (str3 == null) {
                                    throw new NullPointerException("Null content");
                                }
                            }
                        }
                        jsonReader.endObject();
                        if (str3 == null) {
                            str2 = " content";
                        }
                        if (str2.isEmpty()) {
                            emVar.e = new kl(str3);
                        } else {
                            throw new IllegalStateException("Missing required properties:".concat(str2));
                        }
                    }
                } else {
                    jsonReader.beginObject();
                    cl clVar = null;
                    Integer num = null;
                    gb1 gb1Var = null;
                    gb1 gb1Var2 = null;
                    Boolean bool = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1332194002:
                                if (nextName3.equals("background")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1090974952:
                                if (nextName3.equals("execution")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -80231855:
                                if (nextName3.equals("internalKeys")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 555169704:
                                if (nextName3.equals("customAttributes")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 928737948:
                                if (nextName3.equals("uiOrientation")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                            if (c2 != 1) {
                                if (c2 != 2) {
                                    if (c2 != c6) {
                                        if (c2 != c7) {
                                            jsonReader.skipValue();
                                        } else {
                                            num = Integer.valueOf(jsonReader.nextInt());
                                        }
                                    } else {
                                        gb1Var = d(jsonReader, new ef0(27));
                                    }
                                } else {
                                    gb1Var2 = d(jsonReader, new ef0(28));
                                }
                            } else {
                                jsonReader.beginObject();
                                gl glVar = null;
                                gb1 gb1Var3 = null;
                                gb1 gb1Var4 = null;
                                el elVar = null;
                                rk rkVar = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1375141843:
                                            if (nextName4.equals("appExitInfo")) {
                                                c3 = 0;
                                                break;
                                            }
                                            break;
                                        case -1337936983:
                                            if (nextName4.equals("threads")) {
                                                c3 = 1;
                                                break;
                                            }
                                            break;
                                        case -902467928:
                                            if (nextName4.equals("signal")) {
                                                c3 = 2;
                                                break;
                                            }
                                            break;
                                        case 937615455:
                                            if (nextName4.equals("binaries")) {
                                                c3 = 3;
                                                break;
                                            }
                                            break;
                                        case 1481625679:
                                            if (nextName4.equals("exception")) {
                                                c3 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                        if (c3 != 1) {
                                            if (c3 != 2) {
                                                if (c3 != c6) {
                                                    if (c3 != 4) {
                                                        jsonReader.skipValue();
                                                    } else {
                                                        elVar = f(jsonReader);
                                                    }
                                                } else {
                                                    gb1Var3 = d(jsonReader, new qb0(i));
                                                }
                                            } else {
                                                y33 y33Var = new y33(26);
                                                jsonReader.beginObject();
                                                while (jsonReader.hasNext()) {
                                                    String nextName5 = jsonReader.nextName();
                                                    nextName5.getClass();
                                                    int hashCode = nextName5.hashCode();
                                                    if (hashCode != -1147692044) {
                                                        if (hashCode != 3059181) {
                                                            if (hashCode == 3373707 && nextName5.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                                                c4 = 2;
                                                            }
                                                            c4 = 65535;
                                                        } else {
                                                            if (nextName5.equals("code")) {
                                                                c4 = 1;
                                                            }
                                                            c4 = 65535;
                                                        }
                                                    } else {
                                                        if (nextName5.equals("address")) {
                                                            c4 = 0;
                                                        }
                                                        c4 = 65535;
                                                    }
                                                    if (c4 != 0) {
                                                        if (c4 != 1) {
                                                            if (c4 != 2) {
                                                                jsonReader.skipValue();
                                                            } else {
                                                                String nextString2 = jsonReader.nextString();
                                                                if (nextString2 != null) {
                                                                    y33Var.f5263b = nextString2;
                                                                } else {
                                                                    throw new NullPointerException("Null name");
                                                                }
                                                            }
                                                        } else {
                                                            String nextString3 = jsonReader.nextString();
                                                            if (nextString3 != null) {
                                                                y33Var.c = nextString3;
                                                            } else {
                                                                throw new NullPointerException("Null code");
                                                            }
                                                        }
                                                    } else {
                                                        y33Var.d = Long.valueOf(jsonReader.nextLong());
                                                    }
                                                }
                                                jsonReader.endObject();
                                                glVar = y33Var.l();
                                            }
                                        } else {
                                            gb1Var4 = d(jsonReader, new qb0(0));
                                        }
                                    } else {
                                        rkVar = c(jsonReader);
                                    }
                                    c6 = 3;
                                }
                                jsonReader.endObject();
                                if (glVar != null) {
                                    str = "";
                                } else {
                                    str = " signal";
                                }
                                if (gb1Var3 == null) {
                                    str = str.concat(" binaries");
                                }
                                if (str.isEmpty()) {
                                    clVar = new cl(gb1Var4, elVar, rkVar, glVar, gb1Var3);
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            }
                        } else {
                            bool = Boolean.valueOf(jsonReader.nextBoolean());
                        }
                        c6 = 3;
                        c7 = 4;
                    }
                    jsonReader.endObject();
                    if (clVar == null) {
                        str2 = " execution";
                    }
                    if (num == null) {
                        str2 = str2.concat(" uiOrientation");
                    }
                    if (str2.isEmpty()) {
                        emVar.c = new bl(clVar, gb1Var, gb1Var2, bool, num.intValue());
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                }
            } else {
                jx0 jx0Var = new jx0(7);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    switch (nextName6.hashCode()) {
                        case -1708606089:
                            if (nextName6.equals("batteryLevel")) {
                                c5 = 0;
                                break;
                            }
                            break;
                        case -1455558134:
                            if (nextName6.equals("batteryVelocity")) {
                                c5 = 1;
                                break;
                            }
                            break;
                        case -1439500848:
                            if (nextName6.equals("orientation")) {
                                c5 = 2;
                                break;
                            }
                            break;
                        case 279795450:
                            if (nextName6.equals("diskUsed")) {
                                c5 = 3;
                                break;
                            }
                            break;
                        case 976541947:
                            if (nextName6.equals("ramUsed")) {
                                c5 = 4;
                                break;
                            }
                            break;
                        case 1516795582:
                            if (nextName6.equals("proximityOn")) {
                                c5 = 5;
                                break;
                            }
                            break;
                    }
                    c5 = 65535;
                    if (c5 != 0) {
                        if (c5 != 1) {
                            if (c5 != 2) {
                                if (c5 != 3) {
                                    if (c5 != 4) {
                                        if (c5 != 5) {
                                            jsonReader.skipValue();
                                        } else {
                                            jx0Var.c = Boolean.valueOf(jsonReader.nextBoolean());
                                        }
                                    } else {
                                        jx0Var.e = Long.valueOf(jsonReader.nextLong());
                                    }
                                } else {
                                    jx0Var.f = Long.valueOf(jsonReader.nextLong());
                                }
                            } else {
                                jx0Var.d = Integer.valueOf(jsonReader.nextInt());
                            }
                        } else {
                            jx0Var.f2846b = Integer.valueOf(jsonReader.nextInt());
                        }
                    } else {
                        jx0Var.f2845a = Double.valueOf(jsonReader.nextDouble());
                    }
                }
                jsonReader.endObject();
                emVar.d = jx0Var.f();
            }
        }
        jsonReader.endObject();
        return emVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.el f(android.util.JsonReader r5) {
        /*
            em r0 = new em
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L93
            java.lang.String r1 = r5.nextName()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 3
            r4 = -1
            switch(r2) {
                case -1266514778: goto L4b;
                case -934964668: goto L40;
                case 3575610: goto L35;
                case 91997906: goto L2a;
                case 581754413: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L55
        L1f:
            java.lang.String r2 = "overflowCount"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            goto L55
        L28:
            r4 = 4
            goto L55
        L2a:
            java.lang.String r2 = "causedBy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L33
            goto L55
        L33:
            r4 = 3
            goto L55
        L35:
            java.lang.String r2 = "type"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
            goto L55
        L3e:
            r4 = 2
            goto L55
        L40:
            java.lang.String r2 = "reason"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
            goto L55
        L49:
            r4 = 1
            goto L55
        L4b:
            java.lang.String r2 = "frames"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L54
            goto L55
        L54:
            r4 = 0
        L55:
            switch(r4) {
                case 0: goto L86;
                case 1: goto L7f;
                case 2: goto L6e;
                case 3: goto L67;
                case 4: goto L5c;
                default: goto L58;
            }
        L58:
            r5.skipValue()
            goto L8
        L5c:
            int r1 = r5.nextInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e = r1
            goto L8
        L67:
            el r1 = f(r5)
            r0.d = r1
            goto L8
        L6e:
            java.lang.String r1 = r5.nextString()
            if (r1 == 0) goto L77
            r0.f1959b = r1
            goto L8
        L77:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Null type"
            r5.<init>(r0)
            throw r5
        L7f:
            java.lang.String r1 = r5.nextString()
            r0.f1958a = r1
            goto L8
        L86:
            qb0 r1 = new qb0
            r1.<init>(r3)
            gb1 r1 = d(r5, r1)
            r0.c = r1
            goto L8
        L93:
            r5.endObject()
            el r5 = r0.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb0.f(android.util.JsonReader):el");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x016e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0212. Please report as an issue. */
    public static pk g(JsonReader jsonReader) {
        char c;
        char c2;
        String str;
        char c3;
        char c4;
        String str2;
        String str3;
        char c5;
        String str4;
        Charset charset = ob0.f3635a;
        ok okVar = new ok();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            String str5 = "displayVersion";
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 5;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            c = 65535;
            String str6 = "";
            gb1 gb1Var = null;
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    String str7 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str7 = jsonReader.nextString();
                            }
                        } else {
                            gb1Var = d(jsonReader, new ef0(26));
                        }
                    }
                    jsonReader.endObject();
                    if (gb1Var == null) {
                        str6 = " files";
                    }
                    String str8 = str6;
                    if (str8.isEmpty()) {
                        okVar.j = new uk(gb1Var, str7);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str8));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        okVar.f3679a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    okVar.f = jsonReader.nextString();
                    break;
                case 3:
                    okVar.k = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        okVar.g = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        okVar.f3680b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        okVar.d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 7:
                    okVar.e = jsonReader.nextString();
                    break;
                case '\b':
                    okVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        okVar.h = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case '\n':
                    jk jkVar = new jk(2);
                    jkVar.g = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                                break;
                        }
                        c2 = 65535;
                        switch (c2) {
                            case 0:
                                str = str5;
                                jkVar.e = Long.valueOf(jsonReader.nextLong());
                                str5 = str;
                            case 1:
                                str = str5;
                                jkVar.d = jsonReader.nextString();
                                str5 = str;
                            case 2:
                                str = str5;
                                jkVar.c = new String(Base64.decode(jsonReader.nextString(), 2), ob0.f3635a);
                                str5 = str;
                            case 3:
                                str = str5;
                                jkVar.f = Long.valueOf(jsonReader.nextLong());
                                str5 = str;
                            case 4:
                                str = str5;
                                at3 at3Var = new at3();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            break;
                                    }
                                    c3 = 65535;
                                    switch (c3) {
                                        case 0:
                                            at3Var.e = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                at3Var.h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            at3Var.c = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            at3Var.f337a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            at3Var.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            at3Var.f338b = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                at3Var.g = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            at3Var.f = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                at3Var.i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                jkVar.k = at3Var.b();
                                str5 = str;
                            case 5:
                                str = str5;
                                jkVar.l = d(jsonReader, new ef0(25));
                                str5 = str;
                            case 6:
                                str = str5;
                                eb3 eb3Var = new eb3(10);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c4 = 0;
                                                break;
                                            }
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c4 = 1;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c4 = 2;
                                                break;
                                            }
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c4 = 3;
                                                break;
                                            }
                                            break;
                                    }
                                    c4 = 65535;
                                    if (c4 != 0) {
                                        if (c4 != 1) {
                                            if (c4 != 2) {
                                                if (c4 != 3) {
                                                    jsonReader.skipValue();
                                                } else {
                                                    eb3Var.f1907a = Integer.valueOf(jsonReader.nextInt());
                                                }
                                            } else {
                                                String nextString9 = jsonReader.nextString();
                                                if (nextString9 != null) {
                                                    eb3Var.f1908b = nextString9;
                                                } else {
                                                    throw new NullPointerException("Null version");
                                                }
                                            }
                                        } else {
                                            eb3Var.d = Boolean.valueOf(jsonReader.nextBoolean());
                                        }
                                    } else {
                                        String nextString10 = jsonReader.nextString();
                                        if (nextString10 != null) {
                                            eb3Var.c = nextString10;
                                        } else {
                                            throw new NullPointerException("Null buildVersion");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                jkVar.j = eb3Var.t();
                                str5 = str;
                            case 7:
                                jsonReader.beginObject();
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                String str12 = null;
                                String str13 = null;
                                String str14 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            str3 = str5;
                                            if (nextName6.equals("identifier")) {
                                                c5 = 0;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case -519438642:
                                            str3 = str5;
                                            if (nextName6.equals("developmentPlatform")) {
                                                c5 = 1;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 213652010:
                                            str3 = str5;
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c5 = 2;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                str3 = str5;
                                                c5 = 3;
                                                break;
                                            }
                                            str3 = str5;
                                            c5 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                str3 = str5;
                                                c5 = 4;
                                                break;
                                            }
                                            str3 = str5;
                                            c5 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals(str5)) {
                                                str3 = str5;
                                                c5 = 5;
                                                break;
                                            }
                                            str3 = str5;
                                            c5 = 65535;
                                            break;
                                        default:
                                            str3 = str5;
                                            c5 = 65535;
                                            break;
                                    }
                                    if (c5 != 0) {
                                        if (c5 != 1) {
                                            if (c5 != 2) {
                                                if (c5 != 3) {
                                                    if (c5 != 4) {
                                                        if (c5 != 5) {
                                                            jsonReader.skipValue();
                                                        } else {
                                                            str11 = jsonReader.nextString();
                                                        }
                                                    } else {
                                                        str12 = jsonReader.nextString();
                                                    }
                                                } else {
                                                    str10 = jsonReader.nextString();
                                                    if (str10 == null) {
                                                        throw new NullPointerException("Null version");
                                                    }
                                                }
                                            } else {
                                                str14 = jsonReader.nextString();
                                            }
                                        } else {
                                            str13 = jsonReader.nextString();
                                        }
                                    } else {
                                        str9 = jsonReader.nextString();
                                        if (str9 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    }
                                    str5 = str3;
                                }
                                str = str5;
                                jsonReader.endObject();
                                if (str9 != null) {
                                    str2 = "";
                                } else {
                                    str2 = " identifier";
                                }
                                if (str10 == null) {
                                    str2 = str2.concat(" version");
                                }
                                if (str2.isEmpty()) {
                                    jkVar.h = new xk(str9, str10, str11, str12, str13, str14);
                                    str5 = str;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str15 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    nextName7.getClass();
                                    if (!nextName7.equals("identifier")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str15 = jsonReader.nextString();
                                        if (str15 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                if (str15 != null) {
                                    str4 = "";
                                } else {
                                    str4 = " identifier";
                                }
                                if (str4.isEmpty()) {
                                    jkVar.i = new ml(str15);
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str4));
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    jkVar.f2775b = nextString11;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                jkVar.g = Boolean.valueOf(jsonReader.nextBoolean());
                            case 11:
                                jkVar.f2774a = Integer.valueOf(jsonReader.nextInt());
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    okVar.i = jkVar.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return okVar.a();
    }

    public static pk h(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                pk g = g(jsonReader);
                jsonReader.close();
                return g;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
