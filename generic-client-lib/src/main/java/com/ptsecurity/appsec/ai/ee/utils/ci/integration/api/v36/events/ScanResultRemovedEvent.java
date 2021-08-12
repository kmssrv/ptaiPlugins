package com.ptsecurity.appsec.ai.ee.utils.ci.integration.api.v36.events;

import com.ptsecurity.appsec.ai.ee.server.v36.projectmanagement.model.ScanProgress;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class ScanResultRemovedEvent {
    protected UUID scanResultId;
    protected UUID projectId;
    protected Boolean deleteGroup;
}
