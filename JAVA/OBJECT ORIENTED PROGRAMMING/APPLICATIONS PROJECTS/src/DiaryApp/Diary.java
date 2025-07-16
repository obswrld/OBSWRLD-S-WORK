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
            Entry entry = new Entry(this.entries.size() + 1, title, body);
            this.entries.add(entry);
            return entry;
        }else {
            return null;
        }
    }

    public boolean deleteEntry(int id){
        if (!this.isLocked){
            for (int i=0; i<this.entries.size(); i++){
                if (this.entries.get(i).getId() == id){
                    this.entries.remove(i);
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }

    public Entry findByUserId(int id){
        if (!this.isLocked){
            for (Entry entry : this.entries){
                if (entry.getId() == id){
                    return entry;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    public boolean updateEntry(int id, String newTitle, String newBody){
        if (!this.isLocked){
            for (Entry entry : this.entries){
                if (entry.getId() == id){
                    entry.setTitle(newTitle);
                    entry.setBody(newBody);
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }
}
