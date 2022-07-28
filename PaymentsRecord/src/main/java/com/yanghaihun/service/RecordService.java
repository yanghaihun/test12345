package com.yanghaihun.service;

import com.yanghaihun.entity.Record;

/**
 * Author: 杨海珲
 * Data:   2022/7/28 1:29 下午
 */
public interface RecordService {

    public void startToLoadData();

    public void continueToLoadData();

    public Record parseOneLineData(String line);

    public String store(Record record);

    public String printRecords();

    public String printRecords(String recordName);
}
