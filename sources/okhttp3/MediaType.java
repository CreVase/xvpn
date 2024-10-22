package okhttp3;

import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        /* renamed from: -deprecated_get */
        public final MediaType m188deprecated_get(String str) {
            return get(str);
        }

        /* renamed from: -deprecated_parse */
        public final MediaType m189deprecated_parse(String str) {
            return parse(str);
        }

        public final MediaType get(String str) {
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                Locale locale = Locale.US;
                String lowerCase = group.toLowerCase(locale);
                String lowerCase2 = matcher.group(2).toLowerCase(locale);
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.PARAMETER.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group2 = matcher2.group(1);
                        if (group2 == null) {
                            end = matcher2.end();
                        } else {
                            String group3 = matcher2.group(2);
                            if (group3 == null) {
                                group3 = matcher2.group(3);
                            } else if (i23.q1(group3, "'", false) && group3.endsWith("'") && group3.length() > 2) {
                                group3 = group3.substring(1, group3.length() - 1);
                            }
                            arrayList.add(group2);
                            arrayList.add(group3);
                            end = matcher2.end();
                        }
                    } else {
                        throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final MediaType parse(String str) {
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, ng0 ng0Var) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_subtype */
    public final String m186deprecated_subtype() {
        return this.subtype;
    }

    /* renamed from: -deprecated_type */
    public final String m187deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof MediaType) && m20.L(((MediaType) obj).mediaType, this.mediaType)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        int i = 0;
        int q0 = m20.q0(0, this.parameterNamesAndValues.length - 1, 2);
        if (q0 < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 2;
            if (i23.U0(this.parameterNamesAndValues[i], str)) {
                return this.parameterNamesAndValues[i + 1];
            }
            if (i != q0) {
                i = i2;
            } else {
                return null;
            }
        }
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public final Charset charset(Charset charset) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return charset;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
