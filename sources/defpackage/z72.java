package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class z72 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5439b;

    public /* synthetic */ z72(Object obj, int i) {
        this.f5438a = i;
        this.f5439b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f5438a;
        Object obj3 = this.f5439b;
        switch (i) {
            case 0:
                return ((ix2) obj).f2671b - ((ix2) obj2).f2671b;
            case 1:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
            default:
                Thread thread = (Thread) obj;
                Thread thread2 = (Thread) obj2;
                if (thread == thread2) {
                    return 0;
                }
                Thread thread3 = (Thread) obj3;
                if (thread == thread3) {
                    return 1;
                }
                if (thread2 == thread3) {
                    return -1;
                }
                return thread2.getName().compareTo(thread.getName());
        }
    }
}
