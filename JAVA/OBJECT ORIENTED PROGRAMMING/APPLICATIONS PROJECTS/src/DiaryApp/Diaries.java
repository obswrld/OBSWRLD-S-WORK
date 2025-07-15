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
            if (diaries.getUserName().equals(userName)){
                return diary;
            }
        }
    }

    public boolean deleteDiary(String userName, String passWord){
        for (int i = 0; i<this.diaries.size(); i++){
            Diary diary = this.diaries.get(i);
            if (diary.getUserName().equals.userName && diary.getPassWord().equals(passWord)){
                this.diaries.remove(i);
                return true;
            }
        }
        return false;
    }
}
