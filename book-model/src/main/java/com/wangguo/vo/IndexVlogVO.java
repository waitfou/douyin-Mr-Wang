package com.wangguo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IndexVlogVO { // 首页Vlog视图对象，返回给前端用于展示的，就是专门展示视频的。
    private String vlogId;
    private String vlogerId;
    private String vlogerFace;
    private String vlogerName;
    private String content;
    private String url;
    private String cover;
    private Integer width;
    private Integer height;
    private Integer likeCounts;
    private Integer isPrivate;
    private boolean isPlay = false;
    private boolean doIFollowVloger = false;
    private boolean doILikeThisVlog = false;
}
