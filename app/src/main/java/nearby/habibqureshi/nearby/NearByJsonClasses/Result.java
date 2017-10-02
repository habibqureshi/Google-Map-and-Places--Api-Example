
package nearby.habibqureshi.nearby.NearByJsonClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Result {

    @SerializedName("geometry")
    private Geometry mGeometry;
    @SerializedName("icon")
    private String mIcon;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("opening_hours")
    private OpeningHours mOpeningHours;
    @SerializedName("photos")
    private List<Photo> mPhotos;
    @SerializedName("place_id")
    private String mPlaceId;
    @SerializedName("rating")
    private double mRating;
    @SerializedName("reference")
    private String mReference;
    @SerializedName("scope")
    private String mScope;
    @SerializedName("types")
    private List<String> mTypes;
    @SerializedName("vicinity")
    private String mVicinity;

    public Geometry getGeometry() {
        return mGeometry;
    }

    public String getIcon() {
        return mIcon;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public OpeningHours getOpeningHours() {
        return mOpeningHours;
    }

    public List<Photo> getPhotos() {
        return mPhotos;
    }

    public String getPlaceId() {
        return mPlaceId;
    }

    public double getRating() {
        return mRating;
    }

    public String getReference() {
        return mReference;
    }

    public String getScope() {
        return mScope;
    }

    public List<String> getTypes() {
        return mTypes;
    }

    public String getVicinity() {
        return mVicinity;
    }

    public static class Builder {

        private Geometry mGeometry;
        private String mIcon;
        private String mId;
        private String mName;
        private OpeningHours mOpeningHours;
        private List<Photo> mPhotos;
        private String mPlaceId;
        private double mRating;
        private String mReference;
        private String mScope;
        private List<String> mTypes;
        private String mVicinity;

        public Result.Builder withGeometry(Geometry geometry) {
            mGeometry = geometry;
            return this;
        }

        public Result.Builder withIcon(String icon) {
            mIcon = icon;
            return this;
        }

        public Result.Builder withId(String id) {
            mId = id;
            return this;
        }

        public Result.Builder withName(String name) {
            mName = name;
            return this;
        }

        public Result.Builder withOpeningHours(OpeningHours openingHours) {
            mOpeningHours = openingHours;
            return this;
        }

        public Result.Builder withPhotos(List<Photo> photos) {
            mPhotos = photos;
            return this;
        }

        public Result.Builder withPlaceId(String placeId) {
            mPlaceId = placeId;
            return this;
        }

        public Result.Builder withRating(double rating) {
            mRating = rating;
            return this;
        }

        public Result.Builder withReference(String reference) {
            mReference = reference;
            return this;
        }

        public Result.Builder withScope(String scope) {
            mScope = scope;
            return this;
        }

        public Result.Builder withTypes(List<String> types) {
            mTypes = types;
            return this;
        }

        public Result.Builder withVicinity(String vicinity) {
            mVicinity = vicinity;
            return this;
        }

        public Result build() {
            Result Result = new Result();
            Result.mGeometry = mGeometry;
            Result.mIcon = mIcon;
            Result.mId = mId;
            Result.mName = mName;
            Result.mOpeningHours = mOpeningHours;
            Result.mPhotos = mPhotos;
            Result.mPlaceId = mPlaceId;
            Result.mRating = mRating;
            Result.mReference = mReference;
            Result.mScope = mScope;
            Result.mTypes = mTypes;
            Result.mVicinity = mVicinity;
            return Result;
        }

    }

}
