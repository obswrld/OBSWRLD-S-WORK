import DiaryApp.Diaries;
import DiaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {
    private Diaries diaries;
    private Diary diary1;
    private Diary diary2;

    @BeforeEach
    public void setUp() {
        diaries = new Diaries();
        diary1 = new Diary("Money Transfer", "2222");
        diary2 = new Diary("Checkout from school", "1234");
    }

    @Test
    public void testAddDiary(){
        diaries.addDiary(diary1);
        diaries.addDiary(diary2);
        assertEquals(2, diaries.getDiary().size());

    }

    @Test
    public void testFindDiaryByUserName(){
        diaries.addDiary(diary1);
        diaries.addDiary(diary2);
        assertNotNull(diaries.findDiaryByUserName("Money Transfer"));
        assertNotNull(diaries.findDiaryByUserName("Checkout from school"));
        assertNull(diaries.findDiaryByUserName("user 3"));
    }

    @Test
    public void testDeleteDiary(){

        diaries.addDiary(diary2);
        assertTrue(diaries.deleteDiary("Money Transfer", "2222"));
        assertEquals(1, diaries.getDiary().size());
    }


}
