package com.marblelab.newsreader.newsfeedcard;

import java.util.List;

/**
 * Created by Abid Hasan on 5/10/2017.
 */

public interface NewsfeedContractor {

    void parseData();
    List getData();
    void addToList();
    void checkForUpdate();
    void publish();
}
