package DiaryApp;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String passWord;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
        this.isLocked = false;
        this.entries = new ArrayList<>();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public boolean unLockDiary(String passWord){
        if(this.passWord.equals(this.passWord)){
            this.isLocked = false;
            return true;
        }else{
            return false;
        }
    }

    public void lockDiary(){
        this.isLocked = true;
    }

    public boolean isLocked(){
        return this.isLocked;
    }

    public Entry createEntry(String title, String body){
        if (!isLocked){
            Entry entry = new Entry(this.entries.size(), title, body);
            this.entries.add(entry);
            return entry;
        }else {
            return null;
        }
    }


}
