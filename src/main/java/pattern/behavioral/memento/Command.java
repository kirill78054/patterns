package pattern.behavioral.memento;

/*
Снимок(Memento)

Позволяет сохранять и восстанавливать прошлые состояния
объектов, не раскрывая подробностей их реализации.
*/
public class Command {

    private Editor.Snapshot backup;

    public void makeBackup(Editor editor) {
        backup = editor.createSnapshot();
    }

    public void undo() {
        if (backup != null) {
            System.out.println("Восстановик из бэкапа");
            backup.restore();
        } else {
            System.out.println("Бэкап отсутствует!");
        }
    }

}
