package com.Graph;

/**
 * Created by binay on 7/19/16.
 */
public class Vertex {
    int content;
    boolean initialized;
    public Vertex()
    {
        this.initialized=false;
    }
    public void setContent(int c)
    {
        this.content=c;

    }
    public boolean isInitialized()
    {
        return this.initialized;
    }

    public void setInitialized()
    {
        this.initialized=true;
    }
}
