package com.nfmedia.carshop.entries;

/**
 * Description
 * <p>  商品附属类
 * Author rabbit.
 * Datetime 2017/2/28.
 */
public class Part {
    private String id;
    private String partName;

    public Part() {
    }

    public Part(String id, String partName) {
        this.id = id;
        this.partName = partName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", partName='" + partName + '\'' +
                '}';
    }
}
