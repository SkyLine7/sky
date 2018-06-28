package com.panda.sky.util;

/**
 * 
 * ClassName: 常量定义
 * Function: TODO ADD FUNCTION.
 * date: 2017年3月4日 下午1:11:25
 *
 * @author zhao rui
 * @version
 */
public class Constants {
	//用户登录类型（1.app 2.web）
	public static class userLoginType {
		public static final int APPUSER = 1;
		public static final int WEBUSER = 2;
	}
	
	//用户性别
	public static class userSex{
		public static final String MALE = "男";
		public static final String FEMALE = "女";
	}
	
	//性别(B001:男 B002:女)
	public static class userSexCode {
		public static final String MALE = "B001";   //男
		public static final String FEMALE = "B002"; //女
	}
	
	//默认图片地址
	public static class defalutImgUrl {
		public static final String MALE = "http://zjfs2017.oss-cn-shanghai.aliyuncs.com/product/avatar/avatar201704201453231.jpg";   //B001:男
		public static final String FEMALE = "http://zjfs2017.oss-cn-shanghai.aliyuncs.com/product/avatar/avatar201704201453232.jpg"; //B002:女
		public static final String PROJECT = "http://zjfs2017.oss-cn-shanghai.aliyuncs.com/product/company/project20170420001.jpg";  //项目默认图片
		public static final String WKR_CREATOR_AVATAR = "http://zjfs2017.oss-cn-shanghai.aliyuncs.com/product/avatar/wkr_defalut.jpg"; //安全上报默认头像
		public static final String REPORT = "http://zjfs2017.oss-cn-shanghai.aliyuncs.com/product/report"; //表报路径
	}
	
	//是否已读取(0:未读取 1:读取)
	public static class worktaskReadStatus {
		public static final int UN_READ  = 0; // 0:未读取
		public static final int HAVE_READ = 1; // 1:读取
	}
	
	//确认状态标识(0:未确认 1:已确认),当点击确认按钮后更新该字段为确认
	public static class confirmStatus {
		public static final int UN_CONFIRM  = 0; //0:未确认
		public static final int CONFIRMED = 1;   //1:已确认
	}
	
	//有效状态标识(0:可用 1:删除)
	public static class effectiveStatus {
		public static final int AVAILABLE  = 0; // 0:可用
		public static final int DELETE = 1;     // 1:删除
	}
	
	//是否有权限(0:无权限 1:有权限)
	public static class isHasAuthCode {
		public static final int NO = 0;  // 0:无权限
		public static final int YES = 1; // 1:有权限
	}
	
	//是否启用(0:启用 1:不启用)
	public static class isVisibleStatus {
		public static final int VISIBLE = 0;   // 0:启用
		public static final int INVISIBLE = 1; // 1:不启用
	}
	
	//是否有日期目录(0:否 1:是 eg:2017010)
	public static class isDateFolder {
		public static final int NO = 0;  //0:否
		public static final int YES = 1; //1:是
	}
	
	//是否公司工程部门(0:否 1:是)
	public static class isCompanyEnginDeptFolder {
		public static final int NO = 0;  //0:否
		public static final int YES = 1; //1:是
	}
	
	//处理状态(0:未处理 1:已解决 2:删除)
	public static class userFeedbackProcessStatus {
		public static final int UNTREATED  = 0; // 0:未处理
		public static final int RESOLVED = 1;   // 1:已解决
		public static final int DELETE = 2;     // 2:删除
	}
	
	//确认状态标识(0:未确认 1:确认),当点击确认按钮后更新该字段为确认
	public static class userFeedbackConfirmStatus {
		public static final int UN_CONFIRME  = 0; // 0:未确认
		public static final int CONFIRMED = 1;    // 1:已确认
	}
	
	//物资验收状态(0:未验收 1:验收通过 2:验收未通过)
	public static class materialVefFeedbackVefResultStatus {
		public static final int UN_VEF  = 0; // 0:未验收
		public static final int PASS = 1;    // 1:验收通过
		public static final int FAIL = 2;    // 2:验收未通过
	}
	
	//任务所处区域码(1:待办 2:在办 3:已办)
	public static class worktaskAreaCode {
		public static final int AREACODE_1  = 1; // 1:待办
		public static final int AREACODE_2 = 2;  // 2:在办
		public static final int AREACODE_3 = 3;  // 3:已办
		public static final int AREACODE_4 = 4;  // 4:常规
	}
	
	//页面类型(1:公司页面 2:项目页面 3:任务页面 4:个人设置页面)
	public static class pageType {
		public static final int COMPANY = 1;    // 1:公司页面
		public static final int PROJECT = 2;    // 2:项目页面
		public static final int WORKTASK = 3;   // 3:任务页面
		public static final int PERSONAL = 4;   // 4:个人设置页面
	}
	
	//是否显示(0:不显示 1:显示) / 是否可用(0:可用 1:禁用)
	public static class appPageAuth {
		public static final int NO = 0;    // 1:公司页面
		public static final int YES = 1;    // 2:项目页面
	}
	
	//完成步骤(1:刚创建 2:配置项目人员 3:配置查看和审核项目权限 4:完成项目配置)
	public static class projectFinishStep {
		public static final String CREATED = "1";                     // 1:刚创建
		public static final String SET_PROJECT_USER = "2";            // 2:配置项目人员
		public static final String SET_PROJECT_AUTH = "3";            // 3:配置查看和审核项目权限
		public static final String SET_PROJECT_FIRST_PLAN = "4";      // 4:配置项目一级进度
		public static final String SET_PROJECT_SUBCONTRACT = "5";     // 5:配置项目分包公司和人员
		public static final String SET_PROJECT_SUPPLIER = "6";        // 6:配置项目供应商
		public static final String FINISHED = "7";                    // 7:完成项目配置
	}
	
	//0:未删除 1:删除(任务状态为删除时标识1)
	public static class worktaskDeleteFlag {
		public static final int NOT_DELETE  = 0; // 0:未删除
		public static final int DELETED = 1;     // 1:删除(任务状态为删除时标识1)
	}
	
	//状态标识(0:未完成 1:已完成)
	public static class finishStatus {
		public static final int UN_FINISH = 0; // 0:未完成
		public static final int FINISHED = 1;  // 1:已完成
	}
	
	//接受单位类型(1:项目部门 2:分包公司)
	public static class acceptCompanyType {
		public static final int PROJECT_DEPTMENT = 1;      //1:项目部门 
		public static final int SUBCONTRACT = 2;           //2:分包公司
	}
	
	//是否可编辑(0.不可编辑 1.可编辑)
	public static class worktaskFieldAuthIsEdit {
		public static final int NOT_EDIT = 0;      //0:不可编辑
		public static final int EDIT = 1;          //1:可编辑
	}
	
	//评论等级(1:高 2:中 3:低)
	public static class worktaskCommentGrade {
		public static final int HIGH  = 1;   // 1:高
		public static final int MIDDLE  = 2; // 2:中
		public static final int LOW = 3;     // 3:低
	}
	
	//文件类型(1.图片 2.视频 3.语音)
	public static class fileType {
		public static final String IMAGE = "1";   // 1.图片
		public static final String VIDEO  = "2";  // 2.视频
		public static final String VOICE = "3";   // 3.语音
	}
	
	//过滤文件类型(1.图片/视频  2.语音)
	public static class filterFileType {
		public static final int IMAGE_AND_VIDEO = 1;   // 1.图片/视频
		public static final int VOICE  = 2;            // 2.语音
	}
	
	//二级进度完整度(0:不完整/ 1:完整)
	public static class planSecondCompleteStatus {
		public static final int NOT_COMPLETE = 0;  // 0:不完整
		public static final int COMPLETED  = 1;    // 1:完整
	}
	
	//二级进度显示颜色定义
	public static class planSecondDisplayColor {
		public static final String DEFALUT = "";                 // 默认值为空(没有值/仅灰色底)
		public static final String GREEN = "#3fbe45";            // 绿色
		public static final String REDDISH_BROWN = "#fa6035";    // 红棕色
		public static final String STANDARD = "#2A2A2A";         // 标准
	}
	
	//状态标识(1:正在使用中的版本 2:已停止使用的版本)
	public static class appVersionStatus {
		public static final int USEING = 1; // 1:未读取
		public static final int STOP = 2;   // 2:已停止使用的版本
	}
	
	//二级进度显示文本
	public static class planSecondDisplayText {
		public static final String DEFALUT = "";               //默认值为空
		public static final String NOT_START = "尚未开始";       //尚未开始
		public static final String FINISHED = "已完成";          //已完成
		public static final String DOING  = "正在进行";          //正在进行
		public static final String EARLY_START  = "提前开始";    //提前开始
		public static final String EARLY_FINISH  = "提前完成";   //提前完成
		public static final String ON_TIME_START  = "按时开始";  //按时开始
		public static final String ON_TIME_FINISH  = "按时完成"; //按时完成
		public static final String HAVED_DELAY  = "已经延期";    //已经延期
		public static final String DELAY_START  = "延期开始";    //延期开始
		public static final String DELAY_FINISH  = "延期完成";   //延期完成
	}
	
	//项目完成状态项目完成状态(0:未开始 1:进行中  2:延期结束 3:正常结束)
	public static class projectFinishStatus {
		public static final int NOT_START = 0;  // 0:未开始
		public static final int DOING = 1;      // 1:进行中
		public static final int DELAY_END = 2;  // 2:延期结束
		public static final int NORMAL_END = 3; // 3:正常结束
	}
	
	//项目进度完成情况(0:按计划完成 1:未按计划完成)
	public static class projectPlanFinishStatus {
		public static final String PLAN_FINISHED = "0";     // 0:按计划完成
		public static final String NOT_PLAN_FINISHED = "1"; //1:未按计划完成
	}
	
	//用户类型(用户类型(1.系统管理员 2.公司管理员 3.分公司管理员 4.项目管理员 5.属于公司员工 6.属于分公司员工 7.属于公司项目员工 8.属于分包公司员工))
	public static class userType {
		public static final int DEFALUT = 0;              // 0.默认
		public static final int SYS_ADMIN = 1;            // 1.系统管理员
		public static final int COMPANY_ADMIN = 2;        // 2.公司管理员
		public static final int BRA_COMPANY_ADMIN = 3;    // 3.分公司管理员
		public static final int PROJECT_ADMIN = 4;        // 4.项目管理员
		public static final int COMPANY = 5;              // 5.属于公司员工
		public static final int BRA_COMPANY = 6;          // 6.属于分公司员工
		public static final int PROJECT = 7;              // 7.属于公司项目员工
		public static final int SUBCONTRACT_COMPANY = 8;  // 8.属于分包公司员工
	}
	
	//部门类型(1:公司部门 2:分公司部门 3:项目部门 4:分包公司部门)
	public static class departmentType {
		public static final int COMPANY = 1;              // 1.公司部门
		public static final int BRA_COMPANY = 2;          // 2.分公司部门 
		public static final int PROJECT = 3;              // 3.项目部门
		public static final int SUBCONTRACT_COMPANY = 4;  // 4.分包公司部门
	}
	
	//安全上报任务状态 1:等待确认 2：隐患被确认 3：隐患被忽略 4:隐患未解决 5:隐患已解决
	public static class safetyReportStatus {
		public static final int WAIT_CONFIRMATION = 1;     // 1.等待确认
		public static final int CONFIRMED  = 2;            // 2.隐患被确认
		public static final int IGNORE  = 3;               // 3.隐患被忽略
		public static final int UNRESOLVED  = 4;           // 4.隐患未解决
		public static final int RESOLVED  = 5;             // 5.隐患已解决
	}
	
	//角色类型(1:系统(超级管理员) 2:公司 3:分公司  4:项目  5:分包公司角色)
	public static class roleType {
		public static final int SYSTEM  = 1;             //1:系统
		public static final int COMPANY  = 2;            //2:公司
		public static final int BRA_COMPANY = 3;         //3:分公司
		public static final int PROJECT = 4;             //4:项目
		public static final int SUBCONTRACT_COMPANY = 5; //5:分包公司角色
	}
	
	//角色类型(1:系统(超级管理员) 2:公司 3:分公司  4:项目  5:分包公司角色)
	public static class roleTypeName {
		public static final String SYSTEM  = "系统";                   //1:系统
		public static final String COMPANY  = "公司";                  //2:公司
		public static final String BRA_COMPANY = "分公司";             //3:分公司
		public static final String PROJECT = "项目";                   //4:项目
		public static final String SUBCONTRACT_COMPANY = "分包公司";    //5:分包公司
	}
	
	//是否特殊角色(0:不是特殊角色 1:特殊角色 (如补充验收任务(列席参与人(商务经理)/审核人/审批人)))
	public static class materialVefIsSpecRole {
		public static final int NO  = 0; //0:不是特殊角色
		public static final int YES = 1; //1:特殊角色 (如补充验收任务(列席参与人(商务经理)/审核人/审批人)))
	}
	
	//登录用户是否参与子任务中(0:不参与 / 1:参与  任务详细列表中显示)
	public static class loginUserIsInSubCmm {
		public static final int NOT_IN = 0;  //0:不参与
		public static final int IN = 1;      //1:参与
	}
	
	//0:不是系统管理员  1:是系统管理员
	public static class isSystemManger {
		public static final int NO = 0;   //0:不是系统管理员
		public static final int YES = 1;  //1:是系统管理员
	}
	
	//0:不是总工  1:是总工
	public static class isCeUser {
		public static final int NO = 0;   //0:不是总工
		public static final int YES = 1;  //1:是总工
	}
	
	//工程管理部经理(CR1005)和上报人才有权限看到任务创建人姓名 (0:显示(******) 1:显示姓名)
	public static class loginUserHasAuthDisplayCreatorName {
		public static final int NO = 0;   //0:显示(******)
		public static final int YES = 1;  //1:显示姓名
	}
	
	//是否子公司(0:否 1:是)
	public static class isSubCompany {
		public static final int NO = 0;   //0:否
		public static final int YES = 1;  //1:是
	}
	
	//项目计划颜色状态(0:绿色  1:黄色  2:红色 3:灰色)
	public static class planColorState {
		public static final int GREEN  = 0;   //0:绿色
		public static final int YELLOW  = 1;  //1:黄色 
		public static final int RED = 2;      //2:红色
		public static final int GRAY = 3;     //3:灰色
	}
	
	//物资类型(0:大类 1:中类 2:小类)
	public static class materialTypeFlag {
		public static final int BIG  = 0;   //0:大类
		public static final int MID  = 1;   //1:中类 
		public static final int SUB = 2;    //2:小类
	}
	
	//系统报表文件类型(1.任务表报 2.项目二级计划表报 3.项目二级计划表报 4.日表报 5.周报表 6.月报表)
	public static class reportFileType {
		public static final int WORKTASK  = 1;           //1.任务表报
		public static final int PROJECT_FIRST_PLAN = 2;  //2.项目一级计划表报
		public static final int PROJECT_SECOND_PLAN = 3; //3.项目二级计划表报
		public static final int DAY = 4;                 //4.日表报
		public static final int WEEK = 5;                //5.周报表
		public static final int MONTH = 6;               //6.周报表
	}
	
	//系统报表文件操作类型(1:查看 2:下载 3:打印)
	public static class reportFileOptType {
		public static final int VIEW  = 1;    //1:查看
		public static final int DOWNLOAD = 2; //2:下载
		public static final int PRINT = 3;    //3:打印
	}
	
	//任务的最上级默认值为0
	public static final int WORKTASK_PARENT_DEFAULT_VALUE = 0;
	
	//表中定义父级节点最上级默认值为0
	public static final String TABLE_PARENT_DEFAULT_VALUE = "0";
	
	//表中定义级默认值为1000
	public static final String TABLE_WORKTASK_CODE_SUFFIX_DEFAULT_VALUE = "1000";
	
	//表中定义级默认值为0
	public static final int TABLE_DEFAULT_VALUE = 0;
	
	//默认String
	public static final String DEFAULT_VALUE = "0";
	
	//是否任务创建者(0:否 1:是) 发起角色
	public static final int IS_WORKTASK_CREATOR = 1; 
	
	//子任务编号
	public static final String SUB_WORKTASK_CODE_IN_SYMBOL = "S";
	
	//分页配置(默认第一页)
	public static final String PAGE_INDEX_VALUE = "0";
	//默认一页10条记录
	public static final String PAGE_SIZE_DEFALUT_VALUE = "10";
	
