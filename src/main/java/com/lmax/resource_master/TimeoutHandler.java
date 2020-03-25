package com.lmax.resource_master;

public interface TimeoutHandler
{
    void onTimeout(long sequence) throws Exception;
}
