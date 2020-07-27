package com.alibaba.excel.event;

import java.util.Map;

public interface FillVariableValueResolver {

    Object resolveValue(String variable, Map<String, Object> context);

}