	//已完成进度默认值
	public static final int COMPLETED_PRECENT_DEFALUT_VALUE = 1;
	
	//对于整改通知(发起人和自检同一个人)时: 附件表任务状态为0标识发起时上传的附件,任务状态为其他时说明自检传时上附件)
	public static final String SAFETY_NOTIFY_FILE_TYPE_USER_FLAG = "0";
	
	//通用任务截止时间必须必开始时间大于1一个小时以上
	public static final double WORKTASK_DEADLINE_START_TIME_DIFF_HOURS = 1.0;
	public static final double WORKTASK_DEADLINE_START_TIME_DIFF_HALF_HOURS = 0.5;
	
	//字段权限编码默认值FA1000
	public static final String WORKTASK_FIELD_AUTH_CODEL_DEFALUT_VALUE = "FA1000";
	
	//项目一级进度已延期
	public static final String PROJECT_SCHEDULE_DELAY_TEXT = "已延期";
	
	//任务开始时间
	public static final String WORKTASK_FIELD_FIELD_CODE_PLAN_START_TIME = "planStartTime";
	
	//系统角色
	public static class sysRoleCode {
		//查看角色
		public static final String ROLE_CODE_VRR0001 = "VRR0001"; //查看任务角色
		//系统超级管理员
		public static final String ROLE_CODE_SA1000 = "SA1000";//系统管理员
		//公司管理员
		public static final String ROLE_CODE_CA1000 = "CA1000";//公司管理员
		//分公司管理员
		public static final String ROLE_CODE_BA1000 = "BA1000";//分公司管理员
		//项目管理员
		public static final String ROLE_CODE_PA1000 = "PA1000";//项目管理员
		//单位负责人
		public static final String ROLE_CODE_SR1001 = "SR1001";//单位负责人
		//经理
		public static final String ROLE_CODE_SR1002 = "SR1002";//经理
		//专业工程师
		public static final String ROLE_CODE_SR1003 = "SR1003";//专业工程师	
	}
	
	//项目消息标题
	public static final String PROJECT_MESSAGE_TITLE = "您有新的项目消息请查收";
	
	//项目角色Code
	public static class projectRoleCode {
		public static final String ROLE_CODE_PA1000 = "PA1000"; //项目管理员		
		public static final String ROLE_CODE_PR1001 = "PR1001"; //项目经理(项目)
		public static final String ROLE_CODE_PR1002 = "PR1002"; //执行经理(项目)
		public static final String ROLE_CODE_PR1003 = "PR1003"; //党组织书记(项目)
		public static final String ROLE_CODE_PR1004 = "PR1004"; //总工程师(项目)
		public static final String ROLE_CODE_PR1005 = "PR1005"; //生产经理(项目)
		public static final String ROLE_CODE_PR1006 = "PR1006"; //商务经理(项目)
		public static final String ROLE_CODE_PR1007 = "PR1007"; //机电经理(项目)
		public static final String ROLE_CODE_PR1008 = "PR1008"; //安全总监
		public static final String ROLE_CODE_PR1009 = "PR1009"; //质量总监(项目)
		public static final String ROLE_CODE_PR1011 = "PR1011"; //经理(项目)
		public static final String ROLE_CODE_PR1012 = "PR1012"; //副经理经理(项目)
		public static final String ROLE_CODE_PR1025 = "PR1025"; //专业工程师
		public static final String ROLE_CODE_PR1029 = "PR1029"; //采购工程师
		public static final String ROLE_CODE_PR1030 = "PR1030"; //材料工程师
		public static final String ROLE_CODE_PR1031 = "PR1031"; //设备工程师
	}
	
	//项目部门Code
	public static class projectDepartmentCode {
		public static final String DEPARTMENT_CODE_PD1001 = "PD1001"; //项目领导
		public static final String DEPARTMENT_CODE_PD1002 = "PD1002"; //综合办公室
		public static final String DEPARTMENT_CODE_PD1003 = "PD1003"; //财务部
		public static final String DEPARTMENT_CODE_PD1004 = "PD1004"; //机电部
		public static final String DEPARTMENT_CODE_PD1005 = "PD1005"; //设计技术部
		public static final String DEPARTMENT_CODE_PD1006 = "PD1006"; //质量部
		public static final String DEPARTMENT_CODE_PD1007 = "PD1007"; //工程部
		public static final String DEPARTMENT_CODE_PD1008 = "PD1008"; //物资设备部
		public static final String DEPARTMENT_CODE_PD1009 = "PD1009"; //商务部
		public static final String DEPARTMENT_CODE_PD1010 = "PD1010"; //安全部
	}
	
	//公司角色Code
	public static class companyRoleCode {
		public static final String ROLE_CODE_CA1000 = "CA1000"; //公司管理员
		public static final String ROLE_CODE_CR1001 = "CR1001"; //公司董事长
		public static final String ROLE_CODE_CR1002 = "CR1002"; //公司总经理
		public static final String ROLE_CODE_CR1003 = "CR1003"; //公司副总经理
		public static final String ROLE_CODE_CR1005 = "CR1005"; //总工程师
		public static final String ROLE_CODE_CR1006 = "CR1006"; //总经济师
		public static final String ROLE_CODE_CR1007 = "CR1007"; //总会计师
		public static final String ROLE_CODE_CR1016 = "CR1016"; //部门经理(CR1016)
	}
	
	//分公司角色Code
	public static class subCompanyRoleCode{
		public static final String ROLE_CODE_BA1000 = "BA1000";//分公司管理员
		public static final String ROLE_CODE_BR1004 = "BR1004";//总工程师
		public static final String ROLE_CODE_BR1005 = "BR1005";//总经济师
		public static final String ROLE_CODE_BR1009 = "BR1009";//副总工程师
		public static final String ROLE_CODE_BR1012 = "BR1012";//安全总监
		public static final String ROLE_CODE_BR1013 = "BR1013";//质量总监
		public static final String ROLE_CODE_BR1014 = "BR1014";//办公室主任
		public static final String ROLE_CODE_BR1015 = "BR1015";//部门经理
	}
	
	//公司部门Code
	public static class companyDepartmentCode {
		public static final String DEPARTMENT_CODE_CD1001 = "CD1001"; //公司领导部门(CD1001)
		public static final String DEPARTMENT_CODE_CD1002 = "CD1002"; //总经理助理部门
		public static final String DEPARTMENT_CODE_CD1003 = "CD1003"; //副总师
		public static final String DEPARTMENT_CODE_CD1008 = "CD1008"; //工程管理部(CD1008)
		public static final String DEPARTMENT_CODE_CD1009 = "CD1009"; //安全生产管理部
		public static final String DEPARTMENT_CODE_CD1010 = "CD1010"; //采购管理部
		public static final String DEPARTMENT_CODE_CD1011 = "CD1011"; //商务管理部
		public static final String DEPARTMENT_CODE_CD1012 = "CD1012"; //合约法务部
		public static final String DEPARTMENT_CODE_CD1015 = "CD1015"; //科技部
		public static final String DEPARTMENT_CODE_CD1020 = "CD1020"; //设计管理部
		public static final String DEPARTMENT_CODE_CD1022 = "CD1022"; //基础设施管理部
	}
	
	//分公司部门code
	public static class subCompanyDepartmentCode{
		public static final String DEPARTMENT_CODE_BD1001 = "BD1001";//分公司领导
		public static final String DEPARTMENT_CODE_BD1002 = "BD1002";//副总师
		public static final String DEPARTMENT_CODE_BD1003 = "BD1003";//综合办公室
		public static final String DEPARTMENT_CODE_BD1004 = "BD1004";//市场部
		public static final String DEPARTMENT_CODE_BD1005 = "BD1005";//商务管理部
		public static final String DEPARTMENT_CODE_BD1006 = "BD1006";//财务管理部
		public static final String DEPARTMENT_CODE_BD1007 = "BD1007";//施工管理部
		public static final String DEPARTMENT_CODE_BD1008 = "BD1008";//物资设备部
		public static final String DEPARTMENT_CODE_BD1009 = "BD1009";//设计管理部
	}
	
	//分包公司角色code
	public static class subcontractRoleCode{
		public static final String SUBCONTRACT_ROLE_CODE_SR1001 = "SR1001";//分包公司负责人
	}
	
	//通用任务角色Code
	public static class commonRoleCode {
		public static final String ROLE_CODE_CMMR001 = "CMMR001"; //发起人
		public static final String ROLE_CODE_CMMR002 = "CMMR002"; //负责人
		public static final String ROLE_CODE_CMMR003 = "CMMR003"; //参与人
		public static final String ROLE_CODE_CMMR004 = "CMMR004"; //审核人
		public static final String ROLE_CODE_CMMR005 = "CMMR005"; //审批人
		public static final String ROLE_CODE_CMMR006 = "CMMR006"; //发起人/负责人
		public static final String ROLE_CODE_CMMR007 = "CMMR007"; //发起人/审核人
		public static final String ROLE_CODE_CMMR008 = "CMMR008"; //发起人/审批人
	}
	
	//安全上报任务角色Code
	public static class safetyReportRoleCode {
		public static final String ROLE_CODE_AQRR001 = "AQRR001"; //发起人
		public static final String ROLE_CODE_AQRR002 = "AQRR002"; //负责人
		public static final String ROLE_CODE_AQRR003 = "AQRR003"; //参与人
	}
	
	//安全整改通知角色Code
	public static class safetyNotifyRoleCode {
		public static final String ROLE_CODE_AQNR001 = "AQNR001"; //发起人
		public static final String ROLE_CODE_AQNR002 = "AQNR002"; //接收人
		public static final String ROLE_CODE_AQNR003 = "AQNR003"; //自检人
		public static final String ROLE_CODE_AQNR004 = "AQNR004"; //验证人
		public static final String ROLE_CODE_AQNR005 = "AQNR005"; //发起人/验证人
		public static final String ROLE_CODE_AQNR006 = "AQNR006"; //接收人/自检人
	}
	
	//质量整改通知角色Code
	public static class qualityNotifyRoleCode {
		public static final String ROLE_CODE_ZLNR001 = "ZLNR001"; //发起人
		public static final String ROLE_CODE_ZLNR002 = "ZLNR002"; //接收人
		public static final String ROLE_CODE_ZLNR003 = "ZLNR003"; //自检人
		public static final String ROLE_CODE_ZLNR004 = "ZLNR004"; //验证人
		public static final String ROLE_CODE_ZLNR005 = "ZLNR005"; //发起人/验证人
		public static final String ROLE_CODE_ZLNR006 = "ZLNR006"; //接收人/自检人
	}
	
	//物资需用角色Code
	public static class materialReqRoleCode {
		public static final String ROLE_CODE_WZRR001 = "WZRR001"; //发起人
		public static final String ROLE_CODE_WZRR002 = "WZRR002"; //参与人(商务部)
		public static final String ROLE_CODE_WZRR003 = "WZRR003"; //参与人(物资设备部)
		public static final String ROLE_CODE_WZRR004 = "WZRR004"; //审核人
		public static final String ROLE_CODE_WZRR005 = "WZRR005"; //审批人
	}
	
	//物资进场验收角色Code
	public static class materialVefRoleCode {
		public static final String ROLE_CODE_WZVR001 = "WZVR001"; //发起人
		public static final String ROLE_CODE_WZVR002 = "WZVR002"; //材料负责人
		public static final String ROLE_CODE_WZVR003 = "WZVR003"; //专业工程师
		public static final String ROLE_CODE_WZVR004 = "WZVR004"; //收料人员
		public static final String ROLE_CODE_WZVR005 = "WZVR005"; //采购经办人
		public static final String ROLE_CODE_WZVR006 = "WZVR006"; //发起人/材料负责人
		public static final String ROLE_CODE_WZVR007 = "WZVR007"; //发起人/收料人员
		public static final String ROLE_CODE_WZVR008 = "WZVR008"; //发起人/采购经办人
	}
	
	//物资需用(补)角色Code
	public static class materialReqBRoleCode {
		public static final String ROLE_CODE_WZBRR001 = "WZBRR001"; //发起人
		public static final String ROLE_CODE_WZBRR002 = "WZBRR002"; //参与人(商务部)
		public static final String ROLE_CODE_WZBRR003 = "WZBRR003"; //参与人(物资设备部)
		public static final String ROLE_CODE_WZBRR004 = "WZBRR004"; //审核人
		public static final String ROLE_CODE_WZBRR005 = "WZBRR005"; //审批人
	}
	
	//物资进场验(补)收角色Code
	public static class materialVefBRoleCode {
		public static final String ROLE_CODE_WZBVR001 = "WZBVR001"; //发起人
		public static final String ROLE_CODE_WZBVR002 = "WZBVR002"; //材料负责人
		public static final String ROLE_CODE_WZBVR003 = "WZBVR003"; //专业工程师
		public static final String ROLE_CODE_WZBVR004 = "WZBVR004"; //收料人员
		public static final String ROLE_CODE_WZBVR005 = "WZBVR005"; //采购经办人
		public static final String ROLE_CODE_WZBVR006 = "WZBVR006"; //列席参与人(商务经理)
		public static final String ROLE_CODE_WZBVR007 = "WZBVR007"; //审核人
		public static final String ROLE_CODE_WZBVR008 = "WZBVR008"; //审批人
		public static final String ROLE_CODE_WZBVR009 = "WZBVR009"; //发起人/材料负责人
		public static final String ROLE_CODE_WZBVR010 = "WZBVR010"; //发起人/收料人员
		public static final String ROLE_CODE_WZBVR011 = "WZBVR011"; //发起人/采购经办人
	}
	
	//二级进度审核任务角色code
	public static class projectPlanVefRoleCode{
		public static final String ROLE_CODE_PPVR001 = "PPVR001";//发起人
		public static final String ROLE_CODE_PPVR002 = "PPVR002";//参与人
		public static final String ROLE_CODE_PPVR003 = "PPVR003";//审核人
	}
	
	//分包经济签证任务角色code
	public static class subcontractVisaRoleCode{
		public static final String ROLE_CODE_SVR001 = "SVR001";//发起人(工程部专业工程师)
		public static final String ROLE_CODE_SVR002 = "SVR002";//分包参与人(分包公司负责人)
		public static final String ROLE_CODE_SVR003 = "SVR003";//负责人(项目总工/生产经理)
		public static final String ROLE_CODE_SVR004 = "SVR004";//商务参与人(商务部人员 非商务经理)
		public static final String ROLE_CODE_SVR005 = "SVR005";//商务审核人(商务经理)
		public static final String ROLE_CODE_SVR006 = "SVR006";//审核人(项目经理)
		public static final String ROLE_CODE_SVR007 = "SVR007";//分公司商务审批人(三级单位商务管理部分管)
		public static final String ROLE_CODE_SVR008 = "SVR008";//分公司审批人(三级单位总经济师)
		public static final String ROLE_CODE_SVR009 = "SVR009";//公司商务审批人(二级单位商务管理部分管)
		public static final String ROLE_CODE_SVR010 = "SVR010";//公司审批人(二级单位商务管理部负责人)
		public static final String ROLE_CODE_SVR011 = "SVR011";//审批人(二级单位总经济师)
	}
	
