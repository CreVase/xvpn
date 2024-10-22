package defpackage;

/* loaded from: classes2.dex */
public final class ee0 {

    /* renamed from: b, reason: collision with root package name */
    public static final sb0 f1921b = new sb0();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final qb0 e = new qb0(4);

    /* renamed from: a, reason: collision with root package name */
    public final kj2 f1922a;

    public ee0(kj2 kj2Var) {
        this.f1922a = kj2Var;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
