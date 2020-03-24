package com.lmax.resourceMaster;

public interface TimeoutHandler
{
    void onTimeout(long sequence) throws Exception;
}