	//项目检查通报任务角色code
	public static class projectCheckReportRoleCode{
		public static final String ROLE_CODE_PCRR001 = "PCRR001";//发起人
		public static final String ROLE_CODE_PCRR002 = "PCRR002";//负责人(检查组组长)
		public static final String ROLE_CODE_PCRR003 = "PCRR003";//技术质量组负责人
		public static final String ROLE_CODE_PCRR004 = "PCRR004";//技术质量组参与人
		public static final String ROLE_CODE_PCRR005 = "PCRR005";//安全组负责人
		public static final String ROLE_CODE_PCRR006 = "PCRR006";//安全组参与人
		public static final String ROLE_CODE_PCRR007 = "PCRR007";//物资组负责人
		public static final String ROLE_CODE_PCRR008 = "PCRR008";//物资组参与人
		public static final String ROLE_CODE_PCRR009 = "PCRR009";//工期组负责人
		public static final String ROLE_CODE_PCRR010 = "PCRR010";//工期组参与人
		public static final String ROLE_CODE_PCRR011 = "PCRR011";//总承包组负责人
		public static final String ROLE_CODE_PCRR012 = "PCRR012";//总承包组参与人
		public static final String ROLE_CODE_PCRR013 = "PCRR013";//劳务组负责人
		public static final String ROLE_CODE_PCRR014 = "PCRR014";//劳务组参与人
		public static final String ROLE_CODE_PCRR015 = "PCRR015";//机械组负责人
		public static final String ROLE_CODE_PCRR016 = "PCRR016";//机械组参与人
		public static final String ROLE_CODE_PCRR017 = "PCRR017";//绿色施工组负责人
		public static final String ROLE_CODE_PCRR018 = "PCRR018";//绿色施工组参与人
		public static final String ROLE_CODE_PCRR019 = "PCRR019";//实测实量组负责人
		public static final String ROLE_CODE_PCRR020 = "PCRR020";//设计组负责人
		public static final String ROLE_CODE_PCRR021 = "PCRR021";//设计组负责人
		public static final String ROLE_CODE_PCRR022 = "PCRR022";//财务组负责人
		public static final String ROLE_CODE_PCRR023 = "PCRR023";//财务组负责人
		public static final String ROLE_CODE_PCRR024 = "PCRR024";//综合办公室组负责人
		public static final String ROLE_CODE_PCRR025 = "PCRR025";//综合办公室组负责人
		public static final String ROLE_CODE_PCRR026 = "PCRR026";//商务组负责人
		public static final String ROLE_CODE_PCRR027 = "PCRR027";//商务组负责人
	}
	
	//物资需用总计划任务角色code
	public static class materialTotalPlanRoleCode{
		//物资需用总计划
		public static final String ROLE_CODE_WZERR001 = "WZERR001";//发起人
		public static final String ROLE_CODE_WZERR002 = "WZERR002";//参与人01
		public static final String ROLE_CODE_WZERR003 = "WZERR003";//参与人02
		public static final String ROLE_CODE_WZERR004 = "WZERR004";//参与人03
		public static final String ROLE_CODE_WZERR005 = "WZERR005";//审核人
		public static final String ROLE_CODE_WZERR006 = "WZERR006";//审批人
		//钢筋需用总计划
		public static final String ROLE_CODE_WZSRR001 = "WZSRR001";//发起人
		public static final String ROLE_CODE_WZSRR002 = "WZSRR002";//参与人01
		public static final String ROLE_CODE_WZSRR003 = "WZSRR003";//参与人02
		public static final String ROLE_CODE_WZSRR004 = "WZSRR004";//参与人03
		public static final String ROLE_CODE_WZSRR005 = "WZSRR005";//审核人
		public static final String ROLE_CODE_WZSRR006 = "WZSRR006";//审批人
		//混凝土需用总计划
		public static final String ROLE_CODE_WZCRR001 = "WZCRR001";//发起人
		public static final String ROLE_CODE_WZCRR002 = "WZCRR002";//参与人01
		public static final String ROLE_CODE_WZCRR003 = "WZCRR003";//参与人02
		public static final String ROLE_CODE_WZCRR004 = "WZCRR004";//参与人03
		public static final String ROLE_CODE_WZCRR005 = "WZCRR005";//审核人
		public static final String ROLE_CODE_WZCRR006 = "WZCRR006";//审批人
		//周转工具需用总计划
		public static final String ROLE_CODE_WZTRR001 = "WZTRR001";//发起人
		public static final String ROLE_CODE_WZTRR002 = "WZTRR002";//参与人01
		public static final String ROLE_CODE_WZTRR003 = "WZTRR003";//参与人02
		public static final String ROLE_CODE_WZTRR004 = "WZTRR004";//参与人03
		public static final String ROLE_CODE_WZTRR005 = "WZTRR005";//审核人
		public static final String ROLE_CODE_WZTRR006 = "WZTRR006";//审批人
	}

	//劳务分包信用分考核任务角色code
	public static class labourCreditCheckRoleCode{
		public static final String ROLE_CODE_LCCR001 = "LCCR001";//发起人
		public static final String ROLE_CODE_LCCR002 = "LCCR002";//负责人
		public static final String ROLE_CODE_LCCR003 = "LCCR003";//工期参与人
		public static final String ROLE_CODE_LCCR004 = "LCCR004";//技术质量参与人
		public static final String ROLE_CODE_LCCR005 = "LCCR005";//安全文明参与人
	}

	//专业分包信用分考核任务角色code
	public static class professionCreditCheckRoleCode{
		public static final String ROLE_CODE_PCCR001 = "PCCR001";//发起人
		public static final String ROLE_CODE_PCCR002 = "PCCR002";//负责人
		public static final String ROLE_CODE_PCCR003 = "PCCR003";//参与人
	}

	//消息定义
	public static class sysMessage {
		public static final String ERROR_1000 = "登录用户参数值无效";
		public static final String ERROR_1001 = "任务所处区域码参数值无效";
		public static final String ERROR_1002 = "任务消息编号参数值无效";
		public static final String ERROR_1003 = "任务编号参数值无效";		
		public static final String ERROR_1004 = "参数值无效";
		public static final String ERROR_1005 = "任务评论编号参数值无效";
		public static final String ERROR_1006 = "项目编号参数值无效";
		public static final String ERROR_1007 = "用户未分配项目";
		public static final String ERROR_1008 = "任务类型未分配";
		public static final String ERROR_1009 = "任务流程未分配";
		public static final String ERROR_1010 = "任务角色未分配";
		public static final String ERROR_1012 = "任务子类型未分配";
		public static final String ERROR_1013 = "任务发起人角色未分配";
		public static final String ERROR_1015 = "任务所属公司/项目参数值无效";
		public static final String ERROR_1018 = "任务截止时间参数值无效";
		public static final String ERROR_1019 = "任务重要程度参数值无效";
		public static final String ERROR_1030 = "任务不存在,请刷新重试";
		public static final String ERROR_1031 = "任务状态已被他人修改,请刷新重试";
		public static final String ERROR_1036 = "任务截止时间不能早于系统当前时间";
		public static final String ERROR_1100 = "抱歉您没有权限新建/修改任务,请联系管理员开通权限！";
		public static final String ERROR_1101 = "任务的用户人员未分配";
		public static final String ERROR_1102 = "任务用户角色未分配";
		public static final String ERROR_1103 = "任务用户反馈信息参数值无效";
		public static final String ERROR_1104 = "物资参数值无效";
		public static final String ERROR_1105 = "该物资不在物资验收计划之中,请重新选择验收物资";
		public static final String ERROR_1106 = "该物资已验收过,请重新选择验收物资";
		public static final String ERROR_1107 = "该物资交验说明未填写,请重新填写";
		public static final String ERROR_1108 = "该物资验收用户反馈信息无效,请重新选择验收物资";
		public static final String ERROR_1109 = "该物资交验附件未上传,请上传对应的验收附件";
		public static final String ERROR_1110 = "物资进场验收计划无效";
		public static final String ERROR_1111 = "物资需要计划无效";
		public static final String ERROR_1112 = "附件参数值无效";
		public static final String ERROR_1113 = "附件不存在";
		public static final String ERROR_1114 = "您已对该评论点赞过了";
		public static final String ERROR_1115 = "该项目日程为空";
		public static final String ERROR_1116 = "该项目计划为空";		
		public static final String ERROR_1117 = "该项目不存在";
		public static final String ERROR_1118 = "该项目二级进度计划不存在";
		public static final String ERROR_1119 = "任务负责人和发起人均不能同一人";
		public static final String ERROR_1120 = "用户名无效,请重新输入";		
		public static final String ERROR_1121 = "手机设备参数无效";
		public static final String ERROR_1122 = "密码无效,请重新输入";		
		public static final String ERROR_1123 = "用户名/密码无效,请重新输入";
		public static final String ERROR_1124 = "验证码无效,请重新输入";
		public static final String ERROR_1125 = "验证码已过期,请重新生成验证码";
		public static final String ERROR_1126 = "验证码认证失败,请重新生成验证码";
		public static final String ERROR_1127 = "该帐号禁止登录,请联系管理员";
		public static final String ERROR_1128 = "用户名不存在,请重新登录";
		public static final String ERROR_1129 = "认证无效,请联系管理员";
		public static final String ERROR_1134 = "该手机号已经被使用，请更换其他手机号";
		public static final String ERROR_1135 = "手机验证码已失效,请重新发送验证码";
		public static final String ERROR_1136 = "手机验证码无效,请重新发送验证码";
		public static final String ERROR_1137 = "该公司下已存在一个或者多个项目,您无法进行删除";
		public static final String ERROR_1138 = "该公司下人员信息已经分配,您无法进行删除";
		public static final String ERROR_1139 = "该公司下人员信息已经分配,您无法进行修改(是否为分公司)字段";
		public static final String ERROR_1140 = "您还没有权限浏览此项";
		public static final String ERROR_1141 = "文件生成失败";
		public static final String ERROR_1142 = "您输入的新密码和确认密码不一致,请重新输入";
		public static final String ERROR_1143 = "您输入的旧密码不正确,请重新输入";
		public static final String ERROR_1144 = "补录物资需用信息参数值无效";
		public static final String ERROR_1145 = "该用户已经在该角色中存在,请重新选择角色";		
		public static final String ERROR_1146 = "所选二级进度的开始时间不在一级进度时间的范围内";
		public static final String ERROR_1147 = "所选二级进度的结束时间不在一级进度时间的范围内";
		public static final String ERROR_1148 = "项目已开始，无法被删除";
		public static final String ERROR_1149 = "该类型下,二级物资类型为空";
		public static final String ERROR_1150 = "该项目下人员信息已经分配,您无法进行删除";
		public static final String ERROR_1151 = "该物资类型下存在物资,无法进行删除";
		public static final String ERROR_1152 = "该项目配置步骤已被修改,请重新刷新界面";
		public static final String ERROR_1153 = "该项目一级进度下存在已存在二级进度,无法进行删除";
		public static final String ERROR_1154 = "该项目二级进度已在进行,无法进行删除";
		public static final String ERROR_1155 = "该项目已经结束,无法进行新建或修改一级进度计划";
		public static final String ERROR_1156 = "该项目已经结束,无法进行新建或修改二进度计划";
		public static final String ERROR_1157 = "该物资已在使用,无法进行删除";
		public static final String ERROR_1158 = "该物资类型下存在物资子类型,无法进行删除";
		public static final String ERROR_1159 = "该项目的审核人员已经存在,请先移除该人员权限再进行添加";
		public static final String ERROR_1160 = "签证参数值无效";
		public static final String ERROR_1161 = "该签证不存在，请重试";
		public static final String ERROR_1162 = "该签证状态已经被修改，请刷新重试";
		public static final String ERROR_1163 = "该签证内容已经被专业工程师修改，请刷新重试";
		public static final String ERROR_1164 = "该任务所在三级单位尚未配置商务管理部分管，人员配置完善后该任务才可进入下个阶段";
		public static final String ERROR_1165 = "该任务所在三级单位尚未配置总经济师，人员配置完善后该任务才可进入下个阶段";
		public static final String ERROR_1166 = "该任务所在二级单位尚未配置商务管理部分管，人员配置完善后该任务才可进入下个阶段";
		public static final String ERROR_1167 = "该任务所在二级单位尚未配置商务管理部经理，人员配置完善后该任务才可进入下个阶段";
		public static final String ERROR_1168 = "该任务所在二级单位尚未配置总经济师，人员配置完善后该任务才可进入下个阶段";
		public static final String ERROR_1169 = "物资进场验收数量合计(%s)已超出计划需用物资数量(%s),本次物资进场验收数量最大为(%s).";
		public static final String ERROR_1170 = "(%s)物资验收数量合计(%s)已超出物资需用计划数量(%s),验收数量最大为(%s).";
		public static final String ERROR_1174 = "进场验收物资没有全部验收完成,请刷新界面查看物资验收情况";
		public static final String ERROR_1175 = "(%s)物资需要计划无效";
		public static final String ERROR_1195 = "整改详情列表为空";
		public static final String ERROR_1196 = "文件读取失败！";
		public static final String ERROR_1197 = "项目进度计划已存在";
		public static final String ERROR_1198 = "项目一级进度计划不存在,请先选择项目一级进度";
		public static final String ERROR_1199 = "项目进度计划不存在";		
		public static final String ERROR_1301 = "企业账号已被其他人审核,请刷新页面";
		public static final String ERROR_1302 = "企业营业执照没有审核,请进行审核";
		public static final String ERROR_1303 = "企业安全许可证没有审核,请进行审核";
		public static final String ERROR_1304 = "企业资质证书(%s)没有审核,请进行审核";
		public static final String ERROR_1305 = "企业营业执照已审核,请刷新页面";
		public static final String ERROR_1306 = "企业资质证书(%s)已审核,请刷新页面";
		public static final String ERROR_1307 = "企业安全许可证已审核,请刷新页面";
		public static final String ERROR_1308 = "企业营业执照被审核驳回下,账号最终审核无法通过";
		public static final String ERROR_1309 = "公司编号参数值无效";
		public static final String ERROR_1310 = "Token无效";
		
		/************通用任务错误消息  开始*******************************/
		public static final String ERROR_1014 = "任务标题参数值无效";
		public static final String ERROR_1016 = "任务团队/部门参数值无效";
		public static final String ERROR_1017 = "任务开始时间参数值无效";
		public static final String ERROR_1020 = "任务负责人参数值无效";
		public static final String ERROR_1021 = "任务审核人参数值无效";
		public static final String ERROR_1022 = "任务审批人参数值无效";
		public static final String ERROR_1023 = "任务负责人和审核人均不能同一人";
		public static final String ERROR_1024 = "任务负责人、审核人和审批人均不能同一人";
		public static final String ERROR_1025 = "任务有审批人,但不能缺少审核人";
		public static final String ERROR_1026 = "任务截止时间必须大于任务开始时间一个小时以上";
		public static final String ERROR_1027 = "子任务开始时间不能早于父任务开始时间,父任务开始时间(%s)";
		public static final String ERROR_1028 = "子任务截止时间不能晚于父任务截止时间,父任务截止时间(%s)";
		public static final String ERROR_1029 = "子任务截止时间必须早于父任务截止时间半个小时以上,父任务截止时间(%s)";
		public static final String ERROR_1032 = "任务负责人和审批人均不能同一人";
		public static final String ERROR_1033 = "任务有审核人,但不能缺少审批人";
		public static final String ERROR_1034 = "任务有审核人和审批人均不能同一人";
		public static final String ERROR_1035 = "父任务参数值无效";
		public static final String ERROR_1037 = "任务的开始时间必须在完成数据提交前半个小时之内,请重新填写开始时间";		
		public static final String ERROR_1038 = "发起人已在该任务中,请将发起人从参与人中移除";
		public static final String ERROR_1039 = "负责人已在该任务中,请将负责人从参与人中移除";
		public static final String ERROR_1130 = "审核人已在该任务中,请将审核人从参与人中移除";
		public static final String ERROR_1131 = "审批人已在该任务中,请将审批人从参与人中移除";
		public static final String ERROR_1132 = "子任务未完成,请将所有子任务完成后再进行提交操作";
		public static final String ERROR_1133 = "父任务未开始或已通过负责人审批,子任务将无权进行相关操作";
		
		/************通用任务错误消息  结束*******************************/
		/************安全隐患上报/安全整改通知/质量整改通知任务错误消息  开始*******************************/
		public static final String ERROR_1011 = "安全总监人员未分配";
		public static final String ERROR_1040 = "任务接收单位参数值无效";
		public static final String ERROR_1041 = "自检人参数值无效";
		public static final String ERROR_1042 = "验证人参数值无效";
		public static final String ERROR_1043 = "接收人参数值无效";
		public static final String ERROR_1044 = "隐患位置参数值无效";
		public static final String ERROR_1045 = "隐患类型参数值无效";
		public static final String ERROR_1046 = "隐患文字参数值无效";
		public static final String ERROR_1047 = "整改要求参数值无效";
		public static final String ERROR_1048 = "自检人、验证人和接收人均不能同一人";
		public static final String ERROR_1049 = "自检人和验证人均不能同一人";
		public static final String ERROR_1192 = "整改详情列表不能为空";
		public static final String ERROR_1193 = "自检情况文字描述不能为空";
		public static final String ERROR_1194 = "所有整改条目未全部通过";
		
		/************安全隐患上报/安全整改通知/质量整改通知任务错误消息  结束*******************************/
		
