public class Pantry3 {
    // Instance Variables
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    // Constructors
    Pantry3(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    // Constrctors
    Pantry3(Jam jar1, Jam jar2) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = null;
    }

    // Constructors
    Pantry3(Jam jar1) {
        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    // Methods
    public String toString() {
        String str = "\n1: " + jar1.toString() + "\n";
        if (jar2 != null) {
            str += "\n2: " + jar2.toString() + "\n";
        }
        if (jar3 != null) {
            str += "\n3: " + jar3.toString() + "\n";
        }
        return str;
    }

    // assume that the user entered a correct selection, 1, 2, or 3
    public boolean select(int jarNumber) {
        if (jarNumber == 1 && jar1 != null) {
            selected = jar1;
            return true;
        } else if (jarNumber == 2 && jar2 != null) {
            selected = jar2;
            return true;
        } else if (jarNumber == 3 && jar3 != null) {
            selected = jar3;
            return true;
        } else {
            Library.errorMsg("Jam #" + jarNumber + " - Selection unavailable");
        }
        return false;
    }

    // spread the selected jam
    public void spread(int ml) {
        System.out.println(selected);
        if (selected != null) {
            selected.spread(ml);
        }
    }

    public void replace(Jam j, int slot) {
        if (j != null) {
            if (slot == 1 && this.jar1 != null) {
                this.jar1 = j;
                Library.sucMsg("Replaced Slot " + slot + " Jam with " + j.contents);
            } else if (slot == 2 && this.jar2 != null) {
                this.jar2 = j;
                Library.sucMsg("Replaced Slot " + slot + " Jam with " + j.contents);

            } else if (slot == 3 && this.jar3 != null) {
                this.jar3 = j;
                Library.sucMsg("Replaced Slot " + slot + " Jam with " + j.contents);
            }
        } else {
            Library.errorMsg("Oops! Slot " + slot + " can't be replaced, new Jam can't be found!");
        }
    }
}
