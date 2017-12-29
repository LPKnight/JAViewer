package io.github.javiewer.adapter.item;

/**
 * Project: JAViewer
 */

public class DataSource extends Linkable {

    public static DataSource AVMO = new DataSource("AVMOO 日本", "https://javdog.com");
    public static DataSource AVSO = new DataSource("AVSOX 日本无码", "https://javpee.com");
    public static DataSource AVXO = new DataSource("AVMEMO 欧美", "https://avxo.pw");


    public String name;

    public DataSource(String name, String baseUrl) {
        this.name = name;
        this.link = baseUrl;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
