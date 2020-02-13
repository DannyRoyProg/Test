package sample;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.*;
import org.w3c.dom.Text;

public class Controller {
    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();
        Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putString(ref.getText());
        db.setContent(content);
    }

    public void imgTargetDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void imgTargetDragDropped(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        refSource.clear();
    }

    public void comboBoxDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void comboBoxDragDropped(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        ComboBox refTarget = (ComboBox) dragEvent.getGestureTarget();

        if (!refSource.getText().equals("")){
            refTarget.getItems().add(refSource.getText());
            refTarget.getSelectionModel().selectLast();
            refSource.clear();
        }
    }

    public void txfSourceDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void txfSourceDragDropped(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        TextField refTarget = (TextField) dragEvent.getGestureTarget();

        if (refSource.getText().equals("")) {
            if (!refSource.getText().equals("")) {
                refTarget.setText(refSource.getText());
                refSource.clear();
            }
        }

    }
}
