package team.webgroup.todo;

public class Event {

    private String title;
    private String content;
    private boolean isCompleted;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Event() {
    }
}
