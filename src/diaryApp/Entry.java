package diaryApp;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private  String title;
    private String body;
    private LocalDateTime dateCreated;



    public Entry(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getId(){
        return id;
    }




    public void setBody(String body){
        this.body = body;
    }



    public void setDateCreated(LocalDateTime time){
        this.dateCreated = time;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

public String toString(){
        return String.format("""
                =============================
                Entry Id: %d
                Entry Title: %s
                Date Created : %s
                =============================
                Entry Body:
                %s
                =============================
                """,id,title,dateCreated,body);
}

public void setTitle(String title){
        this.title = title;
}

    public String getTitle() {
        return title;
    }
}
