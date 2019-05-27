package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: LiuJinLong   liukc747@163.com
 * @Date: 2019/5/27 0027 下午 9:28
 */
@Data
@ToString
public class QueryPageRequest extends RequestData implements Serializable{
    //接收页面查询的查询条件
    //站点id
    private String siteId;
    //页面id
    private String pageId;
    //页面名字
    private String pageName;
    //别名
    private String pageAliase;
    //模板id
    private String templateId;

}
