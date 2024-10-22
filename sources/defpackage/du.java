package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class du implements lh1, Serializable {
    public static final Object NO_RECEIVER = cu.f1675a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient lh1 reflected;
    private final String signature;

    public du(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.lh1
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.lh1
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public lh1 compute() {
        lh1 lh1Var = this.reflected;
        if (lh1Var == null) {
            lh1 computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return lh1Var;
    }

    public abstract lh1 computeReflected();

    @Override // defpackage.kh1
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public oh1 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            gi2.f2259a.getClass();
            return new i42(cls);
        }
        return gi2.a(cls);
    }

    @Override // defpackage.lh1
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract lh1 getReflected();

    @Override // defpackage.lh1
    public vh1 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.lh1
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.lh1
    public wh1 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.lh1
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.lh1
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.lh1
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
