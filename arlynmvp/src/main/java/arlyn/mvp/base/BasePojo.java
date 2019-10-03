package arlyn.mvp.base;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasePojo implements Parcelable {
    public static final Creator<BasePojo> CREATOR = new Creator<BasePojo>() {
        @Override
        public BasePojo createFromParcel(Parcel in) {
            return new BasePojo(in);
        }

        @Override
        public BasePojo[] newArray(int size) {
            return new BasePojo[size];
        }
    };
    @SerializedName("id")
    @Expose
    protected long id;
    @SerializedName("created_at")
    @Expose
    protected String createdAt;
    @SerializedName("updated_at")
    @Expose
    protected String updatedAt;

    public BasePojo() {
    }

    protected BasePojo(Parcel in) {
        id = in.readInt();
        createdAt = in.readString();
        updatedAt = in.readString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(createdAt);
        dest.writeString(updatedAt);
    }
}