		/************物资需要计划任务错误消息  开始*******************************/
		public static final String ERROR_1050 = "生产经理人员未分配";       //生产经理(审核人)
		public static final String ERROR_1051 = "项目经理/执行经理人员未分配";//项目经理/执行经理(审批人)
		public static final String ERROR_1052 = "合约商务经理人员未分配";    //商务经理
		public static final String ERROR_1053 = "采购工程师人员未分配";      //采购工程师
		public static final String ERROR_1054 = "审核人参数值无效";         //审核人对应的生产经理的职务
		public static final String ERROR_1055 = "审批人参数值无效";         //审批人对应的是项目经理的职务
		public static final String ERROR_1056 = "需用物资列表为空,请重新选择";
		public static final String ERROR_1057 = "物资所属类别参数值无效";
		public static final String ERROR_1058 = "物资类别参数值无效";
		public static final String ERROR_1059 = "物资名称参数值无效";
		public static final String ERROR_1060 = "物资规格型号参数值无效";
		public static final String ERROR_1061 = "物资单位参数值无效";
		public static final String ERROR_1062 = "物资计划数量参数值无效";
		public static final String ERROR_1063 = "物资进场日期参数值无效";
		public static final String ERROR_1064 = "物资使用区域参数值无效";
		public static final String ERROR_1065 = "参与人(物资设备部)参数值无效";
		public static final String ERROR_1066 = "参与人(商务部)参数值无效";
		/************物资需要计划任务错误消息  结束*******************************/
		
		/************物资进场验收计划任务错误消息  开始*******************************/
		public static final String ERROR_1070 = "物资需要计划参数值无效";
		public static final String ERROR_1071 = "物资本次验收数量参数值无效";
		public static final String ERROR_1072 = "物资采购单价参数值无效";
		public static final String ERROR_1073 = "物资采购金额参数值无效";
		public static final String ERROR_1074 = "物资厂家参数值无效";
		public static final String ERROR_1075 = "物资品牌参数值无效";
		public static final String ERROR_1076 = "备注参数值无效";
		public static final String ERROR_1077 = "供应商单位参数值无效";
		public static final String ERROR_1078 = "集合时间参数值无效";
		public static final String ERROR_1079 = "集合位置参数值无效";
		public static final String ERROR_1080 = "材料负责人参数值无效";
		public static final String ERROR_1081 = "专业工程师参数值无效";
		public static final String ERROR_1082 = "收料人员参数值无效";
		public static final String ERROR_1083 = "采购经办人数值无效";
		public static final String ERROR_1084 = "材料负责人和收料人员均不能同一人";
		public static final String ERROR_1085 = "材料负责人和专业工程师均不能同一人";
		public static final String ERROR_1086 = "材料负责人和采购经办人均不能同一人";
		public static final String ERROR_1087 = "专业工程师和收料人员均不能同一人";
		public static final String ERROR_1088 = "专业工程师和采购经办人均不能同一人";
		public static final String ERROR_1089 = "收料人员和采购经办人均不能同一人";
		public static final String ERROR_1090 = "集合时间不能早于系统当前时间";
		public static final String ERROR_1091 = "验收物资列表为空,请重新选择";
		/************物资进场验收计划任务错误消息  结束*******************************/
		
		/************分包经济签证任务错误消息  开始*******************************/
		public static final String ERROR_1092 = "分包经济签证为空,请重新填写";
		public static final String ERROR_1093 = "负责人参数值无效";
		public static final String ERROR_1094 = "分包单位参数值无效";
		public static final String ERROR_1095 = "参与者(商务)参数值无效";
		public static final String ERROR_1096 = "发起人和负责人不能为同一人";
		public static final String ERROR_1097 = "发起人和参与者(商务)不能为同一人";
		public static final String ERROR_1098 = "负责人和参与者(商务)不能为同一人";
		/************分包经济签证任务错误消息  结束*******************************/
		
		/************项目检查通报任务错误消息  开始*******************************/
		public static final String ERROR_1099 = "检查组组长参数不能为空";
		public static final String ERROR_1171 = "至少选择一个检查专业";
		public static final String ERROR_1172 = "请选择所建检查通报任务的年份和季度";
		public static final String ERROR_1173 = "项目检查通报专业不存在";
		public static final String ERROR_1176 = "角色身份信息有误";
		public static final String ERROR_1177 = "该专业内容已经被修改，请刷新重试";
		public static final String ERROR_1178 = "该专业条目详情不存在";
		public static final String ERROR_1179 = "该专业条目状态已经被修改，请刷新重试";
		public static final String ERROR_1180 = "该实测实量专业条目已经存在，请尝试修改";
		public static final String ERROR_1181 = "检查组组长意见不能为空";
		public static final String ERROR_1182 = "专业组长整改内容和建议不能为空";
		public static final String ERROR_1183 = "专业组长优点和不足至少填写一项";
		public static final String ERROR_1184 = "请至少填写一项实测实量条目";
		public static final String ERROR_1185 = "情况描述文字不能为空";
		public static final String ERROR_1186 = "情况描述图片不能为空";
		public static final String ERROR_1187 = "该专业已经被检查组长锁定，无法撤回";
		public static final String ERROR_1188 = "您没有锁定此项专业的权限";
		public static final String ERROR_1189 = "该描述文字长度不能超过1000个汉字";
		public static final String ERROR_1190 = "该描述文字长度不能超过5000个汉字";
		public static final String ERROR_1191 = "加入整改内容的文字描述不能为空";
		/************项目检查通报任务错误消息  结束*******************************/
		
		/************物资需用总计划错误消息  开始*******************************/
		public static final String ERROR_1200 = "任务审核人参数值无效";
		public static final String ERROR_1201 = "任务审批人参数值无效";
		public static final String ERROR_1202 = "需用物资不能为空";
		public static final String ERROR_1203 = "请选择正确的物资名称";
		public static final String ERROR_1204 = "请选择正确的规格型号";
		public static final String ERROR_1205 = "物资单位出错";
		public static final String ERROR_1206 = "请选择正确的供应权限";
		public static final String ERROR_1207 = "请选择正确的楼层名称";
		public static final String ERROR_1208 = "请选择正确的构件类型";
		public static final String ERROR_1209 = "请选择正确的需用数量";
		public static final String ERROR_1210 = "该任务参与人、审核人、审批人不能为同一人";
		public static final String ERROR_1211 = "审核人/审批人已经默认在参与人中，请重新选择审核人/审批人";
		public static final String ERROR_1212 = "需用物资详情不存在";
		public static final String ERROR_1213 = "您已对所有物资验收完成,不能进行相关添加/编辑操作";
		
		/************物资需用总计划错误消息  结束*******************************/

		/************劳务/专业分包信用分考核错误消息  开始*******************************/
		public static final String ERROR_1250 = "分包商相关企业信息无效";
		public static final String ERROR_1251 = "发起人不能为空";
		public static final String ERROR_1252 = "负责人不能为空";
		public static final String ERROR_1253 = "工期参与人不能为空";
		public static final String ERROR_1254 = "技术质量参与人不能为空";
		public static final String ERROR_1255 = "文明施工、安全生产、劳务管理参与人不能为空";
		public static final String ERROR_1256 = "分包商类型不能为空";
		public static final String ERROR_1257 = "参与人不能为空";
		public static final String ERROR_1258 = "各专业参与人必须超过5个";
		public static final String ERROR_1259 = "请选择季度";
		public static final String ERROR_1260 = "";
		public static final String ERROR_1261 = "信用考核任务详情实体不存在";
		public static final String ERROR_1262 = "每一项分值必填";
		public static final String ERROR_1263 = "用户尚未全部提交，请刷新重试";

		/************劳务/专业分包信用分考核错误消息  结束*******************************/
		
		public static final String INFO_1001 = "验收通过";        //物资验收通过
		public static final String INFO_1002 = "任务内容已被修改";  //物资验收通过
		public static final String INTO_1003 = "登录成功";        //登录成功
		public static final String INTO_1004 = "退出登录成功";     //退出登录
		
		public static final String SUCCESS_1001 = "获取数据成功";
		public static final String SUCCESS_1002 = "数据保存成功";
		public static final String SUCCESS_1003 = "数据删除成功";
		public static final String SUCCESS_1104 = "%s操作成功";
		public static final String SUCCESS_1005 = "点赞成功";
		public static final String SUCCESS_1006 = "数据更新成功";
	}
	
	//任务当前状态码
	public static class worktaskStatusCode {
		public static final String STATUS_CODE_1001 = "1001";  //任务刚创建
		public static final String STATUS_CODE_1002 = "1002";  //任务开始
		public static final String STATUS_CODE_1003 = "1003";  //任务开始审核
		public static final String STATUS_CODE_1004 = "1004";  //任务审核不通过
		public static final String STATUS_CODE_1005 = "1005";  //任务开始审批
		public static final String STATUS_CODE_1006 = "1006";  //任务审批不通过
		public static final String STATUS_CODE_1007 = "1007";  //任务完成
		public static final String STATUS_CODE_1008 = "1008";  //任务被暂停
		public static final String STATUS_CODE_1009 = "1009";  //任务被删除
		public static final String STATUS_CODE_1010 = "1010";  //接收人确认接收
		public static final String STATUS_CODE_1011 = "1011";  //自检人确认自检完成
		public static final String STATUS_CODE_1012 = "1012";  //验证人确认验证通过
		public static final String STATUS_CODE_1013 = "1013";  //验证人验证未通过
		public static final String STATUS_CODE_1014 = "1014";  //下发完采购指令
		public static final String STATUS_CODE_1015 = "1015";  //计划验收时间到
		public static final String STATUS_CODE_1016 = "1016";  //材料负责人验收不通过
		public static final String STATUS_CODE_1017 = "1017";  //其他任务角色进行验收
		public static final String STATUS_CODE_1018 = "1018";  //验收均通过
		public static final String STATUS_CODE_1019 = "1019";  //验收均通过，但物资数量被更改
		public static final String STATUS_CODE_1020 = "1020";  //验收未全部通过其他任务角色验收
		public static final String STATUS_CODE_1021 = "1021";  //任务审批通过
		public static final String STATUS_CODE_1022 = "1022";  //隐患确认
		public static final String STATUS_CODE_1023 = "1023";  //隐患忽略
		public static final String STATUS_CODE_1024	= "1024";  //分包同意签证内容				
		public static final String STATUS_CODE_1025	= "1025";  //负责人通过签证				
		public static final String STATUS_CODE_1026	= "1026";  //商务完成核价				
		public static final String STATUS_CODE_1027	= "1027";  //商务经理审核通过签证			
		public static final String STATUS_CODE_1028	= "1028";  //签证在审核阶段被驳回				
		public static final String STATUS_CODE_1029	= "1029";  //项目经理通过签证（签证总金额不超过五千）
		public static final String STATUS_CODE_1030	= "1030";  //项目经理通过签证（签证总金额超过五千，不超过一万）
		public static final String STATUS_CODE_1031	= "1031";  //分公司商务管理部通过签证（签证总金额超过五千，不超过一万）
		public static final String STATUS_CODE_1032	= "1032";  //分公司未通过签证审批（签证总金额超过五千，不超过一万）
		public static final String STATUS_CODE_1033	= "1033";  //分公司总经济师通过签证（签证总金额超过五千，不超过一万）
		public static final String STATUS_CODE_1034	= "1034";  //项目经理通过签证（签证总金额超过一万，不超过五万）
		public static final String STATUS_CODE_1035	= "1035";  //分公司商务管理部通过签证（签证总金额超过一万，不超过五万）	
		public static final String STATUS_CODE_1036	= "1036";  //分公司总经济师通过签证（签证总金额超过一万，不超过五万）
		public static final String STATUS_CODE_1037	= "1037";  //公司商务管理部分管通过签证（签证总金额超过一万，不超过五万）		
		public static final String STATUS_CODE_1038	= "1038";  //签证审批未通过（签证总金额超过一万，不超过五万）		
		public static final String STATUS_CODE_1039	= "1039";  //公司商务管理部负责人通过签证（签证总金额超过一万，不超过五万）
		public static final String STATUS_CODE_1040	= "1040";  //项目经理通过签证（签证总金额超过五万）	
		public static final String STATUS_CODE_1041	= "1041";  //分公司商务管理部通过签证（签证总金额超过五万）	
		public static final String STATUS_CODE_1042	= "1042";  //分公司总经济师通过签证（签证总金额超过五万）		
		public static final String STATUS_CODE_1043	= "1043";  //公司商务管理部分管通过签证（签证总金额超过五万）	
		public static final String STATUS_CODE_1044	= "1044";  //公司商务管理部负责人通过签证（签证总金额超过五万）	
		public static final String STATUS_CODE_1045	= "1045";  //签证审批未通过（签证总金额超过五万）
		public static final String STATUS_CODE_1046	= "1046";  //公司总经济师通过签证（签证总金额超过五万）	
		public static final String STATUS_CODE_1047	= "1047";  //专业负责人全部提交	
		public static final String STATUS_CODE_1048	= "1048";  //参与人全部提交

	}
	
	//任务状态名称
	public static class worktaskStatusCodeName {
		public static final String STATUS_CODE_1001 = "任务刚创建";   //任务刚创建		
		public static final String STATUS_CODE_1002 = "任务开始";    //任务开始	
		public static final String STATUS_CODE_1007 = "任务完成";    //任务完成	
		public static final String STATUS_CODE_1047 = "专业负责人全部提交";    //专业负责人全部提交	
		public static final String STATUS_CODE_1048 = "参与人全部提交";    //参与人全部提交
	}
	
	//二级任务状态
	public static class worktaskSecondStatusCode {
		public static final String STATUS_CODE_2001	= "2001";  //条目初始化
		public static final String STATUS_CODE_2002	= "2002";  //整改自检中
		public static final String STATUS_CODE_2003	= "2003";  //整改验证中
		public static final String STATUS_CODE_2004	= "2004";  //验证已通过
		public static final String STATUS_CODE_2005	= "2005";  //验证已驳回
		public static final String STATUS_CODE_2006	= "2006";  //数据未提交
		public static final String STATUS_CODE_2007	= "2007";  //数据已提交
	}
	
	//任务状态命令编码
	public static class worktaskCmdCode {
		public static final String CMD_CODE_1001 = "1001";  //查看任务
		public static final String CMD_CODE_1002 = "1002";  //评论任务
		public static final String CMD_CODE_1003 = "1003";  //修改任务
		public static final String CMD_CODE_1004 = "1004";  //删除任务
		public static final String CMD_CODE_1005 = "1005";  //暂停任务
		public static final String CMD_CODE_1006 = "1006";  //复制任务
		public static final String CMD_CODE_1007 = "1007";  //开始任务
		public static final String CMD_CODE_1008 = "1008";  //新建子任务
		public static final String CMD_CODE_1009 = "1009";  //确认完成
		public static final String CMD_CODE_1010 = "1010";  //审核通过
		public static final String CMD_CODE_1011 = "1011";  //审核不通过
		public static final String CMD_CODE_1012 = "1012";  //审批通过
		public static final String CMD_CODE_1013 = "1013";  //审批不通过
		public static final String CMD_CODE_1014 = "1014";  //重启任务
		public static final String CMD_CODE_1015 = "1015";  //确认隐患
		public static final String CMD_CODE_1016 = "1016";  //忽略隐患
		public static final String CMD_CODE_1017 = "1017";  //确认接收
		public static final String CMD_CODE_1018 = "1018";  //确认自检
		public static final String CMD_CODE_1019 = "1019";  //验证通过
		public static final String CMD_CODE_1020 = "1020";  //验证不通过
		public static final String CMD_CODE_1021 = "1021";  //下发采购指令
		public static final String CMD_CODE_1022 = "1022";  //验收通过
		public static final String CMD_CODE_1023 = "1023";  //验收不通过
		public static final String CMD_CODE_1024 = "1024";  //开始验收
		public static final String CMD_CODE_1025 = "1025";  //同意签证
		public static final String CMD_CODE_1026 = "1026";  //不同意签证
		public static final String CMD_CODE_1027 = "1027";  //确认单价
		public static final String CMD_CODE_1028 = "1028";  //新建条目
		public static final String CMD_CODE_1029 = "1029";  //提交作业
		public static final String CMD_CODE_1030 = "1030";  //编辑内容
		public static final String CMD_CODE_1031 = "1031";  //驳回提交
		public static final String CMD_CODE_1032 = "1032";  //锁定/解锁专业
		public static final String CMD_CODE_1033 = "1033";  //修改条目
		public static final String CMD_CODE_1034 = "1034";  //删除条目
	}
	
