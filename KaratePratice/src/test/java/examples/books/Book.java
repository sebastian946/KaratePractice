package examples.books;

import java.util.Date;

public class Book {
    private String title;
    private String body;
    private String resume;
    private Date date;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title1){
        this.title = title1;
    }
    public String getBody(){
        return body;
    }
    public void setBody(String body1){
        this.body = body1;
    }
    public String getResume(){
        return resume;
    }
    public void setResume(String resume1){
        this.resume= resume1;
    }
    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
