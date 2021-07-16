package com.sample.controller;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeMultiLoadRunner;
import org.junit.runner.RunWith;

/**
 * Class for launch load testing.
 */
@LoadWith("load_testing.properties")
@TestMapping(testClass = ClientTest.class, testMethod = "testGetClientAndUpdateOk")
@RunWith(ZeroCodeMultiLoadRunner.class)
public class LoadClientTest {
}