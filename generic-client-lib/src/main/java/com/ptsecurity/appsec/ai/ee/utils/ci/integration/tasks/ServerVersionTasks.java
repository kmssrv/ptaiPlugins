package com.ptsecurity.appsec.ai.ee.utils.ci.integration.tasks;

import com.ptsecurity.appsec.ai.ee.ServerCheckResult;
import com.ptsecurity.appsec.ai.ee.utils.ci.integration.exceptions.GenericException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

public interface ServerVersionTasks {
    @Getter
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    enum Component {
        AIC("aic"),
        AIE("aie");

        private final String value;
    }


    Map<Component, String> current() throws GenericException;
    Map<Component, String> latest() throws GenericException;
}
