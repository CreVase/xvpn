package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k72 extends m51 {
    private static final k72 DEFAULT_INSTANCE;
    private static volatile t42 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private xd1 strings_ = ma2.d;

    static {
        k72 k72Var = new k72();
        DEFAULT_INSTANCE = k72Var;
        m51.h(k72.class, k72Var);
    }

    public static /* synthetic */ k72 i() {
        return DEFAULT_INSTANCE;
    }

    public static void j(k72 k72Var, Iterable iterable) {
        int i;
        xd1 xd1Var = k72Var.strings_;
        if (!((q1) xd1Var).f3948a) {
            int size = xd1Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            k72Var.strings_ = xd1Var.mutableCopyWithCapacity(i);
        }
        List list = k72Var.strings_;
        Charset charset = yd1.f5317a;
        iterable.getClass();
        if (iterable instanceof jj1) {
            List underlyingElements = ((jj1) iterable).getUnderlyingElements();
            jj1 jj1Var = (jj1) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (jj1Var.size() - size2) + " is null.";
                    int size3 = jj1Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        } else {
                            jj1Var.remove(size3);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof vs) {
                    jj1Var.d((vs) obj);
                } else {
                    jj1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof v72) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        break;
                    } else {
                        list.remove(size5);
                    }
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static k72 k() {
        return DEFAULT_INSTANCE;
    }

    public static j72 m() {
        return (j72) ((g51) DEFAULT_INSTANCE.d(l51.NEW_BUILDER));
    }

    @Override // defpackage.m51
    public final Object d(l51 l51Var) {
        switch (l51Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new og2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case NEW_MUTABLE_INSTANCE:
                return new k72();
            case NEW_BUILDER:
                return new j72();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                t42 t42Var = PARSER;
                if (t42Var == null) {
                    synchronized (k72.class) {
                        try {
                            t42Var = PARSER;
                            if (t42Var == null) {
                                t42Var = new i51();
                                PARSER = t42Var;
                            }
                        } finally {
                        }
                    }
                }
                return t42Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final xd1 l() {
        return this.strings_;
    }
}
