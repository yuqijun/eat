package com.dijiang.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReExportRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty
    @ApiModelProperty(name = "id",value = "任务导出id编号")
    private String id;

    @ApiModelProperty(name = "parentExportId",value = "父导出任务编号")
    private String parentExportId;


    @NotEmpty
    @ApiModelProperty(name = "applicationId",value = "应用id编号")
    private String applicationId;

    @NotNull(message = "系统名称不能为空")
    @ApiModelProperty(name = "applicationName",value = "应用(系统)名称")
    private String applicationName;

    @NotEmpty
    @ApiModelProperty(name = "modularId",value = "系统模块id编号")
    private String modularId;

    @NotNull(message = "系统模块名称不能为空")
    @ApiModelProperty(name = "modularName",value = "系统模块名称")
    private String modularName;

    @ApiModelProperty(name = "siteCode",value = "网点编号")
    private String siteCode;

    @ApiModelProperty(name = "siteName",value = "网点名称")
    private String siteName;


    @NotEmpty
    @ApiModelProperty(name = "createUserId",value = "创建记录者id编号")
    private String createUserId;


    @ApiModelProperty(name = "userName",value = "用户名称")
    private String userName;

    @NotEmpty
    @ApiModelProperty(name = "updateUserId",value = "修改记录者id编号")
    private String updateUserId;


    @ApiModelProperty(name = "fileId",value = "文件id编号")
    private String fileId;

    @ApiModelProperty(name = "fileName",value = "文件名称")
    private String fileName;

    @ApiModelProperty(name = "fileSize",value = "文件大小")
    private Integer fileSize;


    @NotEmpty
    @ApiModelProperty(name = "csvHeader",value = ".csv文件中文表头")
    private String csvHeader;

    @NotEmpty
    @ApiModelProperty(name = "sqlStatement",value = "执行的sql 语句")
    private String sqlStatement;


    @ApiModelProperty(name = "completionTime",value = "导出任务记录完成时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date completionTime;


    @ApiModelProperty(name = "deleteMark",value = "逻辑删除标记 1：未删除、2已删除")
    private Integer deleteMark;

    @ApiModelProperty(name = "reexportMar",value = "重新导出标记")
    private String reexportMark;

    @ApiModelProperty(name = "remake",value = "文件导出备注")
    private String remake;

    @NotNull
    @ApiModelProperty(name = "exportStatus",value = "任务导出在状态(文件是否成功上传至文件服务器) 0：初始化、 1：导出中 、2：导出完成、 3：导出异常")
    private Integer exportStatus;

    @ApiModelProperty(name = "createTime",value = "导出任务记录创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
}
