package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class nv1 extends go implements Menu {
    public final m33 d;

    public nv1(Context context, m33 m33Var) {
        super(context);
        if (m33Var != null) {
            this.d = m33Var;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m(((ju1) this.d).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((ju1) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((ju1) this.d).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        uu2 uu2Var = (uu2) this.f2288b;
        if (uu2Var != null) {
            uu2Var.clear();
        }
        uu2 uu2Var2 = (uu2) this.c;
        if (uu2Var2 != null) {
            uu2Var2.clear();
        }
        ((ju1) this.d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((ju1) this.d).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m(((ju1) this.d).findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m(((ju1) this.d).getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((ju1) this.d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((ju1) this.d).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return ((ju1) this.d).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((ju1) this.d).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((uu2) this.f2288b) != null) {
            int i2 = 0;
            while (true) {
                uu2 uu2Var = (uu2) this.f2288b;
                if (i2 >= uu2Var.c) {
                    break;
                }
                if (((q33) uu2Var.i(i2)).getGroupId() == i) {
                    ((uu2) this.f2288b).j(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((ju1) this.d).removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((uu2) this.f2288b) != null) {
            int i2 = 0;
            while (true) {
                uu2 uu2Var = (uu2) this.f2288b;
                if (i2 >= uu2Var.c) {
                    break;
                }
                if (((q33) uu2Var.i(i2)).getItemId() == i) {
                    ((uu2) this.f2288b).j(i2);
                    break;
                }
                i2++;
            }
        }
        ((ju1) this.d).removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ((ju1) this.d).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ((ju1) this.d).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ((ju1) this.d).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((ju1) this.d).size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return ((ju1) this.d).addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m(((ju1) this.d).add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return ((ju1) this.d).addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m(((ju1) this.d).a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((ju1) this.d).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m(((ju1) this.d).add(i, i2, i3, i4));
    }
}
