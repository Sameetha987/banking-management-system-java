package com.bankapp.dao;

import java.util.List;

public interface AuditLogDao {

    void logEvent(String actorType,
                  String actorId,
                  String action,
                  String status,
                  String message);

    List<String> fetchRecentLogs(int limit);

    List<String> fetchLogsByActor(String actorId);
}
