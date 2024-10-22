package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class wi3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5017a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f5018b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final Pattern g;
    public static final Pattern h;
    public static HashMap i;
    public static final String[] j;
    public static final String[] k;
    public static final int[] l;
    public static final int[] m;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f5017a = i2;
        String str = Build.DEVICE;
        f5018b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
        f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        g = Pattern.compile("%([A-Fa-f0-9]{2})");
        h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookMediationAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, SubsamplingScaleImageView.ORIENTATION_180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean A(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean B(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long C(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m0 = zf3.m0(str);
        int i2 = 0;
        String str2 = m0.split("-", 2)[0];
        if (i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = j;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap.put(strArr[i3], strArr[i3 + 1]);
            }
            i = hashMap;
        }
        String str4 = (String) i.get(str2);
        if (str4 != null) {
            StringBuilder n = p71.n(str4);
            n.append(m0.substring(str2.length()));
            m0 = n.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m0;
        }
        while (true) {
            String[] strArr2 = k;
            if (i2 < strArr2.length) {
                if (m0.startsWith(strArr2[i2])) {
                    return strArr2[i2 + 1] + m0.substring(strArr2[i2].length());
                }
                i2 += 2;
            } else {
                return m0;
            }
        }
    }

    public static Object[] E(int i2, Object[] objArr) {
        boolean z;
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        return Arrays.copyOf(objArr, i2);
    }

    public static void F(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long G(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        return (long) (j2 * (j3 / j4));
    }

    public static void H(long[] jArr, long j2) {
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
            return;
        }
        double d2 = 1000000 / j2;
        while (i2 < jArr.length) {
            jArr[i2] = (long) (jArr[i2] * d2);
            i2++;
        }
    }

    public static String[] I(String str) {
        return str.split("/", -1);
    }

    public static boolean J(SQLiteDatabase sQLiteDatabase, String str) {
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0) {
            return true;
        }
        return false;
    }

    public static long K(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 / 1000;
        }
        return j2;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j2);
        if (z) {
            return binarySearch - 1;
        }
        return binarySearch;
    }

    public static int c(q9 q9Var, long j2) {
        int i2 = q9Var.f3969a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (q9Var.n(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < q9Var.f3969a && q9Var.n(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(java.util.List r2, java.lang.Long r3, boolean r4) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L1d
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            int r2 = r0 + 1
        L1d:
            if (r4 == 0) goto L24
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi3.d(java.util.List, java.lang.Long, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi3.e(int[], int, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(long[] r4, long r5, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r4 = -r0
            goto L17
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L15
            goto La
        L15:
            int r4 = r0 + 1
        L17:
            if (r7 == 0) goto L1e
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L1e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi3.f(long[], long, boolean):int");
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int i(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static Handler k(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        cp3.o(myLooper);
        return new Handler(myLooper, callback);
    }

    public static Handler l(lm0 lm0Var) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return new Handler(myLooper, lm0Var);
    }

    public static String m(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int n(int i2) {
        if (i2 == 12) {
            return 743676;
        }
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int o(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i2) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int p(String str) {
        String[] split;
        int length;
        boolean z;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            if (z) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long q(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 * f2);
    }

    public static int r(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int s(int i2, int i3) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 268435456) {
                        if (i2 != 536870912) {
                            if (i2 != 805306368) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            return i3 * 3;
                        }
                    }
                }
                return i3 * 4;
            }
            return i3;
        }
        return i3 * 2;
    }

    public static int t(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String[] u() {
        String locale;
        String[] strArr;
        LocaleList locales;
        String languageTags;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i2 = f5017a;
        if (i2 >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            Locale locale2 = configuration.locale;
            if (i2 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr = new String[]{locale};
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            strArr[i3] = D(strArr[i3]);
        }
        return strArr;
    }

    public static String v(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            sn1.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String w(int i2) {
        switch (i2) {
            case -2:
                return DevicePublicKeyStringDef.NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i2 >= 10000) {
                    return p71.k("custom (", i2, ")");
                }
                return "?";
        }
    }

    public static byte[] x(String str) {
        return str.getBytes(ex.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int y(android.net.Uri r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi3.y(android.net.Uri, java.lang.String):int");
    }

    public static String z(int i2) {
        return Integer.toString(i2, 36);
    }
}