	//项目检查通报任务条目命令
	public static class pcrDetailCmdCode{
		public static final String CMD_CODE_1001 = "1001";//修改
		public static final String CMD_CODE_1002 = "1002";//删除
		public static final String CMD_CODE_1003 = "1003";//提交
		public static final String CMD_CODE_1004 = "1004";//采纳
		public static final String CMD_CODE_1005 = "1005";//忽略
		public static final String CMD_CODE_1006 = "1006";//下发整改
		public static final String CMD_CODE_1007 = "1007";//加入整改内容
		public static final String CMD_CODE_1008 = "1008";//撤出整改内容
	}
	
	//任务列表排序字段(importLevel(任务重要等级)/departmentCode(按部门排序)/datetime(按时间排序)/(roleDisplayCode)(按参与角色排序))
	public static class worktaskSortField {
		public static final String IMPORT_LEVEL = "importLevel";          //任务重要等级
		public static final String DEPARTMENT_CODE = "departmentCode";    //按部门排序
		public static final String DATETIME = "datetime";                 //按时间排序
		public static final String ROLE_DISPLAY_CODE = "roleDisplayCode"; //按参与角色排序
	}
	
	//任务类型编码(CMM1000:通用任务\r\nAQR1000:安全隐患上报任务\r\nAQN1000:整改通知任务\r\nWZR1000:物资需用计划任务\r\nWZV1000:物资进场验收任务 CMMS1000:通用任务子任务)
	public static class worktaskTypeCode {
		public static final String WORKTASK_TYPE_CMM = "CMM1000";  //通用任务
		public static final String WORKTASK_TYPE_AQR = "AQR1000";  //安全隐患上报任务
		public static final String WORKTASK_TYPE_AQN = "AQN1000";  //整改通知任务
		public static final String WORKTASK_TYPE_WZR = "WZR1000";  //物资需用计划任务
		public static final String WORKTASK_TYPE_WZV = "WZV1000";  //物资进场验收任务
		public static final String WORKTASK_TYPE_CMM_SUB = "CMMS1000";  //通用任务子任务
		public static final String WORKTASK_TYPE_WZBR = "WZBR1000";  //补充物资需用计划任务
		public static final String WORKTASK_TYPE_WZBV = "WZBV1000";  //补充物资进场验收任务
		public static final String WORKTASK_TYPE_PPV = "PPV1000";  //生产进度审核任务
		public static final String WORKTASK_TYPE_SV = "SV1000";  //分包签证任务
		public static final String WORKTASK_TYPE_PCR = "PCR1000";  //项目检查通报任务
		public static final String WORKTASK_TYPE_ZLN = "ZLN1000";  //质量整改通知任务
		public static final String WORKTASK_TYPE_WZER = "WZER1000";  //物资需用总计划
		public static final String WORKTASK_TYPE_WZSR = "WZSR1000";  //钢筋需用总计划
		public static final String WORKTASK_TYPE_WZCR = "WZCR1000";  //混凝土需用总计划
		public static final String WORKTASK_TYPE_WZTR = "WZTR1000";  //周转工具需用总计划
		public static final String WORKTASK_TYPE_LCC = "LCC1000";  //劳务分包信用分考核
		public static final String WORKTASK_TYPE_PCC = "PCC1000";  //专业分包分包信用分考核
	}
	
	//用户角色名称
	public static class userRoleCodeName {
		public static final String PM = "项目经理"; //项目经理人员
		public static final String EM = "执行经理"; //执行经理人员
		public static final String CE = "项目总工"; //项目总工人员
		public static final String MM = "生产经理"; //生产经理人员
		public static final String BM = "商务经理"; //商务经理人员
	}
	
	//任务子类型编码
	public static class worktaskSubTypeCode {
		//通用任务 开始
		public static final String WORKTASK_SUB_TYPE_CMM1001 = "CMM1001";  //通用任务（完整版）
		public static final String WORKTASK_SUB_TYPE_CMM1002 = "CMM1002";  //通用任务（少审批人）
		public static final String WORKTASK_SUB_TYPE_CMM1003 = "CMM1003";  //通用任务（少审批人，且发起和负责同一人）
		public static final String WORKTASK_SUB_TYPE_CMM1004 = "CMM1004";  //通用任务（少审批人，且发起和审核同一人）
		public static final String WORKTASK_SUB_TYPE_CMM1005 = "CMM1005";  //通用任务（少审核、审批人）
		public static final String WORKTASK_SUB_TYPE_CMM1006 = "CMM1006";  //通用任务（少审核、审批人，且发起和负责同一人）
		public static final String WORKTASK_SUB_TYPE_CMM1007 = "CMM1007";  //通用任务（发起和负责同人）
		public static final String WORKTASK_SUB_TYPE_CMM1008 = "CMM1008";  //通用任务（发起和审核同一人）
		public static final String WORKTASK_SUB_TYPE_CMM1009 = "CMM1009";  //通用任务（发起和审批同一人）
		//通用任务 结束
		//安全隐患上报任务 开始
		public static final String WORKTASK_SUB_TYPE_AQR1001 = "AQR1001";  //安全隐患上报任务（完整版）
		//安全隐患上报任务 结束
		//安全整改通知 开始
		public static final String WORKTASK_SUB_TYPE_AQN1001 = "AQN1001";  //整改通知（完整版）
		public static final String WORKTASK_SUB_TYPE_AQN1002 = "AQN1002";  //整改通知（发起和验证同一人）
		public static final String WORKTASK_SUB_TYPE_AQN1003 = "AQN1003";  //整改通知（接收和自检同一人）
		public static final String WORKTASK_SUB_TYPE_AQN1004 = "AQN1004";  //整改通知（发起和验证同一人,接收和自检同一人）
		//安全整改通知 结束		
		//质量整改通知 开始
		public static final String WORKTASK_SUB_TYPE_ZLN1001 = "ZLN1001";  //整改通知（完整版）
		public static final String WORKTASK_SUB_TYPE_ZLN1002 = "ZLN1002";  //整改通知（发起和验证同一人）
		public static final String WORKTASK_SUB_TYPE_ZLN1003 = "ZLN1003";  //整改通知（接收和自检同一人）
		public static final String WORKTASK_SUB_TYPE_ZLN1004 = "ZLN1004";  //整改通知（发起和验证同一人,接收和自检同一人）
		//质量整改通知 结束		
		//物资需用计划任务 开始
		public static final String WORKTASK_SUB_TYPE_WZR1001 = "WZR1001";  //物资需用计划任务（完整版）
		//物资需用计划任务 结束
		//物资进场验收任务 开始
		public static final String WORKTASK_SUB_TYPE_WZV1001 = "WZV1001";  //物资进场验收任务（完整版）
		public static final String WORKTASK_SUB_TYPE_WZV1002 = "WZV1002";  //物资进场验收（发起和材料负责人同一人）
		public static final String WORKTASK_SUB_TYPE_WZV1003 = "WZV1003";  //物资进场验收（发起和收料人员同一人）
		public static final String WORKTASK_SUB_TYPE_WZV1004 = "WZV1004";  //物资进场验收（发起和采购经办人同一人）
		//物资进场验收任务 结束
		//补充物资需用计划任务 开始
		public static final String WORKTASK_SUB_TYPE_WZBR1001 = "WZBR1001";  //补充物资需用计划任务（完整版）
		//补充物资需用计划任务 结束
		//补充物资进场验收任务 开始
		public static final String WORKTASK_SUB_TYPE_WZBV1001 = "WZBV1001";  //补充物资进场验收任务（完整版）
		public static final String WORKTASK_SUB_TYPE_WZBV1002 = "WZBV1002";  //补充物资进场验收任务（发起和材料负责人同一人）
		public static final String WORKTASK_SUB_TYPE_WZBV1003 = "WZBV1003";  //补充物资进场验收任务（发起和收料人员同一人）
		public static final String WORKTASK_SUB_TYPE_WZBV1004 = "WZBV1004";  //补充物资进场验收任务（发起和采购经办人同一人）
		//补充物资进场验收任务 结束
		//生产进度审核任务 开始
		public static final String WORKTASK_SUB_TYPE_PPV1001 = "PPV1001";    //生产进度审核任务（完整版）
		//生产进度审核任务 结束		
		//分包经济签证任务 开始	
		public static final String WORKTASK_SUB_TYPE_SV1001 = "SV1001";    //分包经济签证任务（完整版）
		//分包经济签证任务 结束		
		//项目检查通报任务 开始
		public static final String WORKTASK_SUB_TYPE_PCR1001 = "PCR1001";
		//项目检查通报任务 结束
		//物资需用总计划 开始
		public static final String WORKTASK_SUB_TYPE_WZER1001 = "WZER1001";
		public static final String WORKTASK_SUB_TYPE_WZSR1001 = "WZSR1001";
		public static final String WORKTASK_SUB_TYPE_WZCR1001 = "WZCR1001";
		public static final String WORKTASK_SUB_TYPE_WZTR1001 = "WZTR1001";
		//物资需用总计划 结束
		//分包信用分考核 开始
		public static final String WORKTASK_SUB_TYPE_LCC1001 = "LCC1001";
		//分包信用分考核 结束
		//专业信用分考核 开始
		public static final String WORKTASK_SUB_TYPE_PCC1001 = "PCC1001";
		//专业信用分考核 结束
	}
	
	//(对应系统参数表 的参数编号 )
	public static class sysParamKey {
		public static final String ACCESSID = "AccessId";                      //OSS登录ID
		public static final String ACCESSKEY = "AccessKey";                    //OSS登录KEY
		public static final String BUCKETNAME = "BucketName";                  //OSS登录Bucket名称
		public static final String OSSENDPOINT = "OssEndPoint";                  //OSS服务器地址
		public static final String OSSENVFILEPATH = "OssEnvFilePath";          //OSS服务器环境路径
		public static final String OSSAVATARFILEPATH = "OssAvatarFilePath";    //OSS服务器用户头像上传路径
		public static final String OSSCOMPANYFILEPATH = "OssCompanyFilePath";  //OSS服务器公司文件上传路径
		public static final String OSSWORKTASKFILEPATH = "OssWorktaskFilePath";//OSS服务器任务文件上传路径
		public static final String OSSPROJECTFILEPATH = "OssProjectFilePath";  //OSS服务器项目文件上传路径
		public static final String OSSPROJECTPLANFILEPATH = "OssProjectPlanFilePath";  //OSS服务器项目计划文件上传路径
		public static final String OSSREPORTFILEPATH = "OssReportFilePath";    //OSS服务器报表上传路径
	}
	
	//消息参数
	public static class messageParamKey {
		public static final String WORKTASKMSGMAXPUSHDAYS = "WorktaskMsgMaxPushDays";//任务消息最大推送天数
		public static final String PROJECTMSGMAXPUSHDAYS = "ProjectMsgMaxPushDays";//项目消息最大推送天数
		public static final String COMPANYMSGMAXPUSHDAYS = "CompanyMsgMaxPushDays";//公司消息最大推送天数
		public static final String WORKTASKMSGMAXPUSHCOUNT = "WorktaskMsgMaxPushCount";//任务消息最大推送次数
		public static final String PROJECTMSGMAXPUSHCOUNT = "ProjectMsgMaxPushCount";//项目消息最大推送次数
		public static final String COMPANYMSGMAXPUSHCOUNT = "CompanyMsgMaxPushCount";//公司消息最大推送次数
	}
	
	//日期格式化
	public static class dateFormt {
		public static final String DATE_FORMT_1 = "%s年%s月份"; //eg:2016年02月份
		public static final String DATE_FORMT_2 = "%s-%s";    //eg:2016-02
	}
	
	//安全隐患类分类(其他)
	public static class safetyTypeOther {
		public static final String SAFETY_TYPE_CODE = "99";
		public static final String SAFETY_TYPE_NAME = "其他";
	}
	
	//安全隐患类分类统计最大条设置
	public static final int SAFETY_TYPE_REPORT_MAX_VALUE = 6;
	
	//系统流水号key
	public static class sysIdsKey {
		public static final String DATE = "DATE";  //当前日期
		public static final String WK  = "WK";     //任务
		public static final String CMM = "CMM";    //通用任务
		public static final String AQR = "AQR";    //安全隐患上报任务
		public static final String AQN = "AQN";    //安全整改通知任务
		public static final String WZR = "WZR";    //物资需用计划任务
		public static final String WZV = "WZV";    //物资进场验收任务
		public static final String WZBR = "WZBR";  //补充物资需用计划任务
		public static final String WZBV = "WZBV";  //补充物资进场验收任务
		public static final String PPV  = "PPV";   //生产进度审核任务
		public static final String RFN  = "RFN";   //表报文件编号
		public static final String SV = "SV";     //分包经济签证编号
		public static final String PCR = "PCR";     //项目检查通报任务
		public static final String ZLN = "ZLN";     //质量整改通知任务
		public static final String WZER = "WZER";     //物资需用总计划
		public static final String WZSR = "WZSR";     //钢筋需用总计划
		public static final String WZCR = "WZCR";     //混凝土需用总计划
		public static final String WZTR = "WZTR";     //周转工具需用总计划
		public static final String LCC = "LCC";     //劳务分包信用分考核
		public static final String PCC = "PCC";     //专业分包信用分考核
		public static final String LPCC = "LPCC";   //劳务/专业分包信用分考核
	}
	
	//附件表类型--表第一个字母简写(tmvff/tsnf/tsrf/twcf/twcrf/twuff)
	public static class tableFileName {
		public static final String TMVFF = "tmvff";  //tmvff:(t_material_vef_feedback_file 物资验收用户反馈附件表)
		public static final String TSNF  = "tsnf";   //tsnf:(t_safety_notify_file 安全整改通知附件表)
		public static final String TSRF = "tsrf";    //tsrf:(t_safety_report_file 安全隐患上报附件表)
		public static final String TWCF = "twcf";    //twcf:(t_worktask_comment_file 任务评论附件表)
		public static final String TWCRF = "twcrf";  //twcrf:(t_worktask_comment_reply_file 任务回复评论附件表)
		public static final String TWUFF = "twuff";  //twuff:(t_worktask_user_feedback_file 用户对应任务反馈附件表)
		public static final String TMIF = "tmif";    //tmif:(t_material_invoice_file 物资发票附件表)
		public static final String TPPF = "tppf";  //tppaf:(t_project_plan_file 项目进度计划附件表)
		public static final String TSSDF = "tssdf";  //tssdf:(t_subcontract_sv_detail_file 分包经济签证任务详情附件表)
		public static final String TPPCDF = "tppcdf";  //tppcdf:(t_project_pcr_case_detail_file 项目检查通报任务条目详情附件表)
	}
	
	//消息发送形式（1.发送命令式的消息添加形式 2.添加或者修改任务的消息添加形式 3.任务评论的消息添加形式）之后加入公司消息和项目消息
	public static class messageType {
		public static final int CMD = 1;      //发送命令式的消息添加形式command
		public static final int AOU = 2;      //添加或者修改任务的消息添加形式addorupdate
		public static final int CMT = 3;      //任务评论的消息添加形式comment
	}
	
