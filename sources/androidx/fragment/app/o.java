package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import defpackage.e7;
import defpackage.u41;
import defpackage.w6;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements w6, u41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f236b;

    public /* synthetic */ o(Object obj, int i) {
        this.f235a = i;
        this.f236b = obj;
    }

    public final void a(ActivityResult activityResult) {
        Fragment c;
        Fragment c2;
        int i = this.f235a;
        Object obj = this.f236b;
        switch (i) {
            case 1:
                p pVar = (p) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) pVar.C.pollLast();
                if (fragmentManager$LaunchedFragmentInfo != null && (c2 = pVar.c.c(fragmentManager$LaunchedFragmentInfo.f215a)) != null) {
                    c2.onActivityResult(fragmentManager$LaunchedFragmentInfo.f216b, activityResult.f132a, activityResult.f133b);
                    return;
                }
                return;
            default:
                p pVar2 = (p) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) pVar2.C.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo2 != null && (c = pVar2.c.c(fragmentManager$LaunchedFragmentInfo2.f215a)) != null) {
                    c.onActivityResult(fragmentManager$LaunchedFragmentInfo2.f216b, activityResult.f132a, activityResult.f133b);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.u41
    public final Object apply(Object obj) {
        Fragment fragment = (Fragment) this.f236b;
        Object obj2 = fragment.mHost;
        if (obj2 instanceof e7) {
            return ((e7) obj2).getActivityResultRegistry();
        }
        return fragment.requireActivity().getActivityResultRegistry();
    }

    public final void b(Object obj) {
        Fragment c;
        int i;
        switch (this.f235a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((Boolean) arrayList.get(i2)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i2] = i;
                }
                p pVar = (p) this.f236b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) pVar.C.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo != null && (c = pVar.c.c(fragmentManager$LaunchedFragmentInfo.f215a)) != null) {
                    c.onRequestPermissionsResult(fragmentManager$LaunchedFragmentInfo.f216b, strArr, iArr);
                    return;
                }
                return;
            case 1:
                a((ActivityResult) obj);
                return;
            default:
                a((ActivityResult) obj);
                return;
        }
    }
}
