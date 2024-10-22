package defpackage;

import com.google.protobuf.m;
import com.google.protobuf.q1;
import java.io.IOException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOOSE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public abstract class rr3 {
    private static final /* synthetic */ rr3[] $VALUES = $values();
    public static final rr3 LAZY;
    public static final rr3 LOOSE;
    public static final rr3 STRICT;

    private static /* synthetic */ rr3[] $values() {
        return new rr3[]{LOOSE, STRICT, LAZY};
    }

    static {
        final String str = "LOOSE";
        final int i = 0;
        LOOSE = new rr3(str, i) { // from class: or3
            {
                q1 q1Var = null;
            }

            @Override // defpackage.rr3
            public Object readString(m mVar) throws IOException {
                return mVar.readString();
            }
        };
        final String str2 = "STRICT";
        final int i2 = 1;
        STRICT = new rr3(str2, i2) { // from class: pr3
            {
                q1 q1Var = null;
            }

            @Override // defpackage.rr3
            public Object readString(m mVar) throws IOException {
                return mVar.readStringRequireUtf8();
            }
        };
        final String str3 = "LAZY";
        final int i3 = 2;
        LAZY = new rr3(str3, i3) { // from class: qr3
            {
                q1 q1Var = null;
            }

            @Override // defpackage.rr3
            public Object readString(m mVar) throws IOException {
                return mVar.readBytes();
            }
        };
    }

    private rr3(String str, int i) {
    }

    public static rr3 valueOf(String str) {
        return (rr3) Enum.valueOf(rr3.class, str);
    }

    public static rr3[] values() {
        return (rr3[]) $VALUES.clone();
    }

    public abstract Object readString(m mVar) throws IOException;

    public /* synthetic */ rr3(String str, int i, q1 q1Var) {
        this(str, i);
    }
}
