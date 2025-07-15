package DiaryApp;
import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;

    public Diaries() {
        this.diaries = new ArrayList<>();
    }

    public void addDiary(Diary diary){
        this.diaries.add(diary);
    }

    public Diary findDiaryByUserName(String userName){
        for (Diary diary : this.diaries){
            if (diary.getUserName().equals(userName)){
                return diary;
            }
        }
        return null;
    }

    public boolean deleteDiary(String userName, String passWord){
        for (int i = 0; i<this.diaries.size(); i++){
            Diary diary = this.diaries.get(i);
            if (diary.getUserName() == userName && diary.getPassWord() == (passWord)){
                this.diaries.remove(i);
                return true;
            }
        }
        return false;
    }
}
