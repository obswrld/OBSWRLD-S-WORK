package DiaryApp;

import java.time.LocalDateTime;

public class Entry {
    private int Id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int Id, String title, String body){
        this.Id = Id;
        this.title = title;
        this.body = body;
    }

    public int getId(){
        return this.Id;
    }

    public String setTitle(String title){
        this.title = title;
        return title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getBody(){
        return this.body;
    }

    public String getDateTime(){
        return this.dateCreated.toString();
    }
}
