
package nearby.habibqureshi.nearby.NearByJsonClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class nearby {

    @SerializedName("html_attributions")
    private List<Object> mHtmlAttributions;
    @SerializedName("next_page_token")
    private String mNextPageToken;
    @SerializedName("results")
    private List<Result> mResults;
    @SerializedName("status")
    private String mStatus;

    public List<Object> getHtmlAttributions() {
        return mHtmlAttributions;
    }

    public String getNextPageToken() {
        return mNextPageToken;
    }

    public List<Result> getResults() {
        return mResults;
    }

    public String getStatus() {
        return mStatus;
    }

    public static class Builder {

        private List<Object> mHtmlAttributions;
        private String mNextPageToken;
        private List<Result> mResults;
        private String mStatus;

        public nearby.Builder withHtmlAttributions(List<Object> htmlAttributions) {
            mHtmlAttributions = htmlAttributions;
            return this;
        }

        public nearby.Builder withNextPageToken(String nextPageToken) {
            mNextPageToken = nextPageToken;
            return this;
        }

        public nearby.Builder withResults(List<Result> results) {
            mResults = results;
            return this;
        }

        public nearby.Builder withStatus(String status) {
            mStatus = status;
            return this;
        }

        public nearby build() {
            nearby nearby = new nearby();
            nearby.mHtmlAttributions = mHtmlAttributions;
            nearby.mNextPageToken = mNextPageToken;
            nearby.mResults = mResults;
            nearby.mStatus = mStatus;
            return nearby;
        }

    }

}