	//消息内容
	public static class messageContentTemplate {
		//任务消息模版
		public static final String MESSAGE_WORKTASK_CREAT = "%s@%s发起了\"%s\"任务,你被指定为%s。"; // 创建命令
		public static final String MESSAGE_WORKTASK_MEND = "%s@%s修改了\"%s\"任务，快去看看吧！"; // 修改命令
		public static final String MESSAGE_WORKTASK_PAUSE = "%s@%s暂停了\"%s\"任务。"; // 暂停命令
		public static final String MESSAGE_WORKTASK_DELETE = "%s@%s删除了\"%s\"任务。"; // 删除命令
		public static final String MESSAGE_WORKTASK_START_AUTO = "\"%s\"任务已经开始了，快去看看吧！"; // 自动开始任务命令
		public static final String MESSAGE_WORKTASK_START = "%s@%s提前开始了\"%s\"任务。";// 手动开始任务命令
		public static final String MESSAGE_WORKTASK_COMPLETE = "\"%s\"任务常规阶段已完成！"; // 完成任务命令
		public static final String MESSAGE_WORKTASK_CHECK = "\"%s\"任务通过了%s@%s的审核。"; // 审核通过命令
		public static final String MESSAGE_WORKTASK_NOTCHECK = "\"%s\"任务的审核被审核人%s@%s驳回。"; // 审核不通过命令
		public static final String MESSAGE_WORKTASK_ASSESS = "\"%s\"任务通过了%s@%s的审批。"; // 审批通过命令
		public static final String MESSAGE_WORKTASK_NOTASSESS = "\"%s\"任务的审批被审批人%s@%s驳回。"; // 审批不通过命令
		public static final String MESSAGE_WORKTASK_RESTART = "%s@%s重启了\"%s\"任务，快去看看吧！"; // 重启任务命令
		public static final String MESSAGE_WORKTASK_COMFIRMDANGER = "\"%s\"任务中的隐患被%s@%s确认！"; // 确认隐患
		public static final String MESSAGE_WORKTASK_IGNOREDANGER = "\"%s\"任务中的隐患被%s@%s忽略！"; // 忽略隐患
		public static final String MESSAGE_WORKTASK_COMMENT = "%s@%s在\"%s\"任务评论区中@了你。"; // 评论
		public static final String MESSAGE_WORKTASK_RECEIVE = "\"%s\"任务已经被接收人%s@%s接收。";   //安全整改任务接收
		public static final String MESSAGE_WORKTASK_SELF_CHECK = "\"%s\"任务已经被自检人%s@%s确认自检。";   //确认自检
		public static final String MESSAGE_WORKTASK_VERIFY = "\"%s\"任务的验证被验证人%s@%s通过";  //验证通过
		public static final String MESSAGE_WORKTASK_NOTVERIFY = "\"%s\"任务的验证被验证人%s@%s驳回";  //验证不通过
		public static final String MESSAGE_WORKTASK_PURCHASE = "%s@%s已对\"%s\"下达了物资采购指令，任务顺利完成！"; // 物资需用计划任务
		public static final String MESSAGE_WORKTASK_AREACODE_1_TO_2 = "\"%s\"任务到了您大显身手的时候了，请移步前往查看任务详情！"; // 当任务从待办转移到在办时向特定人员发出的消息
		public static final String MESSAGE_WORKTASK_PURCHASE_ASSESS = "\"%s\"通过了审批人的审批，请尽快根据该计划下达采购指令，安排人员进行采购"; // 物资需用计划审批后发给物资管理部人员的消息
		public static final String MESSAGE_PROJECT_ENGINEER = "\"%s\"按计划将于%s开始，请您将该一级进度下的二级进度增加完整。"; // 提醒总工完善二级进度信息
		public static final String MESSAGE_PROJECT_MANAGER = "\"%s\"按计划将于%s开始，请您督促项目总工程师将该一级进度下的二级进度信息填写完整。"; // 提醒项目经理督促总工完善二级进度信息
		public static final String MESSAGE_PROJECT_TOMORROW_COMPLETE = "\"%s\"按计划将于明日完成，请您重点关注该工序进展情况"; // 提醒项目经理和生产经理进度计划明日完成
		public static final String MESSAGE_PROJECT_TODAY_COMPLETE = "\"%s\"按计划将于今日完成，请您重点关注该工序进展情况"; // 提醒项目经理和生产经理进度计划今日完成
		public static final String MESSAGE_PROJECT_COMPLETED_TO_ENGINEER = "\"%s\"已超出计划完成时间，如已完成，请您尽快前往项目进度页面完成二级进度情况汇总。";// 提醒总工二级进度计划完成时间已过
		public static final String MESSAGE_PROJECT_COMPLETED_TO_MANAGER = "\"%s\"已超出计划完成，请您重点关注该工序进展情况。";// 提醒项目经理二级进度计划完成时间已过
		public static final String MESSAGE_WORKTASK_STATUS_CODE_1016 = "\"%s\"任务,材料负责人%s未通过的验收。"; // 物资进场验收任务（材料负责人不通过）;
		public static final String MESSAGE_WORKTASK_STATUS_CODE_1017 = "\"%s\"任务,材料负责人%s验收完成,其他任务角色的开始验收。";
		public static final String MESSAGE_WORKTASK_STATUS_CODE_1018 = "\"%s\"任务,本次进场物资验收均通过。";
		public static final String MESSAGE_WORKTASK_STATUS_CODE_1019 = "\"%s\"任务,本次进场物资验收部分通过。";
		public static final String MESSAGE_WORKTASK_STATUS_CODE_1020 = "\"%s\"任务,验收未全部通过其他任务角色验收。";
		public static final String MESSAGE_WORKTASK_PPV_CREAT = "\"%s\"已经创建，您被指定为%s。";//二级进度审核任务创建
		public static final String MESSAGE_WORKTASK_SV_AGREE = "\"%s\"任务顺利被分包单位\"%s\"完成认可。";//分包经济签证任务被分包认可
		public static final String MESSAGE_WORKTASK_SV_CONFIRM_PRICE = "\"%s\"任务被商务参与人\"%s\"确认单价。";//分包经济签证任务被商务参与人确认单价
		public static final String MESSAGE_WORKTASK_PCR_COMMIT_WORK = "\"%s\"任务中%s@%s已提交作业。";//项目检查通报任务提交作业
		public static final String MESSAGE_WORKTASK_PCR_REJECT_COMMIT = "\"%s\"任务中检查组长%s@%s驳回了一项作业提交。";//项目检查通报任务驳回提交
	}
	
	//任务消息类型(1:通用任务消息 2:安全隐患上报任务消息 3:安全整改通知任务消息 4:物资需用计划任务消息 5:物资进场验收任务消息）
	public static class messageWorktaskType{
		public static final int CMM = 1;    //通用任务
		public static final int AQR = 2;    //安全隐患上报任务
		public static final int AQN = 3;    //安全整改通知任务
		public static final int WZR = 4;    //物资需用计划任务
		public static final int WZV = 5;    //物资进场验收任务
		public static final int CMT = 6;    //评论
		public static final int WZBR = 7;   //物资需用计划任务(补充)
		public static final int WZBV = 8;   //物资进场验收任务(补充)
		public static final int PPV = 9;    //生产进度审核任务
		public static final int SV = 10;    //生产进度审核任务
		public static final int PCR = 10;    //项目检查通报任务
	}
	
	//API接口路径地址
	public static class apiRequestPath {
		public static final String API_ALL = "/api/**";                                  //所有路径
		public static final String USER_LOGIN = "/api/userlogin/appUserLogin";           //用户登录类路径
		public static final String FORGET_PHONE_CODE = "/api/userlogin/forgetPhoneCode"; //比对验证码
		public static final String FORGET_PASSWORD = "/api/userlogin/forgetPassword";    //忘记密码
		public static final String GET_PHONE_CODE = "/api/userlogin/getPhoneCode";       //获取验证码
		public static final String SAVE_PROJECT_ENV_DEVICE_DATA = "/api/projectinfo/saveProjectEnvDeviceData"; //保存项目环境监测设备实时数据接口
		public static final String EXAPI_ALL = "/exapi/**";    
	}
	
	//Web路径地址
	public static class webRequestPath {
		public static final String WEB_ALL = "/web/**";                                 //所有路径
		public static final String USER_CAPTCHA_CODE = "/web/userLogin/getCaptchaCode"; //用户验证码路径
		public static final String INDEX = "/web/common/index";                         //首页路径
	}
	
	//Web路径地址
	public static class webPageName {
		public static final String PAGE_NAME_USER_LOGIN = "/user/login";                                //用户登录页面
		public static final String PAGE_NAME_INDEX = "/common/index";                                   //首页页面
		public static final String PAGE_NAME_ERROR_403 = "/common/error403";
		public static final String PAGE_NAME_ERROR = "/common/error500";
		public static final String PAGE_NAME_VIEW_UPLOAD_FILE = "/common/uploadfile";
		public static final String PAGE_NAME_COMPANY_LIST_VIEW = "/company/viewCompanyList";            //公司一览页面
		public static final String PAGE_NAME_COMPANY_SET_USER = "/company/setCompanyUserInfo";          //配置公司用户页面
		public static final String PAGE_NAME_COMPANY_INFO_EDIT = "/company/editCompanyInfo";            //编辑公司页面
		public static final String PAGE_NAME_COMPANY_INFO_ADD = "/company/addCompanyInfo";              //添加公司页面
		public static final String PAGE_NAME_COMPANY_INFO_VIEW = "/company/viewCompanyInfo";            //查看公司页面
		public static final String PAGE_NAME_COMPANY_DEPT_INFO_VIEW = "/company/viewCompanyDeptInfo";   //查看公司部门和人员页面
		public static final String PAGE_NAME_COMPANY_PRJ_INFO_VIEW = "/company/viewCompanyProjectInfo"; //查看公司所属项目页面
		public static final String PAGE_NAME_USER_INFO_EDIT = "/user/editUserInfo";                     //编辑公司用户页面
		public static final String PAGE_NAME_USER_INFO_ADD = "/user/addUserInfo";                       //添加公司用户页面
		public static final String PAGE_NAME_USER_UPDATEUSERINFO = "/user/updateUserInfo";              //修改个人资料
		public static final String PAGE_NAME_USER_UPDATEUSERPASSWORD = "/user/updateUserPassword";      //修改个人密码
		public static final String PAGE_NAME_MESSAGE_CENTER = "/message/viewMessageCenter";             //消息中心
		public static final String PAGE_NAME_WORKTASK_VIEW = "/worktask/viewWorktask";                  //任务一览
		public static final String PAGE_NAME_WORKTASK_DETAIL = "/worktask/viewWorktaskDetail";  	    //任务详情
		public static final String PAGE_NAME_WORKTASK_ADD = "/worktask/addWorktask";                    //新建任务
		public static final String PAGE_NAME_WORKTASK_ADD_DETAIL = "/worktask/addWorktaskDetail";       //新建任务详情
		public static final String PAGE_NAME_WORKTASK_SUB_COMMON_DETAIL = "/worktask/addWorktaskDetailCMMS"; //新建子任务详情页面
		public static final String PAGE_NAME_WORKTASK_SUB_COMMON_DETAIL_VIEW = "/worktask/viewWorktaskDetailCMMS";  //查看子任务详情页面
		public static final String PAGE_NAME_WORKTASK_ADD_WORKTASK_MATERIAL = "/material/aboutWorktask/addWorktaskMaterial";    //物资相关任务添加物资页面
		public static final String PAGE_NAME_WORKTASK_UPDATE_WORKTASK_MATERIAL = "/material/aboutWorktask/updateWorktaskMaterial";    //物资需用计划任务修改物资页面
		public static final String PAGE_NAME_WORKTASK_ADD_WORKTASK_MATERIAL_WITH_INVOICE = "/material/aboutWorktask/addWorktaskMaterialWithInvoice";    //补充物资进场验收任务添加物资页面
		public static final String PAGE_NAME_WORKTASK_ADD_WORKTASK_SELECTWZR = "/material/aboutWorktask/selectWorktaskWZR";     //选择物资需用计划
		public static final String PAGE_NAME_WORKTASK_CMD_PAGE = "/worktask/command/viewWorktaskCmdPage";     //AQN命令确认自检page to1018and1019
		public static final String PAGE_NAME_WORKTASK_SELECT_SINGLE_PERSON_PCR = "/worktask/PCR/selectSinglePerson";     //PCR任务选择单个人员页面
		public static final String PAGE_NAME_WORKTASK_SELECT_MUTI_PERSON_PCR = "/worktask/PCR/selectMutiPerson";     //PCR任务选择多个人员页面
		public static final String PAGE_NAME_PCR_DEYTAIL_CMD_PAGE = "/worktask/PCR/viewPcrDetailCmdPage";     //pcr任务条目命令跳转
		public static final String PAGE_NAME_PCR_LEADER_GET_TEAMER = "/worktask/PCR/viewLeaderGetTeamer";     //pcr任务条目命令跳转
		public static final String PANG_NAME_INIT_UPDATE_WORKTASK = "/worktask/editInitEditPage";			  //初始化修改任务命令页面
		public static final String PAGE_NAME_WORKTASK_REPALY_COMMENT_DETAIL_VIEW = "/worktask/viewRepalyCommentDetailInfo";    //任务回复评论信息一览      
		
		public static final String PAGE_NAME_PROJECT_SET_USER = "/project/setProjectUserInfo";                //配置项目人员信息
		public static final String PAGE_NAME_PROJECT_VIEW_LIST = "/project/viewProjectList";                  //项目一览页面
		public static final String PAGE_NAME_PROJECT_ADD = "/project/addProjectInfo";                         //添加项目页面
		public static final String PAGE_NAME_PROJECT_EDIT = "/project/editProjectInfo";                       //编辑项目页面
		public static final String PAGE_NAME_PROJECT_DEPT_INFO_VIEW = "/project/viewProjectDeptInfo";         //查看项目部门和人员页面
		public static final String PAGE_NAME_PROJECT_FIRST_PLAN_LIST_VIEW = "/project/projectPlan/viewProjectFirstPlanList";   //项目一级进度一览页面
		public static final String PAGE_NAME_PROJECT_FIRST_PLAN_ADD = "/project/projectPlan/addProjectFirstPlanInfo";          //添加一级项目进度页面
		public static final String PAGE_NAME_PROJECT_FIRST_PLAN_EDIT = "/project/projectPlan/editProjectFirstPlanInfo";        //编辑一级项目进度页面
		public static final String PAGE_NAME_PROJECT_FIRST_PLAN_TO_SECOND_PLAN_LIST_VIEW = "/project/projectPlan/viewProjectSecondPlanListByFirstPlan"; //查询项目二级进度通过一级进度页面
		public static final String PAGE_NAME_PROJECT_SECOND_PLAN_LIST_VIEW = "/project/projectPlan/viewProjectSecondPlanList"; //项目二级进度一览页面
		public static final String PAGE_NAME_PROJECT_SECOND_PLAN_ADD = "/project/projectPlan/addProjectSecondPlanInfo";        //添加二级进度页面
		public static final String PAGE_NAME_PROJECT_SECOND_PLAN_EDIT = "/project/projectPlan/editProjectSecondPlanInfo";      //编辑二级进度页面
		public static final String PAGE_NAME_PROJECT_SECOND_PLAN_SUMMARY_EDIT = "/project/projectPlan/editProjectSecondPlanSummaryInfo"; //编辑二级进度汇总情况页面
		public static final String PAGE_NAME_PROJECT_SET_AUTH = "/project/setProjectAuthInfo";                                 //设置项目权限
		public static final String PANG_NAME_PROJECT_PROCESS_VIEW_INFO = "/project/viewProjectProcessInfo";                    //项目进度一览  
		public static final String PAGE_NAME_PROJECT_CONFIG_ADMIN_USER = "/project/configProjectAdminInfo";                    //配置项目管理员
		
		public static final String PAGE_NAME_SUBCONTRACT_SET_USER = "/subcontract/setSubcontractUserInfo";      //配置分包公司用户页面
		public static final String PAGE_NAME_SUBCONTRACT_LIST_VIEW = "/subcontract/viewSubcontractList";        //分包公司一览页面
	    public static final String PAGE_NAME_SUBCONTRACT_ADD = "/subcontract/addSubcontractInfo";               //添加分包公司
	    public static final String PAGE_NAME_SUBCONTRACT_EDIT = "/subcontract/editSubcontractInfo";             //编辑分包公司
	    public static final String PAGE_NAME_SUBCONTRACT_ALL_LIST_VIEW = "/subcontract/viewAllSubcontractList"; //查询所有分包公司一览页面
	    
	    public static final String PAGE_NAME_SUBCONTRANCT_TEAM_VIEW = "/subcontract/viewSubTeamcontractInfo";   //浏览班组页面
	    public static final String PAGE_NAME_SUBCONTRANCT_TEAM_ADD = "/subcontract/addSubTeamcontractInfo";     //添加班组信息页面    
	    public static final String PAGE_NAME_SUBCONTRACT_TEAM_VIEW_ALL = "/subcontract/viewAllSubTeamcontractList"; //查询所有班组(分包公司)信息
	    
	    public static final String PAGE_NAME_SUBCONTRACT_USER_INFO_VIEW = "/subcontract/setSubcontractTeamUserInfo";    //配置班组人员信息一览  
	    
