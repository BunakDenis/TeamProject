package cityName;

public class CityName {
    long level_1;
    long level_2;
    long level_3;
    String level_4;
    String object_category;
    String object_name;
    long object_code;
    String region;
    String community;

    public CityName(long level_1, long level_2, long level_3, String level_4, String object_category, String object_name, long object_code, String region, String community) {
        this.level_1 = level_1;
        this.level_2 = level_2;
        this.level_3 = level_3;
        this.level_4 = level_4;
        this.object_category = object_category;
        this.object_name = object_name;
        this.object_code = object_code;
        this.region = region;
        this.community = community;
    }

    public long getLevel_1() {
        return level_1;
    }

    public void setLevel_1(long level_1) {
        this.level_1 = level_1;
    }

    public long getLevel_2() {
        return level_2;
    }

    public void setLevel_2(long level_2) {
        this.level_2 = level_2;
    }

    public long getLevel_3() {
        return level_3;
    }

    public void setLevel_3(long level_3) {
        this.level_3 = level_3;
    }

    public String getLevel_4() {
        return level_4;
    }

    public void setLevel_4(String level_4) {
        this.level_4 = level_4;
    }

    public String getObject_category() {
        return object_category;
    }

    public void setObject_category(String object_category) {
        this.object_category = object_category;
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name;
    }

    public long getObject_code() {
        return object_code;
    }

    public void setObject_code(long object_code) {
        this.object_code = object_code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    @Override
    public String toString() {
        return "CityName{" +
                "object_name='" + object_name + '\'' +
                '}';
    }
}
