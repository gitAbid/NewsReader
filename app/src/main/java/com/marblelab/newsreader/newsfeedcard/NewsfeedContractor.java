package com.marblelab.newsreader.newsfeedcard;

import java.util.List;

/**
 * Created by Abid Hasan on 5/10/2017.
 */

public interface NewsfeedContractor {

    public void parseData();
    public List getData();
    public void addToList();
    public void checkForUpdate();
    public void publish();
}