	    public static final String PAGE_NAME_SUPPLIER_VIEW_LIST = "/supplier/viewSupplierList";                 //查询供应商一览页面
        public static final String PAGE_NAME_SUPPLIER_ALL_VIEW_LIST = "/supplier/viewAllSupplierList";          //查询所有供应商一览页面
	    public static final String PAGE_NAME_SUPPLIER_ADD = "/supplier/addSupplierInfo";                        //添加供应商页面
		public static final String PAGE_NAME_SUPPLIER_EDIT = "/supplier/editSupplierInfo";
	    
	    public static final String PAGE_NAME_MATERIAL_VIEW_LIST = "/material/viewMaterialList";                 //物资一览页面
		public static final String PAGE_NAME_MATERIAL_ADD = "/material/addMaterialInfo";                        //添加物资页面
		public static final String PAGE_NAME_MATERIAL_EDIT = "/material/editMaterialInfo";                      //修改物资页面
		public static final String PAGE_NAME_MATERIAL_TYPE_VIEW_INFO = "/material/viewMaterialTypeInfo";        //物资类型页面
		public static final String PAGE_NAME_MATERIAL_TYPE_ADD = "/material/addMaterialTypeInfo";               //物资类型添加页面
		public static final String PAGE_NAME_MATERIAL_TYPE_EDIT = "/material/editMaterialTypeInfo";             //物资类型编辑页面
		
		public static final String PAGE_NAME_SYS_MENU_VIEW_INFO = "/sys/menu/viewMenuManageInfo";               //菜单一览页面
	    public static final String PAGE_NAME_SYS_MENU_ADD = "/sys/menu/addMenuInfo";                            //添加菜单页面
	    public static final String page_NAME_SYS_MENU_EDIT = "/sys/menu/editMenuInfo";                          //编辑菜单页面
	    public static final String PAGE_NAME_SYS_MENU_AUTH_VIEW_INFO = "/sys/menu/viewMenuAuthManageInfo";      //菜单权限
	   
	    public static final String PAGE_NAME_SYS_MENU_USER_INFO = "/sys/user/viewUserManageInfo";               //用户管理一览页面
	    
	    public static final String PAGE_NAME_SYS_MENU_ROLE_INFO = "/sys/role/viewRoleManageInfo";               //角色管理一览页面
	    public static final String PAGE_NAME_SYS_MENU_ROLE_INFO_ADD = "/sys/role/addRoleAuthInfo";              //添加角色信息页面
	    public static final String PAGE_NAME_SYS_MENU_ROLE_INFO_EDIT = "/sys/role/editRoleAuthInfo";            //编辑角色信息页面
	    public static final String PAGE_NAME_SYS_MENU_DEPT_INFO_ADD = "/sys/role/addDeptInfo";                  //添加部门信息页面
	    
	    public static final String PAGE_NAME_SYS_MENU_ADMIN_INFO = "/sys/admin/viewAdminManageInfo";            //查看管理员页面
	    public static final String PAGE_NAME_SYS_MENU_ADMIN_INFO_ADD = "/sys/admin/addAdminManageInfo";			//添加管理员信息页面
	    public static final String PAGE_NAME_SYS_MENU_ADMIN_INFO_EDIT = "/sys/admin/editAdminManageInfo";       //编辑管理员信息页面
	    
	    public static final String PAGE_NAME_SYS_REPORT_FILE_VIEW_INFO = "/sys/report/viewReportFileInfo";
	    public static final String PAGE_NAME_SYS_REPORT_FILE_CREATE_VIEW_INFO = "/sys/report/viewCreateReportFileInfo";
	    public static final String PAGE_NAME_SYS_REPORT_HTML_FILE_INFO = "/sys/report/openReportHtmlFile";
	    public static final String PAGE_NAME_SYS_REPORT_ATTACHMENT_FILE_INFO = "/sys/report/viewReportAttachmentFileInfo";
	    
	    public static final String PAGE_NAME_APP_PAGE_AUTH_SET_INFO = "/app/setAppPageAuthInfo";
	    
	    public static final String PAGE_NAME_APP_PAGE_MANAGE_INFO = "/app/viewAppPageManageInfo"; //浏览App页面管理
	    public static final String PAGE_NAME_APP_PAGE_MANAGE_INFO_EDIT = "/app/editAppPageManageInfo";//编辑App页面信息
	    public static final String PAGE_NAME_APP_PAGE_MANAGE_INFO_ADD = "/app/addAppPageManageInfo"; //添加一个App页面信息
	   
	    public static final String PAGE_NAME_PROJECT_PLAN_GANT_TASK_VIEW_INFO = "/ganttask/viewProjectPlanGantTaskInfo";
	    public static final String PAGE_NAME_VR_DEMO_VIEW_INFO = "/ganttask/viewVrDemoInfo";
	    public static final String PAGE_NAME_MAP_DEMO_VIEW_INFO = "/ganttask/viewMapDemoInfo";
	    public static final String PAGE_NAME_PROJECT_PLAN_VIEW_INFO = "/ganttask/viewGantProjectPlanInfo";
	    public static final String PAGE_NAME_WEB_SOCKET_DEMO_VIEW_INFO = "/ganttask/viewWebSocketDemoInfo";
	    public static final String PAGE_NAME_KINDEDITOR_DEMO_VIEW_INFO = "/ganttask/viewKindeditorDemoInfo";
	    
	    public static final String PAGE_NAME_ENTERPRISE_APPROVAL_VIEW_INFO = "/ssplatform/viewEnterpriseApprovalList";  //企业账号申请审核
	    public static final String PAGE_NAME_ENTERPRISE_BASE_VIEW_INFO = "/ssplatform/viewEnterpriseBaseInfo";          //企业基本信息详情
	    public static final String PAGE_NAME_ENTERPRISE_USER_CERT_VIEW_INFO = "/ssplatform/viewEnterpriseUserCertInfo";          //企业人员信息详情
	    public static final String PAGE_NAME_TEAM_BASE_VIEW_INFO = "/ssplatform/viewTeamBaseInfo"; //班组基本信息页面
	    public static final String PAGE_NAME_SUPPLIER_BASE_VIEW_INFO = "/ssplatform/viewSupplierBaseInfo"; //供应商基本信息页面
	    
	    public static final String PAGE_NAME_SET_ENTERPRISE_ACCOUNT_VIEW_INFO = "/ssplatform/setEnterpriseAccountApprovalInfo";  //企业账号申请审核
	    public static final String PAGE_NAME_SET_ENTERPRISE_CERT_VIEW_INFO = "/ssplatform/setEnterpriseCertApprovalInfo";        //企业资质申请审核
	    public static final String PAGE_NAME_APPROVAL_ENTERPRISE_USER_CERT_VIEW_INFO = "/ssplatform/viewApprovalEnterpriseUserCertInfo";
	   
	    public static final String PAGE_NAME_ENTERPRISE_CREDIT_CHECK_INDEX = "/ssplatform/creditcheck"; 						//企业信用考核首页
	    public static final String PAGE_NAME_ENTERPRISE_BLACKLIST_VIEW_INFO = "/ssplatform/blacklist/viewEnterpriseBlackList"; //企业黑名单列表管理
	    public static final String PAGE_NAME_ENTERPERSE_BLACKLIST_ADD_STEP1 = "/ssplatform/blacklist/chooseEnterpriseList"; //选择企业加入黑名单列表
	    public static final String PAGE_NAME_ENTERPERSE_BLACKLIST_ADD_STEP2 = "/ssplatform/blacklist/chooseBlackListType"; //选择黑名单类型
	    
	    public static final String PAGE_NAME_ENTERPRISE_ALL_INFO = "/ssplatform/viewEnterpriseSearcherInfo"; //分供商一览页面
	    
	    public static final String PAGE_NAME_ENTERPRISE_INDEX_INFO = "/ssplatform/viewEnterpriseIndex"; //浏览指定分供商展示基本信息页面
	    public static final String PAGE_NAME_ENTERPRISE_USER_INFO = "/ssplatform/viewEnterpriseUserManageInfo"; //浏览指定分供商人员页面
	    public static final String PAGE_NAME_ENTERPRISE_CREDIT_CHECK_VIEW = "/ssplatform/viewSingleEnterpriseCreditCheck"; //浏览指定分供商信用考核页面
		public static final String PAGE_NAME_ENTERPRISE_BUILDING_PROJECT_VIEW = "/ssplatform/viewSingleEnterpriseBuildingProject"; //浏览指定分供商在建项目页面

	}
	
	//推送状态（1.已推  2.未推）
	public static class pushStatus{
		 public static final int IS_PUSH = 1;    //已经推送
		 public static final int NOT_PUSH = 0;   //尚未推送
	}
	
	//是否需要推送
	public static class needPush {
		public static final int NOT_NEED_PUSH = 0;  //0:不需要推送
		public static final int NEED_PUSH = 1;      //1:需要推送
	}
	
	//消息中心类型
	public static class selectMessageType{
		public static final int WORKTASK = 1;  //1:任务消息中心
		public static final int PROJECT = 2;   //2:项目消息中心
		public static final int COMPANY = 3;   //3:公司消息中心
	}
	
	// 用户任务一览抬头标签
	public static class reportUserWorktaskTitle {
		public static final String MONTHLY_STATISTICS = "月度任务总结";
		public static final String MONTHLY_DETAIL = "月度任务详情";
		public static final String SEASONLY_STATISTICS = "季度任务总结";
		public static final String SEASONLY_DETAIL = "季度任务详情";
		public static final String YEARLY_STATISTICS = "年度任务总结";
		public static final String YEARLY_DETAIL = "年度任务详情";

	}
	
	// 用户任务一览传值 用户任务完成状态
	public static class reportUserWorktaskCompleteStatus {
		public static final int USER_WORKTASK_UNCOMPLETED = 0; // 未完成
		public static final int USER_WORKTASK_COMPLETED = 1; // 已完成
		public static final int USER_WORKTASK_ALL = 2; // 查询全部
	}
	
	//properties配置key
	public static class propertiesKey {
		public static final String IS_START_SCHEDULED = "ct.is.start.scheduled";
		public static final String DRUID_LOGINUSERNAME = "druid.loginUsername";
		public static final String DRUID_LOGINPASSWORD = "druid.loginPassword";
	}
	
	// 用户任务一览时间跨度
	public static class timeSpan {
		public static final int MONTHLY = 1;
		public static final int SEASONLY = 2;
		public static final int YEARLY = 3;
	}
	
	//用户任务一览判断任务是否准时
	public static class onTime{
		public static final int ON_TIME = 1;
		public static final int OUT_TIME = 2;
	}
	
	//用户任务一览任务类型
	public static class worktaskType{
		public static final int ALL = 0;
		public static final int COMMON = 1;
		public static final int SAFETY = 2;
		public static final int MATERIAL = 3;
		public static final int APPROVAL = 4;
		public static final int SUBCONTRACT = 5;
	}
	
	//默认日期值
	public static final String DEFAULT_DATE = "0";
	
	//默认值空String
	public static final String EMPTY_DEFAULT_VALUE = "";
	
	//验证码key
	public static String VALIDATE_CODE_KEY = "validateCode";
	
	//web token
	public final static String WEB_TOKEN_KEY = "web-token";
	//System version
	public final static String WEB_VERSION_KEY = "sysVersion";
	//System version
	public final static String WEB_VERSION_DEFALUT_VALUE = "1.4";
	//API token值 
	public final static String API_TOKEN_VALUE = "2ea9dd1ab85b48b580ebaa0b311b1863";	
	//环境监测设备类型
	public final static String ENV_DEVICE_TYPE = "ENV0001";
	
	//用户健康指数返回描述
	public static class fileSuffixName {
		public static final String HTML = ".html";
		public static final String WORD = ".doc";
		public static final String WORDX = ".docx";
		public static final String PDF = ".pdf";
	}

	//用户健康指数返回描述
	public static class userPersonalPoint{
		public static final String POINT = "您的健康指数为";
		public static final String OVEREIGHTY = "，打败了80%的用户！人品报表，再接再厉哦！";
		public static final String OVERSIXTY = "，打败了60%的用户！已经接近完美了，加油哦！";
		public static final String OTHER = "，打败了40%的用户！还需要努力，加油哦！";
	}
	
	//项目任务统计一览条件选项
	public static class projectOption{
		public static final int ALLCOUNT = 1;   //任务数量
		public static final int NEWCOUNT = 2;  //新建任务数量
		public static final int COMPLETECOUNT = 3; //完成任务数量
		public static final int COMPLETERATE = 4;//任务完成率
		public static final int POINT = 5;//任务健康指数
	}
	
	//树形分隔符
	public final static String DELIMITER = "|-";
	public final static String HTML_BLANK = "&nbsp;&nbsp;";
	public final static String HTML_BR = "<br/>";
	
	//物资默认第一条值
	public final static String MATERIAL_CODE_DEFALUT_VALUE = "00001";
	//物资大类型默认第一条值
	public final static String MATERIAL_BIG_TYPE_CODE_DEFALUT_VALUE = "10";
	//物资类型默认第一条值
	public final static String MATERIAL_TYPE_CODE_DEFALUT_VALUE = "01";
	
	//菜单二级默认第一条值
	public final static String MENU_CODE_DEFALUT_VALUE = "001";
	//菜单默认第一条值
	public final static String MENU_BIG_CODE_DEFALUT_VALUE = "100";
	//未知文件
	public final static String UNKNOWN_FILE = "错误文件.pdf";
	//换行符号
	public final static String HTML_NEW_LINE_SIGN_N = "/\n";
	
	//混凝土需用总计划默认合计行
	public final static int MATERIAL_CONCRETE_COLSPAN_DEFALUT_VALUE = 10;
	//钢筋需用总计划默认合计行数
	public final static int MATERIAL_STEEL_SUB_COLSPAN_DEFALUT_VALUE = 5;
	//钢筋需用总计划默认合计行总数
	public final static int MATERIAL_STEEL_ALL_SUB_COLSPAN_DEFALUT_VALUE = 15;
	//合计
	public final static String HTML_TOTAL_SIGN = "合计";
	//钢筋默认列名
	public final static String MATERIAL_STEEL_DEFALUT_COLUMN_VALUE = "0000";
	
	//日期格式化
	public static class dateTimeFormt {
		public static final String DEFALUT_DATE_TIME = " 00:00:00";//默认时间 （时分秒）
		public static final String DATE_START_TIME = " 06:00:00";  //开始时间（时分秒）
		public static final String DATE_END_TIME = " 18:00:00";    //结束时间 （时分秒）
	}
	
	//项目二级进度审核状态
	public static class projectPlanApprovalStatus{
		//t_project_plan
		public static final int NOT_WRITE = 1;//未填写
		public static final int HAVE_WRITE = 2;//已填写可修改
		public static final int NOT_APPROVAL = 3;//已填写待审核
		public static final int NOT_PASS = 4;//审核不通过
		public static final int PASS = 5;//审核通过(即完成)
		//t_project_plan_approval
		public static final int STATUS_1 = 1;//未审核
		public static final int STATUS_2 = 2;//审核不通过
		public static final int STATUS_3 = 3;//审核通过
	}
	
	//是否需要上传OSS(0:否 1:是)
	public static class isNeedUploadOss {
		public static final int NO = 0;   //0:否
		public static final int YES = 1;  //1:是
	}
	
	//是否需要创建HTML文件(0:否 1:是)
	public static class isNeedCreateHtml {
		public static final int NO = 0;   //0:否
		public static final int YES = 1;  //1:是
	}
	
	//是否竖向或横向打印(0:竖向 1:横向)
	public static class isVerticalOrHorizontal {
		public static final int VERTICAL = 0;    //0:竖向
		public static final int HORIZONTAL = 1;  //1:横向
	}
	
	//系统标准代码表
	public static class sysTypeCode {
		public static final String TYPE_CODE_A09 = "A09"; //签证类型(签证任务SV1000)
		public static final String TYPE_CODE_A10 = "A10"; //供应权限(WZER1000)
		public static final String TYPE_CODE_A11 = "A11"; //构件类型(WZSR1000、WZCR1000)
		public static final String TYPE_CODE_A21 = "A21"; //分供商类型(LCC1000)
	}
	
