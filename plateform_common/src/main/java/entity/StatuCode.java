package entity;

/**
 * @author 王文泽
 * 提前定义好的常用的状态码
 */
public class StatuCode {
    public static final int ok = 20000;//成功
    public static final int ERROR = 20001;//失败
    public static final int LOGINERROR = 20002;//用户名或者密码错误
    public static final int ACCESSERROR = 20003;//权限不足
    public static final int REMOTEERROT = 20004;//远程调用失败
    public static final int REPERROR = 20004;//重复操作
}
