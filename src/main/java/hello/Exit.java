package hello;

public class Exit {

    private final long id;
    private final String content;

    Exit(long id, String content) {
        this.id = id;
        this.content = content;
        //This appears in console !! When http://localhost:8080/GerritTest2 is entered in the browser
        System.out.print("Testje");
    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

