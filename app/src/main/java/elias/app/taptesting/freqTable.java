package elias.app.taptesting;

/**
 * Created by vhmOliveira on 31/05/2016.
 */
public class freqTable {
    private int id;
    private long endTime;

    //constructor
    public freqTable() {

    }
    public freqTable( long EndTime, int ID) {
        this.endTime = EndTime;
        this.id = ID;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setEndTime(int EndTime) {
        this.endTime = EndTime;
    }

    // getter
    public int getId() {
        return this.id;
    }

    public long getEndTime() {
        return this.endTime;
    }
}
