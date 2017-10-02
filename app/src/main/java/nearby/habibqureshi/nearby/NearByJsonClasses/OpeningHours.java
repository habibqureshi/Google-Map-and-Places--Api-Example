
package nearby.habibqureshi.nearby.NearByJsonClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OpeningHours {

    @SerializedName("open_now")
    private Boolean mOpenNow;
    @SerializedName("weekday_text")
    private List<Object> mWeekdayText;

    public Boolean getOpenNow() {
        return mOpenNow;
    }

    public List<Object> getWeekdayText() {
        return mWeekdayText;
    }

    public static class Builder {

        private Boolean mOpenNow;
        private List<Object> mWeekdayText;

        public OpeningHours.Builder withOpenNow(Boolean openNow) {
            mOpenNow = openNow;
            return this;
        }

        public OpeningHours.Builder withWeekdayText(List<Object> weekdayText) {
            mWeekdayText = weekdayText;
            return this;
        }

        public OpeningHours build() {
            OpeningHours OpeningHours = new OpeningHours();
            OpeningHours.mOpenNow = mOpenNow;
            OpeningHours.mWeekdayText = mWeekdayText;
            return OpeningHours;
        }

    }

}