	//系统文件目录表
	public static class sysFileFolderCode {
		public static final String FMCD1008001 = "FMCD1008001"; //项目检查文件目录
		public static final String FMCD1009001 = "FMCD1009001"; //公司安全整改通知单文件目录
		public static final String FMCD1015001 = "FMCD1015001"; //公司质量整改通知单文件目录
		public static final String FMBD1007001 = "FMBD1007001"; //分公司安全整改通知单文件目录
		public static final String FMBD1007002 = "FMBD1007002"; //分公司质量整改通知单文件目录
		public static final String FMSD1006001 = "FMSD1006001"; //分包公司安全整改通知单文件目录
		public static final String FMSD1003001 = "FMSD1003001"; //分包公司质量整改通知单文件目录
		public static final String FMSD1007001 = "FMSD1007001"; //分包公司经济签证报表文件目录
		public static final String FMBD1007003 = "FMBD1007003"; //分公司项目检查文件目录
		public static final String FMBD1005001 = "FMBD1005001"; //劳务/专业分包考核评价得分表文件目录
	}
	
	//分包经济签证详情状态
	public static class subcontractSvDetailStatus{
		public static final String SV_STATUS_CODE_1001 = "1001";//签证待确认
		public static final String SV_STATUS_CODE_1002 = "1002";//签证已确认
		public static final String SV_STATUS_CODE_1003 = "1003";//签证被驳回
		public static final String SV_STATUS_CODE_1004 = "1004";//签证待审核
		public static final String SV_STATUS_CODE_1005 = "1005";//审核已通过
		public static final String SV_STATUS_CODE_1006 = "1006";//审核被驳回
		public static final String SV_STATUS_CODE_1007 = "1007";//签证待核价
		public static final String SV_STATUS_CODE_1008 = "1008";//签证已核价
		public static final String SV_STATUS_CODE_1009 = "1009";//商务待审核
		public static final String SV_STATUS_CODE_1010 = "1010";//商务已通过
		public static final String SV_STATUS_CODE_1011 = "1011";//商务被驳回
		public static final String SV_STATUS_CODE_1012 = "1012";//签证待审核
		public static final String SV_STATUS_CODE_1013 = "1013";//审核已通过
		public static final String SV_STATUS_CODE_1014 = "1014";//审核被驳回
		public static final String SV_STATUS_CODE_1015 = "1015";//签证待审批
		public static final String SV_STATUS_CODE_1099 = "1099";//签证已失效
		public static final String SV_STATUS_CODE_1100 = "1100";//签证已完成
	}

	//项目检查通报任务专业类型
	public static class pcrProfessionalType{
		public static final int PCR_PROFSSIONAL_TECHNOLOGY_QUALITY = 1;		//技术质量管理
		public static final int PCR_PROFSSIONAL_SAFETY = 2;					//安全管理
		public static final int PCR_PROFSSIONAL_MATERIAL = 3;				//物资管理
		public static final int PCR_PROFSSIONAL_WORKLOAD = 4;				//工期管理
		public static final int PCR_PROFSSIONAL_CONTRACT = 5;				//总承包管理
		public static final int PCR_PROFSSIONAL_SERVICE = 6;				//劳务管理
		public static final int PCR_PROFSSIONAL_MACHINE = 7;				//机械管理
		public static final int PCR_PROFSSIONAL_GREEN_CONSTRUCT = 8;		//绿色施工管理
		public static final int PCR_PROFSSIONAL_MEASURE = 9;				//实测实量
		public static final int PCR_PROFSSIONAL_LEADER_ADVICE = 10;			//组长意见
		public static final int PCR_PROFSSIONAL_DESIGN = 11;				//设计管理
		public static final int PCR_PROFSSIONAL_FINANCE = 12;				//财务管理
		public static final int PCR_PROFSSIONAL_OFFICE = 13;				//综合办公室管理
		public static final int PCR_PROFSSIONAL_BUSINESS = 14;				//商务管理
	}
	
	//项目检查通报任务专业类型
	public static class pcrProfessionalTypeName {
		public static final String PCR_PROFSSIONAL_TECHNOLOGY_QUALITY = "技术质量管理"; //技术质量管理
		public static final String PCR_PROFSSIONAL_SAFETY = "安全管理";	               //安全管理
		public static final String PCR_PROFSSIONAL_MATERIAL = "物资管理";               //物资管理
		public static final String PCR_PROFSSIONAL_WORKLOAD = "工期管理";			   //工期管理
		public static final String PCR_PROFSSIONAL_CONTRACT = "总承包管理";		       //总承包管理
		public static final String PCR_PROFSSIONAL_SERVICE = "劳务管理";				   //劳务管理
		public static final String PCR_PROFSSIONAL_MACHINE = "机械管理";				   //机械管理
		public static final String PCR_PROFSSIONAL_GREEN_CONSTRUCT = "绿色施工管理";	   //绿色施工管理
		public static final String PCR_PROFSSIONAL_MEASURE = "实测实量管理";			   //实测实量
		public static final String PCR_PROFSSIONAL_LEADER_ADVICE = "组长意见";		   //组长意见
		public static final String PCR_PROFSSIONAL_DESIGN = "设计管理";				   //设计管理
		public static final String PCR_PROFSSIONAL_FINANCE = "财务管理";				   //财务管理
		public static final String PCR_PROFSSIONAL_OFFICE = "综合办公室管理";			   //综合办公室管理
		public static final String PCR_PROFSSIONAL_BUSINESS = "商务管理";			   //商务管理
	}
	
	//项目检查通报任务条目详情状态
	public static class pcrDetailStatus{
		public static final String PCR_DETAIL_STATUS_1 = "1001";	//组员未提交
		public static final String PCR_DETAIL_STATUS_2 = "1002";	//组员已提交
		public static final String PCR_DETAIL_STATUS_3 = "1003";	//组长已采纳
		public static final String PCR_DETAIL_STATUS_4 = "1004";	//组长已忽略
		public static final String PCR_DETAIL_STATUS_5 = "1005";	//条目已失效
		public static final String PCR_DETAIL_STATUS_6 = "1006";	//组长未下发
		public static final String PCR_DETAIL_STATUS_7 = "1007";	//组长已下发
		public static final String PCR_DETAIL_STATUS_8 = "1008";	//组长未提交
		public static final String PCR_DETAIL_STATUS_9 = "1009";	//组长已提交
	}

	//报表类型
	public static class reportType {
		public static final String PP1000 = "PP1000"; //项目重要节点
		public static final String SV1001 = "SV1001"; //分包经济签证月清确认单
		public static final String SV1002 = "SV1002"; //分包签证管理台账
		public static final String ZB1001 = "ZB1001"; //分供方招（议）标文件评审表
		public static final String ZB1002 = "ZB1002"; //分包商推荐表
		public static final String ZB1003 = "ZB1003"; //项目分包选择和实施计划表
		public static final String ZB1004 = "ZB1004"; //项目分包申请表
		public static final String ZB1005 = "ZB1005"; //招标说明
		public static final String ZB1006 = "ZB1006"; //评标报告
		public static final String ZB1007 = "ZB1007"; //中标通知书
		public static final String ZB1008 = "ZB1008"; //清单表(附件表)
		public static final String JS1001 = "JS1001"; //3-分包结算条件会签单
		public static final String JS1002 = "JS1002"; //2-中国建筑第八工程局定案单
		public static final String JS1003 = "JS1003"; //4-分包结算审查会签表
		public static final String JS1004 = "JS1004"; //1-中建八局三公司定案单
		public static final String HT1001 = "HT1001"; //分供方合同评审表公司层面
		public static final String HT1002 = "HT1002"; //项目部分供方合同评审表工程
		public static final String KHSC01 = "KHSC01"; //分包商考核记录表(项目部)
		public static final String KHSC02 = "KHSC02"; //分包商考核记录表(三级单位)
		public static final String KHSC03 = "KHSC03"; //分包商综合考评定级表
		
		public static final String CC1001 = "CC1001"; //劳务分供商信用分统计表
		public static final String CC1002 = "CC1002"; //劳务分包考核评价得分表
		public static final String CC1003 = "CC1003"; //劳务分包工期考核评价表
		public static final String CC1004 = "CC1004"; //劳务分包技术质量考核评价表
		public static final String CC1005 = "CC1005"; //劳务分包安全文明施工、劳务考核记录表
		public static final String CC1006 = "CC1006"; //专业分包考核评价表
	};
	
	//项目检查通报任务人员类型
	public static class pcrUserType{
		public static final int PCR_USER_TYPE_0 = 0;//组员
		public static final int PCR_USER_TYPE_1 = 1;//专业组长
		public static final int PCR_USER_TYPE_2 = 2;//检查组组长
	}

	//是否提交完成(0:未完成提交 1:完成提交)
	public static class isSubmitStatus {
		public static final int NO = 0;  //0:未完成提交
		public static final int YES = 1; //1:完成提交
	};
	
	//项目检查通报任务实测实量专业选项
	public static class pcrMeasurePlace{
		public static final int MEASURE_PLACE_1 = 1;//混凝土
		public static final int MEASURE_PLACE_2 = 2;//钢筋
		public static final int MEASURE_PLACE_3 = 3;//砌体
	}
	
	//任务是否在进行(0:未进行 1:正在进行)
	public static class worktaskOptCode {
		public static final int NO = 0;  //0:未进行
		public static final int YES = 1; //1:正在进行
	};
	
	//是否直接创建HTML或PDF
	public static class isCreateHtmlOrPdf {
		public static final int HTML = 0; //0:HTML
		public static final int PDF = 1;  //1:PDF
	};
	
	//是否有查看和审核项目权限
	public static class isProjectAuth {
		public static final int NO = 0;    // 0:无权限
		public static final int YES = 1;    // 2:有权限
	}
	
	//设置用户项目权限操作状态1:添加项目 2:添加用户 3:删除用户
	public static class userProjectAuthOptFlag {
		public static final int ADD_PROJECT = 1; // 1:添加项目
		public static final int ADD_USER = 2;    // 2:添加用户
		public static final int DEL_USER = 3;    // 3:删除用户
	}
	
	//甘特图类型(1:项目进度计划 2:物资需要计划)
	public static class gantType {
		public static final int PROJECT_PLAN = 1;      // 1:项目进度计划
		public static final int MATERIAL_REQ_PLAN = 2; // 2:物资需要计划
	}
	
	//项目计划等级
	public static class projectPlanLevel {
		public static final int ONE = 1;   // 1:一级项目进度计划
		public static final int TWO = 2;   // 2:二级项目进度计划
	}
	
	//是否选中(0:未选择 1:选中)
	public static class isChecked {
		public static final int NO = 0;   //0:否
		public static final int YES = 1;  //1:是
	}
	
	//设置pdf宽度和高度默认值
	public static class pdfFileAttr {
		public static final float WIDTH = 595;   //宽度
		public static final float HEIGHT = 842;  //高度
	}
	
	//钢筋等级(1:一级钢 2:二级钢 3:三级钢 4:四级钢 5:其他)
	public static class steelLevelConfig {
		public static final String STEEL_LEVEL_1 = "1"; //1:一级钢
		public static final String STEEL_LEVEL_2 = "2"; //2:二级钢
		public static final String STEEL_LEVEL_3 = "3"; //3:三级钢
		public static final String STEEL_LEVEL_4 = "4"; //4:四级钢
		public static final String STEEL_LEVEL_5 = "5"; //5:其他
	}
	
	//钢筋等级(1:一级钢 2:二级钢 3:三级钢 4:四级钢 5:其他)
	public static class steelLevelConfigName {
		public static final String STEEL_LEVEL_1 = "一级钢"; //1:一级钢
		public static final String STEEL_LEVEL_2 = "二级钢"; //2:二级钢
		public static final String STEEL_LEVEL_3 = "三级钢"; //3:三级钢
		public static final String STEEL_LEVEL_4 = "四级钢"; //4:四级钢
		public static final String STEEL_LEVEL_5 = "其他";   //5:其他
	}
	
	//系统代码表
	public static class sysCode {
		public static final int SYS_TYPE_0 = 0; //智建系统
		public static final int SYS_TYPE_1 = 1; //分供商系统
	}
	
	//企业附件类型(A1201:营业执照 A1202:资质证书 A1202:安全生产许可证)
	public static class enterpriseFileTypeCode {
		public static final String A1201 = "A1201"; //营业执照
		public static final String A1202 = "A1202"; //资质证书
		public static final String A1203 = "A1203"; //安全生产许可证
	}
	
	//注册审核状态(0:待审核 1:审核驳回(退回到完善企业信息) 2:审核拒绝 3:审核通过)
	public static class regApprovalStatus {
		public static final int WAIT = 0;    //0:待审核
		public static final int REJECT = 1;  //1:审核驳回(退回到完善企业信息)
		public static final int REFUSE = 2;  //2:审核拒绝
		public static final int PASS = 3;    //3:审核通过
	}
	
	//资质证书审核状态(0:待审核 1:审核通过 2:审核失败)
	public static class certApprovalStatus {
		public static final int WAIT = 0;    //0:待审核
		public static final int PASS = 1;    //1:审核通过
		public static final int NOPASS = 2;  //2:审核失败
	}
	
	//注册已完成步骤(0:默认 10:完成企业注册 20:完善企业信息 30:等待审核 40:审核完成(包括两种情况审核通过和审核拒绝) 50:流程完成)
	public static class regSeptIndex {
		public static final int SEPT_0 = 0;    //0:默认
		public static final int SEPT_10 = 10;  //10:完成企业注册
		public static final int SEPT_20 = 20;  //20:完善企业信息
		public static final int SEPT_30 = 30;  //30:等待审核
		public static final int SEPT_40 = 40;  //40:审核完成
		public static final int SEPT_50 = 50;  //50:流程完成
	}
	
	//企业类型(1:分包商 2:设备和材料供应商 3:班组)
	public static class enterpriseType {
		public static final int SUBCONTRACTOR = 1; //1:分包商
		public static final int SUPPLIER = 2;      //2:设备和材料供应商
		public static final int TEAM = 3;          //3:班组
	}

	//劳务/专业分包信用分考核专业code
	public static class creditCheckTypeCode{
		public static final String CREDIT_CHECK_TYPE_CODE_A2201 = "A2201";//工期(劳务分包)
		public static final String CREDIT_CHECK_TYPE_CODE_A2202 = "A2202";//施工质量(劳务分包)
		public static final String CREDIT_CHECK_TYPE_CODE_A2203 = "A2203";//文明施工、安全生产、劳务管理(劳务分包)
		public static final String CREDIT_CHECK_TYPE_CODE_A2301 = "A2301";//专业分包(专业分包)
	}

	//企业分包类型(A21)
	public static class subContentTypeCode{
		public static final String SUB_CONTENT_A2101 = "A2101";//一次结构
		public static final String SUB_CONTENT_A2102 = "A2102";//二次结构
		public static final String SUB_CONTENT_A2103 = "A2103";//装饰装修
		public static final String SUB_CONTENT_A2104 = "A2104";//专业分包
	}

	//分供商企业用户角色
	public static class enterpriseRoleType{
		public static final String ENTERPRISE_ROLE_1001 = "SR1001"; //企业负责人
		public static final String ENTERPRISE_ROLE_1002 = "SR1002"; //经理
		public static final String ENTERPRISE_ROLE_1003 = "SR1003"; //专业工程师
	}
	
	//Druid
	public static class druidConfig {
		public static final String USER_NAME = "admin";
		public static final String PASSWORD = "ad1q2w3e4R"; //经理
	}
	
	//加密后token
	public static class exApiConfig {
		public static final String COMPANY_TOKEN = "zjbiCompany1q2w3er";
	}
	
	//Material key
	public static class exApiMaterialDisplayTypeKey {
		public static final String M01 = "M01";
		public static final String M02 = "M02";
		public static final String M03 = "M03";
		public static final String M04 = "M04";
		public static final String M05 = "M05";
		public static final String M06 = "M06";
	}
	
	//M01:钢筋/M02:混凝土/M03:水泥/M04:模板/M05:木方/M06:脚手架
	public static class exApiMaterialDisplayTypeName {
		public static final String M01 = "钢筋";
		public static final String M02 = "混凝土";
		public static final String M03 = "水泥";
		public static final String M04 = "模板";
		public static final String M05 = "木方";
		public static final String M06 = "脚手架";
	}
	
	//物资单位
	public static class materialUnitName {
		public static final String U001 = "吨";
		public static final String U002 = "立方米";
		public static final String U003 = "平方米";
	}
	
	//项目类型(0:土建 1:装饰装修)
	public static class projectType {
		public static final int PROJECT_TYPE_0 = 0;
		public static final int PROJECT_TYPE_1 = 1;
	}
}