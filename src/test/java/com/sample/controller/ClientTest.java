package com.sample.controller;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("zerocode.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class ClientTest {
    @Test
    @Scenario("example/get_client_ok.json")
    public void testGetClientOk() {
    }

    @Test
    @Scenario("example/get_client_error.json")
    public void testGetClientError() {
    }

    @Test
    @Scenario("example/get_client_and_update_ok.json")
    public void testGetClientAndUpdateOk() {
    }

    @Test
    @Scenario("example/get_client_ok_parameterized.json")
    public void testGetClientOkParameterized() {
    }
}