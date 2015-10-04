package org.apache.lucene.demo;

import org.apache.lucene.queryparser.classic.ParseException;

import java.io.IOException;

/**
 * Created by chintoo on 10/4/15.
 */
public interface DocsSearcher {
    void search() throws IOException, ParseException;
}
