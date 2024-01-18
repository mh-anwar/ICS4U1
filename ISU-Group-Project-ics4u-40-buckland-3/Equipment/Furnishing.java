//Made by sarah
// Class Furnishing :
// The Furnishing class extends the equipment class and provides specific variables related to furniture such as the maetrial, finish and the category it falls under
//Getters:
// getMaterial()
// getFinish()
// getCategory()
// Setters:
// setMaterial()
// setFinish()
// setCategory()
package Equipment;
import Root.Library;

public class Furnishing extends Equipment {
    protected String material; // e.g. wood, leather, metal, aluminium
    protected String finish; // e.g. glossy, matte
    protected String category; // e.g. seating, sleeping, storage, table, entertainment

    public Furnishing(String name, String material, String finish, String category) {
        super(name);
        this.material = material;
        this.finish = finish;
        this.category = category;
    }

    public String toString() {
        return "Furnishing (" + name + ") | Material: " + material + " | Finish: " + finish
                + " | Category: " + category;
    }

    // GETTERS
    public String getMaterial() {
        return material;
    }

    public String getFinish() {
        return finish;
    }

    public String getCategory() {
        return category;
    }

    // SETTERS
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // GENERAL METHODS (none)
}