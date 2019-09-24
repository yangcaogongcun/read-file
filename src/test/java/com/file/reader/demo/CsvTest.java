package com.file.reader.demo;

import com.file.reader.demo.csv.CsvReadFileService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangjian
 * @version ： 1.0.0
 * @date 2019-09-24 11:43
 */
public class CsvTest extends BaseTest {

    @Autowired
    private CsvReadFileService csvReadFileService;

    @Test
    public void test() {
        csvReadFileService.print();
    }
}
