package sample;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public TextField tname;
    public TextField tid;
    public TextField tmarks;
    public TextField tcontact;

    public TextArea texta;

    public void buttonclicked()
    {

        texta.appendText(tname.getText()+"\t"+tid.getText()+"\t"+tmarks.getText()+"\t"+tcontact.getText()+"\n");

    }

}