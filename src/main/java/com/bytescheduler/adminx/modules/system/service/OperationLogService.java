package com.bytescheduler.adminx.modules.system.service;

import org.springframework.data.domain.Page;
import com.bytescheduler.adminx.modules.system.entity.OperationLog;

/**
 * @author byte-scheduler
 * @since 2025/6/8
 */
public interface OperationLogService {

    void save(OperationLog log);

    Page<OperationLog> getLogs(String operator, String module, org.springframework.data.domain.Pageable pageable);
}
