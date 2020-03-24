package com.lmax.resourceMaster;

public interface BatchStartAware
{
    void onBatchStart(long batchSize);
}
