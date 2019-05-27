package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @Author: LiuJinLong   liukc747@163.com
 * @Date: 2019/5/27 0027 下午 9:36
 */
public interface CmsPageControllerApi {
    //页面查询
    public QueryResponseResult findList(Integer page, Integer size, QueryPageRequest queryPageRequest);
}
