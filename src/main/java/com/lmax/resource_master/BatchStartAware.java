package com.lmax.resource_master;

public interface BatchStartAware
{
    void onBatchStart(long batchSize);
}
