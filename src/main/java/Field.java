import gui_fields.GUI_Field;

public abstract class Field {
    protected String name;
    protected GUI_Field field;
    protected String description;

    public GUI_Field getGUIField(){
        return field;
    }
}
