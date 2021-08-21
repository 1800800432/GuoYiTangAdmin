package guet.com.cn.guoyitangadmin.bean;

public class Medicateddiet {



    private String tittle;
    private String origin;
    private String author;
    private String publicTime;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }
}
