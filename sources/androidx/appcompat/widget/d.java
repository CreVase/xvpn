package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class d implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f177a;

    public d(SearchView searchView) {
        this.f177a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        int length;
        SearchView searchView = this.f177a;
        if (searchView.n0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
        if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
            if (searchView.n0 == null || searchView.O == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i != 66 && i != 84 && i != 61) {
                if (i != 21 && i != 22) {
                    if (i != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                if (i == 21) {
                    length = 0;
                } else {
                    length = searchAutoComplete.length();
                }
                searchAutoComplete.setSelection(length);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            } else {
                searchView.p(searchAutoComplete.getListSelection());
            }
            return true;
        }
        if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
        return true;
    }
}
