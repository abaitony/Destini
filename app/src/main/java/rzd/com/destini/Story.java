package rzd.com.destini;

public class Story {

    private int storyID;
    private int storyAns;
    private int nextStory;

    public Story(int storyID1){
        storyID = storyID1;
    }

    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int isStoryAns() {
        return storyAns;
    }

    public void setStoryAns(int storyAns) {
        this.storyAns = storyAns;
    }

    public int getNextStory() {
        return nextStory;
    }

    public void setNextStory(int nextStory) {
        this.nextStory = nextStory;
    }
}
